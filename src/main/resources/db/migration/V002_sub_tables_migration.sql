

-- Создание таблицы;
CREATE TABLE IF NOT EXISTS like_test.post_liked_users
(
    id serial PRIMARY KEY,
    user_id int,
    post_id int,
    FOREIGN KEY (user_id) REFERENCES like_test.user (id),
    FOREIGN KEY (post_id) REFERENCES like_test.post (id)
);

CREATE TABLE IF NOT EXISTS like_test.post_disliked_users
(
    id serial PRIMARY KEY,
    user_id int,
    post_id int,
    FOREIGN KEY (user_id) REFERENCES like_test.user (id),
    FOREIGN KEY (post_id) REFERENCES like_test.post (id)
);






