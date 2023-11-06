package uk.ac.abdn.csd;

import com.github.javafaker.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        System.out.printf("Hello %s and %s %s\n", name, firstName, lastName);
    }
}
