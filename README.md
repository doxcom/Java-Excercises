
# 100 PREGUNTAS Y CONCEPTOS JAVA & SPRINGBOOT


## 1.- ¿QUE ES ENCAPSULAMIENTO?:
Permite ocultar la complejidad interna de un objeto y exponer solo las operaciones necesarias para su uso
ejemplo en Paquete Encapsulamiento con la  clase Telefono y Tablet heredan de la clase Bateria.java  
el código encapsula el concepto de batería mediante delegación. con el atributo de "capacidad"

EJEMPLO CODIGO -> https://github.com/doxcom/Java-Excercises/tree/main/Encapsulamiento


## 2.- ¿QUE ES LA HERENCIA?:
Permite crear nuevas clases a partir de clases existentes, aprovechando sus atributos y métodos.
La herencia permite la reutilización de código y la simplificación de la estructura de los programas.

## 3.- POLIMORFISMO: 
Permite que diferentes objetos respondan de manera diferente a un mismo mensaje. 
El polimorfismo da la posibilidad de que los objetos puedan ser tratados como si fueran de una clase más general, 
lo que hace que el código sea más flexible y escalable, Un ejemplo clásico de poliformismo es el siguiente. 
Podemos crear dos clases distintas: Gato y Perro, que heredan de la superclase Animal. 
La clase Animal tiene el método abstracto makesound() que se implementa de forma distinta en cada una de las 
subclases (gatos y perros suenan de forma distinta)

EJEMPLO CODIGO -> https://github.com/doxcom/Java-Excercises/tree/main/Polimorfismo


## 4.- ABSTRACCION:
Permite representar un objeto complejo con una estructura simple y fácil de entender. 
La abstracción implica seleccionar las características más relevantes de un objeto y definir una interfaz para interactuar con él.

## 5.- OBJETO:
Se define como una instancia de una clase. El objeto puede tener un estado y un comportamiento. Se crea con “new ()”.

## 6.- ¿ CUALES SON LOS PILARES DE POO?

-Polimorfismo
-Herencia
-Encapsulacion
-Abstraccion

## 7.- TIPOS DE VARIABLES
- Locales: definidas dentro deun bloque, todo o constructor

- Instancia: variables no estaticas declaradas fuera de cualquier bloque,metodo o constructor

- Estatica:También se conocen como variables de clase y se declaran utilizando “static”. Solo se puede tener una copia de estas por clase.


## 8.-¿DIFERENCIA ENTRE ARRAYLIST Y HASHSET?:

- arraylist admite elementos repetidos, mientras hashset no
- heredan de distintas interfaces, list y set respectivamente
- arraylist implementa un array, mientras hash set esta respaldado x un hashMap
- arraylist mantiene un orden del objeto se inserte, mientras hashset no mantiene un orden

EJEMPLO CODIGO -> https://github.com/doxcom/Java-Excercises/tree/main/Colecciones

## 9.- ¿QUE ES EL PATRON SINGLETON?
-Es un patron que tiene como objetivo de asegurar de que existe tan solo UNA INSTANCIA de una clase concreta
evitando asi hacer mas de una clase u objeto, singleton debe proveer una accesibilidad global a esta instancia

-Para conseguir que una clase sea de tipo Singleton necesitamos en primer lugar que su constructor sea privado. 
De esa forma ningún programa será capaz de construir objetos de esta tipo y por lo tanto no podremos construir 
ninguno estaremos en cero En segundo lugar necesitaremos disponer de una variable estática privada que almacene 
una referencia al objeto que vamos a crear a traves del constructor . Por ultimo un método estático publico que se
encarga de instanciar el objeto la primera vez y almacenarlo en la variable estática apoyándose en el constructor
privado que recordemos se puede llamar desde la misma clase.

EJEMPLO CODIGO:-> https://github.com/doxcom/Java-Excercises/tree/main/PatronesDise%C3%B1o


## 10.- ¿DIFERENCIA ENTRE CLASE ABSTRACTA E INTERFAZ?

-En una interfaz todos sus metodos deben ser implementados de la clase que la implemente, asi
class java1 implements interface1{}...  , una interfaz a su vez puede heredar a otra misma con la palabra extends
public interface ReproductorMusica extends Reproductor{...


-En una clase abstracta puede heredar o extender cualquier clase, mientras que la interfaz solo puede extender o 
implementar  otras interfaces puede tambien contener metodos abstractos o que no lo sean, mientras que las interfaces 
solo pueden definir metodos abstractos(Los métodos abstractos en una interfaz son métodos que no tienen implementación,
es decir, no llevan código. En una interfaz, todos los métodos son implícitamente abstractos

- no es necesario utilizar la palabra clave abstracta al declarar una interfaz




## 11.-¿Qué son los beans de Spring y decirnos qué contenedor los gestiona?

El contenedor IoC es un marco para implementar la inyección de dependencias automatizada .
Contiene la creación de objetos para las formas más largas de uso e inyecta dependencias dentro de la clase.
Cualquier objeto que un contenedor IoC pueda instanciar, ensamblar y gestionar es un bean de Spring. 
El contenedor IoC no tiene ningún problema para inicializar estos objetos, que las aplicaciones utilizan para 
muchos fines. Pueden crear una configuración, prestar un servicio o establecer conexiones a bases de datos.


## 12 .-DIFERENCIA ENTRE Bean Java vs Bean Spring:
Un objeto Java puede ser un JavaBean, un POJO y un bean Spring, todo al mismo tiempo.
Los JavaBeans son clases que encapsulan muchos objetos en un único objeto (el bean).
El nombre “Bean” se le dio para englobar los siguientes estándares, cuyo objetivo es crear componentes de software
reutilizables para Java.

JavaBeans are classes that encapsulate many objects into a single object (the bean). The name “Bean” was given
to encompass  the following standards, which aims to create reusable software components for Java.

- 1.-Must implement Serializable(Una clase serializable es aquella que puede ser convertida en una secuencia de bytes 
y luego reconstruida como un objeto nuevo.).
- 2.-It should have a public no-arg constructor.
- 3.- All properties in java bean must be private with public getters and setter methods.

Spring beans are just object instances that are managed by the Spring IOC container.
They’re created based on BeanDefinition.
