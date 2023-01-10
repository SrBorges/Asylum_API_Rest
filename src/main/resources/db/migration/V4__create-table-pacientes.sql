create table pacientes(

id bigint not null auto_increment,
nome varchar(100) not null,
telefone varchar(60) not null,
nivel varchar(100) not null,
condicao varchar(60) not null,
encaminhado varchar(100) not null,
tratamento varchar(60) not null,
medicacao varchar(60) not null,
logradouro varchar(50) not null,
bairro varchar(50) not null,
cep varchar(50) not null,
cidade varchar(100) not null,
uf varchar(2) not null,
numero varchar(20) not null,
complemento varchar(60) not null,

primary key(id)


)