CREATE TABLE users (
    id_user           SERIAL         PRIMARY KEY,
    nombre_user       VARCHAR(50)    NOT NULL,
    password_user     VARCHAR(15)     NOT NULL
);

CREATE TABLE stock (
    id_product        SERIAL         PRIMARY KEY,
    name_product      VARCHAR(40)    NOT NULL,
    tipo_carro        VARCHAR(20)    NOT NULL,
    marca             VARCHAR(20)    ,
    referencia        VARCHAR(20)    ,
    feature           VARCHAR(30)    ,
    descripcion       VARCHAR(50)    ,
    unidades_stock    INT4           NOT NULL,
    valor_sugerido    MONEY          NOT NULL
);

CREATE TABLE sales (
    id_sale          SERIAL         PRIMARY KEY,
    name_product     VARCHAR(60)    NOT NULL,
    date_sale        DATE           NOT NULL,
    units_sales      INT4           NOT NULL,
    valor_venta      MONEY          NOT NULL,
    id_product       INT8           NOT NULL,
    id_user          INT4           NOT NULL
);