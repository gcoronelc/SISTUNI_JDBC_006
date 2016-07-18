
-----------------------

--Categoria

insert into Categoria(idcategoria,nombre) values(1,'ZAPATOS DE BEBES');
insert into Categoria(idcategoria,nombre) values(2,'ZAPATO DE CABALLEROS');
insert into Categoria(idcategoria,nombre) values(3,'ZAPATOS NIÑOS');
insert into Categoria(idcategoria,nombre) values(4,'ROPA DE DAMAS');
insert into Categoria(idcategoria,nombre) values(5,'ROPA DE CABELLEROS');
insert into Categoria(idcategoria,nombre) values(6,'ROPA DE SEÑORITAS');
insert into Categoria(idcategoria,nombre) values(7,'ROPA DE NIÑOS');
insert into Categoria(idcategoria,nombre) values(8,'ROPA DE NIÑAS');



--Tabla control
insert into Control(Parametro,Valor) values('Lineas',1);
insert into Control(Parametro,Valor) values('Empleados',1);
insert into Control(Parametro,Valor) values('Clientes',1);
insert into Control(Parametro,Valor) values('Productos',1);
insert into Control(Parametro,Valor) values('Proveedores',1);
insert into Control(Parametro,Valor) values('Ventas',1);
insert into Control(Parametro,Valor) values('Compras',1);


-- Tabla: producto
Insert Into Producto Values ( 'A0001', 'Baby Class Calzado para bebe tallas 4 a 8',1, 65,45,200 );
Insert Into Producto Values ( 'A0002', 'Baby Line Calzado para bebe',1, 70,50, 170 );
Insert Into Producto Values ( 'A0003', 'Baby Magoo Calzado para bebe',1, 80,60, 567 );
Insert Into Producto Values ( 'A0004', 'Baby sandalia Sandalia',1, 55,45, 367 );
Insert Into Producto Values ( 'A0005', 'Balint Calzado para varon',2, 190,170, 876 );
Insert Into Producto Values ( 'A0006', 'Blucher Calzado para varon',2, 300,280, 267 );
Insert Into Producto Values ( 'A0007', 'Clucher 5 Calzado para varon',2, 280,200, 546 );
Insert Into Producto Values ( 'A0008', 'Ingland Calzado para varon',2, 290,260, 489 );
Insert Into Producto Values ( 'A0009', 'Steeper Clasico Calzado de montaña',3, 380,310, 678 );
Insert Into Producto Values ( 'A0010', 'Steeper Plus Calzado de montaña',3, 320,250, 3456 );
Insert Into Producto Values ( 'A0011', 'Steeper Light Calzado liviabno de montaña',3, 260,180, 765 );
Insert Into Producto Values ( 'A0012', 'Casaca Bomber para dama', 4,330,450, 398 );
Insert Into Producto Values ( 'A0013', 'Casaca Corta para dama', 4,260,980, 845 );
Insert Into Producto Values ( 'A0014', 'Casaca de gamuza para dama',4, 340,260, 967 );
Insert Into Producto Values ( 'A0015', 'Casaca jean para dama', 4,190,810, 587 );
Insert Into Producto Values ( 'A0016', 'Casaca Sybilla para dama',4, 530,250, 845 );
Insert Into Producto Values ( 'A0017', 'Casaca cuero para varon',5, 280,200, 634 );
Insert Into Producto Values ( 'A0018', 'Casaca para varon de cuero de carnero',5, 770,290, 867 );
Insert Into Producto Values ( 'A0019', 'Casaca cuero clasica para varon', 5,660,280, 934 );
Insert Into Producto Values ( 'A0020', 'Casaca corta para varon',5, 190,610, 345 );
Insert Into Producto Values ( 'A0021', 'Casaca larga para varon', 5,450, 980,786 );
Insert Into Producto Values ( 'A0022', 'Sacon para varon',5, 390,1100, 956 );
Insert Into Producto Values ( 'A0023', 'Abrigo Split para varon',5, 190, 910,378 );
Insert Into Producto Values ( 'A0024', 'Saco larga para varon',5, 280, 1300,888 );


