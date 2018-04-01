Vagrant.configure("2") do |config|
  config.vm.box = "ubuntu/trusty64"
  config.vm.box_check_update = false

  config.vm.provider "virtualbox" do |v|
    v.memory = 4096
  end

  config.vm.provision "dependencies", type: "shell", inline: <<-SHELL
    apt-get install -y git openjdk-7-jdk-headless maven
  SHELL

  config.vm.provision "gopath", type: "shell", inline: <<-SHELL
    cat >/etc/environment <<'ENVIRONMENT'
GOPATH=/usr/local/gopath
PATH="$GOPATH/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin"
ENVIRONMENT
  SHELL

  config.vm.provision "nomad", type: "shell", run: "always", inline: "/vagrant/scripts/build-nomad.sh"
end
