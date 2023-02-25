APP_LIST ?= user-service

start : down remove up

down :
	docker compose -f docker-compose.dev.yml down

remove :
	docker image rm -f ${APP_LIST}

up:
	docker compose -f docker-compose.dev.yml up -d 

build:
	docker compose -f docker-compose.dev.yml build
		
push:
    docker push tcp//ec2-18-179-25-169.ap-northeast-1.compute.amazonaws.com:2376/${APP_LIST}:latest
	
restart: down up