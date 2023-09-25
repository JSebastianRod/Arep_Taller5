# Bonus Parcial

En este repositorio se encuentra el bonus del parcial de AREP, el cual calcula: Seno, Coseno, Palindromo y la magnitud de un vector real.

## Para empezar

Descargue y copie el repositorio en su maquina local.

### Prerrequisitos

- Java
- Maven

### Ejecución

Primero, compile el proyecto con el siguiente comando:

```
mvn clean install
```

Después, ejecute el siguiente comando para correr el programa:

```
java -cp "target/classes;target/dependency/*" edu.escuelaing.arep.app.SparkWebServer
```

Debe ingresar a la siguiente direccion:

```
http://localhost:4567/index
```

Estando ahi la pagina se vera asi:
<br>

![](./src/images/1.png)



### Funcionamiento y Código

### Función Seno

El siguiente código calcula el seno de un numero ingresado por el usuario.
<br>

![](./src/images/sen.png)
<br>
Esto se ve en pantalla asi:
<br>

![](./src/images/1.png)


Si hacemos el calculo por la url se ve asi:
<br>

![](./src/images/2.png)

Y desde la aplicación asi:
<br>

![](./src/images/2.5.png)

### Función Coseno
El siguiente código calcula el Coseno de un numero ingresado por el usuario.
<br>

![](./src/images/9.png)
<br>
Esto se ve en pantalla asi:
<br>

![](./src/images/8.png)


Si hacemos el calculo por la url se ve asi:
<br>

![](./src/images/11.png)

Y desde la aplicación asi:
<br>

![](./src/images/12.png)

### Función Palindromo
El siguiente valida si una palabra es palindromo o no.
<br>

![](./src/images/pal.png)
<br>
Esto se ve en pantalla asi:
<br>

![](./src/images/pal1.png)


Si hacemos la función desde la la url se ve asi:
<br>

Cuando es palindromo
<br>
![](./src/images/pl1.png)

<br>
Y cuando no

![](./src/images/pl2.png)


Y desde la aplicación asi:


Cuando no es Palindromo
<br>

![](./src/images/rp1.png)

<br>
Cuando es palindromo
<br>

![](./src/images/rp2.png)

### Función Vector
El siguiente código calcula la magnitud de un vector real el cual recibe dos entradas.
<br>

![](./src/images/vec1.png)
<br>
Esto se ve en pantalla asi:
<br>

![](./src/images/vec2.png)


Si hacemos el calculo por la url se ve asi:
<br>

![](./src/images/vec3.png)

Y desde la aplicación asi:
<br>

![](./src/images/vec4.png)

link docker
https://hub.docker.com/r/sebastianrod/bonoparcial
