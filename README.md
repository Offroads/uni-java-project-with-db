# uni-java-project-with-db

You need a database with the following.

Table: saved_games

game_id:VARCHAR(128)

player_1:VARCHAR(128)

player_2:VARCHAR(128)

game_postition:SMALLINT

player_1_energy:SMALLINT UNSIGNED

player_2_energy:SMALLINT UNSIGNED


Table: open_games

player_1:VARCHAR(128)

player_1_random:VARCHAR(10)

player_2:VARCHAR(128)

player_2_random:VARCHAR(10)


Table: games_in_progress

game_id:VARCHAR(20)

player_1:VARCHAR(128)

player_2:VARCHAR(128)

game_postition:SMALLINT

player_1_energy:SMALLINT UNSIGNED

player_2_energy:SMALLINT UNSIGNED

player_1_move:SMALLINT UNSIGNED

player_2_move:SMALLINT UNSIGNED

move_number: INT UNSIGNED


Table: ranking

player: VARCHAR(128)

score: FLOAT
