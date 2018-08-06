-- user - admin,password - admin
-- '$2a$08$8U9wktOktnoo6Vinj7tovOlg/3EXOzoowovqCgKCBrN4gHRrVQhhi'
insert  into usr(id, username, password, active, email) values (1, 'admin', '$2a$08$.7DP/RZH7wpdH6KZCfUyqOkv1lyLX9O9wvoz4gRSkNMVqkRwZKfde', true , 'q@pay-mon.com');
insert into user_role (user_id, roles)
        values (1, 'USER'), (1, 'ADMIN');
