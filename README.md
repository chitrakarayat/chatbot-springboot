---

# Spring Boot Chatbot

This project is a simple chatbot application built with Spring Boot. It uses a AWS RDS MySQL database to store and retrieve question-answer pairs which the bot uses to interact with users.

## Postman Documentation: 
<a href="https://documenter.getpostman.com/view/25622053/2s93sZ5tap" target="_blank">https://documenter.getpostman.com/view/25622053/2s93sZ5tap</a>

## Usage

### Chat UI

The chat UI (`http://chatbot.chitrakarayat.tech/chat`) allows you to interact with the bot. Simply type a question in the input field and press send to get a response.

### RESTful API

- To get a response from the bot, make a `POST` request to `http://chatbot.chitrakarayat.tech/chat` with the question in the request body.
- CRUD operations for question-answer pairs can be done on the `rest/qa` endpoint.

## Docker 
-  Repository Link: <a href="https://hub.docker.com/r/chitrakarayat/chatbot" target="_blank">https://hub.docker.com/r/chitrakarayat/chatbot</a>
-  Steps:
    1. `docker pull chitrakarayat/chatbot:spring`
    2. `docker run -p 8080:8080 chitrakarayat/chatbot:spring`

## Features
- RESTful API that allows to get a response from the bot given a question.
- CRUD operations for question-answer pairs.
- MySQL database to persist the question-answer pairs.
- Basic chat UI where you can interact with the bot.
