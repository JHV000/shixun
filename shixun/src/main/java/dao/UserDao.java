package dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import entity.User;

public interface UserDao {
	
	@Select("select * from user")
	public List<User> queryAll();
}
