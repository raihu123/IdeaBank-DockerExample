# IdeaBank

## Description
This Application is for me to come up with Ideas about how to learn new things or keep track of new things I am learning. At the moment this application is containerized and can connect with Database in Localhost.

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [TODO](#todo)
- [Test](#tests)

## Installation
Will require Maven, Docker and JDK

## Usage
To run project use the following steps (all steps in root directory)
- `mvn clean install`
- In `./Dockerfile` DB configuration are put as environment variable but are in comment. So change accordingly.
- `docker build -t idea-bank-img`

## Features
- Basic Crud Operation
- Simple Connection with MySQL
- Application uses CRUDREPO
- Has Get, Post, Delete, PUT

## TODO
- Need to Test Coverage
- Need to add a NOSQL DB connectivity
- Need to explore PATCH
- Add pagination in get all

## Tests
Haven't written anything for the tests, but I will do full code coverage. 