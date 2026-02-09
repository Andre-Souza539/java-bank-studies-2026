create table  tb_users (
   id UUID DEFAULT RANDOM_UUIDa() PRIMARY KEY,
   first_name varchar(50) not null,
   last_name varchar(50) not null,
   email varchar(255) not null unique,
   created_at timestamp default current_timestamp
);

create table tb_accounts (
    id uuid default random_uuid() primary key,
    user_id uuid not null,
    bank_name varchar(100) not null,
    account_number varchar(30) not null,
    balance decimal(15,2) default 0.00,
    created_at timestamp default current_timestamp

    constraints fk_accounts_user
        foreign key (user_id)
        references tb_users(id)
        on delete cascade
);

