--Primary Key
ALTER TABLE client
    ADD CONSTRAINT client_pk PRIMARY KEY (id);

ALTER TABLE cellphone
    ADD CONSTRAINT cellphone_pk PRIMARY KEY (id);

ALTER TABLE address
    ADD CONSTRAINT address_pk PRIMARY KEY (id);