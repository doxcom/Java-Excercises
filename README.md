
# 100 PREGUNTAS Y CONCEPTOS JAVA & SPRINGBOOT


## 1.- ¿QUE ES ENCAPSULAMIENTO?
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

- Polimorfismo 
- Herencia
- Encapsulacion
- Abstraccion

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
- Es un patron que tiene como objetivo de asegurar de que existe tan solo UNA INSTANCIA de una clase concreta
evitando asi hacer mas de una clase u objeto, singleton debe proveer una accesibilidad global a esta instancia

- Para conseguir que una clase sea de tipo Singleton necesitamos en primer lugar que su constructor sea privado. 
De esa forma ningún programa será capaz de construir objetos de esta tipo y por lo tanto no podremos construir 
ninguno estaremos en cero En segundo lugar necesitaremos disponer de una variable estática privada que almacene 
una referencia al objeto que vamos a crear a traves del constructor . Por ultimo un método estático publico que se
encarga de instanciar el objeto la primera vez y almacenarlo en la variable estática apoyándose en el constructor
privado que recordemos se puede llamar desde la misma clase.

EJEMPLO CODIGO:-> https://github.com/doxcom/Java-Excercises/tree/main/PatronesDise%C3%B1o


## 10.- ¿DIFERENCIA ENTRE CLASE ABSTRACTA E INTERFAZ?

- En una interfaz todos sus metodos deben ser implementados de la clase que la implemente, asi
class java1 implements interface1{}...  , una interfaz a su vez puede heredar a otra misma con la palabra extends
public interface ReproductorMusica extends Reproductor{...


- En una clase abstracta puede heredar o extender cualquier clase, mientras que la interfaz solo puede extender o 
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

## 13.- TIPOS DE ASIGNACION DE MEMORIA EN JAVA

- Memory Heap: El espacio Heap es usado para la colocación dinámica de objetos Java y clases JRE en tiempo de ejecución.
Los nuevos objetos que se van necesitando, son creados siempre en el espacio HEAP y la referencia a estos objetos 
son almacenados en la memory stack

- Memory Stack: La memoria Stack se usa para almacenar las variables locales (cuyo ámbito de acción está limitada solo 
a la función donde se declaró) y también las llamadas de funciones en Java. La memory Stack es usada para la ejecución 
de un thread teniendo referencia a otros objetos del heap. 

## 14.- CLASES WRAPPER

En java admitimos datos primitivos:

- byte
- short
- int
- long
- float
- double
- boolean
- char

las clases envolventes(wrappers) ayudan a convertir este tipo de datos primitivos en objetos (Autoboxing) o tipos de
y viceversa (Unboxing), los wrappers posen metodos ya que son objetos 

Integer numWrapper = Integer.valueOf(numPrimitive);

- Byte
- Short
- Integer
- Long
- Boolean
- Float
- Double
- Character

## 15.- ¿QUE SON LOS CONSTRUCTORES?

Es el bloque de codigo que se aplica a un objeto para inicializarlo, En Java para definir un Java Constructor 
debemos generar una función con el mismo nombre de la clase y pasarla los parámetros que consideremos adecuados a la 
hora de inicializar los objetos.

Ejemplo en clase Persona:

public Persona(String nombre, int edad)

Cuando una clase no contiene un constructor se llama a un constructor por defecto, gestionado por el compilador
existen dos tipos de constructores, por defecto y parametrizados

## 16.- DIFERENCIA ENTRE COLA Y PILA
La pila se basa en el principio LIFO(ultimo en entrar primero en salir), mientras que la cola se basa
en el principio FIFO(primero en entrar primero en salir)


## 17.- TIPOS DE EXCEPCIONES 

- Checked Exceptions: son aquellas que se deben declarar en un bloque try catch para manejar apropiadamente
errores en la compilacion, tal como IOException, que indica un error en la entrada o salida, FileNotFoundException
la cual indica que un archivo al cual se quiere acceder no se encuentra en el sistema, entre otras, es decir se 
manejan en el tiempo de compilacion, se heredan de la clase Exception

- Unchecked Exceptions: son excepciones que no son manejadas explicitamente, porque ocurren durante la ejecucion
del programa, algunos ejemplos son,NullPointerException que es cuando intentamos acceder a un objeto que es null, o
ArraysIndexOutOfBounds, cuando ingresamos a un indice fuera de rango valido, estas se heredan del RuntimeException


## 18.- ¿QUE INDICA LA PALABRA FINAL?

Nos indica que una variable, metodo, o clase no se puede modificar ni sobreescribir

## 19.- SERIALIZACION DE OBJETOS

La serializacion de un objeto se usa para generar una secuencia de bytes preparada para su almacenamiento o
transmision, despues mediante la deserializacion se puede reconstruir al objeto a su estado original

## 20.- ¿PARA QUE SIRVE EL GARBAGE COLLECTOR?
Se usa de manera interna y automatica cuando ya no se hace referencia o uso de un objeto, y se destruye en automatico

## 21.- ¿COMO SE GESTIONAN LAS DEPENDENCIAS?
el uso de dependencias y librerias externas se manejan con herramientas como maven o gradle, que utilizan su propio
lenguaje para escribir scripts de compilacion 


## 22 .-¿QUE ES LA SINCRONIZACION?
Son aquellos subprocesos multiples en el que un bloque de codigo sincronizado solo puede ser ejecutado por un hilo a la
vez, java admite multiples subprocesos para la ejecucion, la sincronizacion permite ayuda a que se ejecuten de manera
paralela aquellos subprocesos, evitando errores en el acceso de memoria compartida

## 23 .- ¿PARA QUE SIRVEN LOS SETTERS Y GETTERS?
sirven para ocultar detalles de la implementacion de los metodos de alguna interfaz o clase

## https://www.freecodecamp.org/espanol/news/repasa-estas-50-preguntas-para-superar-una-entrevista-de-programacion-en-java/