package com.project.regandlogin.service;

 import com.project.regandlogin.model.User;
 import com.project.regandlogin.web.dto.UserRegistrationDto;
 import org.springframework.security.core.userdetails.UserDetailsService;
 import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {

  User save(UserRegistrationDto registrationDto);

}
