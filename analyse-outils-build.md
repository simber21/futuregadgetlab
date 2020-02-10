<h1> Comparaisons entre Maven et Gradle </h1>

<h2> Critéres de comparaison: </h2>

* Facilité d’utilisation
* Vitesse d’éxécution
* Documentation et communauté en ligne

<h2> Facilité d’utilisation </h2>

Il est toujours agréable de commencer à utiliser, directement, un nouvel outil grâce à ses fonctionnalitées qui sont à la fois faciles, rapides et intuitives.

Ce critère montre si un outil nécessite une connaissance avancée, il est facile de déboguer un programme avec, s’il est facile de comprendre le build script et surtout s’il est facile de l’utiliser avec peu de connaissances.

* <h3> Maven </h3> 

Apprendre à utiliser Maven n’est pas très difficile. Si on respecte ses conventions, tout sera facile et simple mais dès qu’on veut sortir un peu de ce système, qu’on veut utiliser d’autres outils ou faire quelque chose en dehors de cet outil, ça devient vite complexe parce qu'on est très habitué à ce système de Maven.

Le grand défi est de s’habituer à utiliser et comprendre les fonctionnalitées de pom.xml qui est son fichier de configuration. Ce fichier XML est trop fragile et verbeux, par exemple pour la définition des dépendances, il est difficile de créer un pom.xml de zéro. Les build scripts sont compliqués à comprendre car il s’agit de l’utilisation de grands nombres de plugins et des déclarations même pour réaliser certaines tâches simples. Aussi, la personnalisation des goals est difficile sur Maven, il faut que tu crées ton propre plugin.


* <h3> Gradle </h3>

Gradle est un outil ou les scripts de build sont écrits dans un langage Java : Groovy. Avec un peu de connaissance sur cet langage, qui est très peu verbeux, on peut facilement commencer à l’utiliser. Les builds scripts sont facile à lire et à comprendre. En plus, Gradle permet d'utiliser un grand nombre de ressources propres à Ant ou Maven (comme la gestion des build.xml, pom.xml, repositories...) cela permet aux développeurs, qui ont un background sur ces outils de build, de commencer à travailler directement.
Gradle peut aussi réutiliser et compléter une infrastructure basée sur Ant, Ivy ou Maven. En effet, Ant est intégré dans Gradle ce qui nous donne la possibilité de faire des builds entièrement en Ant. Contrairement à Maven, la modification du cycle de vie d'un projet pour ajouter ou supprimer des étapes de construction, ou encore en insérer de nouvelles est simple en Gradle. La personnalisation des goals en Gradle est plus facile que Maven.

<h3> Gagnant:  GRADLE </h3>

Avec un peu de background en Maven ou Ant et un peu de connaissance en Groovy (langage de Java), on peut facilement commencer à utiliser Gradle, et à faire nos builds. Grâce à la simplicité de ses scripts, la possibilité d’utiliser les répertoires de Maven et Ant et sa facilité d’utilisation, Gradle est plus facile à utiliser que Maven.

<h2> Vitesse d'exécution</h2>

La vitesse d'exécution est le clé principale qui va faire la différence entre un outil qui sera choisi par plusieurs entreprises et un autre outil qui sera la pour les petits projets.

Coté performance, les deux outils implémentent le système de multi-module builds qui s'exécute parallèlement pour gagner du temps. Moins de temps sur les builds, moins de dépenses pour les entreprises et plus de projets livrés à temps.

* <h3>Maven</h3>

Maven par défaut n’utilise pas la méthode de builds parallèle, il favorise le build séquentielle. Parfois on doit spécifier à cet outil manuellement, d’utiliser le build en parallèle pour gagner plus de temps et utiliser toute la capacité de notre machine.
De plus, Maven nous donne la capacité de faire les tests en parallèle, moins de temps et plus de tests et de builds, grace a la possibilité de personnaliser les plugins comme Surefire, en lui donnant la possibilité de faire l'exécution des test en parallèle, mais tout doit être fait manuellement.

* <h3>Gradle</h3>

