# Dependency Inversion:-
The client delegates to another object the responsibility of providing it dependencies.

Spring will use **auto wiring** for dependency injection:- \
spring will look for a class that matches by type: class or interface and inject it automatically \
Spring will scan for @Components

2 types of **dependency injections**:-

Constructor injection- for required dependencies \
Setter injection- for optional dependencies

**Bad injection:-**
Field injection - directly injecting without taking through parameter

**example:-**
@Autowired
private Coach myCoach

_// no need for constructors or setters_
@GetMapping ( " /dailyworkout " )

public String getDailyWorkout() {
return myCoach.getDailyWorkout() ;
}