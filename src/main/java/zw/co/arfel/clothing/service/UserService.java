package zw.co.arfel.clothing.service;


import zw.co.arfel.clothing.model.User;

import java.util.List;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public List<User> findAll();
}
