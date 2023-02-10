--Drop Foreign Key
ALTER TABLE cellphone
    DROP CONSTRAINT cellphone_fk;

ALTER TABLE address
    DROP CONSTRAINT address_fk;

ALTER TABLE client
    DROP CONSTRAINT client_un;

DROP INDEX client_dni_idx;

ALTER TABLE client
    DROP CONSTRAINT client_pk;


ALTER TABLE client
    ADD CONSTRAINT client_pk PRIMARY KEY (dni_client);

ALTER TABLE cellphone
    ADD CONSTRAINT cellphone_fk FOREIGN KEY (dni_client) REFERENCES client (dni_client);

ALTER TABLE address
    ADD CONSTRAINT address_fk FOREIGN KEY (dni_client) REFERENCES client (dni_client);

ALTER TABLE client
    DROP COLUMN createdat;

ALTER TABLE cellphone
    DROP COLUMN createdat;

ALTER TABLE cellphone
    DROP COLUMN enabled;

ALTER TABLE address
    DROP COLUMN createdat;

ALTER TABLE address
    DROP COLUMN enabled;

ALTER TABLE address
    DROP COLUMN deleted;
