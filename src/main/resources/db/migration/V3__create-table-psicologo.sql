create table psicologo(

id bigint not null auto_increment,
nome varchar(100) not null,
telefone varchar(60) not null,
email varchar(100) not null unique,
crp varchar(60) not null unique,
logradouro varchar(50) not null,
bairro varchar(50) not null,
cep varchar(50) not null,
cidade varchar(100) not null,
uf varchar(2) not null,
numero varchar(20) not null,
complemento varchar(60) not null,

primary key(id)



)