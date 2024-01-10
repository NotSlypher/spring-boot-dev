# Dependency Inversion:-
The client delegates to another object the responsibility of providing it dependencies.

Spring will use **auto wiring** for dependency injection:- \
spring will look for a class that matches by type: class or interface and inject it automatically \
Spring will scan for @Components

2 types of **dependency injections**:-

Constructor injection- for required dependencies \
Setter injection- for optional dependencies

## Constructor Injection:-

Development Process
1. Define dependency interface and class
2. Create Demo REST Controller
3. Create a constructor in class fo injection
4. Add @GetMapping for /endpoint