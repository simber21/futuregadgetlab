
Vagrant.configure("2") do |config|
  config.vm.box = "hashicorp/bionic64"
  config.vm.network :forwarded_port, guest: 8080, host: 8080
  config.vm.provision "shell", inline: <<-SHELL
  
    ## Installation de Java
    wget -qO - https://adoptopenjdk.jfrog.io/adoptopenjdk/api/gpg/key/public | sudo apt-key add -
    sudo add-apt-repository --yes https://adoptopenjdk.jfrog.io/adoptopenjdk/deb/
    apt-get -y install adoptopenjdk-11-hotspot
    echo 'export JAVA_HOME=/usr/lib/jvm/adoptopenjdk-11-hotspot-amd64' >> .bashrc

    ## Installation de Maven
    sudo wget -qP /opt http://mirror.its.dal.ca/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz
    sudo tar xzf /opt/apache-maven-3.6.3-bin.tar.gz -C /opt
    echo 'export M2_HOME=/opt/apache-maven-3.6.3' >> .bashrc
    echo 'PATH=$PATH:$M2_HOME/bin' >> .bashrc

    ## Installation de Gradle
    sudo apt-get install -y unzip
    sudo wget -qP /opt https://services.gradle.org/distributions/gradle-5.6.4-bin.zip
    sudo unzip -q /opt/gradle-5.6.4-bin.zip -d /opt
    echo 'export GRADLE_HOME=/opt/gradle-5.6.4' >> .bashrc
    echo 'PATH=$PATH:$GRADLE_HOME/bin' >> .bashrc

    #Exécution du minischeme web à l'interieur de la VM.
    cd /vagrant/minischeme-web
    ./gradlew bootRun

  SHELL
end