-- Tabla: Cliente

insert into cliente values( 'C0001', 'CORDOVA CARRASCO JUILIO CESAR', 'AV lAS PALEMERAS 234 LOS OLIVOS', '10567892456', '987-6789');
insert into cliente values( 'C0002', 'HERNANDEZ MORALES PERCY RAFAEL', ' AV LA PAZ 567 MAGDALENA', '10567892456', '987-6789' );
insert into cliente values( 'C0003', 'MATEO VILLCA RICARDO', 'CALLE RISO PATRON 456 LINCE', '10567892456', '987-6789' );
insert into cliente values( 'C0004', 'ROMERO CASTRO CARLOS ALFONSO', 'AV TACNA 234 LIMA LOS OLIVOS', '10567892456', '987-6789' );
insert into cliente values( 'C0005', 'AREVALO LUDEÑA ALAN ALBERTO', 'AV AREQUIPA 678 SAN ISIDRO', '10567892456', '987-6789' );
insert into cliente values( 'C0006', 'ANCO PEREZ JOB LUIS', 'JR LAS ARTES 890 SAN BORJA', '11999966733', '987-6789' );
insert into cliente values( 'C0007', 'PINEDO CAVERO EDGAR JOSE', 'AV PARADO 342 MIRAFLORES', '11999966733', '987-6789' );
insert into cliente values( 'C0008', 'FERNANDEZ MAACHADO ROCIO LIZET', 'AV JAVIER PRADO 456 LA MOLINA', '11999966733', '987-6789' );
insert into cliente values( 'C0009', 'FLORES VILCHEZ JAIME RAFAEL', 'AV UNIVERSITARIA 234 LOS OLIVOS', '11999966733', '966-23854' );
insert into cliente values( 'C0010', 'GALARZA  GUTIERRES GABRIEL ALEJANDRO', 'LA COSTANERA 231 SAN MIGUEL', '11999966733', '966-23854' );

-- Tabla: proveedor

insert into Proveedor values( 'P0001', 'DISTRIBUIDORA IMPERIAL', 'AV lAS PALEMERAS 234 LOS OLIVOS ', '10567892456', '987-6789'  );
insert into Proveedor values( 'P0002', 'IMPORTACIONES NEPTUNO SAC', 'AV PERU 123 SMP ', '10566542456', '999-6789'  );
insert into Proveedor values( 'P0003', 'TIENDAS GAMARRA', 'AV GRAU 234 LIMA', '10567895554', '234-6789'  );
insert into Proveedor values( 'P0004', 'JOSE LUIS GALAN', 'AV PARDO 456 MIRAFLORES ', '10567892456', '453-6789'  );
insert into Proveedor values( 'P0005', 'DISTRIBUIDORA EL 9CITO', 'AV TUPAC AMARU 110 ', '10567895432', '234-6789'  );

--Tabla empleados 

insert into Empleado values('E0001','Cecilia','Deza','ceci@gmail.com','Cecilia','ceci');
insert into Empleado values('E0002','Marlon','Gomez','marlon@hotmail.com','marlon','man');
insert into Empleado values('E0003','Flavia','Chacaltana','flavy@gmail.com','Flavi','fla');
insert into Empleado values('E0004','Renzo','Villavicencio','renzo@hotmail.com','renzo','ren');
insert into Empleado values('E0005','Miguel','puma','miguel@hotmail.com','miguel','mig');




--tabla venta
insert into venta values(1,'C0003','E0005','14/07/16',590);
insert into venta values(2,'C0001','E0002','15/07/16',840);
insert into venta values(3,'C0002','E0004','15/07/16',420);
insert into venta values(4,'C0004','E0003','15/07/16',720);

--tabla detalle venta
insert into detalleventa values(1,'A0023',190,2,380);
insert into detalleventa values(1,'A0020',210,1,210);
insert into detalleventa values(2,'A0019',280,3,840);
insert into detalleventa values(3,'A0015',210,2,420);
insert into detalleventa values(4,'A0011',180,4,720);