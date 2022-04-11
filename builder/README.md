# Lambda based Builder Pattern

## Language: Java 17

The Builder Pattern is a Creational Pattern described by  (Gamma et al., 2016).  This is an implementation of the builder pattern based on (Mulley 2022) whose implementation is Lambda orientated. The emphasis in my implementation based on Mulley's is applying the general guidelines for making an object immutable as documented in the OCP study guide.

## Immutable Strategy

General guidelines to make a class immutable (Boyarsky et al., 2020):

1. Ensure the class access is final.
2. All instance variables shall be private.
3. Remove all setter methods and make fields final.
4. Mutable objects shall not be allowed any modifications.
5. A class constructor shall set all properties for the object and make a copy if need be.


# Bibliography

Boyarsky, J. and Selikoff, S. (2020). OCP Oracle Certified Professional Java SE 11 Programmer II Study Guide : Exam 1Z0-816 and Exam 1Z0-817. Hoboken: Sybex, A Wiley Brand.

Gamma, E., Helm, R., Johnson, R. and Vlissides, J. (2016). Design patterns : elements of reusable object-oriented software. Boston: Addison-Wesley.

Muley, A., 2022. Advanced Builder Using Java 8 Lambda. [online] Innovecture. Available at: <https://www.innovect.com/advanced-builder-using-java-8-lambda> [Accessed 11 April 2022].






