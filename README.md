# TP 5 - Template Method y Composite

- Template method
    - Propósito: define el esqueleto de un algoritmo en la superclase pero permite que las subclases sobrescriban pasos del algoritmo sin cambiar su estructura.
- Composite:
    - Propósito: permite componer objetos en estructuras de árbol y trabajar con esas estructuras como si fueran objetos individuales.

## 1. Composite: Empresa con Empleados
Se debe calcular el monto salarial. La empresa los siguientes roles: directores, gerentes, mandos medios, líderes de proyecto y empleados regulares. Todos tienen gente a su cargo, salvo los empleados regulares.
![TP 5.1](/images/TP5.1.png)

## 2. Composite: Proyecto de Scrum
Compuesto por historia de usuario con tareas y spikes. Se requiere conocer el tiempo total del Sprint.
![TP 5.2](/images/TP5.2.png)


## 3. Composite: Gestion de Seguros
Una aplicación que maneja seguros de hogar, automóvil, vida y médicos, y que permite crear paquetes que agrupan seguros (y también otros paquetes). El costo de cada paquete está dado por el costo individual de cada seguro, con descuento del 5%, acumulativo, por cada seguro incluido en el paquete.
![TP 5.3](/images/TP5.3.png)

## 4. Template Method: Proyecto de Scrum
Un Supermercado lanzó una promoción en la cual se hacen cargo de parte del IVA que se le cobra a los productos. Se da un código y deben removerse líneas duplicadas.
![TP 5.4](/images/TP5.4.png)

## 5. Template Method: Negocio de Remeras
Las remeras pueden ser importadas o nacionales. Para el cálculo del precio de venta se deben tener en cuenta que ambos tipos de
remeras poseen un precio unitario. Además las remeras importadas sobre el precio unitario tienen un 3% de recargo más un 5% de impuesto aduanero. Por último el comercio aplica un 25% para determinar el precio final.
![TP 5.5](/images/TP5.5.png)