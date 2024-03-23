INSERT ALL 
INTO companias (companiaid, nombre) VALUES (1, 'Compañía 1')
INTO companias (companiaid, nombre) VALUES (2, 'Compañía 2')
INTO companias (companiaid, nombre) VALUES (3, 'Compañía 3')
SELECT * FROM dual;


INSERT ALL 
INTO clientes (dni, password, nombre, telefono, direccion) VALUES (1, 'contraseña1', 'Cliente 1', '123456789', 'Dirección 1')
INTO clientes (dni, password, nombre, telefono, direccion) VALUES (2, 'contraseña2', 'Cliente 2', '987654321', 'Dirección 2')
INTO clientes (dni, password, nombre, telefono, direccion) VALUES (3, 'contraseña3', 'Cliente 3', '456789123', 'Dirección 3')
SELECT * FROM dual;


INSERT ALL 
INTO lugares (lugarid, nombre) VALUES (1, 'Lugar 1')
INTO lugares (lugarid, nombre) VALUES (2, 'Lugar 2')
INTO lugares (lugarid, nombre) VALUES (3, 'Lugar 3')
SELECT * FROM dual;

INSERT ALL 
INTO billetes (nro, fecha, hora, companias_companiaid, destino_lugarid, origen_lugarid2, clientes_dni) VALUES (1, TO_DATE('2024-03-23', 'YYYY-MM-DD'), TO_DATE('12:00:00', 'HH24:MI:SS'), 1, 2, 3, 1)
INTO billetes (nro, fecha, hora, companias_companiaid, destino_lugarid, origen_lugarid2, clientes_dni) VALUES (2, TO_DATE('2024-03-24', 'YYYY-MM-DD'), TO_DATE('14:00:00', 'HH24:MI:SS'), 2, 3, 1, 2)
INTO billetes (nro, fecha, hora, companias_companiaid, destino_lugarid, origen_lugarid2, clientes_dni) VALUES (3, TO_DATE('2024-03-25', 'YYYY-MM-DD'), TO_DATE('10:30:00', 'HH24:MI:SS'), 3, 1, 2, 3)
SELECT * FROM dual;

SELECT b.nro AS numero_boleto, l_origen.nombre AS origen, l_destino.nombre AS destino, c.nombre AS nombre_cliente
FROM billetes b
JOIN lugares l_origen ON b.origen_lugarid2 = l_origen.lugarid
JOIN lugares l_destino ON b.destino_lugarid = l_destino.lugarid
JOIN clientes c ON b.clientes_dni = c.dni;
