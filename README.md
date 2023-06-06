---

# Spring Boot Chatbot

This project is a simple chatbot application built with Spring Boot. It uses a AWS RDS MySQL database to store and retrieve question-answer pairs which the bot uses to interact with users.

## Usage

### Chat UI

The chat UI (`http://localhost:8080/chat`) allows you to interact with the bot. Simply type a question in the input field and press send to get a response.

### RESTful API

- To get a response from the bot, make a `POST` request to `http://localhost:8080/chat` with the question in the request body.
- CRUD operations for question-answer pairs can be done on the `/qa` endpoint.

## Docker 
-  Repository Link: https://hub.docker.com/r/chitrakarayat/chatbot
-  Steps:
  1. `docker pull chitrakarayat/chatbot:spring`
  2. `docker run -p 8080:8080 chitrakarayat/chatbot:spring`

## Features
- RESTful API that allows to get a response from the bot given a question.
- CRUD operations for question-answer pairs.
- MySQL database to persist the question-answer pairs.
- Basic chat UI where you can interact with the bot.

## Technologies Used
- Java
- Spring Boot
- MySQL
- Thymeleaf
- Maven
