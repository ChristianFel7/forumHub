create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensagem varchar(10000) not null,
    data DATETIME not null,
    estado varchar(100)  not null,
    autor varchar(100) not null,
    curso varchar(100) not null,



    primary key(id)

);