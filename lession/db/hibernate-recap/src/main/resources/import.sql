INSERT INTO employee_type VALUES (1, 'Developer');
INSERT INTO employee_type VALUES (2, 'Manager');

INSERT INTO employee (name, surname, email, phone_number, employee_type_id) VALUES ('Antanas', 'Antanaitis', 'a@a.lt', '87654321', 1);
INSERT INTO employee (name, surname, email, phone_number, employee_type_id) VALUES ('Vardas', 'Pavardenis', 'a@a.lt', '87654321', 2);
INSERT INTO employee (name, surname, email, employee_type_id) VALUES ('Vardas', 'Pavardenis', 'c@a.lt', 1);
