
<h1> Comparaisons entre Maven et Gradle </h1>

<<<<<<< HEAD
=======
<h2> Introduction à Maven </h2>

Apache Maven est un logiciel libre de gestion et automatisation de projets Java. Il a été crée et est présentement maintenu par l'organisme sans but lucratif Apache Software Foundation. En 2002, Maven a débuté comme sous-projet du défunt projet Jakarta Turbine pour ensuite être officiellement publié comme logiciel en 2004. En date de ce rapport (janvier 2020), la version 3.6.3 est la version courante.

Maven réduit le temps de configuration des projets en fournissant un écosystème complet au programmeur. Les projets sur Maven sont configurés en utilisant un Project Object Model (POM) et un ensemble de plugin partagés parmi eux. Les instructions et configurations sont rédigés en XML et entreposés dans le fichier pom.xml. Ceci permet de facilement de gérer et ajouter les dépendances d'un projet dans un seul fichier. L'écosystème fournie par Maven comprend aussi une structure de répertoire avec une arborescence et nomenclature préétablie ainsi qu'un cycle de vie (build lifecycle) intégré. 

Maven est un outil qui est conçu pour offrir un certain niveau de flexibilité. Puisque le processus de construction est clairement défini, l'utilisateur a seulement besoin d'apprendre un petit ensemble de commandes pour construire un projet. 

<h3> Sources </h3>

https://maven.apache.org/background/history-of-maven.html \
https://maven.apache.org/what-is-maven.html \
http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html 


>>>>>>> master
<h2> Introduction à Gradle </h2>

Gradle est un logiciel libre sous la license Apache 2.0 qui permet l'automatisation de build de projets Java. Cet outil à été introduit au public en 2007 et en est maintenant à la version 6.0 en date du 8 novembre 2019. 

Les instructions et configurations sont déclarés dans un fichier nommé build.gradle à la racine du projet Java. Ces instructions sont écrites en language Groovy ou Kotlin. Le flux d'exécution est exprimé sous forme de graphe orienté acyclique, ce qui permet de déclarer l'ordre d'exécution et l'interdépendence entre chaque tâches. 

Gradle est un outil très flexible qui permet à l'utilisateur de créer des fonctions pour paramétriser et simplifier les tâches à exécuter. Son écosystème d'extensions ("plugins") est riche et complet et permet d'intégrer facilement d'autres outils tels que JUnit et Sonarqube aux tâches d'exécution.

Le développement de Gradle est très actif. Avec plus de 400 contributeurs et 70 000 commits sur Github à ce jour, il est clair que son futur est prometteur dans l'écosystème de développement Java.

<h2> Critéres de comparaison: </h2>

* Facilité d’utilisation
* Vitesse d’éxécution
* Documentation et communauté en ligne

<h2> Facilité d’utilisation </h2>

Il est toujours agréable de commencer à utiliser, directement, un nouvel outil grâce à ses fonctionnalitées qui sont à la fois faciles, rapides et intuitives.

Ce critère montre si un outil nécessite une connaissance avancée, il est facile de déboguer un programme avec, s’il est facile de comprendre le build script et surtout s’il est facile de l’utiliser avec peu de connaissances.

* <h3> Maven </h3> 

Apprendre à utiliser Maven n’est pas très difficile. Si l'on respecte ses conventions, tout sera facile et simple mais dès que l’on veut sortir un peu de ce système, que l’on veut utiliser d’autres outils ou faire quelque chose en dehors de cet outil, ça devient vite complexe parce que l'on est très habitué à ce système de Maven.

Le grand défi est de s’habituer à utiliser et comprendre les fonctionnalitées de pom.xml qui est son fichier de configuration. Ce fichier XML est trop fragile et verbeux. Par exemple pour la définition des dépendances, il est difficile de créer un pom.xml de zéro. Les build scripts sont compliqués à comprendre car il s’agit de l’utilisation de grands nombres de plugins et des déclarations même pour réaliser certaines tâches simples. Aussi, la personnalisation des goals est difficile sur Maven, il faut créer son propre plugin.


* <h3> Gradle </h3>

Gradle est un outil où les scripts de build sont écrits dans un langage Java : Groovy. Avec un peu de connaissances sur ce langage, qui est très peu verbeux, on peut facilement commencer à l’utiliser. Les builds scripts sont facile à lire et à comprendre. En plus, Gradle permet d'utiliser un grand nombre de ressources propres à Ant ou Maven (comme la gestion des build.xml, pom.xml, repositories...) cela permet aux développeurs, qui ont un background sur ces outils de build, de commencer à travailler directement.
Gradle peut aussi réutiliser et compléter une infrastructure basée sur Ant, Ivy ou Maven. En effet, Ant est intégré dans Gradle ce qui nous donne la possibilité de faire des builds entièrement en Ant. Contrairement à Maven, la modification du cycle de vie d'un projet pour ajouter ou supprimer des étapes de construction, ou encore en insérer de nouvelles est simple en Gradle. La personnalisation des goals en Gradle est plus facile que Maven.

<h3> Gagnant:  GRADLE </h3>

Avec un peu de background en Maven ou Ant et un peu de connaissance en Groovy (langage de Java), on peut facilement commencer à utiliser Gradle, et à faire nos builds. Grâce à la simplicité de ses scripts, la possibilité d’utiliser les répertoires de Maven et Ant et sa facilité d’utilisation, Gradle est plus facile à utiliser que Maven.

