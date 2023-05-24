# WE BLEED BLUE : INDIAN CRICKET TEAM

## TO RUN THE APPLICATION:
Make sure you have these prerequisites:
- NPM
- JAVA 19
- MAVEN

## IF THE PROJECT IS ALREADY BUILD:
You need to deploy the docker containers only with the command:\
``
docker compose -f "docker-compose.yaml" up -d
``

It will start the backend, frontend and create a database for the application which is MongoDB.

### To build the backend project:
In the main directory:\
``
mvn clean install
``

To run the backend project separately, use this command:\
``
mvn spring-boot:run
``

## To build the frontend project:
Go to the directory bleed_blue_frontend in the terminal/command line:\
``
npm install
``

To run the frontend project separately, use this command:\
``
npm start
``


