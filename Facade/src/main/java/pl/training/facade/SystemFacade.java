package pl.training.facade;

import pl.training.facade.model.User;
import pl.training.facade.service.AccountActivator;
import pl.training.facade.service.UsersRepository;

public class SystemFacade {
	
	private UsersRepository usersRepository;
	private AccountActivator accountActivator;
	
	public SystemFacade(UsersRepository usersRepository, AccountActivator accountActivator) {
		this.usersRepository = usersRepository;
		this.accountActivator = accountActivator;
	}

	void addUser(String firstName, String lastName) {
		User user = new User(firstName, lastName);
		usersRepository.add(user);
		accountActivator.sendActivationLink();
	}

}
