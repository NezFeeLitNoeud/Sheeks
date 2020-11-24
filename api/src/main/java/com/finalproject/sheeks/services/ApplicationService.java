package com.finalproject.sheeks.services;


import com.finalproject.sheeks.entities.*;
import com.finalproject.sheeks.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
public class ApplicationService implements IApplicationService {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    IUserRepository userRepository;

    @Autowired
    AnnounceRepository announceRepository;

    @Autowired
    JeuxRepository jeuxRepository;

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void insertData() {
        Role user = new Role("USER");
        Role admin = new Role("ADMIN");
        roleRepository.save(user);
        roleRepository.save(admin);

        Jeux RL = new Jeux("Rocket League", "Sport");
        Jeux R6 = new Jeux("Rainbow 6 Siege", "FPS");

        jeuxRepository.save(RL);
        jeuxRepository.save(R6);

        User adminUser = new User("Admin", "admin@gmail.com", passwordEncoder.encode("supermdp"), "AdminGT", "PC", admin);
        userRepository.save(adminUser);

        User normalUser = new User("Devious", "nepheline.nehlig@gmail.com", passwordEncoder.encode("1234"), "Devious_maid", "PS4", user);
        userRepository.save(normalUser);

        Announce announce = new Announce(normalUser, RL,"Recherche copine", "Recherche Mate niveau D3/C1 sachant rotate et majeur", "Ranked", "PS4");
        announceRepository.save(announce);
        announceRepository.save(new Announce(normalUser,R6, "Veut plus jouer seule", "Recherche du monde pour m'amuser sans prise de tete", "Chill", "PC"));
        announceRepository.save(new Announce(normalUser, RL,"Cherche equipe", "Recherche equipe esport pour monter ensemble", "Ranked", "PC"));

        answerRepository.save(new Answer(adminUser, announce, "Bonjour, moi je suis intéréssée !", LocalDateTime.now()));
        answerRepository.save(new Answer(normalUser, announce, "Cool, envoie moi une demande d'amis à Devious_maid !", LocalDateTime.now()));

    }
}
