# Patterns

## GoF Definition: 
Define an object that encapsulates how a set of objects interacts. The mediator pattern promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

## Concept 
A mediator is the one who takes the responsibility of communication among a group of objects. The mediator acts as an intermediary who can track the communication between two objects. The other objects in the system are also aware of this mediator and they know that if they need to communicate among themselves, they need to go through the mediator. The advantage of using such a mediator is that we can reduce the direct interconnections among the objects and thus lower the coupling.
