# Immutable Builder 

## Programming Language: Java 17

# Introduction

The builder pattern is a software pattern used to construct complex objects while separating them from their representation using the same construction process (Gamma et al., 2016).  Lambda expressions were introduced in Java 8  and can facilitate quick and convenient functions to construct objects. 

So what does this mean for the builder pattern? 

# Lambda

Since functional programming was introduced to Java 8, objects, mutable and immutable may be instantiated using lambda expresions via parameterised constructors of a class. Depending on how many parameters are in the constructors of said class. Objects instantiated via constructors would require user-defined functional interfaces should they use constructors with more than two parameters. 

Classes with one or two-parameter constructors may use the Java provided functional interfaces as per the table below. 


|Functional interface|Rerurn type|Methode name|# parameters|
|:------------------:|:---------:|:----------:|:----------:|
|Supplier<T>         |T          |get()       |0           |
|Consumer<T>         |void       |accept(T)   |1(T)        |
|BiConsumer<T>       |void       |accept(T,U) |2(T,U)      |
|Predicate<T>        |boolean    |test(T)     |1(T)        |
|Predicate<T,U>      |boolean    |test(T,U)   |2(T,U)      |
|Function<T,R>       |R          |apply(T)    |1(T)        |
|BiFunction<T,U,R>   |R          |apply(T,U)  |2(T,U)      |
|UnaryOperator<T>    |T          |apply(T)    |1(T)        |

Table 1, (Boyarsky and Selikoff, 2020)

## Advantages

* Some of the native Java functional interfaces listed in table 1 above provide quick and easy options for creating new objects from classes.

## Disadvantages

* Null values inevitably will need to be passed to the constructor of complex classes. Telescoping or different combinations of constructors is not a solution either (Kiwy, 2022). Since Java do not allow  two or more constructors of the same signature in the same class.


```java

package io.centilliard;

public class ImmutableBuilder<T> {

    public static <T, U,V,W> T of(Tercet<T,U,V,W> tercet, U u,V v,W w) {       
        return tercet.get(u, v, w);
    }    
}

package io.centilliard;

public class App {

    public static void main(String[] args) throws Exception {
       
        /**
         * Instantiate the immutable Student object using a functional interface
         */
        Tercet<Student, String, String, String> tercet = (id, name, surname) -> new Student(id, name, surname);       
        System.out.println(tercet.get("7fb48204-031b-48b2-a5a3-9236b05b31a6", "Peter", "Pan"));

        /** 
         * Instantiate the immutable Student object using ImmutableBuilder class
         */        
        Student student = ImmutableBuilder.of(Student::new, "e8d43f07-0a64-414c-b70a-cd5213a7bc52", "Jack", "Ryder");        
        System.out.println(student);

    }
}
```
# Bibliography

Boyarsky, J. and Selikoff, S. (2020). OCP Oracle Certified Professional Java SE 11 Programmer II Study Guide : Exam 1Z0-816 and Exam 1Z0-817. Hoboken: Sybex, A Wiley Brand.

Gamma, E., Helm, R., Johnson, R. and Vlissides, J. (2016). Design patterns : elements of reusable object-oriented software. Boston: Addison-Wesley.

Kiwy, F. (2022). Exploring Joshua Bloch’s Builder design pattern in Java. [online] Oracle.com. Available at: https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java [Accessed 15 Apr. 2022].