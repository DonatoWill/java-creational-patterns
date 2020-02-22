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
