File-to-db sample for spring-boot-starter-batch-web
=============================
This sample demonstrates the usage of an external database. 

Start the Spring Boot application:

```shell
mvn spring-boot:run
```

The default port is 8090. To start a job, use this curl command:

```shell
curl --data 'jobParameters=pathToFile=classpath:partner-import.csv' http://localhost:8090/batch/operations/jobs/flatfileJob
```

Get the status of the job:

```shell
curl -X GET http://localhost:8090/batch/operations/jobs/executions/0
```

Get the logfile of the job:

```shell
curl -X GET http://localhost:8090/batch/operations/jobs/executions/0/log
```