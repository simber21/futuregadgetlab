Started by user Ingrid Blémur
Running as SYSTEM
Building in workspace /var/lib/jenkins/workspace/futuregadgetlab
using credential 13d94e66-64b3-4f64-bcff-b466d235bfdc
 > git rev-parse --is-inside-work-tree # timeout=10
Fetching changes from the remote Git repository
 > git config remote.origin.url https://github.com/simber21/futuregadgetlab.git # timeout=10
Fetching upstream changes from https://github.com/simber21/futuregadgetlab.git
 > git --version # timeout=10
using GIT_ASKPASS to set credentials 
 > git fetch --tags --progress -- https://github.com/simber21/futuregadgetlab.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git rev-parse refs/remotes/origin/ingrid^{commit} # timeout=10
 > git rev-parse refs/remotes/origin/origin/ingrid^{commit} # timeout=10
Checking out Revision a8b99059755f0ff76662e3c5c05f42967761fce1 (refs/remotes/origin/ingrid)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f a8b99059755f0ff76662e3c5c05f42967761fce1 # timeout=10
Commit message: "restorer le build.gradle pour minischeme-web"
 > git rev-list --no-walk a8b99059755f0ff76662e3c5c05f42967761fce1 # timeout=10
[Gradle] - Launching build.
[futuregadgetlab] $ /var/lib/jenkins/workspace/futuregadgetlab/gradlew build
Starting a Gradle Daemon (subsequent builds will be faster)
> Task :bootStartScripts
> Task :generateGrammarSource
> Task :minischeme-web:compileJava
> Task :minischeme-web:processResources
> Task :minischeme-web:classes
> Task :minischeme-web:jar SKIPPED

> Task :compileJava
Note: /var/lib/jenkins/workspace/futuregadgetlab/src/main/java/minischeme/GlobalEnvironment.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

> Task :processResources NO-SOURCE
> Task :classes
> Task :bootWar
> Task :bootDistTar
> Task :bootDistZip
> Task :jar SKIPPED
> Task :startScripts
> Task :distTar
> Task :distZip
> Task :shadowJar
> Task :startShadowScripts
> Task :shadowDistTar
> Task :shadowDistZip
> Task :war SKIPPED
> Task :assemble

> Task :pmdMain
6 PMD rule violations were found. See the report at: file:///var/lib/jenkins/workspace/futuregadgetlab/build/reports/pmd/main.html

> Task :generateTestGrammarSource NO-SOURCE
> Task :compileTestJava
> Task :processTestResources NO-SOURCE
> Task :testClasses

> Task :pmdTest
9 PMD rule violations were found. See the report at: file:///var/lib/jenkins/workspace/futuregadgetlab/build/reports/pmd/test.html

> Task :test
> Task :check
> Task :build
> Task :minischeme-web:bootJar
> Task :minischeme-web:bootStartScripts
> Task :minischeme-web:bootDistTar
> Task :minischeme-web:bootDistZip
> Task :minischeme-web:startScripts
> Task :minischeme-web:distTar
> Task :minischeme-web:distZip
> Task :minischeme-web:assemble
> Task :minischeme-web:compileTestJava NO-SOURCE
> Task :minischeme-web:processTestResources NO-SOURCE
> Task :minischeme-web:testClasses UP-TO-DATE
> Task :minischeme-web:test NO-SOURCE
> Task :minischeme-web:check UP-TO-DATE
> Task :minischeme-web:build

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.3/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 2m 16s
26 actionable tasks: 26 executed
Build step 'Invoke Gradle script' changed build result to SUCCESS
Triggering a new build of futuregadgetlab
Finished: SUCCESS
