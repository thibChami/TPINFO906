# Un exemple minimaliste d'une application JavaEE 7

## Usage :

Pour voir les sources il suffit de cloner le projet git et de l'importer (sous forme de projet gradle). 
Cela devrait permettre la création de 3 sous-projets (ou modules), un pour la partie EJB et JPA , un pour la partie WEB et un pour la partie EAR.

La création des archives (CompteWeb.war, CompteEjb.jar, CompteEar.ear) peut se faire via gradle en appelant la tâche build sur le projet principal.

Pour utiliser l'exemple il suffit de déployer le fichier CompteEar.ear sur un serveur JavaEE 7. 
Le client Web est alors dans déployé dans _/CompteWeb_.

## Documentation :

JavaEE 7
- Doc : http://docs.oracle.com/javaee/7
- Tutoriel : https://docs.oracle.com/javaee/7/tutorial
- API (javadoc) : http://docs.oracle.com/javaee/7/api
- Spécifications : https://www.oracle.com/technetwork/java/javaee/tech/index-jsp-142185.html

JaveEE 8
- Doc : https://javaee.github.io/glassfish/documentation
- Tutoriel : https://javaee.github.io/tutorial/
- API (javadodc : https://javaee.github.io/javaee-spec/javadocs/
- Spécifications : https://www.oracle.com/technetwork/java/javaee/tech/java-ee-8-3890673.html

