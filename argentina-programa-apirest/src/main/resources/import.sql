INSERT INTO basicos (nombre, email, nacimiento, ubicacion, idioma, foto) VALUES('Matias Bonfanti','matias@mbonfanti.com', '27 de enero 1987', 'Resistencia, Chaco', 'Ingles', '3727.jpg');

INSERT INTO skills (nombre, porcentaje) VALUES('HTML', '12');
INSERT INTO skills (nombre, porcentaje) VALUES('CSS', '20');
INSERT INTO skills (nombre, porcentaje) VALUES('JAVA', '32');
INSERT INTO skills (nombre, porcentaje) VALUES('JAVASCRIPT', '14');
INSERT INTO skills (nombre, porcentaje) VALUES('GITHUB', '2');
INSERT INTO skills (nombre, porcentaje) VALUES('ANGULAR', '4');
INSERT INTO skills (nombre, porcentaje) VALUES('SPRING BOOT', '45');
INSERT INTO skills (nombre, porcentaje) VALUES('SCRUM', '54');
INSERT INTO skills (nombre, porcentaje) VALUES('MYSQL', '23');


INSERT INTO educacion (nombre, fecha, descripcion, plataforma, docente) VALUES('master javascrpt', '2021', 'basico java','udemy','Juan Perez');

INSERT INTO proyectos (nombre, url, git, descripcion) VALUES('Facebook', 'www.facebook.com','www.git.com', 'Red Social');
INSERT INTO proyectos (nombre, url, git, descripcion) VALUES('Facebook2', 'www.facebook.com2','www.git.com2', 'Red Social2');


INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('matias','$2a$10$4rR39uPepa.aePTI4hdf8uT59q.BNASGh73U040y/WSL..m//WXFe',1, 'Matias', 'Bonfanti','matias@mbonfanti.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$r58YdNkpab1Wo7dIU2c9W.zLwMq6pyNRr7VUOtbn35/VzB/5A6yye',1, 'Root', 'Admin','Admin@root.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('Evaluador','$2a$10$9RwC440RRginkbEmp3//FurXxPIq0CddhMfSlDaxNU51uYbSLn.Xq',1, 'Root2', 'Admin2','Admin2@root.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (3, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (3, 1);