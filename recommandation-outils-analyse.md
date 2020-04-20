<h1>Comparaisons entre les outils d'analyse PMD et SpotBug</h1>

<h2>PMD</h2>

PMD est un outil d'analyse statique du code source. Additionellement, il comprend un détecteur de code copier-coller (CPD) qui trouve les bouts de code dupliqués. Il trouve les erreurs communes de programmation comme les variables non utilisées, 
    
les catch blocks vides, des objets crées inutilement, ect.. En plus de supporter Java, il supporte aussi au moins 7 autres langages. PMD peut être intégré facilement dans un procédé de build en but Maven, an tâche Ant, en tâche Gradle ou en ligne de commande.  

L'utilisateur peut utiliser les options de vérification disponibles ou créer leurs propres règles, écrites en Java.

<h3>Sources</h3>
https://pmd.github.io/latest/#overview
https://pmd.github.io/


<h2>SpotBugs</h2>

SpotBugs est un outil d'analyse statique qui analyse le code en langage Java et trouve les bugs caché dans le code source. C'est un programme qui cherche pour des instances de code qui sont plus à risque de causer des bugs. SpotBugs est distribué sous la GNU Lesser General Public License. SpotBugs est le successeur spirituel de FindBugs, un programme d'analyse statique avec la marque de commerce de L'Université du Maryland. 

Plus de 400 modèles de bugs peuvent être reconnus par SpotBug. 

<h3>Sources</h3>
https://spotbugs.github.io/index.html#using-spotbugs
http://findbugs.sourceforge.net/ 

<h2>Fonctionnalité</h2>

La fonctionnalité est donc les tâches que le programme est capable d'éffectuer. Il est important de choisir un outil d'analyse de code qui offre des fonctionnalités qui correspondent aux besoins du projet. Pour ce projet, un outil qui offre des fonctions efficaces mais facile d'utilisation, un rapport de données compréhensible et qui possède une certaine flexibilité sont les qualités recherchées.

En évaluant les programmes d'analyse statique selon ce critère, on identifiera lequel correspond le plus au projet. 

PMD est un programme qui scan le code source et trouve les problèmes potentiels, principale fonctionnalité recherchée. Il peut vérifier si le code source est conforme à une convention de nom de variable établie jusqu'à être capable d'identifier du code ou des variables non utilisées et aussi la complexité du code, tout en vérifiant les bugs. De plus, il vient avec un outil qui identifie le code dupliqué.

Il s'intègre facilement avec une vaste sélection d'éditeurs et outils de build en plus de pouvoir s'exécuter sur ligne de commande. L'outil est capable de générer un rapport clair et puisque c'est possible de l'afficher sur une page web, facile d'accès. 

SpotBugs scanne le code source à la recherche de bugs sous plus de 400 modèles différents. 
<h3>Sources</h3>
https://blog.codacy.com/which-java-static-code-analysis-tools-should-i-use/



criteres de comparaison: 

cout/liscence
usabilite
customization
securite
Integration


