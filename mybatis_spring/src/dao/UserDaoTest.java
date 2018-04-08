package dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.User;

public class UserDaoTest {

	private UserDao userdao;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		this.userdao = context.getBean(UserDao.class);
	}

	@Test
	public void testFindUserById() {
		User user = this.userdao.findUserById(1);
		System.out.println(user);
	}

	@Test
	public void testFindUserByUsername() {
		List<User> list = this.userdao.findUserByUsername("三");
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void testSavaUser() {
		User user = new User();
		user.setUsername("黑崎一护");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("空座町");
		this.userdao.savaUser(user);
	}

}
