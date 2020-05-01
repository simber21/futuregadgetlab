Vagrant.configure("2") do |config|
  config.vm.box = "hashicorp/bionic64"
  config.vm.provision "shell", inline: <<-SHELL
    ## Installation de Java
    wget -qO - https://adoptopenjdk.jfrog.io/adoptopenjdk/api/gpg/key/public | sudo apt-key add -
    sudo add-apt-repository --yes https://adoptopenjdk.jfrog.io/adoptopenjdk/deb/
    apt-get -y install adoptopenjdk-11-hotspot
    echo 'export JAVA_HOME=/usr/lib/jvm/adoptopenjdk-11-hotspot-amd64' >> .bashrc
    ## Installation de Gradle
    sudo apt-get install -y unzip
    sudo wget -qP /opt https://services.gradle.org/distributions/gradle-6.3-bin.zip
    sudo unzip -q /opt/gradle-6.3-bin.zip -d /opt
    echo 'export GRADLE_HOME=/opt/gradle-6.3' >> .bashrc
    echo 'PATH=$PATH:$GRADLE_HOME/bin' >> .bashrc
  SHELL
end