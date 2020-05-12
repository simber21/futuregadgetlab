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

<h5>Pour installer l'application web avec Vagrant il faut:</h5>

<h5> Installation VirtualBox</h5>
```
 sudo apt install virtualbox
```
*<h5>Installation Vagrant</h5>

```
  sudo apt install vagrant
  sudo apt upgrade vagrant
```
<h5>Ensuite, dans le dossier ou se trouve le fichier Vagrantfile, effectuez:</h5>
```
vagrant up
```
<h5>Puis, sur la machine virtuelle, entrez `vagrant` comme utilisateur et `vagrant` comme mot de passe</h5>

<h5>Une fois dans le ssh, faite:</h5>
```
cd minischeme-web/
```
Ensuite,
```
./gradlew bootRun
```
<h5>Ouvrez une page de navigateur en entrez `http://localhost:8080`</h5>


