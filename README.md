# Backend Homework Assignment #

## Welcome ##
This readme file describes the interview assignment in detail. So read it Carefully!
Please keep your code clean and maintain good documentation as these will also be evaluated as part of the assignment.

* The first step you should do is to clone this repository to your local machine using git.
* When you done with the assignment please zip your code and send it for evaluation.

## Project Structure ##
This is a simple Maven Java (1.8) project with no external dependencies, you can find the source code inside the src/main/java folder.
In the assignment we will define two entities:

* The User entity - POJO with the user information.
* The Connection - a connection between two users.

Inside that folder you will find the following package structure:

    +com.owiwi
        +data
            - ConnectionDatabase -> The connection database (in-memory).
            - UserDatabase -> The user's database (in-memory).

        +enumeration
            - Gender - Enum that describes the user's gender.
            - ConnectionType - Enum that describes a type of connection between two users.
            - EducationLevel - Enum that describes the user's education level.

        +model
            - Entity - Abstract entity class.
            - Connection - The data model of a connection.
            - User - The data model of a user.

        +repositories
            +base
                - IRepository - An interface of a repository.
                - BaseRepository - Common abstract class to all future repositories.
                - ConnectionRepository - Implementation class of the connection repository.
                - UserRepository - Implementation class of the user's repository.

## Assignment Number 1 ##
* Fill in the implementation to the user's repository named UserRepository.
* Fill in the implementation to the connection repository named ConnectionRepository.

## Assignment Number 2 ##
* You may use any 3rd party framework to handle the HTTP requests.
* Create a REST endpoint that will get a user by its id.
* Create a REST endpoint to get all the connections of a user, the result should be grouped by the connection type.
* Create a REST endpoint to add a connection between two users (for each one of the connection types).

## Assignment Number 3 ##
One new feature is to suggest potential mentors from the user's connections:

The user can send his search preferences:
* Age range
* Education Level
* Gender

We will filter the user's database according to the users suggestion and, to make a "good" suggestion we will apply the following rules:
* The requester should not get users that marked him as stranger.
* The requester should not get users that he has marked as stranger.

Your job is to create a REST controller to handle this request, a good way to start is by extending the repositories and by creating services to handle the business logic.

## Assignment Number 4 - BONUS ##
As the user database begins to grow up in size we want to implement a cache layer to the results of the 3rd assignment.
Design, implement and integrate a cache layer to the results of the 3rd assignment endpoint.


Good Luck!
