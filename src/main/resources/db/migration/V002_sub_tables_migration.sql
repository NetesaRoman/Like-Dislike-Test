-- Создание таблицы;
CREATE TABLE IF NOT EXISTS like_test.post_rating
(
    user_id int ,
    post_id int,
    PRIMARY KEY (user_id, post_id),
    FOREIGN KEY (user_id) REFERENCES like_test.user(id),
    FOREIGN KEY (post_id) REFERENCES like_test.post(id)

);







