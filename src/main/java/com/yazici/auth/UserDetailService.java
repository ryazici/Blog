package com.yazici.auth;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService{

	private final UserRepository userRepository;
	private final AuthGroupRepository authGroupRepository;
	
	@Autowired
	public UserDetailService(UserRepository userRepository,AuthGroupRepository authGroupRepository) {
		super();
		this.userRepository=userRepository;
		this.authGroupRepository=authGroupRepository;
	}
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUsername(username);
		List<AuthGroup> authGroups=authGroupRepository.findByUsername(username);
		
		if(user==null)
			throw new UsernameNotFoundException(username + " not found");
		
		return new AppUser(user,authGroups);
	}
	


	
}
