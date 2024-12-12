# sourceware-lab-idp

Sourceware Lab IDP server implementing OAuth 2.0 architecture

## ENV Variables

If running in development mode place a `.env` file in deployment if using docker or define these enviornment variables
in Eclipse run configuration if using Eclipse.

```
DB_HOST: Hostname of the MySQL database that the IDP server is connecting to
DB_PORT: Port of the MySQL database that the IDP server is connecting to
DB_USER: Username of the MySQL user in the MySQL database that the IDP server is connecting to
DB_PASS: Password of the MySQL user in the MySQL database that the IDP server is connecting to
DB_DATABASE: Name of the MySQL database that the IDP server is connecting to
MYSQL_ROOT_PASSWORD: (Only for docker) Password of the root user in the MySQL database
```

## To Run In Eclipse

Create a run configuration for the `IdpApplication.java` file that includes the ENV variables mentioned above with an underlying database running; then run the configuration.

## To Run In Docker (Dev)

Run the `build-project.sh` from the `src/main/scripts` directory to build the IDP server's base image and the IDP server's deployment image.

**Will be method once new IDP base image is hosted**
~~Run the `mvn clean package` command at the root of the folder to build the Java project and create a Docker image under the tag: `sourceware-labs/sourceware-lab-idp:latest`.~~

Afterwared, create a `.env` file in the `/src/main/deployment` folder with the previously mentioned ENV variables.

Finally run `docker compose up -d` from the `/src/main/deployment` folder to create the underlying database and run the server in a container from the created docker image.

## To Check For Documented Dependency Vulnerabilities

Run the `log-vulnerabilities.sh` file in the `src/main/scripts` directory to analyze the IDP server docker image for any documented dependency vulnerabilities regarding installed packages
and Maven dependencies.

## View Swagger UI

The Swagger API UI can be accessed at `http://localhost:8080/swagger-ui/index.html`.

## TODOs

- Allow for control over hostname and port of server
- Allow for control over the selected database user
- Add styling sheet
- Add github actions
