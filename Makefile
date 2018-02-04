# Makefile based helper for the Registry Web Service

#														#
# Author: Manuel Bernal Llinares <mbdebian@gmail.com>	#
#														#

# Container name
container_name = identifiersorg/cloud-ws-registry
docker_compose_development_file = docker-compose-development.yml

# TODO default target

development_env_up:
	@echo "<===|DEVOPS|===> [ENVIRONMENT] Bringing development environment UP"
	@docker-compose -f $(docker_compose_development_file) up -d
	# TODO Clean this way of referencing the target name in future iterations
	@touch development_env_up
