## Lippia Web sample project - Windows users

## System Requirements :
+ Windows Professional
+ Vagrant 2.2.x: https://www.vagrantup.com/downloads.html
+ Virtual Box https://www.virtualbox.org/wiki/Downloads

# Getting started
 [Download]: <https://bitbucket.org/crowdarautomation/lippia-web-example-project/get/fdc35889edbf.zip>
- [Download] and unzip the source repository for this guide, or clone it using Git:
    ``` $ git clone https://bitbucket.org/crowdarautomation/lippia-web-example-project.git ```
- Go to root directory  
    ``` $ cd lippia-web-example-project ```
## Strategies to run
***
- [Local](#localHeadless) (running tests building project with docker-compose from command line)
- [Stack](#remote) (running docker-compose)   

### Local strategy  
- To run local strategy see:   (Has no changes to Linux users)    
 [`Getting started - Linux User`](/docs/README_Linux.md)

***
### Stack strategy
This strategy use Vagrant to generate a virtual enviroment with Linux.   
You only need to execute one command to start the stack.
```
$ vagrant up --provision
```

 > This command, will start download the images needed to build. It takes a while to download the images depending on your internet connection.
 
The console output looks like this

```
Bringing machine 'default' up with 'virtualbox' provider...
==> default: Importing base box 'fedora/28-atomic-host'...
==> default: Matching MAC address for NAT networking...
==> default: Checking if box 'fedora/28-atomic-host' version '28.20181007.0' is up to date...
==> default: Setting the name of the VM: lippia-web-example-project_default_1567711483282_81366
==> default: Vagrant has detected a configuration issue which exposes a
==> default: vulnerability with the installed version of VirtualBox. The
==> default: current guest is configured to use an E1000 NIC type for a
==> default: network adapter which is vulnerable in this version of VirtualBox.
==> default: Ensure the guest is trusted to use this configuration or update
==> default: the NIC type using one of the methods below:
==> default:
==> default:   https://www.vagrantup.com/docs/virtualbox/configuration.html#default-nic-type
==> default:   https://www.vagrantup.com/docs/virtualbox/networking.html#virtualbox-nic-type
==> default: Clearing any previously set network interfaces...
==> default: Preparing network interfaces based on configuration...
    default: Adapter 1: nat
    default: Adapter 2: hostonly
==> default: Forwarding ports...
    default: 4444 (guest) => 4444 (host) (adapter 1)
    default: 22 (guest) => 2222 (host) (adapter 1)
==> default: Running 'pre-boot' VM customizations...
==> default: Booting VM...
==> default: Waiting for machine to boot. This may take a few minutes...
    default: SSH address: 127.0.0.1:2222
    default: SSH username: vagrant
    default: SSH auth method: private key
    default:
    default: Vagrant insecure key detected. Vagrant will automatically replace
    default: this with a newly generated keypair for better security.
    default:
    default: Inserting generated public key within guest...
    default: Removing insecure key from the guest if it's present...
    default: Key inserted! Disconnecting and reconnecting using new SSH key...
==> default: Machine booted and ready!
==> default: Checking for guest additions in VM...
==> default: Configuring and enabling network interfaces...
==> default: Rsyncing folder: /cygdrive/c/Users/carames/lippia-web-example-project/ => /home/vagrant/sync
==> default: Running provisioner: selinux (shell)...
    default: Running: inline script
    default: Stopped Docker
    default: Started Docker
==> default: Running provisioner: docker_compose...
    default: Checking for Docker Compose installation...
    default: Installing Docker Compose 1.23.1
    default: Symlinking Docker Compose 1.23.1
==> default: Running provisioner: compose (shell)...
    default: Running: inline script
    default: Creating network "sync_default" with the default driver
    default: Pulling selenium-hub (selenium/hub:3.141.59-palladium)...
    default: Trying to pull repository docker.io/selenium/hub ...
    default: sha256:d4eeb55daf5a3501f7e3489c0fabcf50f1d67f4bb9148c433736b995472a3f9a: Pulling from docker.io/selenium/hub
    default: Pulling chrome (selenium/node-chrome:3.141.59-palladium)...
    default: Trying to pull repository docker.io/selenium/node-chrome ...
    default: sha256:6ac84e5942a4bea7848b00edaebafcc8e338fc5a229a2a49b0963a990014ea68: Pulling from docker.io/selenium/node-chrome
    default: Pulling jenkins (crowdar/jenkinsbo:demoweb)...
    default: Trying to pull repository docker.io/crowdar/jenkinsbo ...
    default: sha256:6e7b71c127766294eb46b15118e44cc6d7a9b85843cb356a88f33d830256c163: Pulling from docker.io/crowdar/jenkinsbo
    default: Creating selenium-hub ...
    default: Creating sync_jenkins_1_a2eab8479af2 ...
Creating sync_jenkins_1_a2eab8479af2 ... done
Creating selenium-hub                ... done
    default: Creating sync_chrome_1_7ece9f1f55e6  ...
Creating sync_chrome_1_7ece9f1f55e6  ... done
``` 

Now you can continue with the Linux user guide from the "Check Docker stack is up and running" section.  
[`Getting started - Linux User`](/docs/README_Linux.md)

***
### Shutdown Vagrant
To shutdown vagrant execute this command from root project directory:   
 ```$ vagrant halt```
 
***
#### For more information about Vagrant    
- https://www.vagrantup.com/docs/index.html
- ```$ vagrant --help```  