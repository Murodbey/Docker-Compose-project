## Install Vault using DOCKER-COMPOSE

1. Install docker and docker-compose into your system
``` 
chmod +x docker_install.sh 
. docker_install.sh
```
2. Install Vault running this command
```
docker-compose up -d
```
3. Check if the container is running
```
docker-compose ps
```
4. Paste your ip address of your machine into browser with port ```8200```
```
yourip:8200
```