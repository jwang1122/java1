# My class notes

* check installation
    1. check JDK

```DOS
java -version
javac -version
```
    2. check git version

```DOS
git --version
```
    3. Check installation on Eclipse
>Double-click eclipse icon on Desktop

* My first Java program

```java
public class Hello {
    // my main method to run this class
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

}
```



## Learning Life Cycle
```mermaid
graph TB
A((start))
B([Learning])
C[Take Notes]
D[Try yourself]
E[Fix mistakes]
F[Update Notes]

A-->B-->C-->D-->E-->F-->B

classDef start fill:green,stroke:#DE9E1F,stroke-width:2px;
class A start
```