# Project Name
Hair_Salon 

## Description
 Its a java application created for a Hair Salon owner to aid in the management of the Salon where he/she can store the Salon's stylists and assignment of clients to a specific stylist. The User can add or delete stylists or clients

## Author
Kelvin Kimathi

### Prerequisites

 * An up-to-date browser, preferably chrome or mozilla
 * Internet connection 

## Installation
* Install Git on you machine
 * Maneouver to 'clone or download' button and get the link
 * --Linux Users-- open your terminal and run the 'git clone ...' command in a directory of your choice
 * --for Windows Users-- Navigate to the location you'd want the repository located, right click and select "git bash here"
 * Clone the repository
 * Upon completion, navigate to the cloned repository
  Feel free to edit the files to your prefered taste

 * Now build the Database to enable storing of created instances
 * Install Postgres SQL
 * run the following commands in your terminal

        CREATE DATABASE Hair_Salon;

        CREATE TABLE stylists (id serial PRIMARY KEY, firstName varchar, secondName varchar, lastName varchar, phoneNo varchar, idNo varchar, email varchar);

        CREATE TABLE clients (id serial PRIMARY KEY, clientFirstName varchar,  clientLastName varchar, clientPhoneNo varchar, clientIdNo varchar, clientEmail varchar);

        CREATE DATABASE hair_salon_test;

         CREATE DATABASE hair_salon_test WITH TEMPLATE hair_salon;

## Technologies used
* Gradle
* Postgres SQL
* Java
* HTML
* CSS & Bootstrap
* Junit