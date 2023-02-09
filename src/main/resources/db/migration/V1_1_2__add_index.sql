ALTER TABLE client
    ADD CONSTRAINT client_un UNIQUE (dni_client);

CREATE INDEX client_dni_idx ON client USING btree (dni_client);

--Foreign Key
ALTER TABLE cellphone
    ADD CONSTRAINT cellphone_fk FOREIGN KEY (dni_client) REFERENCES client(dni_client);

ALTER TABLE address
    ADD CONSTRAINT address_fk FOREIGN KEY (dni_client) REFERENCES client(dni_client);