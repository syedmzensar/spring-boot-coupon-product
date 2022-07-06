package com.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.entity.User;
import com.security.repository.UserDetailsRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<User> users = userDetailsRepository.findByUsername(username);
		
		User user = users.get(0);
		
		String password = user.getPassword();
		
		List<GrantedAuthority> authority = new ArrayList<GrantedAuthority>();
		
		authority.add(new SimpleGrantedAuthority(user.getRoles()));
		
		return new org.springframework.security.core.userdetails.User(username,password,authority);
	}

}
