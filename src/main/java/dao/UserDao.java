package dao;

import java.util.List;

import model.User;

public interface UserDao {

	public List<User> findAll();

	public User create(User u);

	User getUserById(int id);

	User update(User newUser);

	User delete(int id);
	
	User login(User user);
	
	User findByLogin(String login);
}
