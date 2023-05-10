

INSERT INTO personal_trainer(cod_trabajador, nombre, apellidos, dni, cuenta_banco, num_telefono, titulo, url_img, email, precio_mensual, experiencia, valoracion) VALUES(1, 'Juan', 'Perez Perez', '54189320D', 'ES2347859008', '682456678', 'Licenciado en Ciencias del deporte', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTckFQOrbeXGDvd8LaA4zXwWnozYM-Xp-px_g&usqp=CAU', 'juan@gmail.com', 120, 3, 3);

INSERT INTO class_trainer(cod_trabajador, apellidos, cuenta_banco, desc, dni, email, experiencia, nombre, num_telefono, salario, url_img) VALUES (1, 'Martinez Martinez', 'ES16515612156', 'Hola soy genial', '82564136F', 'hola@gmail.com', 3, 'Paco', '665231456', 1000, 'https://hips.hearstapps.com/hmg-prod/images/mh-trainer-2-1533576998.png');
INSERT INTO class_trainer(cod_trabajador, apellidos, cuenta_banco, desc, dni, email, experiencia, nombre, num_telefono, salario, url_img) VALUES (2, 'Martinez Martinez', 'ES16515612156', 'Hola soy genial', '82564136F', 'hola@gmail.com', 3, 'Paco', '665231456', 1000, 'https://hips.hearstapps.com/hmg-prod/images/mh-trainer-2-1533576998.png');
INSERT INTO class_trainer(cod_trabajador, apellidos, cuenta_banco, desc, dni, email, experiencia, nombre, num_telefono, salario, url_img) VALUES (3, 'Martinez Martinez', 'ES16515612156', 'Hola soy genial', '82564136F', 'hola@gmail.com', 3, 'Paco', '665231456', 1000, 'https://hips.hearstapps.com/hmg-prod/images/mh-trainer-2-1533576998.png');
INSERT INTO class_trainer(cod_trabajador, apellidos, cuenta_banco, desc, dni, email, experiencia, nombre, num_telefono, salario, url_img) VALUES (4, 'Martinez Martinez', 'ES16515612156', 'Hola soy genial', '82564136F', 'hola@gmail.com', 3, 'Paco', '665231456', 1000, 'https://hips.hearstapps.com/hmg-prod/images/mh-trainer-2-1533576998.png');    

INSERT INTO client (cod_cliente, admin, bp_reps, bp_weigh, cod_postal, cuenta_banco, cuota_mens, dl_reps, dl_weight, dni, email, num_telefono, password, sq_reps, sq_weight, username) VALUES (1, true, 0, 0, '0', 'admin', 0, 0, 0, '0', 'admin@admin.com', '0', 'admin', 0, 0, 'admin'), (2, false, 0, 0, '0', 'user', 0, 0, 0, '0', 'user@user.com', '0', 'user', 0, 0, 'user');





alter sequence hibernate_sequence restart with 1000;