Llanquihue Tour - Sistema de Gestión Turística

Información General.
Asignatura: Desarrollo Orientado a Objetos I.
Estudiante: Daniel González.
Semana: 3.
Lenguaje: Java.
IDE: IntelliJ IDEA.
Descripción del Proyecto.


Este proyecto corresponde al desarrollo de un sistema para la agencia de turismo Llanquihue Tour.

El objetivo es representar a las personas involucradas en los procesos de la empresa mediante un modelo orientado a objetos, aplicando conceptos como encapsulamiento, herencia, composición y reutilización de clases.

El sistema permite registrar clientes, empleados, operadores turísticos y direcciones, organizando la información de manera estructurada.



Estructura del Proyecto.

Paquete model.

Persona: clase base que almacena nombre, edad y rut.
Cliente: hereda de Persona y agrega ticket y operador asociado.
Empleado: hereda de Persona y agrega especialidad, turno e idiomas.
Direccion: representa la dirección de una persona.
Operador: representa una empresa operadora de servicios turísticos.


Paquete app.

Main: clase principal encargada de crear objetos y mostrar los resultados por consola.



Conceptos de Programación Orientada a Objetos Aplicados.

Encapsulamiento.
Los atributos fueron declarados como privados y se utilizan métodos get y set para acceder a ellos.


Herencia.
Las clases Cliente y Empleado heredan de la clase Persona para reutilizar atributos comunes.


Composición.
La clase Persona mantiene una relación de composición con la clase Direccion.


Sobreescritura de métodos.
Se implementó el método toString() para mostrar la información de los objetos de forma legible.



Ejemplo de Ejecución.
Al ejecutar la clase Main se crean instancias de Cliente, Empleado, Dirección y Operador, mostrando su información mediante la consola.



Instrucciones de Ejecución.
Abrir el proyecto en IntelliJ IDEA.
Ejecutar la clase Main ubicada en el paquete app.
Revisar la salida generada en la consola.


Repositorio.

Repositorio GitHub utilizado para la entrega de la actividad.
