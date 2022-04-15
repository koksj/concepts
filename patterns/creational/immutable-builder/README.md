# Immutable Builder 

## Programming Language: Java 17

# Introduction

(Kiwy, 2022) Argues that the builder pattern use is limited to "build different immutable objects using the same building process".

# Lambda




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
        Student part = ImmutableBuilder.of(Student::new, "e8d43f07-0a64-414c-b70a-cd5213a7bc52", "Jack", "Ryder");        
        System.out.println(part);

    }
}
```


# Bibliography

Kiwy, F. (2022). Exploring Joshua Bloch’s Builder design pattern in Java. [online] Oracle.com. Available at: https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java [Accessed 15 Apr. 2022].


https://www.sourcecodeexamples.net/2018/05/refactoring-factory-design-pattern-with.html

