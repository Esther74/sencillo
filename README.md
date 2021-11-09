# sencillo

proyecto realizado con spring boot, esta en heroku tambien, si pones http://localhost:8080?name=nombre te personifica el saludo
https://hesencillo.herokuapp.com/

proyecto que se ve en heroku
https://hesencillo.herokuapp.com/?name=pepa

sencillo es un program en spring. https://start.spring.io/

Para nombrar el proyecto como yo quiero en spring boot lo que cambio es Artifact, le pongo Artifact: sencillo, de dependencias: spring web
Spring Web:
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

Al importar el archivo sencillo.zip con netbeans, me sale un warning en el proyecto, boton derecho, resolve proyect problems.
--------------------------------------------------------------
proyecto subido a github
para subier a github:
1 boton derecho, versioning, initialize Git repository...
cuando hago esto se crea una carpeta oculta .git en C:\Users\soporte\Documents\NetBeansProjects\sencillo\.git
2 en la pagina de github, new repository y le llamo sencillo, https://github.com/USUARIOGITHUB/sencillo.git

3 proyecto en netbeans boton derecho, git, commit, pongo el mensaje que quiero en "commit Message" por ejemplo "primer commit"

4 proyecto en netbeans, boton derecho, git, remote, push
Specify git repository location:
remote name: origin, persit remote (lo dejo como está)
repository URL: https://github.com/USUARIOGITHUB/sencillo.git
User: USUARIOGITHUB
password ************
local branches, master (marcar)

5 en la pagina de github se puede escribir un readme y traerlo al proyecto en netbeans con proyecto, boton derecho, git, remote, pull
select configured git repository location
origin:https://USUARIOGITHUB@github.com/USUARIOGITHUB/sencillo.git
next
------------
En net beans, sencillo boton derecho propiedades, run, main class: com.example.sencillo.SencilloApplication
------------
pom.xml, lo unico que hago aqui es comentar lo de java version 11, no toco nada mas, esto lo hago por que si no, no funciona el proyecto en heroku
<!--
        <properties>
		<java.version>11</java.version>
	</properties>
-->  

-------------
Recordar que para hacer los test en NetBeans
boton derecho en archivo, tools, create update test.
--------------------------------


