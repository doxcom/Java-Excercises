# javaExcercises
#
#JAVA Conceptos
Encapsulamiento:
permite ocultar la complejidad interna de un objeto y exponer solo las operaciones necesarias para su uso
ejemplo en Paquete Encapsulamiento con la  clase Telefono y Tablet heredan de la clase Bateria.java  el código encapsula el concepto de batería mediante delegación.
con el atributo de "capacidad"


Herencia:
permite crear nuevas clases a partir de clases existentes, aprovechando sus atributos y métodos.
La herencia permite la reutilización de código y la simplificación de la estructura de los programas.

Polimorfismo: 
Permite que diferentes objetos respondan de manera diferente a un mismo mensaje. 
El polimorfismo da la posibilidad de que los objetos puedan ser tratados como si fueran de una clase más general, 
lo que hace que el código sea más flexible y escalable, Un ejemplo clásico de poliformismo es el siguiente. 
Podemos crear dos clases distintas: Gato y Perro, que heredan de la superclase Animal. 
La clase Animal tiene el método abstracto makesound() que se implementa de forma distinta en cada una de las 
subclases (gatos y perros suenan de forma distinta)

ABSTRACCION:
Permite representar un objeto complejo con una estructura simple y fácil de entender. 
La abstracción implica seleccionar las características más relevantes de un objeto y definir una interfaz para interactuar con él.

OBJETO:
Se define como una instancia de una clase. El objeto puede tener un estado y un comportamiento. Se crea con “new ()”.

PILARES DE POO
-Polimorfismo
-Herencia
-Encapsulacion
-Abstraccion

TIPOS DE VARIABLES
locales: definidas dentro deun bloque, todo o constructor
de instancia: variables no estaticas declaradas fuera de cualquier bloque,metodo o constructor


#SPRINGBOOT CONCEPTOS

Qué son los beans de Spring y decirnos qué contenedor los gestiona?
El contenedor IoC es un marco para implementar la inyección de dependencias automatizada . 
Contiene la creación de objetos para las formas más largas de uso e inyecta dependencias dentro de la clase.
Cualquier objeto que un contenedor IoC pueda instanciar, ensamblar y gestionar es un bean de Spring. El contenedor IoC no 
tiene ningún problema para inicializar estos objetos, que las aplicaciones utilizan para muchos fines. Pueden crear una configuración,
prestar un servicio o establecer conexiones a bases de datos.


DIFERENCIA ENTRE Bean Java vs Bean Spring:
Un objeto Java puede ser un JavaBean, un POJO y un bean Spring, todo al mismo tiempo.
Los JavaBeans son clases que encapsulan muchos objetos en un único objeto (el bean).
El nombre “Bean” se le dio para englobar los siguientes estándares, cuyo objetivo es crear componentes de software
reutilizables para Java.

JavaBeans are classes that encapsulate many objects into a single object (the bean). The name “Bean” was given to encompass
the following standards, which aims to create reusable software components for Java.

 1.-Must implement Serializable(Una clase serializable es aquella que puede ser convertida en una secuencia de bytes y luego reconstruida como un objeto nuevo.).
 2.-It should have a public no-arg constructor.
 3.- All properties in java bean must be private with public getters and setter methods.



Spring beans are just object instances that are managed by the Spring IOC container. 
They’re created based on BeanDefinition.

https://www.google.com/search?client=firefox-b-d&q=preguntas+java+senior+developer
