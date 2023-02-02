--Primary Key

ALTER TABLE client
    ADD CONSTRAINT client_pk PRIMARY KEY (dni);

ALTER TABLE cellphone
    ADD CONSTRAINT cellphone_pk PRIMARY KEY (id);

ALTER TABLE address
    ADD CONSTRAINT address_pk PRIMARY KEY (id);

--Foreign Key
ALTER TABLE cellphone
    ADD CONSTRAINT cellphone_fk FOREIGN KEY (client_id) REFERENCES client(dni);

ALTER TABLE address
    ADD CONSTRAINT address_fk FOREIGN KEY (client_id) REFERENCES client(dni);