# Parcial 2 - 19/11/2019

## Entrega

La solución y entrega de este examen se va a realizar en el repositorio asignado por los profesores https://github.com/obj2-unahur-2019s2/parcial2-2019-s2-{usuario-alumno}.

Se deben subir los cambios en un branch llamado `solucion` y se debe crear el pull request correspondiente en Github.

El código debe compilar y debe tener test unitarios que verifiquen la funcionalidad desarrollada.

### Creación del branch

El siguiente comando nos crea el nuevo branch y luego nos deja ya parados el mismo

```console
  git checkout -b solucion
```

### Subida de los cambios

La primera vez que subimos los cambios, se crea el branch en el repositorio remoto, para eso hay que ejecutar el siguiente comando:

```console
  git push -u origin solucion
```

Luego si es necesario subir nuevos commits, ejecutamos:

```console
  git push
```

### Crear Pull Request

Siempre que comiteamos sobre un branch, github nos ofrece crear un pull request.
También podemos crearlo usando el botón `New pull request`.


### Condiciones de aprobación
* Ejercicio 1 - 1 punto
* Ejercicio 2 - 1 punto
* Ejercicio 3 - 2 puntos
* Ejercicio 4 - 3 puntos
* Ejercicio 5 - 3 puntos

### ENUNCIADOS

## Ejercicio 1

Para un sistema de inscripción de la Universidad tiene el listado de `Carreras` con sus respectivas `Materias`. 
Nos piden agregar una funcionalidad que para cada `Carrera` nos permita saber la carga horaria total (Suma de la carga horaria de cada materia que la compone). 
Empezamos modelando la tecnicatura y nos dimos cuenta que el modelo actual no es escalable ya que cuando agreguemos las 20 materias que faltan va a ser inmanejable.

*¿Cómo lo mejorarías?*

## Ejercicio 2

Un astillero que fabrica velas tiene un departamento de calidad que testea los distintos productos con un sistema inteligente. Entre esos productos están las velas que tienen diferentes modelos. 
En general el astillero define el modelo de clases de los distintos modelos de velas pero hay una en particular, la `Genova` que es un producto tercerizado por lo que no podemos modificarla. 

*Necesitamos hacer las modificaciones necesarias al sistema para poder incorporar este modelo y probarlo como a las demás* 

## Ejercicio 3
Como parte de un procesador de textos nuevo que está desarrollando **Booble** tiene definido un `Documento` que contiene `Nodos` de distintos tipos ( `Link`, `String`,`Tag`). 
También tiene un `ExtractorDeTexto` que sabe buscar en cada tipo de `Nodo` un texto pedido. 
En estos días el CTO de Booble vió que cuando quiera agregar nuevos tipos de Nodos el `Extractor` va a tener demasiada lógica y va a ser muy dificil de mantener.

*Nos contrató para que le demos una solución más elegante de manejar la lógica de extracción* 

## Ejercicio 4
*DumbTV* nos contrató para mejorar la performance de su control remoto ya que muchos clientes se quejan de lo lentas que son sus Televisores. 
El código del sistema tiene una `Television` que maneja las acciones básicas de encender, apagar, silenciar, bajar y subir volumen.


## Ejercicio 5
La aplicación `EnviosYa` ofrece envíos calculando costos por tipo de envio y tipo de paquete para ofrecerle la mejor opción a sus usuarios. 
En la última reunión de socios se informó que se consiguieron inversores por lo que se van a agregar muchos tipos de envío y de paquetes. 
A partir de esa noticia, los analistas vieron que hoy en día su sistema no está en condiciones de agregarlos de manera prolija/elegante.

*¿Cómo se puede mejorar?
 
