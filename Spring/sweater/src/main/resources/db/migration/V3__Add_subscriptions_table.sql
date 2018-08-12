-- create table user_subscriptions (
--     channel_id bigint not null references usr,
--     subscriber_id bigint not null references usr,
--     primary key (channel_id, subscriber_id)
-- );

create table user_subscriptions (
    channel_id bigint not null default 1,
    subscriber_id bigint not null,
    primary key (channel_id, subscriber_id),
    foreign key (channel_id) references usr(id),
    foreign key (subscriber_id) references usr(id)
);
