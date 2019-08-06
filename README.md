# Demo Task

## Pay attention to:
* It's using Desing First pattern (check the public-api.yml), means the code for Controllers is autogenerated
* There are a lot of "TODOs", check them out too
* It's split up to the logical modules
* It's the REST application
* Thread-safe is out of the box with Spring framework
* There is no error handling, but there are some constraints in the DB and controller layer

## How to run:
* Run docker-compose file with Postgres DB and predefined table
* Run from Intellij idea or manually from the terminal using MVN

## Endpoints:
* POST /api/number/ — with payload (check yml file) creates the number
* GET /api/number/avg — get average value
* GET /api/number/min — get min value
* GET /api/number/max — get max value

Enjoy.
