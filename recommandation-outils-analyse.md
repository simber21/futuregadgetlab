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

SpotBugs est un outil d'analyse statique qui analyse le code en langage Java et trouve les bugs caché dans le code source. C'est un programme qui cherche pour des instances de code qui sont plus à risque de causer des bugs. SpotBugs est distribué sous la GNU Lesser General Public License. SpotBugs est le successeur spirituel de FindBugs, un programme d'analyse statique avec la marque de commerce de L'Université du Maryland. 

Plus de 400 modèles de bugs peuvent être reconnus par SpotBug. 

<h3>Sources</h3>
https://spotbugs.github.io/index.html#using-spotbugs
http://findbugs.sourceforge.net/ 

<h2>Critères de comparaison</h2>

* La fonctionnalité du programme
* Facilité d'installation
* La licence utilisée

<h2>La fonctionnalité du programme</h2>

La fonctionnalité du programme sont les tâches qu'il peut éffectuer qui sont les plus pertinentes au projet. Il est important de choisir un outil d'analyse de code qui offre des fonctionnalités qui correspondent aux besoins de l'équipe. Pour ce projet, un outil qui offre des options efficaces mais facile d'utilisation, un rapport de données compréhensible et qui possède une certaine flexibilité sont les qualités recherchées.

En évaluant les programmes d'analyse statique selon ce critère, on identifiera lequel correspond le plus au projet. 

* <h3>PMD</h3>

PMD est un programme qui scan le code source et trouve les problèmes potentiels, principale fonctionnalité recherchée. Il peut vérifier si le code source est conforme à une convention de nom de variable établie jusqu'à être capable d'identifier du code ou des variables non utilisées et aussi la complexité du code, tout en vérifiant les bugs. De plus, il vient avec un outil qui peut identifier le code dupliqué. Les utilisateurs peuvent aussi intégré leurs propres règles dans PMD.

PMD peut aussi faire une résolution de type. Il s'intègre facilement, sous forme de plugin, avec une vaste sélection d'éditeurs et outils de build en plus de pouvoir s'exécuter sur ligne de commande. L'outil est capable de générer un rapport clair et puisque c'est possible de l'afficher sur une page web, facile d'accès. 

* <h3>SpotBugs</h3>

SpotBugs scanne le code source, après la compilation, à la recherche de bugs sous plus de 400 modèles différents. Les modèles sont séparés en plusieurs catégories, classés par sévérité des bugs potentiels, du moins important au plus important en passant par la performance et le code douteux. SpotBugs s'intègre aussi avec une variété d'éditeurs et d'outils de build sous forme de plugin.



<h3>Gagnant: PMD </h3>

Bien que SpotBugs possède une librairie vaste de modèle de bugs, PMD ne s'arrête pas juste à identifier des modèles prédéfinis. PMD possède aussi un rapport simple et compréhensible. 

<h3>Sources</h3>
https://blog.codacy.com/which-java-static-code-analysis-tools-should-i-use/
https://spotbugs.readthedocs.io/en/latest/gradle.html



criteres de comparaison: 

cout/liscence
u  sabilite
customization
securite
Integration


