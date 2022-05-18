CREATE TABLE pokemon(
    id_pokedex int,
    nombre varchar(14),
    tipo1 varchar(14),
    imagen varchar(50),
    sonido varchar(50)
); 


CREATE TABLE movimientos(
    id_movimientos int,
    tipo varchar(14),
    nombre_mov varchar(14),
    potencia int,
    num_turno int,
    estado varchar(14),
    mejora varchar(14),
    cant_mejora int,
    tipo_ataque varchar(10),
    forma_ataque int
    );
	

CREATE TABLE pokemon_entrenador(
    id_pokemon int,
    id_pokedex int,
    id_entrenador int,
    mote varchar(14),
    vitalidad int,
    ataque int,
    defensa int,
    ataque_esp int,
    defensa_esp int,
    estamina int,
    nivel int,
    velocidad int,
    experiencia int,
    equipo int
    );

	CREATE TABLE entrenador(
    id_entrenador int,
    nombre varchar(14),
    pokemonedas int
    );


	CREATE TABLE movimientos_pokemon(
    id_pokemon int,
    id_movimiento int
    );
	




CREATE TABLE combate(
    id_combate int,
    id_entrenador int,
    id_rival int,
    id_ganador int,
    pokemon_jugador_ko int,
    pokemon_rival_ko int
    );
	

CREATE TABLE turno(
    id_combate int,
    num_turno int,
    accion_entrenador varchar(14),
    accion_rival varchar(14)
    );
	
	ALTER TABLE turno
ADD PRIMARY KEY (id_combate,num_turno);

ALTER TABLE turno
ADD CONSTRAINT fk_combate_turno FOREIGN KEY (id_combate) REFERENCES combate(id_combate);

alter TABLE pokemon
add PRIMARY KEY (id_pokedex);
	
    ALTER TABLE movimientos
add PRIMARY KEY (id_movimientos);
	
    ALTER TABLE pokemon_entrenador
add PRIMARY key (id_pokemon);

ALTER TABLE entrenador
add PRIMARY KEY (id_entrenador);

ALTER TABLE pokemon_entrenador
ADD CONSTRAINT fk_id_pokedex FOREIGN KEY (id_pokedex) REFERENCES pokemon(id_pokedex);

	
ALTER TABLE pokemon_entrenador
ADD CONSTRAINT fk_id_entrenador FOREIGN KEY (id_entrenador) REFERENCES entrenador(id_entrenador);

ALTER TABLE movimientos_pokemon
ADD PRIMARY KEY (id_pokemon,id_movimiento);
	
    ALTER TABLE combate
ADD PRIMARY KEY (id_combate);

ALTER TABLE combate
ADD CONSTRAINT fk_entrenador FOREIGN KEY (id_entrenador) REFERENCES entrenador(id_entrenador);

ALTER TABLE combate
ADD CONSTRAINT fk_rival FOREIGN KEY (id_rival) REFERENCES entrenador(id_entrenador);

ALTER TABLE combate
ADD CONSTRAINT fk_ganador FOREIGN KEY (id_ganador) REFERENCES entrenador(id_entrenador);