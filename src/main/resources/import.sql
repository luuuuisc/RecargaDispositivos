
INSERT INTO tb_client  (name, email, phone) VALUES ('Luiz Silva', 'luiz@example.com', '999888777');
INSERT INTO tb_client  (name, email, phone) VALUES ('Maria Souza', 'maria@example.com', '999777666');

INSERT INTO tb_payment (quantity, payment_method, client_id) VALUES (100.00, 0, 1);
INSERT INTO tb_payment (quantity, payment_method, client_id) VALUES (150.00, 1, 2);

INSERT INTO tb_recharge (amount, moment, status_recharge, client_id, payment_id) VALUES (100.00, TIMESTAMP WITH TIME ZONE '2024-06-02T23:36:00Z', 0, 1, 1);
INSERT INTO tb_recharge (amount, moment, status_recharge, client_id, payment_id) VALUES (150.00, TIMESTAMP WITH TIME ZONE '2024-06-03T20:36:00Z', 1, 2, 2);