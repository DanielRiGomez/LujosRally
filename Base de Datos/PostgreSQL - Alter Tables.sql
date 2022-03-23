ALTER TABLE stock 
    ADD CONSTRAINT sto_ck_uni CHECK (unidades_stock >= 0);

ALTER TABLE sales 
    ADD CONSTRAINT sal_fk_idp FOREIGN KEY (id_product) REFERENCES stock(id_product),
    ADD CONSTRAINT sla_ck_uni CHECK (units_sales > 0);