CREATE TABLE client
(
    id        bigint  NOT NULL,
    name      varchar NOT NULL,
    lastname  varchar NOT NULL,
    dni       bigint  NOT NULL,
    dnitype   varchar NOT NULL,
    createdat date    NOT NULL,
    updateat  date    NOT NULL
);

CREATE TABLE address
(
    id         bigint  NOT NULL,
    longitude  varchar NOT NULL,
    latitude   varchar NOT NULL,
    address    varchar NOT NULL,
    enabled    bool    NOT NULL,
    deleted    bool    NOT NULL,
    client_dni bigint  NOT NULL,
    createdat  date    NOT NULL,
    updateat   date    NOT NULL
);

CREATE TABLE cellphone
(
    id         bigint  NOT NULL,
    cellphone  varchar NOT NULL,
    client_dni bigint  NOT NULL,
    principal  bool    NOT NULL,
    enabled    bool    NOT NULL,
    createdat  date    NOT NULL,
    updateat   date  NOT NULL
);