ALTER TABLE cellphone
    ADD CONSTRAINT cellphone_un_max_two_phones UNIQUE (dni_client, principal);