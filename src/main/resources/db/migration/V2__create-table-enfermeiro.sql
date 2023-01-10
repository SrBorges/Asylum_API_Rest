create table enfermeiro(

id bigint not null auto_increment,
nome varchar(100) not null,
telefone varchar(60) not null,
email varchar(100) not null unique,
coren varchar(60) not null unique,
especialidade varchar(100) not null,
logradouro varchar(50) not null,
bairro varchar(50) not null,
cep varchar(50) not null,
cidade varchar(100) not null,
uf varchar(2) not null,
numero varchar(20) not null,
complemento varchar(60) not null,

primary key(id)



)