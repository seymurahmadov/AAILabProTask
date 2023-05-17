CREATE TABLE customers (
                           id BIGINT,
                           username varchar(255),
                           first_name varchar(255),
                           last_name varchar(255)
);


CREATE TABLE orders (
                        id BIGINT,
                        customer_id int,
                        product_name varchar(255),
                        price int
);