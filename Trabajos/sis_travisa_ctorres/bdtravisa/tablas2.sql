-- =============================================
-- CRACIÓN DEL USUARIO
-- =============================================

DECLARE
	N INT;
	COMMAND VARCHAR2(200);
BEGIN
	COMMAND := 'DROP USER VENTAS CASCADE';
	SELECT COUNT(*) INTO N
	FROM DBA_USERS
	WHERE USERNAME = 'VENTAS';
	IF ( N = 1 ) THEN
		EXECUTE IMMEDIATE COMMAND;
	END IF;
END;
/

CREATE USER ventas IDENTIFIED BY admin;

GRANT CONNECT, RESOURCE TO ventas;
GRANT CREATE VIEW TO ventas;


-- =============================================
-- CONECTARSE A ORACLE
-- =============================================

CONNECT ventas/admin



CREATE TABLE Proveedor
(
	idProveedor	 char(5) NOT NULL,
	RazonSocial	 varchar(60) NOT NULL,
	Direccion	 varchar(60) NOT NULL,
	Ruc		 varchar(11) NOT NULL,
	Telefono	 varchar(15) NOT NULL,
 	CONSTRAINT XPKProveedor PRIMARY KEY (idProveedor)
);

CREATE TABLE Empleado
(
	idEmpleado	 char(5) NOT NULL,
	Nombre	 varchar(20) NOT NULL,
	Apellidos	 varchar(25) NOT NULL,
	Email		 varchar(50) NOT NULL,
	Usuario	 varchar(20) NOT NULL,
	Clave		varchar(20) NOT NULL,
 	CONSTRAINT XPKEmpleado PRIMARY KEY (idEmpleado)
);

CREATE TABLE Categoria
(
	idcategoria	number not null,
	Nombre	varchar(20) NOT NULL,
	CONSTRAINT XPKLinea PRIMARY KEY (idcategoria)
 );

CREATE TABLE Producto
(
	idProducto	 char(5) Not null,
	Descripcion	 varchar(50) NOT NULL,
	idcategoria	 number NOT NULL,
	PrecioVenta	 number(8,2) NOT NULL,
        Preciocompra             number(8,2) NOT NULL,
	Stock		 number NOT NULL,
	CONSTRAINT XPKProducto PRIMARY KEY (idProducto),
	CONSTRAINT fk_Productos_Categorias FOREIGN KEY (idcategoria) REFERENCES Categoria
 );


CREATE TABLE Cliente(
	idCliente	 char(5) NOT NULL,
	Nombre	 varchar(60) NOT NULL,
	Direccion	 varchar(60) NOT NULL,
	RucDNI	 varchar(11) NOT NULL,
	Telefono	 varchar(15) NOT NULL,
	 CONSTRAINT XPKCliente PRIMARY KEY (idCliente)
	);


CREATE TABLE Control
(
	Parametro	 varchar(20) NOT NULL,
	Valor	 	 number  NOT NULL,
	CONSTRAINT XPKcontrol PRIMARY KEY (Parametro)
);


CREATE TABLE Compra
(
	idCompra numeric NOT NULL,
	idProveedor char(5) NOT NULL,
	idEmpleado char(5) NOT NULL,
	TipoDoc varchar(20) NOT NULL,
	NroDoc varchar(7) NOT NULL,
	Fecha date NOT NULL,
	SubTotal number(8,2) NOT NULL,
	Igv number(8,2) NOT NULL,
	Total number(8,2) NOT NULL,
	CONSTRAINT XPKCompras PRIMARY KEY (idCompra),
	CONSTRAINT fk_compras_proveedores FOREIGN KEY (idProveedor) REFERENCES proveedor
);
 
CREATE TABLE Venta
(
	idVenta number NOT NULL,
	idCliente char(5) NOT NULL,
	idEmpleado char(5) NOT NULL,
	Fecha date NOT NULL,
	Total number(8,2) NOT NULL,
	CONSTRAINT XPKVentas PRIMARY KEY (idVenta),
	CONSTRAINT fk_ventas_clientes Foreign Key (idCliente) References Cliente,
	CONSTRAINT fk_ventas_empleados Foreign Key (idEmpleado) References Empleado
); 

CREATE TABLE DetalleVenta
(
	idVenta number NOT NULL,
	idProducto char(5) NOT NULL,
	Precio number(8,2) NOT NULL,
	Cantidad number NOT NULL,
	Importe number(8,2) NOT NULL,
        CONSTRAINT DetalleVenta_PK PRIMARY KEY(idVenta,idProducto),
	CONSTRAINT fk_detalleventas_ventas Foreign Key (idVenta) references Venta,
	CONSTRAINT fk_detalleventas_productos Foreign Key (idProducto) references Producto
);




CREATE TABLE DetalleCompra
(
	idCompra number NOT NULL,
	idProducto char(5) NOT NULL,
	PrecioCompra number(8,2) NOT NULL,
	Cantidad number NOT NULL,
	Importe number(8,2) NOT NULL,
	CONSTRAINT fk_detallecompras_compras Foreign Key (idCompra) References Compra,
	CONSTRAINT fk_detallecompras_productos Foreign Key (idProducto) References Producto
);
















