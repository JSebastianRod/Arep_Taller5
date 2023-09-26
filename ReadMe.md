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
#### Para esta función hay que asegurarnos que la palabra no tenga espacio, si tiene espacio, siempre sera no palindroma.
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


### Docker
Construimos la imagen:
Debe ingresar a la siguiente dirección:

```
docker build --tag dockersparkprimer .
```

<br>

![](./src/images/d1.png)

<br>

Revisamos que la imagen quede construida con el siguiente comando:

```
docker images
```

<br>

![](./src/images/d2.png)

<br>

A partir de la imagen creada creamos 3 instancias:

```
docker run -d -p 34000:6000 --name firstdockercontainer dockersparkprimer
docker run -d -p 34001:6000 --name firstdockercontainer2 dockersparkprimer
docker run -d -p 34002:6000 --name firstdockercontainer3 dockersparkprimer
```

<br>

![](./src/images/d3.png)

<br>

Nos aseguramos que el contendor esta corriendo:

```
docker ps
```

<br>

![](./src/images/d4.png)

<br>

Accedemos por el browser a las siguientes direcciones, para verificar que esta corriendo:

```
http://localhost:34002/index
http://localhost:34001/index
http://localhost:34000/index
```

Asi se vería la pagina:
<br>

![](./src/images/d5.png)

<br>


Ejecutamos el docker compose
```
docker-compose up -d
```

Asi se vería la pagina:
<br>

![](./src/images/d6.png)

<br>

Verificamos que se crearon los servicios:

```
docker ps
```

Asi se vería la pagina:
<br>

![](./src/images/d7.png)

<br>

Asi se ve el docker desktop:
<br>

![](./src/images/d8.png)

<br>
Creamos el repositorio y revisamos que se haya creado:
<br>

![](./src/images/d9.png)

<br>
Hacemos push al repositorio:

<br>

![](./src/images/d10.png)

<br>
Revisamos que se haya subido, en docker hub:

<br>

![](./src/images/d11.png)

<br>

La pagina en la cual se encuentra el repositorio es la siguiente:

```
https://hub.docker.com/r/jsebastianrod/taller_arep5
```

### Correr el Docker

1. Para correr el docker debe ejecutar el siguiente comando:

```
docker pull jsebastianrod/taller_arep5
```

2. Después debe ejecutar el siguiente comando:

```
docker ps
```

Ahi revisamos en que puerto esta

3. Por ultimo usamos el comando, el cual va a probar la conexión:
    
```
docker run jsebastianrod/taller_arep5
```
4. Como podemos ver, la conexión fue exitosa:
<br>

![](./src/images/du.png)
<br>
Entramos al puerto 8087 el cual obtuvimos en el paso 2:
<br>

![](./src/images/du1.png)
<br>



