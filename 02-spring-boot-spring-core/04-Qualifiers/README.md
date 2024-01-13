# Qualifiers:-
When multiple components implement a single class for dependency injection, then a qualifier can be used to specify which dependency is to be used here. It can be specified while defining an argument as @Qualifier("bean-id") <br> <br>
_bean-id =  same as class name, first character lower-case._

## Example:-

public DemoController(@Qualifier("trackCoach") Coach theCoach) {
myCoach theCoach ; \
}