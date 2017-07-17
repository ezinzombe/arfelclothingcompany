package zw.co.arfel.clothing.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.arfel.clothing.model.Role;
import zw.co.arfel.clothing.repository.RoleRepository;
import zw.co.arfel.clothing.service.RoleService;

import java.util.List;

/**
 * Created by micnice on 7/4/17.
 */

@Service
public class RoleServiceImpl implements RoleService {
  @Autowired
  RoleRepository roleRepository;

  @Override
  public Role findByRole (String role) {
    return roleRepository.findByRole(role);
  }

  @Override
  public List<Role> findAll () {
    return roleRepository.findAll();
  }
}
