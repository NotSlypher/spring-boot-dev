# Setter Injection
Inject dependencies by calling setter injection methods on your class.

### Development Process -

1. Create setter methods in your class for injections.
2. Configure the dependency injection with @Autowired Annotation.


\
Behind the scenes SpringBoot will create a new object with required implementation and use the method to set the dependency injection.


### example :-
Coach theCoach = new CricketCoach();

DemoController demoController = new DemoController();

demo Controller.setCoach(theCoach); <br><br>

_There is no compulsion on the method name._