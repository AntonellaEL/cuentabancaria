# Proyecto: Sistema de Cuentas Bancarias

Este proyecto implementa un sistema de cuentas bancarias en Java que incluye dos tipos de cuentas: Cuenta de Ahorros y Cuenta Corriente. El sistema permite consignar dinero, retirar dinero, calcular el interés mensual y generar un extracto mensual, con particularidades específicas para cada tipo de cuenta.

# - Estructura del Proyecto
El proyecto está compuesto por las siguientes clases:


# ***Cuenta:*** 

Clase base que modela una cuenta bancaria con los siguientes atributos y funcionalidades:

Atributos: saldo, numConsignaciones, numRetiros, tasaAnual, comMensual.


# ***CuentaAhorros:*** 

Clase hija de Cuenta, que añade el comportamiento de cuentas de ahorros:

Atributos: activa (determina si la cuenta está activa según el saldo).


 # ***CuentaCorriente:***

 Clase hija de Cuenta, que añade el comportamiento de una cuenta corriente:

Atributos: sobregiro (permite que el saldo de la cuenta sea negativo).


# - Diagrama UML

Puedes encontrar el diagrama UML del sistema en el siguiente enlace: https://drive.google.com/file/d/1Ikkg5fQqIrbv3Tmn6n39N4BEJJg-o1QH/view

# - Cobertura de Tests

El proyecto incluye tests unitarios que aseguran un mínimo del 70% de cobertura, para validar el correcto funcionamiento de las funcionalidades principales.
https://drive.google.com/file/d/1B6AdtW8Yqodvo0huixtU88iCZa16VSYJ/view?usp=drive_link


# Instrucciones para Ejecutar el Proyecto
- Clonar el repositorio:
git clone : https://github.com/AntonellaEL/cuentabancaria

