--Parte 3
--Crear tabla TB_PRODUCTOS
	CREATE TABLE TB_PRODUCTOS (
	id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	nombre VARCHAR2(100) NOT NULL,
	tipo VARCHAR2(50) NOT NULL CHECK (tipo IN ('Alimentacion','Electronica','Ropa')),
	precio NUMBER(8,2) NOT NULL CHECK (precio >= 0),
	stock NUMBER(6) DEFAULT 0 NOT NULL
	);
--Insertar productos en la tabla
	INSERT INTO TB_PRODUCTOS (nombre,tipo,precio,stock) VALUES ('Portatil','Electronica', 750.00,5);
	INSERT INTO TB_PRODUCTOS (nombre,tipo,precio,stock) VALUES ('Movil','Electronica', 450.00,2);
	INSERT INTO TB_PRODUCTOS (nombre,tipo,precio,stock) VALUES ('Queso curado','Alimentacion', 15.99,30);
	INSERT INTO TB_PRODUCTOS (nombre,tipo,precio,stock) VALUES ('Camiseta','Ropa', 24.99,0);

-- Consultar todos los productos
-- 1a forma
	SELECT id, nombre, tipo, stock
	FROM TB_PRODUCTOS;
	
--2a forma
	SELECT *
	FROM TB_PRODUCTOS;

--CONSUNTAR PRECIO MEDIO DE CADA CATEGORIA Y CUANTOS PRODUCTOS POR CADA TIPO DE CATEGORIA
SELECT 
    tipo,
    ROUND(AVG(precio), 2) AS precio_medio,
    COUNT(*) AS num_productos_total
FROM TB_PRODUCTOS
GROUP BY tipo
ORDER BY num_productos_total DESC;