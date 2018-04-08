package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import pojo.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) {
		SqlSession session = super.getSqlSession();
		User user = session.selectOne("findUserById", id);
		return user;
	}

	@Override
	public List<User> findUserByUsername(String username) {
		SqlSession session = super.getSqlSession();
		List<User> list = session.selectList("findUserByUsername", username);
		return list;
	}

	@Override
	public void savaUser(User user) {
		SqlSession session = super.getSqlSession();
		session.insert("savaUser", user);
	}

}
