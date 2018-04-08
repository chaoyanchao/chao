package dao;

import java.util.List;

import pojo.User;

public interface UserDao {
	
	public User findUserById(int id);
	
	public List<User> findUserByUsername(String username);
	
	public void savaUser(User user);
	
}
