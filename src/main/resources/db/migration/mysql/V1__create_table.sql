create TABLE bets (
    id BIGINT NOT NULL,
    numbets INT,
    game varchar(255),
    stake DECIMAL(30, 2),
    returns DECIMAL(30, 2),
    client_id BIGINT,
    date Date,
    primary key(id)
);









