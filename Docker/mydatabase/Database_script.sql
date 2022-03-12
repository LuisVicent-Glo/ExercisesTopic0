CREATE DATABASE challenge_topic_docker;

USE challenge_topic_docker;

CREATE TABLE USER (
	username VARCHAR(100) NOT NULL UNIQUE,
    name VARCHAR(20) NOT NULL,
    lastname VARCHAR(30) NOT NULL,
    idetification_number INT NOT NULL PRIMARY KEY,
    address VARCHAR(100) NOT NULL,
    zip_code VARCHAR(20) NOT NULL,
    city VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    country VARCHAR(50) NOT NULL);
    
INSERT INTO USER (username, name, lastname, idetification_number, address, zip_code, city, state, country) 
VALUES  ("luisvi", "Luis", "Vicent", 1221988999, "Calle 23 #48A-66", "050029", "Medellin", "Antioquia", "Colombia"),
		("vicentalicep", "Alice", "Vicent", 1021812222, "Carrera 36 #56-13", "470001", "Santa Marta", "Magdalena", "Colombia"),
		("enrobles", "Englis", "Robles", 1221972111, "Calle 22 #8-23", "111031", "Cienaga", "Magdalena", "Colombia"),
		("efraguerrero", "Efrain", "Guerrero", 32999834, "Calle 13 #2-72", "478040", "Pueblo Viejo", "Magdalena", "Colombia"),
		("margaragallo", "Margarita", "Gallo", 36779214, "Carrera 17 #50-22", "130006", "Cartagena", "Bolivar", "Colombia"),
		("edyeche", "Edy", "Echeverria", 36987345, "Carrera 18 #22-34", "080003", "Barranquilla", "Atlantico", "Colombia"),
		("ricarlopez", "Ricardo", "Lopez", 88944328, "Calle 53 #33-66 SUR", "050029", "Medellin", "Antioquia", "Colombia"),
		("erickvi", "Erick", "Vicent", 108193427, "Calle 53 #33-66 SUR", "050029", "Medellin", "Antioquia", "Colombia"),
		("carlitosmu", "Carlos", "Muriel", 232948725, "Carrera 6 #9-40", "478001", "Cienaga", "Magdalena", "Colombia"),
		("rodoro", "Rodolfo", "Rodriguez", 84296716, "Avenida 13 #37-6", "20005", "Valledupar", "Cesar", "Colombia");

select * from user;