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
  ## Heroku Client Deployment App Name :- hel-location-client
  -- git subtree push --prefix country-information-web hel-heroku-client master

  -- Where hel-heroku-client is remote for	https://git.heroku.com/hel-location-client.git
  
  -- URL --> https://hel-location-client.herokuapp.com/

  ## network.constants holds baseURL
  -- baseURL: "https://hel-location-server.herokuapp.com/"

### Server
  ## Heroku server Deployment App Name :- hel-location-server
  -- git subtree push --prefix country-service-service hel-heroku-server master

  -- Where hel-heroku-server is remote for	https://git.heroku.com/hel-location-server.git
  
  -- URL --> https://hel-location-server.herokuapp.com/locations

  ## For CORS handling Added following to LocationController
  @CrossOrigin(origins = "https://hel-location-client.herokuapp.com")
