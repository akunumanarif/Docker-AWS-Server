APP_LIST ?= user-service
EC2_INSTANCE_IP ?= tcp//ec2-18-179-25-169.ap-northeast-1.compute.amazonaws.com:2375
IMAGE_TAG ?= latest		

start : down remove up

down :
	docker compose -f docker-compose.dev.yml down

remove :
	docker image rm -f ${APP_LIST}

up:
	docker compose -f docker-compose.dev.yml up -d 

build:
	docker compose -f docker-compose.dev.yml build

tag:
    docker tag ${APP_LIST}:${IMAGE_TAG} ${EC2_INSTANCE_IP}/${APP_LIST}:${IMAGE_TAG}
		
push:
    docker push ${EC2_INSTANCE_IP}/${APP_LIST}:${IMAGE_TAG}
	
restart: down up