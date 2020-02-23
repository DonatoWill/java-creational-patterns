# java-creational-patterns
#### Project based on course: https://www.pluralsight.com/courses/design-patterns-java-creational
## Java Creational Patterns
### Singleton Pattern
Guarantees only one instance is going to be created.
Guarantees control of a resource, since this is a creational design pattern, the instantiation of it is all are controlled through the implementation of the pattern.
It is usually lazily loaded

Examples:
 - Runtime
 - Logger
 - Spring Beans

#### Design
 - Class is responsible for lifecycle
 - Static in nature
 - Needs to be thread safe
 - Private instance
 - Private constructor

### Builder Pattern
Handle complex constructors with large number of parameters, can guarantee immutability.

Examples:
 - StringBuilder
 - DocumentBuilder
 - Locale.Builder

#### Design
 - Flexibility over telescoping constructors
 - Static inner class
 - Calls appropriate constructor
 - Negates the need for exposed setters
 - Can take advantage of Generics
 
### Protoype Pattern
This pattern is used when the type of object to create is determined by a prototypical instance, wich is cloned to produce a new instance. Oftentimes used to get a unique instance of the same object.
If an object is expensive to create, but we can get we need by copying the member variables, than the prototype is a great fit.

#### Concepts
 - Avoids costly creation
 - Avoids subclassing
 - Typically doesn't use "new"
 - Often utilizes an Interface
 - Usually implemented with a Registry

#### Design
 - Tipically implements the clone/cloneable method and interface 
 - Avoids keyword new
 - Although a copy, each instance unique
 - Costly construction not handled by client
 - Different to Singleton you can still utilize parameters for construction
 - Shallow VS Deep Copy (Shalow just copy the immediate properties)