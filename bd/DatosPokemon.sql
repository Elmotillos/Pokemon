Insert into pokemon values
	(001, 'Bulbasaur', 'Planta', 'Veneno', 'https://static.wikia.nocookie.net/espokemon/images/4/43/Bulbasaur.png/revision/latest?cb=20170120032346', null);

Insert into pokemon values
	(002, 'Ivysaur', 'Planta', 'Veneno', 'https://static.wikia.nocookie.net/espokemon/images/8/86/Ivysaur.png/revision/latest?cb=20140207202404', null);

Insert into pokemon values
	(003, 'Venusaur', 'Planta', 'Veneno', 'https://static.wikia.nocookie.net/espokemon/images/b/be/Venusaur.png/revision/latest?cb=20160309230456', null);

Insert into pokemon values
	(004, 'Charmander', 'Fuego', null, 'https://www.pngmart.com/files/13/Charmander-PNG-HD.png', null);

Insert into pokemon values
	(005, 'Charmeleon', 'Fuego', null, 'https://static.wikia.nocookie.net/espokemon/images/f/fb/Charmeleon.png/revision/latest?cb=20140207202536', null);

Insert into pokemon values
	(006, 'Charizard', 'Fuego', 'Volador', 'https://static.wikia.nocookie.net/espokemon/images/9/95/Charizard.png/revision/latest?cb=20180325003352', null);



Insert into entrenador values
	(1111, 'Perico Palotes', 1000);

Insert into entrenador values
	(2222, 'Manolo Bombos', 999);



Insert into movimientos values
	(001, 'Normal', 'Placage', 35, 40, null, null, null, null, 'Físico'); 

Insert into movimientos values
	(002, 'Normal', 'Gruñido', 40, null, 2, null, 'Ataque', 1, null);

Insert into movimientos values
	(003, 'Planta', 'Látigo cepa', 25, 45, null, null, null, null, 'Físico');

Insert into movimientos values
	(004, 'Fuego', 'Lanzallamas', 15, 90, null, 'Quemadura', null, null, 'Especial');  



Insert into movimientos_pokemon values 
	(001, 001);


Insert into movimientos_pokemon values 
	(001, 003);


Insert into movimientos_pokemon values 
	(004, 004);


Insert into movimientos_pokemon values 
	(004, 002);



Insert into pokemon_entrenador values 
	(004, 004, 1111, 'Gustavo Adolfo-Becker', 39, 52, 43, 60, 50, 250, 5, 65, 100, 0, 1);

Insert into pokemon_entrenador values
	(001, 001, 2222, 'Lope de Vega', 45, 49, 49, 65, 65, 250, 5, 45, 100, 0, 1);

Insert into pokemon_entrenador values 
	(003, 003, 1111, 'Garcilaso de la Vega', 80, 82, 83, 100, 100, 1800, 36, 80, 50, 0, 2);

Insert into pokemon_entrenador values 
	(006, 006, 2222, 'Ortega y Gasset', 78, 84, 78, 109, 85, 1800, 36, 100, 50, 0, 2); 
