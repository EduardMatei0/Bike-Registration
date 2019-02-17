# Bike-Registration

A simple app integrating Spring boot and Angular

Steps for back-end

1. Run bikes.sql (folder database script) script in mysql workbench ( or other database, but you need to configure in application properties)

2. Run CrudDemoAplication using your favorite IDE to get the server starting (localhost:8080);

3. You can verify the json objects on https://localhost:8080/api/bikes or https://localhost:8080/api/bikes/1

Steps for front-end

1. You need node.js installed https://nodejs.org/en/

2. Verify in cmd prompt node -v

3. Run in terminal in source folder (Angular-BikeUi-front-end) npm install

4. Run with ng serve --proxy-config proxy.conf.json in terminal

5. Type https://localhost:4200 to see bike registration form

6. Type https://localhost:4200/admin to see table of bike objects
