# 100 PREGUNTAS Y CONCEPTOS JAVA & SPRINGBOOT & PROGRAMACION
# FROM HERO TO ZERO JAVA Course

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
implementar 

- en la clase abstracta se permiten los metodos estaticos, mientras que en la interfaz no

- en la clase abstracta estan permitidos los constructores, en la interfaz no

- la clase abstracta puede tener miembros de clase privados y protegidos, mientras que los de una interfaz son publicos
por defecto

- una clase normal puede solo heredar de 1 clase abstracta a la vez,pero varias clases pueden heredar de una misma clase
abstracta , por otro lado una clase normal si puede heredar  varias interfaces a la vez

EJEMPLO CODIGO INTERFAZ FIGURA,CIRCULO Y CUADRADO ->  
- https://github.com/doxcom/Java-Excercises/tree/main/InterfazYClaseAbstracta


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


## 24.- DIFERENCIA ENTRE HASHTABLE Y HASHMAP:
Hashtable esta sincronizada(significa es segura para subprocesos), mientras que hashmap no, la sincronizacion de una
Hashtable se realiza en los metodos de acceso y mutacion, lo que impide que dos hilos diferentes agreguen o eliminen
de manera concurrente de la lista


## 25.- DIFERENCIA ENTRE LIST Y SET:

List esta ordenada y permite duplicidad de los datos, y set esta desordenado y no permite elementos duplicados

## 26.- DESCRIBA public static void main(String args [])

- public: es un modificador de acceso, por lo tanto este metodo tiene acceso desde cualquier clase
- static: nos indica que usamos este metodo sin crear un nuevo objeto de una clase
- void: especifica el tipo de retorno, el cual no devolvera ningun valor
- main: es el nombre que le damos al metodo, jvm reconoce como una firma particular
- String args []: parametro del metodo

## 27.- DIFERENCIA ENTRE equals() y ==

El simbolo "==" es un operador, mientras que equals() es un metodo,"==" compara referencias(verifica si ambos objetos 
apuntan a la misma ubicación de memoria ), y equals() compara contenido de ellos


## 28.- ¿QUE SIGNIFICA QUE UN OBJETO ES INMUTABLE?

Significa que no se puede modificar objetos despues de su creacion, si intentas modificarlos el objeto hace un clon
y cambia este clon durante la creacion, un ejemplo es String, que es inmutable, String es una clase inmutable. 
Eso significa que no puede modificar su contenido una vez creado

Ejemplo ,Aqui solo hay un objeto

String s1="Hello";
String s2="Hello";
String s3="Hello";



## 29.- ¿QUE ES JAVA SPRING BOOT?

Es una herramienta de desarrollo web y microservicios con java spring framework que acelera el proceso de creacion
de aplicaciones


## 30.- ¿QUE ES MVC en SpringBoot?

Es un patron de aquitectura que se basa en tres componentes

- Modelo: Representa los datos de la aplicacion y se encarga de gestionarlos, aqui se usan las anotaciones de @Table
para mapear los campos con la base de datos, asi como sus setter y getters

- Vista: se encarga de presentar los datos del modelo al usuario final

- Controlador: Se encarga de gestionar la logica de como mostrar los datos y que hacer con ello

## 31 .- MENCIONE COMPONENTES DE SPRINGBOOT

- Repositories: conecta y enlaza los datos con la base de datos
- Services: Coordina las fuentes de datos
- Controllers: coordina entras y salidas de informacion @GetMapping url etc
- Dependencias: se coordinan entre si en el tiempo de construccion del proyecto


## 32.- ¿QUE REALIZA LA ANOTACION @Autowired?

Nos Permite inyectar dependencias de forma automatica, springboot se encargara de brindar las instancias de clase
necesarias para que funcione la aplicacion

## 33.- ¿QUE REALIZA LA ANOTACION @Bean?

Indica que un metodo crea, configura e inicializa un nuevo "objeto" que sera administrado por el contenedor IoC Spring

## 34.- ¿QUE ES EL CONTENEDOR IoC en SpringBoot?

Es un marco que implementa la inyeccion de dependencias automatizadas, (inversion of control), se encarga de crear
los objetos, inyectar dependencias dentro de la clase, gestionar instancias


## 35.- ¿QUE SIGNIFICA LA ANOTACION @Controller?

Esta anotacion se usa para indicar que la clase es un controlador de Spring y notificar al contexto MVC

## 36.- ¿QUE REALIZA LA ANOTACION @Service?

Se usa en una clase que realiza algun tipo de servicio, relacionado a logica de negocios, calculos etc y llamar
a API's externas

## 36.- ¿QUE REALIZA LA ANOTACION @Repository?

Se utiliza en clases que acceden directamente a la base de datos

## 37.-¿QUE SON LAS FUNCIONES LAMBDAS EN JAVA?

son funciones anonimas de java que se usan al mismo tiempo que se va declarando
de uso mas comun en aws lambda con la finalidad esencialmente de eficientar recursos
de la instancia del contenedor o servicio



## 38.-¿QUE ES DOCKER?
## 39.-¿MENCIONE 3 TIPOS DE TESTING?
## 40.-¿QUE ES UN PIPELINE?
## 41.-¿MENCIONA OBJETOS DE LA CLASE COLLECTION?
## 42.-¿DIFERENCIA ENTRE STRING, STRING BUILDER Y STRING BUFFER?
## 43.-IMPLEMENTA UN LIST Y BUSCA UN NOMBRE FILTRALO USANDO LAMBDA
## 44.-¿QUE ES HIBERNATE?
## 45.-¿QUE ES JPA?
## 46.-¿PARA QUE SIRVE EL OBJETO OPTIONAL EN JAVA?
## 47.-MENCIONE METODOS HTTP
## 48.-¿DIFERENCIA ENTRE PUT Y PATH?
## 49.-¿MENCIONE 3 CODIGOS DE ESTADO HTTP?
https://developer.mozilla.org/es/docs/Web/HTTP/Status

## 50.-¿QUE ES UN ORM?

## 51.-¿QUE REALIZA LA ANOTACION DE SPRING BATCH ?
https://spring.io/guides/gs/batch-processing

## 52.-¿SQL INNER JOIN?
## 53.-¿QUE ES REST?

## 54.-¿QUE DIFERENCIA HAY ENTRE REST Y SOAP?
## 55.-¿QUE ES UNA CLASE ANONIMA?


## 56.-¿QUE ES UN STREAM EN JAVA?

## 57.-¿QUE UN HILO Y MULTIHILOS?

## 58.- ¿QUE SIGNIFICA FINAL CLASS?
Que es inmutable y no se puede extender una subclase de ella

## 59.- ¿que es un enum?
## 60.- ¿QUE es serialization?
## 61.- ¿QUE es deserialization?
## 62.- ¿QUE son los terminos iaas,paas,y saas?




Ejercicios de practica:
- buscar un numero en un arreglo de manera optima
- comprobar si un string es palindromo o no, con espacios,caracteres, mayusculas minusculas etc
- invertir una cadena de texto sin metodos de string
- encontrar numero fibonacci con memoization
