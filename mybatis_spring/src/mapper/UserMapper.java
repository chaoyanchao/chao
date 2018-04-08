package mapper;

import java.util.List;

import pojo.User;

public interface UserMapper {
	
	public User findUserById(int id);
	
	public List<User> findUserByUsername(String username);
	
	public void savaUser(User user);
	
}
