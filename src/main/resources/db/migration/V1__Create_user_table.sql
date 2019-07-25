create table user(
                   id int AUTO_INCREMENT primary key not null ,
                   account_id varchar(100),
                   name varchar(50),
                   token varchar(36),
                   GMT_CREATE bigint,
                   GMT_MODIFIED bigint
);