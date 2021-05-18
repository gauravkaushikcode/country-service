# country-service

## Project Structure

-- country-service
-- country-information-service (Spring Boot)
-- country-information-web (React)

## Standalone Deployment

-- country-information-web (Client)
-- cd /country-information-web

## /constant/network.constants.js holds baseURL

-- baseURL: "http://localhost:8080"
-- npm start
-- this will start application at default port 3000
-- country-information-service (Service)
-- cd /country-information-service

## For CORS handling Added following to LocationController

-- @CrossOrigin(origins = "http://localhost:3000")
-- mvn spring-boot:run
-- this will start application at default port 8080

### Client - React

-- URL --> http://localhost:3000

### Server

-- URL (All Countries) --> http://localhost:8080/countries
-- URL (Specific Country)--> http://localhost:8080/countries/finland

#### Below section is for deployment to heroku

### Client - React

## Heroku Client Deployment App Name :- country-information-web

-- git subtree push --prefix country-information-web heroku-country-web master

-- Where hel-heroku-client is remote for
https://git.heroku.com/heroku-country-web.git

-- URL --> https://heroku-country-information-web.herokuapp.com/

## network.constants holds baseURL

-- baseURL: "https://heroku-country-information-service.herokuapp.com/"

### Server

## Heroku server Deployment App Name :- country-information-service

-- git subtree push --prefix country-information-service heroku-country-service master

-- Where heroku-country-information-service is remote for
https://git.heroku.com/heroku-country-service.git

-- URL --> https://heroku-country-service.herokuapp.com/countries

## For CORS handling Added following to LocationController

@CrossOrigin(origins = "https://heroku-country-web.herokuapp.com")
