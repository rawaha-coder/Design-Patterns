# Abstract Factory Patterns

## GoF Definition: 
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

## Concept 
In this pattern, we provide an encapsulation mechanism to a group of individual factories. These factories have a theme in common. In this process, an interface is used to create related objects. 
Here we do not call their implementer or concrete classes directly. We sometimes refer to this pattern as a factory of factories or a Super factory.
With this pattern, we can interchange the specific implementations without changing the user’s code. But to achieve this, we need to compensate for the complexity of the system. As a result, debugging may be difficult in many scenarios.
