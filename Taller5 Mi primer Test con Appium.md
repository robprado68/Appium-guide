# Mi primer Test con Appium
Crearemos un pequeño ejemplo, utilizaremos como lenguaje de programacion Java y como editor de codigo Visual Studio Code. El codigo de este ejemplo esta disponible en la carpeta `demoappium` de este mismo repositorio.

### Paso 1: Creacion de proyecto en VSCode
Crea un proyecto con Maven en 0, Te recomendamos utilizar la `Extension Pack for Java` como extension para manejar Java en vscode
>**Recuerda** que debes tener descargada y configuradas las Variables de entorno de maven 

![Alt text](image.png)

Una vez creado el proyecto deberia de tener una estructura de la siguiente forma:
![Alt text](image-1.png)

### Paso 3: Añade las dependencias
Localiza en tu directorio el archivo `pom.xml`, copia y pega las siguientes dependencias, puedes guiarte con el archivo [pom.xml](url) de este repositorio.

```xml
<dependency>
    <groupId>io.appium</groupId>
    <artifactId>java-client</artifactId>
    <version>8.3.0</version>
</dependency>
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.13.0</version>
    <scope>compile</scope>
</dependency>
```
### Paso 4: 

