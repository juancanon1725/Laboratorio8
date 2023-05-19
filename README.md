# Laboratorio8

## Juan Pablo Poveda Cañon
## Gonzalo Falco

* Sobre el proyecto web realizado en el laboratorio 5, se trabajará para integrar el desarrollo realizado con el uso de SPRING.
* El primer paso será, poder desplegar el proyecto web con toda la configuración de SPRING que se indica en el siguiente tutorial.

![imagen 1](https://github.com/juancanon1725/Laboratorio8/blob/main/1.png)

Despues, para lograr desplegar el juego del laboratorio 5 debemos importar los archivos de bean.java y guess.xhtml al proyecto generado. Para que esto funcione
correctamente se traen las dependencias del *pom* del laboratorio 5 que fueran necesarias para el funcionamiento del juego.


Dentro de la clase bean.java se debe añadir la etiqueta @Component. Esto para que al momento de ejecutar el main del proyecto pueda cargar esta clase en spring-boot.
![image](https://github.com/juancanon1725/Laboratorio8/assets/98672541/fcfea28a-e936-490a-bab9-103c793faa80)

Al ejecutar el main con el comando `mvn spring-boot:run` e ingresando a *localhost:8080/guess.xhtml* podremos jugar al GuessBean del laboratorio 5
