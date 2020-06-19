# Are words pyramid words
## Problem Statement:
Please write a web service that accepts http requests and returns responses based on the following problem statement. You may define the request and response format as you see fit based on the problem statement.

Problem statement: Accept a string as input and return a response indicating whether a word is a pyramid word.  A word is a ‘pyramid’ word if you can arrange the letters in increasing frequency, starting with 1 and continuing without gaps and without duplicates.

Examples:
banana is a pyramid word because you have 1 'b', 2 'n's, and 3 'a's.
bandana is not a pyramid word because you have 1 'b' and 1 'd'.

## Requirements
* Java 14
* Gradle

## Run the tests

In the command line from the root directory execute

Mac/Linux

`./gradlew test`

Windows

`./gradlew.bat test`

## Run the application

Mac/Linux

`./gradlew bootRun`

Windows

`gradlew.bat bootRun`

This will spin up the API on `localhost:8080`

### Usage
http://localhost:8080/is-pyramid-word?word=<word to test>
  
### Example request: 
http://localhost:8080/is-pyramid-word?word=banana

### curl examples:
#### Valid pyramid word
Request:
```
curl "http://localhost:8080/is-pyramid-word?word=banana"
```
Response:
```
{"validPyramidWord":true}
```

#### Invalid pyramid word

Request
```
curl "http://localhost:8080/is-pyramid-word?word=bandana"
```

Response
```
{"validPyramidWord":false}
```



## Future improvements
* Version the API
* Swagger Docs
* Dockerize the application
* Health check endpoint
* Implement metrics
* Implement logging