<h2> Vitesse d'exécution</h2>

La vitesse d'exécution est la clé principale qui va faire la différence entre un outil qui sera choisi par plusieurs entreprises et un autre outil qui sera la pour les petits projets.

Coté performance, les deux outils implémentent le système de multi-module builds qui s'exécute parallèlement pour gagner du temps. Moins de temps sur les builds, moins de dépenses pour les entreprises et plus de projets livrés à temps.

* <h3>Maven</h3>

Maven par défaut n’utilise pas la méthode de builds parallèle, il favorise le build séquentielle. Parfois on doit spécifier à cet outil manuellement, d’utiliser le build en parallèle pour gagner plus de temps et utiliser toute la capacité de notre machine.
De plus, Maven nous donne la capacité de faire les tests en parallèle, moins de temps et plus de tests et de builds, grace a la possibilité de personnaliser les plugins comme Surefire, en lui donnant la possibilité de faire l'exécution des test en parallèle, mais tout doit être fait manuellement.

* <h3>Gradle</h3>

Gradle favorise l’utilisation d’un daemon de compilation continuelle et incrémentale, cet outil vérifie quelle tâche est modifiée. Si rien n’est modifié, la tâche n’est pas exécutée ce qui nous donne la possibilité de faire des builds en moins de temps. De plus, puisque Gradle utilise son propre langage Java (Groovy) au lieu de XML pour ses scripts, il donne la possibilité d'être plus flexible que Maven. Par contre, les builds deviennent plus lents quand les projets sont plus larges, à cause que le script Groovy doit être compilé pour chaque build.

<h3> Gagnant:  GRADLE </h3>

Gradle est surprenamment performant grâce à des builds continues et composés son daemon qui favorise une compilation rapide et incrémentée pour les classes Java. Il évite aussi de vérifier les tasks qui n’étaient pas modifiés entre les builds. Certains le considère comme un outil plus intelligent que Maven avec des meilleurs optimisations.

<h2>Documentation et communauté en ligne</h2>

Pour commencer à utiliser un outil rapidement, la documentation et la communauté en ligne sont nécessaires pour faciliter la compréhension des fonctionnalités et des capacités de cet outil.

La documentation est très essentielle pour comprendre comment un outil fonctionne et ce que l’on peut faire avec. Avec les ressources que l'on trouve en ligne et les tutoriels disponibles, il est préférable qu’ils soient facile à lire et à comprendre rapidement que d'être compliqués. En plus de ça, la communauté en ligne joue un rôle important à répondre aux questions de plusieurs autres développeurs qui travaille peut être sur un projet similaire.


* <h3>Maven</h3>

La documentation de Maven et ses ressources sont plus riches puisque Maven est sorti en 2004, plus ancien que Gradle. Les ressources de Maven sont très larges et plus extensives. On y trouve presque tout les projets Open Source Java. En fait, Maven est très populaire dans la communauté Open Source, au point que plusieurs nouveaux projets l’utilisent comme l’outil de construction de choix. Puisque la communauté Open Source est plutôt grande et généralement très utile, il existe de nombreux guides et tutoriels faites par des sources third-party sur Maven. Malgré ça, les ressources de Maven manquent d’exemples et de détails, mais on y trouve presque tout ce qu’on veut de ressources comme des plugins, des extensions et des exemples.
La communauté en ligne est plutôt passive qu’active, puisque Maven est sorti avant Gradle, et plusieurs autres outils de builds sont introduites au marché après les forums sont devenus inactifs et plusieurs développeurs ont changé vers d’autre outil de build en trouvant Gradle plus facile à apprendre que Maven.


* <h3>Gradle</h3>

La documentation de Gradle est plus à jour puisque Gradle est un nouveau outil, donc toutes ses forums et ses sites de ressources sont plus “vivants” que Maven et plus actifs. Avec des exemples et des codes bien illustrés, le site officiel de Gradle est assez suffisant pour comprendre cet outil et il est plus moderne.
Si on fait une comparaison de la documentation sur le “test de plugin” sur [Gradle](https://guides.gradle.org/testing-gradle-plugins/) et sur [Maven](https://maven.apache.org/plugin-developers/plugin-testing.html), on peut constater que la documentation de Gradle est plus détaillé, plus simple à lire et à comprendre que celle de Maven.

<h3>Gagnant: GRADLE</h3>

La documentation de Gradle est plus moderne que Maven où chaque tutoriel est bien expliqué et bien détaillé. Elle semble plus moderne et plus récente. Mais d’un autre coté, la documentation de Maven est plus riche et parfois même plus compliqué à comprendre. C’est pour cette raison que plusieurs développeurs préfèrent commencer avec Gradle plutôt qu’avec Maven au point que les forums et la communauté en ligne est plus active sur cet outil.

<h2>Références</h2>

<<<<<<< HEAD
=======

>>>>>>> master
https://gradle.org/maven-vs-gradle/ \
https://gradle.org/gradle-vs-maven-performance/ \
https://dzone.com/articles/gradle-vs-maven \
https://stackify.com/gradle-vs-maven/ \
https://www.baeldung.com/ant-maven-gradle \
https://guides.gradle.org/testing-gradle-plugins/ \
https://maven.apache.org/plugin-developers/plugin-testing.html \
https://gradle.org/features/#performance \
https://en.wikipedia.org/wiki/Gradle \
https://github.com/gradle/gradle
