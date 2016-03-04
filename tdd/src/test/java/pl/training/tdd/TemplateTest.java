package pl.training.tdd;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class TemplateTest {

    private static final String EXPECTED_RESULT = "My name is Jan Kowalski";

    private Template template  = new Template("My name is ${firstName} ${lastName}");
    private Map<String, String> parameters = new HashMap<>();

    @Mock
    private List<Integer> numbers;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        parameters.put("firstName", "Jan");
        parameters.put("lastName", "Kowalski");

        when(numbers.get(0)).thenReturn(1);
    }

    @Test
    public void shouldEvaluateTextWithExpressions() {
        assertEquals(EXPECTED_RESULT, template.evaluate(parameters));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenParameterIsMissing() {
       template.evaluate(new HashMap<>());
    }

    @Test
    public void shouldIgnoreAdditionalParameters() {
        parameters.put("extraParameter", "someValue");
        assertEquals(EXPECTED_RESULT, template.evaluate(parameters));
    }

    @Test
    public void shouldReturnOne() {
        assertTrue(numbers.get(0) == 1);
    }

}
