package zw.co.arfel.clothing.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import zw.co.arfel.clothing.model.User;
import zw.co.arfel.clothing.repository.RoleRepository;
import zw.co.arfel.clothing.repository.UserRepository;
import zw.co.arfel.clothing.service.UserService;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
       // Role userRole = roleRepository.findByRole("ADMIN");
        //user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	}

	@Override
	public List<User> findAll () {
		return userRepository.findAll();
	}

}
