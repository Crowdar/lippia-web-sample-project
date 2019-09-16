# -*- mode: ruby -*-
# vi: set ft=ruby :

# All Vagrant configuration is done below. The "2" in Vagrant.configure
# configures the configuration version (we support older styles for
# backwards compatibility). Please don't change it unless you know what
# you're doing.
#
#
unless Vagrant.has_plugin?("vagrant-docker-compose")
  system("vagrant plugin install vagrant-docker-compose")
  puts "Dependencies installed, please try the command again."
  exit
end

Vagrant.configure("2") do |config|
    config.vm.box = "fedora/28-atomic-host"
	# used by seleniumGrid
    config.vm.network "forwarded_port", guest: 4444, host: 4444	
    config.vm.network "forwarded_port", guest: 8080, host: 8080
    config.vm.network "forwarded_port", guest: 8081, host: 8081
    config.vm.network "forwarded_port", guest: 6081, host: 6081
    
    config.vm.network "private_network", type: "dhcp"
  
	config.vm.synced_folder ".", "/home/vagrant/sync", disabled: false
		
    config.vm.provider "virtualbox" do |vb|
	    vb.cpus = "2"
        vb.memory = "2048"
        vb.gui = true
        vb.linked_clone = false
	end

   config.vm.provision "selinux", type: "shell", inline: <<-SHELL
     sudo systemctl stop docker
     echo "Stopped Docker " 
     sudo sed -i 's/--selinux-enabled //g' /etc/sysconfig/docker
     sudo systemctl start docker
     echo "Started Docker " 
   SHELL
    config.vm.provision :docker_compose, compose_version:"1.23.1", run: "always"
    config.vm.provision "compose", type: "shell", run: "always", inline: <<-SHELL
	sudo docker-compose -f /home/vagrant/sync/docker-compose.yml up
   SHELL
end
