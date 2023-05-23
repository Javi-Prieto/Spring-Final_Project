

INSERT INTO personal_trainer(cod_trabajador, nombre, apellidos, dni, cuenta_banco, num_telefono, titulo, url_img, email, precio_mensual, experiencia, valoracion) VALUES(1, 'Juan', 'Fernandez Perez', '54189320D', 'ES2347859008', '682456678', 'Licenciado en Ciencias del deporte', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTckFQOrbeXGDvd8LaA4zXwWnozYM-Xp-px_g&usqp=CAU', 'juan@gmail.com', 120, 3, 3);
INSERT INTO personal_trainer(cod_trabajador, nombre, apellidos, dni, cuenta_banco, num_telefono, titulo, url_img, email, precio_mensual, experiencia, valoracion) VALUES(2, 'Lucia', 'Perez Molina', '48698745S', 'ES123456789', '654112365', 'Grado en TFAR', 'https://www.greatestphysiques.com/wp-content/uploads/2017/06/Courtney-King-10.jpg', 'lucia@gmail.com', 230, 5, 5);
INSERT INTO personal_trainer(cod_trabajador, nombre, apellidos, dni, cuenta_banco, num_telefono, titulo, url_img, email, precio_mensual, experiencia, valoracion) VALUES(3, 'Manolo', 'Carrasco Lopez', '968743698F', 'ES1515612318', '625638974', 'Licenciado en Ciencias del deporte y grado Superior en Nutrición y Dietetica', 'https://bulevip.com/blog/wp-content/uploads/2019/07/raul-carrasco-atleta-amix.jpg', 'paco@gmail.com', 100, 7, 4);
INSERT INTO personal_trainer(cod_trabajador, nombre, apellidos, dni, cuenta_banco, num_telefono, titulo, url_img, email, precio_mensual, experiencia, valoracion) VALUES(4, 'Antonio', 'Perez Alvarez', '63789456D', 'ES2569458486', '656985748', 'Licenciado en Ciencias del deporte con Master en Entrenamiento Deportivo', 'https://mn2s-content.s3.eu-west-2.amazonaws.com/wp-content/uploads/2022/06/01180249/Mauro-Fialho.png', 'antonio@gmail.com', 150, 2, 2);




INSERT INTO class_trainer(cod_trabajador, apellidos, cuenta_banco, desc, dni, email, experiencia, nombre, num_telefono, salario, url_img) VALUES (1, 'Martinez Martinez', 'ES12156489789', 'Estoy preparado para que des tu máximo nivel', '82564136F', 'paco@gmail.com', 3, 'Paco', '686485698', 1000, 'https://pbs.twimg.com/media/DbNPZQyW0AAxGVx.jpg');
INSERT INTO class_trainer(cod_trabajador, apellidos, cuenta_banco, desc, dni, email, experiencia, nombre, num_telefono, salario, url_img) VALUES (2, 'Pulido Prieto' ,'Me encargaré de sacar lo mejor de ti', 'Hola soy genial', '82564136F', 'fili@gmail.com', 3, 'Filiberto', '62365489', 1250, 'https://yt3.googleusercontent.com/ytc/AGIKgqNr2gEQTPE7Mpr13gPb3ov85HSn-U6WHraEdtWk=s900-c-k-c0x00ffffff-no-rj');
INSERT INTO class_trainer(cod_trabajador, apellidos, cuenta_banco, desc, dni, email, experiencia, nombre, num_telefono, salario, url_img) VALUES (3, 'Millan Rebolledo', 'ES5648946556', 'Puedes contar conmigo en cualquier momento', '82564136F', 'maria@gmail.com', 3, 'Maria', '67548966', 1100, 'https://yt3.googleusercontent.com/_mSuQMqmT1aM24PwuDAn6MKlU-_53maXlro1TAkh6XWoRyhunKJpwXa7ZHVxcAyr_-ug-az10w=s900-c-k-c0x00ffffff-no-rj');
INSERT INTO class_trainer(cod_trabajador, apellidos, cuenta_banco, desc, dni, email, experiencia, nombre, num_telefono, salario, url_img) VALUES (4, 'Ortiz Camara', 'ES897498648', 'Estoy disponible si lo que quieres es ser mejor', '82564136F', 'pepa@gmail.com', 3, 'Pepa', '62365984', 2500, 'https://cdn4.sharechat.com/img_846181_265ed8b6_1676121843164_sc.jpg');    

--INSERT INTO client (cod_cliente, admin, bp_reps, bp_weigh, cod_postal, cuenta_banco, cuota_mens, dl_reps, dl_weight, dni, email, num_telefono, password, sq_reps, sq_weight, username) VALUES (1, true, 0, 0, '0', 'admin', 0, 0, 0, '0', 'admin@admin.com', '0', '$2a$10$Hrjm.SdjRa1nHY/Ax80HFOztBjS2P63shHhdI2dhmcYqYlfkd0SAy', 0, 0, 'admin'), (2, false, 0, 0, '0', 'user', 0, 0, 0, '0', 'user@user.com', '0', '$2a$10$Xq6ylBQPqWvdwPpOrqbq/e1kTGy1RCI/OYzknSeSgMk6RaEvHEl4G', 0, 0, 'user');

INSERT INTO room (cod_sala , hora_fin , hora_inicio , limite_clientes) VALUES (1, NOW(), (NOW() +1), 1);



alter sequence hibernate_sequence restart with 1000;