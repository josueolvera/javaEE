/*CREATE TABLE USUARIO(ID_USUARIO INTEGER PRIMARY KEY AUTO_INCREMENT,
                       NOMBRE VARCHAR(120),
                        EMAIL VARCHAR(120),
                        LOGIN VARCHAR(90),
                        PASSWORD VARCHAR(90));

*/
 select * from usuario;
CREATE TABLE ADMINISTRACION( ID_SESION INTEGER PRIMARY KEY AUTO_INCREMENT,
                                ID_USUARIO INTEGER,
                                FECHA DATE,
                                IP VARCHAR(120),
                                FOREIGN KEY(ID_USUARIO) REFERENCES USUARIO(ID_USUARIO));