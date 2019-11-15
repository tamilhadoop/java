package de.codecentric.java8examples.defaultmethods;

/**
 * A GreetingService implementation that overrides to provided default method.
 */
public class ExtendedGreetingService implements GreetingService {

    private String name;

    public ExtendedGreetingService(String name) {
        this.name = name;
    }

    @Override
    public String greet() {
        return "Hello " + name + "!";
    }
	
/**
 * Feature branch-2 JIRA ID -Fea02.
 */
    public String meetgreet() {
        return "Hello " + name + "!";
    }
	
}