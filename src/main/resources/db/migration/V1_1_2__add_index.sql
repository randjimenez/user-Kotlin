ALTER TABLE client
    ADD CONSTRAINT client_un UNIQUE (dni);

CREATE INDEX client_dni_idx ON client USING btree (dni);

--Foreign Key
ALTER TABLE cellphone
    ADD CONSTRAINT cellphone_fk FOREIGN KEY (client_dni) REFERENCES client(dni);

ALTER TABLE address
    ADD CONSTRAINT address_fk FOREIGN KEY (client_dni) REFERENCES client(dni);