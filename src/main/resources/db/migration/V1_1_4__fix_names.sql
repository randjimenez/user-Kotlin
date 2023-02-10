-- Client
ALTER TABLE client
    DROP COLUMN id;

ALTER TABLE client
    DROP COLUMN updateat;

ALTER TABLE client
    ADD COLUMN update_at DATE DEFAULT now();

ALTER TABLE client
    DROP COLUMN dnitype;

ALTER TABLE client
    ADD COLUMN dni_type VARCHAR;

ALTER TABLE client
    DROP COLUMN lastname;

ALTER TABLE client
    ADD COLUMN last_name VARCHAR;


--Cellphone
ALTER TABLE cellphone
    DROP COLUMN updateat;

ALTER TABLE cellphone
    DROP COLUMN cellphone;

ALTER TABLE cellphone
    ADD COLUMN cell_phone VARCHAR NOT NULL;

ALTER TABLE cellphone
    ADD COLUMN update_at DATE NOT NULL DEFAULT now();

--Address

ALTER TABLE address
    DROP COLUMN updateat;

ALTER TABLE address
    ADD COLUMN update_at DATE NOT NULL DEFAULT now();