CREATE TABLE  "CLIENTE" 
   (    "CODIGO" VARCHAR2(10) NOT NULL ENABLE, 
    "APELLIDOS" VARCHAR2(70), 
    "NOMBRES" VARCHAR2(50), 
    "FEC_NAC" DATE, 
    "DIRECCION" VARCHAR2(100), 
    "DNI" VARCHAR2(8), 
    "SEXO" CHAR(1), 
    "EST_CIVIL" VARCHAR2(15), 
     CONSTRAINT "CLIENTE_PK" PRIMARY KEY ("CODIGO") ENABLE
   ) ;CREATE TABLE  "CUENTA" 
   (    "NUM_CTA" VARCHAR2(20), 
    "FEC_APT" DATE, 
    "POSEEDOR" VARCHAR2(10), 
    "TIPO" VARCHAR2(7), 
    "TIPO_MONEDA" VARCHAR2(7), 
    "SALDO" NUMBER(7,2), 
    "LIMITE" NUMBER(7,2), 
     CONSTRAINT "CUENTA_PK" PRIMARY KEY ("NUM_CTA") ENABLE
   ) ;CREATE TABLE  "EMPLEADO" 
   (    "CODIGO" VARCHAR2(10), 
    "APELLIDOS" VARCHAR2(70), 
    "NOMBRES" VARCHAR2(60), 
    "FEC_NAC" DATE, 
    "FEC_ING" DATE, 
    "AFP" VARCHAR2(30), 
    "DIRECCION" VARCHAR2(50), 
    "TELEF" VARCHAR2(15), 
     CONSTRAINT "EMPLEADO_PK" PRIMARY KEY ("CODIGO") ENABLE
   ) ;CREATE TABLE  "PARAMETRO" 
   (    "TABLA" NUMBER(2,0) NOT NULL ENABLE, 
    "PARAM" VARCHAR2(7) NOT NULL ENABLE, 
    "DESCRIPCION" VARCHAR2(90), 
     CONSTRAINT "PARAMETRO_PK" PRIMARY KEY ("TABLA", "PARAM") ENABLE
   ) ;CREATE TABLE  "TRANSACCIONES" 
   (    "OPERACION" NUMBER(8,0), 
    "MONTO" NUMBER(7,2), 
    "FECHA" VARCHAR2(10), 
    "HORA" VARCHAR2(10), 
    "CLIENTE" VARCHAR2(10), 
    "CUENTA" VARCHAR2(20), 
    "TRANSACCION" VARCHAR2(7), 
     CONSTRAINT "TRANSACCIONES_PK" PRIMARY KEY ("OPERACION") ENABLE
   ) ;CREATE TABLE  "UBIGEO" 
   (    "ID" NUMBER(4,0) NOT NULL ENABLE, 
    "DPTO" VARCHAR2(7), 
    "PROV" VARCHAR2(7), 
    "DIST" VARCHAR2(7), 
    "NOMBRE" VARCHAR2(40), 
     CONSTRAINT "UBIGEO_PK" PRIMARY KEY ("ID") ENABLE
   ) ;CREATE TABLE  "USUARIO" 
   (    "CODIGO" VARCHAR2(10), 
    "ALIAS" VARCHAR2(30), 
    "CLAVE" VARCHAR2(30), 
    "NOMBRE" VARCHAR2(70), 
    "PERFIL" NUMBER, 
     CONSTRAINT "USUARIO_PK" PRIMARY KEY ("CODIGO") ENABLE
   ) ;ALTER TABLE  "CUENTA" ADD CONSTRAINT "CUENTA_CON" FOREIGN KEY ("POSEEDOR")
      REFERENCES  "CLIENTE" ("CODIGO") ENABLE;CREATE UNIQUE INDEX  "CLIENTE_PK" ON  "CLIENTE" ("CODIGO") 
  ;CREATE UNIQUE INDEX  "CUENTA_PK" ON  "CUENTA" ("NUM_CTA") 
  ;CREATE UNIQUE INDEX  "EMPLEADO_PK" ON  "EMPLEADO" ("CODIGO") 
  ;CREATE UNIQUE INDEX  "PARAMETRO_PK" ON  "PARAMETRO" ("TABLA", "PARAM") 
  ;CREATE UNIQUE INDEX  "TRANSACCIONES_PK" ON  "TRANSACCIONES" ("OPERACION") 
  ;CREATE UNIQUE INDEX  "UBIGEO_PK" ON  "UBIGEO" ("ID") 
  ;CREATE UNIQUE INDEX  "USUARIO_PK" ON  "USUARIO" ("CODIGO") 
  ; CREATE SEQUENCE   "TRANSACCIONES_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE ;