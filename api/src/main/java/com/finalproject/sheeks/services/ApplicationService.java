package com.finalproject.sheeks.services;


import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.Role;
import com.finalproject.sheeks.entities.User;
import com.finalproject.sheeks.repositories.AnnounceRepository;
import com.finalproject.sheeks.repositories.IUserRepository;
import com.finalproject.sheeks.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ApplicationService implements IApplicationService {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    IUserRepository userRepository;

    @Autowired
    AnnounceRepository announceRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void insertData() {
        Role user = new Role("USER");
        Role admin = new Role("ADMIN");
        roleRepository.save(user);
        roleRepository.save(admin);

        User adminUser = new User("Admin", "admin@gmail.com", passwordEncoder.encode("supermdp"), "AdminGT", "PC", admin);
        userRepository.save(adminUser);

        User normalUser = new User("Devious", "nepheline.nehlig@gmail.com", passwordEncoder.encode("1234"), "Devious_maid", "PS4", user);
        userRepository.save(normalUser);

        announceRepository.save(new Announce(1, "Admin","Recherche copine", "Rocket League", "PS4", "Ranked", "Recherche Mate niveau D3/C1 sachant rotate et majeur"));
        announceRepository.save(new Announce(2, "Devious","Veut plus etre seule", "Rainbow 6", "PC", "Chill", "Recherche du monde pour m'amuser sans prise de tete"));

    }
}
