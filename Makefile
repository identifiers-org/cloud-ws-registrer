# Makefile based helper for the Registry Web Service

#														#
# Author: Manuel Bernal Llinares <mbdebian@gmail.com>	#
#														#

# Container name
container_name = identifiersorg/cloud-ws-registry
docker_compose_development_file = docker-compose-development.yml
springboot_development_profile = development

# TODO default target

development_env_up:
	@echo "<===|DEVOPS|===> [ENVIRONMENT] Bringing development environment UP"
	@docker-compose -f $(docker_compose_development_file) up -d
	# TODO Clean this way of referencing the target name in future iterations
	@rm -f development_env_down
	@touch development_env_up

development_env_down:
	@echo "<===|DEVOPS|===> [ENVIRONMENT] Bringing development environment DOWN"
	@docker-compose -f $(docker_compose_development_file) down
	# TODO Clean this way of referencing the target name in future iterations
	@rm -f development_env_up
	@touch development_env_down

development_run_tests: development_env_up
	@echo "<===|DEVOPS|===> [TESTS] Running Unit Tests"
	@mvn -Dspring.profiles.active=$(springboot_development_profile) clean test

clean:
	@echo "<===|DEVOPS|===> [CLEAN] Running House Keeping tasks"
	@mvn clean > /dev/null

.PHONY: all clean development_run_tests