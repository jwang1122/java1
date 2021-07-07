<h1> Java learning Notes </h1>

- [Java API Documentation](#java-api-documentation)
- [Variable naming](#variable-naming)
- [Variable and Memory](#variable-and-memory)
- [First Java Program](#first-java-program)
- [Basic skills](#basic-skills)
- [Comments](#comments)
- [Print](#print)
- [Primative Data Type](#primative-data-type)
- [Array](#array)
- [Operators](#operators)
- [If-else](#if-else)
- [Loop](#loop)
  


## Java API Documentation
[Java API website](https://docs.oracle.com/javase/8/docs/api/)

## Variable naming
1. variable name cannot start with number
```java
int 1a = 0; // 1a is invailid variable name, cause Syntax error
```
2. variable can only start with letter combined with letter and number _, a-z, A-Z, 0-9, no other special characters.
3. prefer camel style: firstName, it is used for variables, method name.
4. cannot use reserved java key words and existing class name for variable name.

![](images/javaKeywords.png)

[Java Reserve Keywords](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)

## Variable and Memory
![](images/chineseMedicine.jpg)

The computer memory is something similar as Chinese medicine drawer. You can put something into the drawer, and then you can get what you put in. The only difference is, once you put stuff in computer memory, you can get as many as you want; but the medicien drawer will be empty one you take out too much.

![](images/memory.gif)
create a variable just like put a label on the drawer. so you can put more than one labels on the same drawer, or no label at all.

## First Java Program
[Hello.java](../src/com/huaxia/java1/Hello.java)
```java
class Hello {
	// my main method to run this class
	public static void main(String[] options) {
		System.out.println("Hello, World!");
	}

}
```
✔️❌❓
## Basic skills
* ❓What is the method signature?
>✔️1. method name; 2. argument type and number of arguments; 3. maybe return type
* ❓What are the modifiers?
>✔️

* ❓Can I rename main method?
>✔️

* ❓How to create a package?
>✔️Right-click **src** folder > New > Package > enter package name

* ❓How to create Java Class?
>✔️

* ❓How to run java class?
>✔️

* ❓How to rename a class file?
>✔️

## Comments
* Single line comment
```java
// this is single line comment
int a = /* assign value 10 to a*/ 10;
int b = 5; // add comment after code
```
* Multiple lines comment
```java
/**
This is multiple line
comment.
*/
```
## Print
* [System.out.print](../src/com/huaxia/java1/Print.java)
* System.out.println(String);
* System.out.print(String);
* System.out.printf(format, args);

![](images/languageBasics.svg)

## Primative Data Type
[Data Type](../src/com/huaxia/java1/DataType.java)
```java
	boolean flag = false; // true, false
	byte myByte = 127; // 8 bits, -128~127
	char c = 'A'; // ASCII:American Standard Code for Information Interchange, 7 bits
	short myShort = 128;
	int a = 1234542345; // int is data type of integer
	long l = 123454234563242L; // put L, or l, on the end
	float x = 129.3F; // f or F on the end
	double y = 12.3;
```
The above data is in the order of the container size.

You can assign small value to bigger container, but cannot assign big value to smaller container. If you know what you are doing, you can cast big value to smaller container, which may truncation your data.

## Array
Array is a special data type.

## Operators
* [Operator](../src/com/huaxia/java1/Operator.java)
* Arithmetic operator +, -, *, /, %
* Compound assignment operator +=, -=, *=, /=, %=
* Binary operator ++, --
* Comparison Operator >, <, >=, <=, ==, !=
* Logical Operator  && and, || or, ! not
* Ternary Operator a>b?a:b

## If-else
* [if, if-else, if-else if-else](../src/com/huaxia/java1/IfElse.java)

## Loop
* [for loop](../src/com/huaxia/java1/Loop.java)
* [while loop]()