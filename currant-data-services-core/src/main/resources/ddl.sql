CREATE TABLE SPORT(
sport_id BIGSERIAL PRIMARY KEY NOT NULL,
label VARCHAR (20) NOT NULL,
description VARCHAR (140) NOT NULL ,
image_url VARCHAR (1024),
min_players INT,
max_players INT,
wait_list_amount INT,
active BOOLEAN NOT NULL,
CONSTRAINT sport_label_unique UNIQUE (label)
);
CREATE TABLE CURRANT_USER(
currant_user_id BIGSERIAL PRIMARY KEY NOT NULL,
email_address VARCHAR(50) NOT NULL,
salt VARCHAR (20) NOT NULL,
password VARCHAR (100) NOT NULL,
account_status VARCHAR (20) NOT NULL,
subscriber_type VARCHAR (20) NOT NULL,
active BOOLEAN NOT NULL,
CONSTRAINT user_email_address_unique UNIQUE (email_address)
);
CREATE TABLE PROFILE(
profile_id BIGSERIAL PRIMARY KEY NOT NULL,
currant_user_id BIGINT NOT NULL,
source VARCHAR (10) NOT NULL,
source_identifier VARCHAR (10) NOT NULL,
first_name VARCHAR (20),
last_name VARCHAR(20),
image_url VARCHAR (50),
bio VARCHAR (140),
city VARCHAR (50),
state VARCHAR(50),
country VARCHAR (50),
profile_level VARCHAR (10) NOT NULL,
preferred_time VARCHAR (10),
location_enabled BOOLEAN NOT NULL ,
new_game_notification BOOLEAN NOT NULL,
friend_activity_notification BOOLEAN NOT NULL,
news_promotions_notification BOOLEAN NOT NULL,
payment_receipt VARCHAR(100),
FOREIGN KEY (currant_user_id) REFERENCES currant_user (currant_user_id)
);
CREATE TABLE PUSH_NOTIFICATION_IDENTIFIER(
push_notification_identifier_id BIGSERIAL PRIMARY KEY NOT NULL,
identifier UUID  NOT NULL,
platform VARCHAR(10) NOT NULL,
profile_id BIGINT NOT NULL,
FOREIGN KEY (profile_id) REFERENCES PROFILE (profile_id),
CONSTRAINT push_notification_identifier_unique UNIQUE (identifier, platform, profile_id)
);
CREATE TABLE PROFILE_SPORT(
profile_id BIGINT NOT NULL,
sport_id BIGINT NOT NULL ,
sort_order INT NOT NULL,
FOREIGN KEY (profile_id) REFERENCES PROFILE(profile_id),
FOREIGN KEY (sport_id) REFERENCES SPORT(sport_id),
CONSTRAINT profile_sport_unique UNIQUE (profile_id, sport_id)
);
CREATE TABLE EQUIPMENT(
equipment_id BIGSERIAL PRIMARY KEY NOT NULL,
label VARCHAR (30) NOT NULL,
description VARCHAR (100),
image_url VARCHAR (50),
active BOOL NOT NULL ,
CONSTRAINT equipment_label_unique UNIQUE (label)
);
CREATE TABLE SPORT_EQUIPMENT(
sport_id BIGINT NOT NULL,
equipment_id BIGINT NOT NULL,
sort_order INT NOT NULL,
FOREIGN KEY (sport_id) REFERENCES SPORT(sport_id),
FOREIGN KEY (equipment_id) REFERENCES EQUIPMENT(EQUIPMENT_ID),
CONSTRAINT sport_equipment_unique UNIQUE (sport_id, equipment_id)
);
CREATE TABLE CONNECTION (
source_profile_id BIGINT NOT NULL,
target_profile_id BIGINT NOT NULL,
status VARCHAR(10) NOT NULL,
FOREIGN KEY (source_profile_id) REFERENCES PROFILE(profile_id),
FOREIGN KEY (target_profile_id) REFERENCES PROFILE(profile_id),
CONSTRAINT connection_unique UNIQUE (SOURCE_PROFILE_ID, TARGET_PROFILE_ID)
);
CREATE TABLE CLUB (
club_id BIGSERIAL PRIMARY KEY NOT NULL,
label VARCHAR (30) NOT NULL,
description VARCHAR(100),
location VARCHAR(100),
gps_coordinates VARCHAR(50),
club_icon BIGINT,
club_icon_back_color INT,
club_icon_front_color INT,
visibility VARCHAR(10) NOT NULL,
open_enrollment BOOLEAN NOT NULL,
status VARCHAR(10) NOT NULL,
byof BOOLEAN NOT NULL,
CONSTRAINT club_label_unique UNIQUE (label)
);
CREATE TABLE CLUB_ICON (
club_icon_id BIGSERIAL PRIMARY KEY NOT NULL,
image_url VARCHAR(50) NOT NULL,
locked BOOLEAN NOT NULL default(false),
CONSTRAINT club_icon_image_url_unique UNIQUE (image_url)
);
CREATE TABLE CLUB_IMAGE (
club_id BIGINT NOT NULL,
image_url VARCHAR(50) NOT NULL,
sort_order INT NOT NULL,
FOREIGN KEY (club_id) REFERENCES CLUB(club_id),
CONSTRAINT club_image_unique UNIQUE (club_id, image_url, sort_order)
);
CREATE TABLE CLUB_PROFILE_CONNECTION (
club_id BIGINT NOT NULL,
profile_id BIGINT NOT NULL,
status VARCHAR(10) NOT NULL,
FOREIGN KEY (club_id) REFERENCES CLUB(club_id),
FOREIGN KEY (profile_id) REFERENCES PROFILE(profile_id),
CONSTRAINT club_profile_connection_unique UNIQUE (club_id, profile_id)
);
CREATE TABLE CLUB_SPORT (
club_id BIGINT NOT NULL,
sport_id BIGINT NOT NULL,
sort_order INT NOT NULL,
FOREIGN KEY (club_id) REFERENCES CLUB(club_id),
FOREIGN KEY (sport_id) REFERENCES SPORT(sport_id),
CONSTRAINT club_sport_unique UNIQUE (club_id, sport_id, sort_order)
);
CREATE TABLE CLUB_WALL_POST (
club_wall_post_id BIGSERIAL PRIMARY KEY NOT NULL,
author_profile_id BIGINT NOT NULL,
club_id BIGINT NOT NULL,
text VARCHAR (200) NOT NULL,
image_url VARCHAR (50),
created TIMESTAMP NOT NULL,
parent_post_id BIGINT,
FOREIGN KEY (author_profile_id) REFERENCES PROFILE(profile_id),
FOREIGN KEY (club_id) references CLUB(club_id)
);
CREATE TABLE GAME (
game_id BIGSERIAL PRIMARY KEY NOT NULL,
sport_id BIGINT NOT NULL,
visibility VARCHAR(10) NOT NULL,
club_id BIGINT,
location VARCHAR(100),
gps_coordinates VARCHAR(50),
byof BOOLEAN NOT NULL,
game_time TIMESTAMP NOT NULL,
size INT NOT NULL,
intensity VARCHAR(10) NOT NULL,
description VARCHAR(200) NOT NULL,
status VARCHAR(10) NOT NULL,
waitlist_strategy VARCHAR(5) NOT NULL default('blast'),
FOREIGN KEY (sport_id) REFERENCES SPORT(sport_id),
FOREIGN KEY (club_id) REFERENCES CLUB(club_id)
);
CREATE TABLE GAME_PROFILE_CONNECTION (
game_id BIGINT NOT NULL,
profile_id BIGINT NOT NULL,
status VARCHAR(10) NOT NULL,
FOREIGN KEY (game_id) REFERENCES GAME(game_id),
FOREIGN KEY (profile_id) REFERENCES PROFILE(profile_id),
CONSTRAINT game_profile_connection_unique UNIQUE (game_id, profile_id)
);
CREATE TABLE GAME_EQUIPMENT (
game_id BIGINT NOT NULL,
equipment_id BIGINT NOT NULL,
amount INT,
claimed BOOL,
claimed_by_profile_id BIGINT,
sort_order INT NOT NULL,
FOREIGN KEY (game_id) REFERENCES GAME(game_id),
FOREIGN KEY (equipment_id) REFERENCES EQUIPMENT(equipment_id),
FOREIGN KEY (claimed_by_profile_id) REFERENCES PROFILE(profile_id),
CONSTRAINT game_equipment_unique UNIQUE (game_id, equipment_id)
);
CREATE TABLE GAME_PROFILE_STARRED (
game_id BIGINT NOT NULL,
profile_ID BIGINT NOT NULL,
FOREIGN KEY (game_id) REFERENCES GAME(game_id),
FOREIGN KEY (profile_id) REFERENCES PROFILE(profile_id),
CONSTRAINT game_profile_starred_unique UNIQUE (game_id, profile_id)
);
CREATE TABLE GAME_IMAGE (
game_id BIGINT NOT NULL,
image_url VARCHAR(50) NOT NULL,
sort_order INT NOT NULL,
FOREIGN KEY (game_id) REFERENCES GAME(game_id),
CONSTRAINT game_image_unique UNIQUE (game_id, image_url)
);