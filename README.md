## oneXtwoNtwrk




### Prerequisites

* Java Development Kit 11 (or higher)
* Message Broker Kafka
* Free local ports: 9999, 9092

### Running the example

* Clone the Git repository.

* Open a terminal in the subdirectory microservice-application and run 'gradle clean'.

* Open a terminal in the subdirectory microservice-application and run 'gradle build'.

* Open a terminal in the subdirectory microservice-application and run 'gradle bootRun'. This will start the microservice on local port 9999.

* Open your browser and navigate to http://localhost:9999/

### API Endpoints

* GET: api/v1/bet (response: Content-Type, application-json) - get all Entities
* POST: api/v1/bet (request: Content-Type, application-json) - insert new Entities

