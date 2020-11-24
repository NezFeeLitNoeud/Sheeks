package com.finalproject.sheeks.services;

import com.finalproject.sheeks.entities.Role;
import com.finalproject.sheeks.repositories.IUserRepository;
import com.finalproject.sheeks.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

@Service
public class UserDetailsService implements IUserDetailsService{
    @Autowired
    private IUserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        List<Role> roles = new ArrayList<>();
        roles.add(user.getRoles());
       Set<GrantedAuthority> authorities = roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(toSet());

        return new org.springframework.security.core.userdetails.User(
                user.getPseudo(), user.getPassword(), authorities);
    }
}
