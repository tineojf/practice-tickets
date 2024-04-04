-- data
-- person
INSERT INTO person (dni, nameuser, lastnameuser) VALUES (1, 'John', 'Doe');
INSERT INTO person (dni, nameuser, lastnameuser) VALUES (2, 'Jane', 'Smith');
INSERT INTO person (dni, nameuser, lastnameuser) VALUES (3, 'Michael', 'Johnson');
INSERT INTO person (dni, nameuser, lastnameuser) VALUES (4, 'Emily', 'Brown');
INSERT INTO person (dni, nameuser, lastnameuser) VALUES (5, 'David', 'Martinez');
INSERT INTO person (dni, nameuser, lastnameuser) VALUES (6, 'Sarah', 'Anderson');
INSERT INTO person (dni, nameuser, lastnameuser) VALUES (7, 'Daniel', 'Wilson');

-- company
INSERT INTO company (companynro, namecompany) VALUES (1, 'ABC Corporation');
INSERT INTO company (companynro, namecompany) VALUES (2, 'XYZ Enterprises');
INSERT INTO company (companynro, namecompany) VALUES (3, 'Smith and Co');
INSERT INTO company (companynro, namecompany) VALUES (4, 'Johnson Ltd');
INSERT INTO company (companynro, namecompany) VALUES (5, 'Brown Industries');
INSERT INTO company (companynro, namecompany) VALUES (6, 'Anderson Group');
INSERT INTO company (companynro, namecompany) VALUES (7, 'Wilson Partners');

-- place
INSERT INTO place (placeid, nameplace) VALUES (1, 'New York');
INSERT INTO place (placeid, nameplace) VALUES (2, 'Los Angeles');
INSERT INTO place (placeid, nameplace) VALUES (3, 'Chicago');
INSERT INTO place (placeid, nameplace) VALUES (4, 'Houston');
INSERT INTO place (placeid, nameplace) VALUES (5, 'Miami');
INSERT INTO place (placeid, nameplace) VALUES (6, 'San Francisco');
INSERT INTO place (placeid, nameplace) VALUES (7, 'Seattle');

-- phone
INSERT INTO phone (phoneid, phonenumber, person_dni) VALUES (1, '123-456-7890', 1);
INSERT INTO phone (phoneid, phonenumber, person_dni) VALUES (2, '987-654-3210', 2);
INSERT INTO phone (phoneid, phonenumber, person_dni) VALUES (3, '555-555-5555', 3);
INSERT INTO phone (phoneid, phonenumber, person_dni) VALUES (4, '111-222-3333', 4);
INSERT INTO phone (phoneid, phonenumber, person_dni) VALUES (5, '999-888-7777', 5);
INSERT INTO phone (phoneid, phonenumber, person_dni) VALUES (6, '444-555-6666', 6);
INSERT INTO phone (phoneid, phonenumber, person_dni) VALUES (7, '777-888-9999', 7);

-- address
INSERT INTO address (addressid, addressname, person_dni) VALUES (1, '123 Main St', 1);
INSERT INTO address (addressid, addressname, person_dni) VALUES (2, '456 Elm St', 2);
INSERT INTO address (addressid, addressname, person_dni) VALUES (3, '789 Oak St', 3);
INSERT INTO address (addressid, addressname, person_dni) VALUES (4, '101 Pine St', 4);
INSERT INTO address (addressid, addressname, person_dni) VALUES (5, '222 Maple St', 5);
INSERT INTO address (addressid, addressname, person_dni) VALUES (6, '333 Cedar St', 6);
INSERT INTO address (addressid, addressname, person_dni) VALUES (7, '444 Pineapple St', 7);

-- ticket
INSERT INTO ticket (ticketnro, dateticket, timeticket, place_origin, place_destination, person_dni, company_companynro) 
VALUES (1, TO_DATE('2024-04-01 12:30:00', 'YYYY-MM-DD HH24:MI:SS'), TO_TIMESTAMP('12:30:00', 'HH24:MI:SS'), 1, 2, 1, 1);
INSERT INTO ticket (ticketnro, dateticket, timeticket, place_origin, place_destination, person_dni, company_companynro) 
VALUES (2, TO_DATE('2024-05-02 12:30:00', 'YYYY-MM-DD HH24:MI:SS'), TO_TIMESTAMP('10:00:00', 'HH24:MI:SS'), 2, 3, 2, 2);
INSERT INTO ticket (ticketnro, dateticket, timeticket, place_origin, place_destination, person_dni, company_companynro) 
VALUES (3, TO_DATE('2024-05-03 12:30:00', 'YYYY-MM-DD HH24:MI:SS'), TO_TIMESTAMP('14:30:00', 'HH24:MI:SS'), 3, 4, 3, 3);
INSERT INTO ticket (ticketnro, dateticket, timeticket, place_origin, place_destination, person_dni, company_companynro) 
VALUES (4, TO_DATE('2024-06-04 12:30:00', 'YYYY-MM-DD HH24:MI:SS'), TO_TIMESTAMP('15:30:00', 'HH24:MI:SS'), 4, 5, 4, 4);
INSERT INTO ticket (ticketnro, dateticket, timeticket, place_origin, place_destination, person_dni, company_companynro) 
VALUES (5, TO_DATE('2024-07-05 12:30:00', 'YYYY-MM-DD HH24:MI:SS'), TO_TIMESTAMP('16:30:00', 'HH24:MI:SS'), 5, 1, 5, 5);
INSERT INTO ticket (ticketnro, dateticket, timeticket, place_origin, place_destination, person_dni, company_companynro) 
VALUES (6, TO_DATE('2024-04-06 12:30:00', 'YYYY-MM-DD HH24:MI:SS'), TO_TIMESTAMP('03:30:00', 'HH24:MI:SS'), 6, 2, 6, 6);
INSERT INTO ticket (ticketnro, dateticket, timeticket, place_origin, place_destination, person_dni, company_companynro) 
VALUES (7, TO_DATE('2024-10-07 12:30:00', 'YYYY-MM-DD HH24:MI:SS'), TO_TIMESTAMP('22:00:00', 'HH24:MI:SS'), 7, 3, 7, 7);




-- joins
-- ticket + person
SELECT t.ticketnro, t.dateticket, t.timeticket, p.nameuser, p.lastnameuser
FROM ticket t
JOIN person p ON t.person_dni = p.dni;

-- ticket + company
SELECT t.ticketnro, t.dateticket, t.timeticket, c.namecompany, o.nameplace as origin, d.nameplace as destination
FROM ticket t
JOIN company c ON t.company_companynro = c.companynro
JOIN place o ON t.place_origin = o.placeid
JOIN place d ON t.place_destination = d.placeid;

-- person + phone + address
SELECT p.nameuser, p.lastnameuser, ph.phonenumber, a.addressname
FROM phone ph
JOIN person p ON ph.person_dni = p.dni
JOIN address a ON a.person_dni = p.dni;

-- company + person
SELECT c.namecompany, p.nameuser, p.lastnameuser
FROM ticket t
JOIN person p ON t.person_dni = p.dni
JOIN company c ON t.company_companynro = c.companynro;

-- person + place
SELECT p.nameuser, p.lastnameuser, o.nameplace AS origin, d.nameplace AS destination, t.dateticket
FROM ticket t
JOIN person p ON t.person_dni = p.dni
JOIN place o ON t.place_origin = o.placeid
JOIN place d ON t.place_destination = d.placeid;

