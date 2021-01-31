DROP TABLE IF EXISTS product;
CREATE TABLE product (
id bigint primary key auto_increment,
name varchar(50) not null,
price decimal(8,2) not null,
score int not null,
image varchar(100) not null);

INSERT INTO product(name,price,score,image) values('Super Mario Odyssey','197.88',100,'super-mario-odyssey.png');
INSERT INTO product(name,price,score,image) values('Call Of Duty Infinite Warfare','49.99',80,'call-of-duty-infinite-warfare.png');
INSERT INTO product(name,price,score,image) values('The Witcher III Wild Hunt','119.5',250,'the-witcher-iii-wild-hunt.png');
INSERT INTO product(name,price,score,image) values('Call Of Duty WWII','249.99',205,'call-of-duty-wwii.png');
INSERT INTO product(name,price,score,image) values('Mortal Kombat XL','69.99',150,'mortal-kombat-xl.png');
INSERT INTO product(name,price,score,image) values('Shards of Darkness','71.94',400,'shards-of-darkness.png');
INSERT INTO product(name,price,score,image) values('Terra Média: Sombras de Mordo','79.99',50,'terra-media-sombras-de-mordor.png');
INSERT INTO product(name,price,score,image) values('FIFA 18','195.39',325,'fifa-18.png');
INSERT INTO product(name,price,score,image) values('Horizon Zero Dawn','115.8',290,'horizon-zero-dawn.png');
INSERT INTO product(name,price,score,image) values('Grand Theft Auto V','69.99',350,'grand-theft-auto5.png');
INSERT INTO product(name,price,score,image) values('Cyberpunk 2077','179.90',90,'cyberpunk-2077.png');
INSERT INTO product(name,price,score,image) values('Game Returnal','290.39',180,'game-returnal.png');