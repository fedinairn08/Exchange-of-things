INSERT INTO users(id, login, name, password, surname, role) VALUES (14543, '1', 'First', '1', 'First', 'USER');
INSERT INTO users(id, login, name, password, surname, role) VALUES (23445, '2', 'Second', '2', 'Second', 'ADMIN');

INSERT INTO thing(id, thing_status, name, description, link_to_photo, number_of_views) VALUES (14567, 'NOT_EXPOSED', 'Тапок',
    'Одинокий тапок без пары', 'resources/tapok.jpeg', 0);

INSERT INTO application(application_status, desirable_thing_id, id, request_date, thing_to_exchange_id,
                       user_of_desirable_thing_id, user_of_thing_to_exchange_id) VALUES ('UNDER_CONSIDERATION', 14567, 14567, TO_DATE('03-09-2024', 'DD-MM-YYYY'), 1, 1, 2)