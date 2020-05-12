<h1>futuregadgetlab</h1>
<h2>Projet de Session INF2050-H2020</h2>

<h5>Pour compiler le programme, assurez vous d'avoir Java OpenJDK 11:</h5>
[Download OpenJDK 11](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot)

<h5>Par la suite, Gradle doit être installé sur votre PC:</h5>
[Install Gradle](https://gradle.org/install)

<h5>Une fois Gradle et Java 11 installés, dans un terminal, se rendre à la racine du projet.</h5>
Example: /home/simberg/mon-repertoire-git/futuregadgetlab

<h5>Pour compiler et générer un Jar exécutable, lancez la commande suivante:</h5>
*gradle clean shadowJar*

<h5>Pour exécuter le programme avec les fichiers d'examples fournis, lancez la commande suivante:</h5>
*java -jar build/libs/futuregadgetlab-1.0-all.jar exemples/aire-cercle.json*

Si tout fonctionne, le terminal devrait afficher **314.1592**.

