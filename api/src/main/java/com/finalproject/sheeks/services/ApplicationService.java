package com.finalproject.sheeks.services;


import com.finalproject.sheeks.entities.Role;
import com.finalproject.sheeks.entities.User;
import com.finalproject.sheeks.repositories.IUserRepository;
import com.finalproject.sheeks.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ApplicationService implements IApplicationService {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    IUserRepository userRepository;

    @Override
    @Transactional
    public void insertData() {
        Role user = new Role("USER");
        Role admin = new Role("ADMIN");
        roleRepository.save(user);
        roleRepository.save(admin);

        User adminUser = new User("Admin", "admin@gmail.com", "supermdp", "AdminGT", "PC", admin);
        userRepository.save(adminUser);
    }
}
