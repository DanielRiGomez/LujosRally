INSERT INTO users (nombre_user, password_user) VALUES ('Daneil Gomez','13');
INSERT INTO users (nombre_user, password_user) VALUES ('Gomez gonzalez','21');
INSERT INTO users (nombre_user, password_user) VALUES ('Daneil','12');
INSERT INTO users (nombre_user, password_user) VALUES ('Gomez','13');

INSERT INTO stock (name_product, tipo_carro, marca, referencia, feature, descripcion, unidades_stock, valor_sugerido) VALUES ('product_1','carro_1', 'marca_1', 'referencia_1', 'feature_1', '', 4, 100);
INSERT INTO stock (name_product, tipo_carro, marca, referencia, feature, descripcion, unidades_stock, valor_sugerido) VALUES ('product_2','carro_2', 'marca_2', '', 'feature_1', 'descripcion_1', 4, 100);
INSERT INTO stock (name_product, tipo_carro, marca, referencia, feature, descripcion, unidades_stock, valor_sugerido) VALUES ('product_3','carro_3', '', 'referencia_2', 'feature_3', '', 4, 100);
INSERT INTO stock (name_product, tipo_carro, marca, referencia, feature, descripcion, unidades_stock, valor_sugerido) VALUES ('product_4','carro_2', '', 'referencia_3', 'feature_4', 'descripcion_1', 4, 100);
INSERT INTO stock (name_product, tipo_carro, marca, referencia, feature, descripcion, unidades_stock, valor_sugerido) VALUES ('product_5','carro_1', 'marca_1', '', '', 'descripcion_1', 4, 100);

INSERT INTO sales (name_product, date_sale, units_sales, valor_venta, id_product, id_user) VALUES ('product_1','2022/02/26', 2, 5000, 2, 4);
INSERT INTO sales (name_product, date_sale, units_sales, valor_venta, id_product, id_user) VALUES ('product_2','2022/01/26', 2, 5000, 4, 2);
INSERT INTO sales (name_product, date_sale, units_sales, valor_venta, id_product, id_user) VALUES ('product_1','2022/03/26', 2, 5000, 3, 3);
INSERT INTO sales (name_product, date_sale, units_sales, valor_venta, id_product, id_user) VALUES ('product_2','2022/04/26', 2, 5000, 2, 1);