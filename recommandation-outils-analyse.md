<h1>Comparaisons entre les outils d'analyse PMD et SpotBug</h1>

<h2>PMD</h2>

PMD est un outil d'analyse statique du code source. Additionellement, il comprend un détecteur de code copier-coller (CPD) qui trouve les bouts de code dupliqués. Il trouve les erreurs communes de programmation comme les variables non utilisées, 
    
les catch blocks vides, des objets crées inutilement, ect.. En plus de supporter Java, il supporte aussi au moins 7 autres langages. PMD peut être intégré facilement dans un procédé de build en but Maven, an tâche Ant, en tâche Gradle ou en ligne de commande.  

L'utilisateur peut utiliser les options de vérification disponibles ou créer leurs propres règles, écrites en Java. L'abbréviation "PMD" n'est pas exactement définie, il serait même un rétro-acronyme. "Programming Mistake Detector" ou "Project Mess Detector"

sont les définitions données les plus logique. L'outil est principalement connu sous le nom "PMD" avec le slogan "Don't shoot the messenger" intégré dans le logo.


<h3>Sources</h3>
https://pmd.github.io/latest/#overview
https://pmd.github.io/
https://www.datarespons.com/code-quality-assurance-with-pmd/


<h2>SpotBugs</h2>

SpotBugs est un outil d'analyse statique qui passe en revu bytecode en langage Java et trouve les bugs caché dans le code source. C'est un programme qui cherche pour des instances de code qui sont plus à risque de causer des bugs. SpotBugs est distribué sous la GNU Lesser General Public License. SpotBugs est le successeur spirituel de FindBugs, un programme d'analyse statique avec la marque de commerce de L'Université du Maryland. 

Plus de 400 modèles de bugs peuvent être reconnus par SpotBug. 

<h3>Sources</h3>
https://spotbugs.github.io/index.html#using-spotbugs
http://findbugs.sourceforge.net/ 

<h2>Critères de comparaison</h2>

* La fonctionnalité du programme
* Intégration au projet 
* Personnalisation

<h2>La fonctionnalité du programme</h2>

La fonctionnalité du programme sont les tâches qu'il peut éffectuer qui sont les plus pertinentes au projet. Il est important de choisir un outil d'analyse de code qui offre des fonctionnalités qui correspondent aux besoins de l'équipe. Pour ce projet, un outil qui offre des options efficaces mais facile d'utilisation, un rapport de données compréhensible et qui possède une certaine flexibilité sont les qualités recherchées.

En évaluant les programmes d'analyse statique selon ce critère, on identifiera lequel correspond le plus au projet. 

* <h3>PMD</h3>

PMD est un programme qui scan le code source et trouve les problèmes potentiels, principale fonctionnalité recherchée. Il peut vérifier si le code source est conforme à une convention de nom de variable établie jusqu'à être capable d'identifier du code ou des variables non utilisées et aussi la complexité du code, tout en vérifiant les bugs. De plus, il vient avec un outil qui peut identifier le code dupliqué. Les utilisateurs peuvent aussi intégré leurs propres règles dans PMD.

PMD peut aussi faire une résolution de type. Il s'intègre facilement, sous forme de plugin, avec une vaste sélection d'éditeurs et outils de build en plus de pouvoir s'exécuter sur ligne de commande. L'outil est capable de générer un rapport clair et puisque c'est possible de l'afficher sur une page web, facile d'accès. 

* <h3>SpotBugs</h3>

SpotBugs scanne le bytecode du code source, après la compilation, à la recherche de bugs sous plus de 400 modèles différents. Les modèles sont séparés en plusieurs catégories, classés par sévérité des bugs potentiels, du moins important au plus important en passant par la performance et le code douteux. SpotBugs s'intègre aussi avec une variété d'éditeurs et d'outils de build sous forme de plugin.



<h3>Gagnant: PMD </h3>

Bien que SpotBugs possède une librairie vaste de modèle de bugs, PMD lui, analyse le code source directement. Aussi, il ne s'arrête pas juste à identifier des modèles de bugs prédéfinis. PMD possède aussi un rapport plus simple et compréhensible. 

<h3>Sources</h3>
https://blog.codacy.com/which-java-static-code-analysis-tools-should-i-use/
https://spotbugs.readthedocs.io/en/latest/gradle.html

<h2>Intégration au projet</h2>

La simple tâche d'installer un plugin sur un programme peut s'avérer un véritable casse-tête. Ainsi, un outil qui est simple a intégré est une qualité recherchée. Il faut aussi qu'il soit pleinement compatible avec les outils utilisés par le projet. Aussi, qu'il ne nuit pas à la création de builds et que l'on puisse personnaliser aux besoins du projet.  

<h3>PMD</h3>

Avec l'outil de build que l'on a choisi (Gradle), PMD s'intègre facilement dans le fichier de configuration en plugin, ajouté au fichier build.gradle. Il n'est pas nécéssaire d'installer de dépendences pour le faire fonctionner. L'outil est facilement appelé avec des lignes de commandes compréhensibles.

<h3>SpotBugs</h3>

SpotBugs s'installe aussi comme plugin à Gradle, en l'ajoutant avec ses dépendances dans le fichier build.gradle. Par contre, du à bug de Gradle, l'installation ne se fait pas sans problèmes, malheureusement. 

<h3>Gagnant: PMD </h3>

PMD n'est pas compliqué à installer et c'est possible de visonner un rapport quelques minutes après avoir intégrer le plugin.  

<h2>Personnalisation</h2>

Chaque projet est différent et demande différentes configurations. Un outil flexible et capable de s'adapter aux besoins du projet et des utilisateurs est une option viable pour fournir un processus de build efficace, qui sauve du temps et évite de mettre de fausses alarmes dans le rapport d'analyse.

<h3>PMD</h3>

Bien que PMD possède plus de 250 règles prêtes à être utilisées immédiatement après installation, il est possible de faire ses propres règlements. Vu le nombre de règle disponible, il se peut qu'il y en ai qui se contredisent donc l'outils permet de choisir les règles que l'on veut appliquer au projet et éteindre celles qui ne sont pas pertinente.

Il peut être configuré pour s'assurer de la qualité du code. Puisqu'il analyse le code source même, l'utilisateur peut mettre en place des règles qui vérifient le style du code et lorsqu'il est intégré au processus de build, peut faire échouer le build ou le commit non-conforme. Ainsi, la qualité du code peut être automatiquement vérifiée et le code ne peut qu'être amélioré après un certain temps.  

<h3>SpotBugs</h3>

Bien que SpotBugs possède une très large librairie de règles, il est aussi possible de personnaliser les options d'analyse. Les options d'analyses de Spotbugs ont 2 objectifs: de permettre à l'utilisateur d'informer Spotbugs du sens des methodes utilisées dans le projet pour éviter de fausses alarmes et permet de configurer la précision à laquelle l'analyse est performée. 

Il est possible aussi de classifier une classe qui n'a pas besoin d'être analysée mais dont le code a besoin de fonctionner. En ajoutant le fichier à l'"auxiliary classpath", le fichier peut être utilisé par le code mais ne sera pas analysé par SpotBugs.

<h3>Gagnant: PMD</h3>

Bien que SpotBugs propose des options d'analyses intéressantes, PMD permet de personnaliser ce qui est analysé, ce qui est reporté mais aussi de faire en sorte que la qualité du code est améliorée.  
