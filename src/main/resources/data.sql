INSERT INTO users(id, login, name, password, surname) VALUES (14543, '1', 'First', '1', 'First');
INSERT INTO users(id, login, name, password, surname) VALUES (23445, '2', 'Second', '2', 'Second');

INSERT INTO thing(id, thing_status, name, description, link_to_photo, number_of_views) VALUES (1, 'NOT_EXPOSED', 'Тапок',
    'Одинокий тапок без пары', 'resources/tapok.jpeg', 0);

INSERT INTO application(application_status, desirable_thing_id, id, request_date, thing_to_exchange_id,
                       user_of_desirable_thing_id, user_of_thing_to_exchange_id) VALUES ('UNDER_CONSIDERATION', 1, 1, TO_DATE('03-09-2024', 'DD-MM-YYYY'), 1, 1, 2)