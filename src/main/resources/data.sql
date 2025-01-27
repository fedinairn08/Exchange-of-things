INSERT INTO users(id, login, name, password, surname, role) VALUES (14543, '1', 'First', '1', 'First', 'USER');
INSERT INTO users(id, login, name, password, surname, role) VALUES (23445, '2', 'Second', '2', 'Second', 'ADMIN');

INSERT INTO thing(id, thing_status, name, description, number_of_views, user_id) VALUES (14567, 'NOT_EXPOSED', 'Тапок',
    'Одинокий тапок без пары', 0, 14543);
INSERT INTO thing(id, thing_status, name, description, number_of_views, user_id) VALUES (5647, 'NOT_EXPOSED', 'Тапок',
                                                                                         'Одинокий тапок без пары', 0, 14543);
INSERT INTO thing(id, thing_status, name, description, number_of_views, user_id) VALUES (5648, 'NOT_EXPOSED', 'Тапок',
                                                                                         'Одинокий тапок без пары', 0, 14543);
INSERT INTO thing(id, thing_status, name, description, number_of_views, user_id) VALUES (5649, 'NOT_EXPOSED', 'Тапок',
                                                                                         'Одинокий тапок без пары', 0, 14543);

INSERT INTO application(application_status, desirable_thing_id, id, request_date, thing_to_exchange_id,
                       user_of_desirable_thing_id, user_of_thing_to_exchange_id) VALUES ('UNDER_CONSIDERATION', 14567, 14567, TO_DATE('03-09-2024', 'DD-MM-YYYY'), 1, 1, 2)