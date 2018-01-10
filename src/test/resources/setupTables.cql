CREATE TABLE customer (id TimeUUID PRIMARY KEY, firstname text, lastname text);
CREATE INDEX customerfistnameindex ON customer (firstname);
CREATE INDEX customersecondnameindex ON customer (lastname);
INSERT INTO customer(id, firstname, lastname) values (c5733ee8-f5a2-11e7-8c3f-9a214cf093ae, 'Eduardo', 'Hernandez');