package services;

import java.util.List;

import model.User;

public interface UserService {

	void createUser(User u);

	List<User> getAllUser();

	User getUserById(int id);

	void updateUser(User user);

	void deleteUser(int id);
	
	void login(User user);
	
	User findUserByLogin(String login);

}

