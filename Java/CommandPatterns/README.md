# Command Patterns

## GoF Definition: 
Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

## Concept 
Here requests are encapsulated as objects. In general, four terms are associated—invoker, client, command, and receiver. 
A command object is capable of calling a particular method in the receiver. It stores the parameters of the methods in receiver. 
An invoker only knows about the command interface, but it is totally unware about the concrete commands. 
The client object holds the invoker object and the command object(s). 
The client decides which of these commands needs to execute at a particular point in time. 
To do that, he/she passes the command object to the invoker to execute that particular command.

