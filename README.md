# helloSoa-jaxws
Contract-First CXF SOAP over JMS &amp; HTTP Web Service

helloSoa-jaxws is a sample JavaEE project built with Maven for demonstrating how to build and run a Contract-First SOAP Web Service implementation through a both JMS and HTTP endpoints.
Whereas the SOAP/HTTP endpoint can be consumed directly, the SOAP/JMS needs a MQ Broker for publishing the queue.

### Tech

- Apache CXF
- Maven
- Contract-First SOAP Web Service
- SOAP/JMS and SOAP/HTTP endpoints
- SOAP/JMS endpoint uses Apache MQ 

### SOAP/JMS usage

Before consuming the SOAP/JMS service, the queue should be running.
An Apache MQ local test environment can be used for this purpose executing the following Maven command: mvn org.apache.activemq.tooling:activemq-maven-plugin:5.8.0:run
