<h1>futuregadgetlab</h1>
<h2>Projet de Session INF2050-H2020</h2>

Bienvenue au projet minischeme de l 'équipe futuregadgetlab. Il y a 3 moyens d'utiliser le minischeme:
-Par la ligne de commande.
-Par l'application web.
-Par une machine virtuelle vagrant.

Voici les instructions à suivre pour chaque méthode:

<h2>Ligne de commande:</h2>
<h5>Pour compiler le programme, assurez vous d'avoir Java OpenJDK 11:</h5>
[Download OpenJDK 11](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot)

<h5>Par la suite, Gradle doit être installé sur votre PC:</h5>
[Install Gradle](https://gradle.org/install)


<h5>Une fois Gradle et Java 11 installés, dans un terminal, se rendre à la racine du projet minischeme.</h5>
Example: /home/simberg/mon-repertoire-git/futuregadgetlab/minischeme

<h5>Pour compiler et générer un Jar exécutable, lancez la commande suivante:</h5>
gradle clean shadowJar

<h5>Pour exécuter le programme avec les fichiers d'examples fournis, lancez la commande suivante:</h5>
java -jar build/libs/futuregadgetlab-1.0-all.jar exemples/<nom-du-fichier.minischeme>

<h2>Application Web</h2>
<h5>Pour compiler le programme, assurez vous d'avoir Java OpenJDK 11:</h5>
[Download OpenJDK 11](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot)

<h5>Par la suite, Gradle doit être installé sur votre PC:</h5>
[Install Gradle](https://gradle.org/install)

<h5>Une fois Gradle et Java 11 installés, dans un terminal, se rendre à la racine du projet minischeme-web.</h5>
Example: /home/simberg/mon-repertoire-git/futuregadgetlab/minischeme-web

<h5>Pour exécuter l'application web, lancez la commande suivante:</h5>
Sur windows: gradlew.bat bootRun
Sur mac/linux: ./gradlew bootRun

Ouvrez votre fureteur et rendez vous à l'adresse: http://localhost:8080

<h2>Machine Virtuelle Vagrant</h2>
<h5>Vous devez avoir Vagrant installé et fonctionnel sur votre ordinateur:</h5>
[Installation Vagrant](https://www.vagrantup.com/intro/getting-started/install.html)

<h5>Pour exécuter la machine virtuelle et l'application, dans un terminal, se rendre à la racine du projet futuregadgetlab.</h5>
Example: /home/simberg/mon-repertoire-git/futuregadgetlab

<h5>Exécuter la commande suivante.</h5>
vagrant up

Ouvrez votre fureteur et rendez vous à l'adresse: http://localhost:8080


