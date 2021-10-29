# Memento Patterns

## GoF Definition: 
Without violating encapsulation, capture and externalize an object’s internal state so that the object can be restored to this state later. 

## Concept 
Our aim is to save the state of an object, so that in the future, we can go back to the specified state. Three objects are playing the game here—a memento, a caretaker, and the originator. 
The memento will store the internal states of the originator. The originator can have the internal states and it has the ability to restore into its earlier state. 
An originator can also retrieve information from the memento. The caretaker takes care of the memento’s safekeeping or protection and it should not examine the contents of the memento.
