package io.centilliard;

public class App {

    public static void main(String[] args) throws Exception {

        Person person = GenericBuilder.of(Person::new)
                .with(Person::setId, "1")
                .with(Person::setName, "Albert")
                .with(Person::setSurname, "Einstein")
                .build();

        System.out.println(person);

    }
}