Gradle favorise l’utilisation d’un deamon de compilation continuelle et incrémentale, cet outil vérifie quel task est changé, si rien n’est modifié, le task n’est pas exécuté ce qui nous donne la possibilité de faire des builds en moins de temps. De plus, puisque Gradle utilise sa propre langage Java, Groovy au lieu de XML pour ses scripts, il donne la possibilité d'être plus flexible que Maven, mais les builds deviennent plus lents quand les projets sont plus larges, parce que le script Groovy doit être compilé pour chaque build.

<h3> Gagnant:  GRADLE </h3>

Gradle est surprenamment performant grâce à des builds continues et composés son deamon qui favorise une compilation rapide et incrémenté pour les classes Java. Il évite aussi de vérifier les tasks qui n’étaient pas modifiés entre les builds. Certains le considère comme un outil plus intelligent que Maven avec des meilleurs optimisations.

<h2>Documentation et communauté en ligne</h2>

Pour commencer à utiliser un outil rapidement, la documentation et la communauté en ligne sont nécessaires pour faciliter la compréhension des fonctionnalités et des capacités de cet outil.

La documentation est très essentielle pour comprendre comment un outil fonctionne et qu’est ce qu’on peut faire avec. Avec les ressources qu’on trouve en ligne et les tutoriels disponibles, il est préférable qu’ils soient facile à lire et à comprendre rapidement que d'être compliqués. En plus de ça, la communauté en ligne joue un rôle important à répondre aux questions de plusieurs autres développeurs qui travaille peut être sur un projet similaire.


* <h3>Maven</h3>

La documentation de Maven et ses ressources sont plus riches puisque Maven est sorti en 2004, plus ancien que Gradle. Les ressources de Maven sont très larges et plus extensives. On y trouve presque toutes les projets Open Source Java. En fait, Maven est très populaire dans la communauté Open Source, au point que plusieurs nouveaux projets l’utilisent comme l’outil de construction de choix. Puisque la communauté Open Source est plutôt grande et généralement très utile, il existe de nombreux guides et tutoriels faites par des sources third-party sur Maven. Malgré ça, les ressources de Maven manquent d’exemples et de détails, mais on y trouve presque tout ce qu’on veut de ressources comme des plugins, des extensions et des exemples.
La communauté en ligne est plutôt passive qu’active, puisque Maven est sorti avant Gradle, et plusieurs autres outils de builds sont introduites au marché après les forums sont devenus inactifs et plusieurs développeurs ont changé vers d’autre outil de build en trouvant Gradle plus facile à apprendre que Maven.


* <h3>Gradle</h3>

La documentation de Gradle est plus à jour puisque Gradle est un nouveau outil, donc toutes ses forums et ses sites de ressources sont plus “vivants” que Maven et plus actifs. Avec des exemples et des codes bien illustrés, le site officiel de Gradle est assez suffisant pour comprendre cet outil et il est plus moderne.
Si on fait une comparaison de la documentation sur le “test de plugin” sur [Gradle](https://guides.gradle.org/testing-gradle-plugins/) et sur [Maven](https://maven.apache.org/plugin-developers/plugin-testing.html), on peut constater que la documentation de Gradle est plus détaillé, plus simple à lire et à comprendre que celle de Maven.

<h3>Gagnant: GRADLE</h3>

La documentation de Gradle est plus moderne que Maven où chaque tutoriel est bien expliqué et bien détaillé. Elle semble plus moderne et plus récente. Mais d’un autre coté, la documentation de Maven est plus riche et parfois même plus compliqué à comprendre. C’est pour cette raison que plusieurs développeurs préfèrent commencer avec Gradle plutôt qu’avec Maven au point que les forums et la communauté en ligne est plus active sur cet outil.

<h2>Références</h2>

https://gradle.org/maven-vs-gradle/ \
https://gradle.org/gradle-vs-maven-performance/ \
https://dzone.com/articles/gradle-vs-maven \
https://stackify.com/gradle-vs-maven/ \
https://www.baeldung.com/ant-maven-gradle \
https://guides.gradle.org/testing-gradle-plugins/ \
https://maven.apache.org/plugin-developers/plugin-testing.html \
https://gradle.org/features/#performance