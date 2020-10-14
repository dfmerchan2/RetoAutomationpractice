**Solución**
1. Se realiza la automatización de la página automationpractice, en donde se realiza la compra de productos.
2. Se realiza la automatización del proceso de inicio de sesion en la pagina automatización.

**Como generar el reporte de Serenity**

Para generar el reporte de Serenity se debe ejecutar por consola los siguientes comandos:
1. gradle clean assemble
2. gradle compileJava
3. gradle clean test aggregate 
4. Después  de finalizar la ejecución, se genera un archivo index.html donde se encuentra el reporte.
5. El archivo index.html se encuentra en la ruta: target/site/serenity/index.html

**Herramientas utilizadas**
* Serenity BDD
* Selenium

**Patrón de diseño**
* Screenplay

**Lenguaje utilizado**
* Java

**Gestor de dependencias**
* Gradle


