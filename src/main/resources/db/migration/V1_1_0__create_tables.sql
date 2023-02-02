CREATE TABLE client
(
    name      varchar NOT NULL,
    lastname  varchar NOT NULL,
    dni       varchar NOT NULL,
    dnitype   varchar NOT NULL,
    createdat date    NOT NULL,
    updateat  date    NOT NULL
);

CREATE TABLE address
(
    id        varchar NOT NULL,
    longitude varchar NOT NULL,
    latitude  varchar NOT NULL,
    address   varchar NOT NULL,
    enabled   bool    NOT NULL,
    deleted   bool    NOT NULL,
    client_id varchar NOT NULL,
    createdat date    NOT NULL,
    updateat  date    NOT NULL
);

CREATE TABLE cellphone
(
    id        varchar NOT NULL,
    cellphone varchar NOT NULL,
    client_id varchar NOT NULL,
    principal bool    NOT NULL,
    enabled   bool    NOT NULL,
    createdat date    NOT NULL,
    updateat  date NULL
);