INSERT INTO role (r_name) VALUES ('ADMIN'),('USER');

INSERT INTO game (g_name, g_type) VALUES
('Rocket League', 'Sport'),
('Rainbow Six Siege', 'FPS');

INSERT INTO "user" (u_pseudo, u_email, u_password, u_gamertag, u_plateform, u_role) VALUES
('ADMIN', 'admin@gmail.com', 'superAdmin', 'Admin', 'PC', (SELECT r.r_id FROM role r WHERE r.r_id = 1)),
('Devious', 'devious.maid@gmail.com', '12345', 'Devious_maid', 'PS4', (SELECT r.r_id FROM role r WHERE r.r_id = 2)),
('Extazy', 'exta@gmail.com','OKIhH', 'Extazy2001', 'PS4', (SELECT r.r_id FROM role r WHERE r.r_id = 2));

INSERT INTO annonce (a_titre, a_message, a_level, a_plateforme, a_user_id, a_game_id) VALUES
('Recherche Coequipier', 'Bonjour, j’ai 25 ans je m’apelle Néphéline et je recherche des personnes avec qui jouer', 'Ranked', 'PS4', (SELECT u.u_id FROM "user" u WHERE u.u_id = 2), (SELECT g.g_id FROM game g WHERE g.g_id = 1)),
('Exemple Annonce', 'Bonjour, voici un exemple d’annonce. Présentez vous, demander ce que vous rechercher', 'Chill', 'PC', (SELECT u.u_id FROM "user" u WHERE u.u_id = 1), (SELECT g.g_id FROM game g WHERE g.g_id = 1));

INSERT INTO answer_announce (aa_message, aa_creation_date, aa_u_id, aa_a_id) VALUES
('Salut, moi je serai intéréssée pour jouer avec toi', TO_DATE('25/12/2020', 'DD/MM/YYYY'), (SELECT u.u_id FROM "user" u WHERE u.u_id = 3), (SELECT a.a_id FROM annonce a WHERE a.a_id = 1)),
('Bonjour, cool ajoute moi sur la play, Devious_maid.', TO_DATE('26/12/2020', 'DD/MM/YYYY'), (SELECT u.u_id FROM "user" u WHERE u.u_id = 2), (SELECT a.a_id FROM annonce a WHERE a.a_id = 1));