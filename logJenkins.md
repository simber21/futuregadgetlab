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
 > git rev-parse refs/remotes/origin/master^{commit} # timeout=10
 > git rev-parse refs/remotes/origin/origin/master^{commit} # timeout=10
Checking out Revision b391f5887ca25c4b3e1fc70e8ae930d9e2b45e4f (refs/remotes/origin/master)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f b391f5887ca25c4b3e1fc70e8ae930d9e2b45e4f # timeout=10
Commit message: "Merge pull request #11 from simber21/livrable4"
 > git rev-list --no-walk 342f84f1d35f1dcd9310cf297b727e5ea5852447 # timeout=10
[Gradle] - Launching build.
[futuregadgetlab] $ /var/lib/jenkins/workspace/futuregadgetlab/minischeme/gradlew build
Starting a Gradle Daemon (subsequent builds will be faster)

> Task :buildEnvironment

------------------------------------------------------------
Root project
------------------------------------------------------------

classpath
No dependencies

A web-based, searchable dependency report is available by adding the --scan option.

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.3/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 14s
1 actionable task: 1 executed
Build step 'Invoke Gradle script' changed build result to SUCCESS
Triggering a new build of futuregadgetlab
Finished: SUCCESS
