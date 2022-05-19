# **Question 01**

In order to solve the problems using programming language, a programmer must design their solution using algorithm. It is essential step that will correspond to the instructions which is developed to the computer using programming language.

1. Define algorithm.

    > Algorithm is a sequence of well-defined step by step instruction to solve the problems.

2. List two (2) ways to represent algorithm.

    > Pseudocode and Flowchart

3. Describe one of the answer mentioned above.

    > Flowchart is a set of standard shaped boxes that are connected by flow lines to represent an algorithm.

Based on statements below, write the appropriate type of control structure.

> | Statements | Control Structure |
> | --- | :---: |
> | Two or more conditions, determine the execution of certain instructions. | Multiple Selection |
> | All actions or instructions will be executed, none will be skipped. | Sequence |
> | Indefinite looping of actions or execution of instruction. | Sentinel-Controlled Repetition |
> | To implement a set of actions or instructions by checking only one condition<br>or criterion provided. | Single Selection |

# **Question 02**

`Java` is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs used for Mobile applications especially Android apps.

Identify the characteristic of Object-oriented Programming based on the following description.

> | Description | Characteristic of OOP |
> | --- | :---: |
> | This feature protects data and methods from outside access or misuse. | Encapsulation |
> | Concept by which we can perform a single action in different ways. | Polymorphism |
> | Process of hiding the implementation details and showing only functionality<br>to the user. | Abstraction |
> | A mechanism in which one object acquires all the properties and behaviors<br>of a parent object. | Inheritance |


State three (3) types of operators and give one (1) example for each of them.

> | Operator | Example |
> | :---: | :---: |
> | Arithmetic Operator | + |
> | Relational Operator | > |
> | Logical Operator | && |

# **Question 03**

List three (3) rules of creating valid identifier.

> 1. Identifiers can only start with alphabet, underscore and dollar sign only.
> 2. Identifiers cannot be `Java` reserved keywords like `extends` and `private`.
> 3. Identifiers cannot contain white spaces.

State whether these identifiers are valid or invalid. Give the reason to justify the invalid
identifier.

> | Identifier | Valid / Invalid | Reason |
> | :---: | :---: | --- |
> | Size-L | Invalid | Identifier cannot contain "-". |
> | void | Invalid | void is a `Java` reserved keyword. |
> | $Max | Valid | - |

Identify whether the following assignment statements are valid or invalid. Assume the variable declaration section of a program is:

```java
int noofpeople, waterpark;
double ticketprice, drypark;
```

> | Assignment Statement | Valid / Invalid |
> | --- | :---: |
> | `drypark = noofpeople * ticketprice;` | Valid |
> | `waterpark = drypark * ticketprice;` | Invalid |

# **Question 04**

Describe the following declaration statement, then state the highest index of `height`.

```java
double[] height = new double[30];
```

> An array named `height` that can store values of datatype `double` is declared with array size 30. 
> 
> The highest index of `height` is 29.

Differentiate two (2) types of methods.

1. User-Defined Method

    > It is a self-written method by the programmer to meet certain requirement.

2. Standard Library Method

    > It is a built-in `Java` methods that are readily available to be used.

Give an example for the given method structure or type based on the following code segment.

```java
public static void main (String [] args){

    int star1, star2;

    System.out.print (“Enter two number: ”);
    star1 = ana.nextInt();
    star2 = ana.nextInt();

    System.out.print(obj.BolehKira(star1, star2));
}

boolean BolehKira (int x, int y) {
    
    if (x % y == 0)
        return true;
    else
        return false;
}
```

> | Method Structure / Type | Example |
> | :---: | :---: |
> | User-Defined Method Name | `BolehKira` |
> | List of Arguments |  `star1`, `star2` |
> | Parameter List for User-Defined Method | `int x`, `int y` |
> | Return Type | `Boolean`|

# **Question 05**

Name the appropriate step in Problem Solving based on the table below.

> | Activity | Name of Step | 
> | --- | :---: |
> | Writing Java codes. | Implementation |
> | Programmer explain part of program by using // symbol in the codes. | Documentation |
> | Identify the data needed in problem solving. | Problem Analysis |
> | Draw a flowchart before proceed writing the codes. | Design A Solution |
> | Ensure the program is free from any errors. | Testing | 

A guest at a residential hotel will be charged basic rate RM 8 if he parks his car at the hotel parking area six (6) hours or less. Otherwise, he will be charged an extra RM 2 for every following hour. Calculate and display the parking fee that he has to pay.

> **INPUT**
> 
> * `hour`
> 
> **PROCESS**
> 
> * Determine and calculate `fee` based on `hour`.
> 
> **OUTPUT**
> 
> * `fee`

# **Question 06**

A student will not be fined if he returns the car he rent within 24 hours. Otherwise, he will be charged RM30 per hour of late return. Calculate and display the amount of fine that he has to pay, or display a message “Thank you for early return” based on hours. Draw a flowchart to solve the problem.

> ![1920kmj - Q6](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/1920kmj%20-%20Q6.png?raw=true)

The vice president would like to know the oldest age of participant that attend the meeting. The number of people attend will be recorded before they the start the meeting. Create a pseudocode to solve the following problem.

> START
> <br>&emsp;SET counter = 0
> <br>&emsp;SET ageOldest = 0
> <br>&emsp;INPUT peopleCount
> <br>&emsp;WHILE counter < peopleCount
> <br>&emsp;&emsp;INPUT age
> <br>&emsp;&emsp;IF age > ageOldest THEN
> <br>&emsp;&emsp;&emsp;ageOldest = age
> <br>&emsp;&emsp;ENDIF
> <br>&emsp;&emsp;counter = counter + 1
> <br>&emsp;ENDWHILE
> <br>&emsp;PRINT ageOldest
> <br>STOP

# **Question 07**

Convert the following algebraic expressions into `Java` expressions.

&emsp;3*a*²/2*ut*

> `3 * Math.pow(a, 2) / (2 * u * t)`

Write the output after the segment is executed.

```java
int a = 1, b = 5;
double c = 5.0;
double d;

d = 3 / a - b / c;

System.out.println(d);
System.out.println(!(20 > 4) && (4 % 3 > 75));
```

> ```markdown
> 2.0
> false
> ```

Identify the errors in the program segment below. State one (1) appropriate type of error found in the code.

```java
 1. (
 2.     char Upperb = 'B';
 3.     int j = 2, k = 3;
 4.     double r = 24.5, s = 3.0, t;
 5.
 6.     System.out.print("Rule 1 = " + r + j);
 7.     System.out.print("Rule 2 = " + upperb + j);
 8. 
 9.     calculate t = r + j;
10. 
11.     System.out.print("Rule 3 = " + t);
12. )
```

> Error type: Syntax Error. 
>
> Line 1 and Line 12: if the code segment above is in a method, the `()` should be replaced to `{}`
> \
> Line 7: The variable `upperb` is not declared and initialized, it should be `Upperb` instead.
> \
> Line 9: The term "calculate" is undefined, to perform addition operation, it should be removed.

Complete the given Java code segment to produce following output.

```markdown
1  2  3  4  5
6  7  8  9  10
11 12 13 14 15
16 17 18 19 20
```

> ```java
> for(int i = 1; i <= 20; i++){
> 
>     if(i % 5 == 0){
>         System.out.println(i);
>     }
>     else{
>         System.out.print(i + "\t");
>     }
> }
> ```

A year is a leap year if it is divisible by 4 but not by 100 or if it is divisible by 400. Write the `Java` `if` statement for the above condition. Use variable named as `year`.

> ```java
> if((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0))
> ```

# **Question 08**

Write a `Java` program to calculate area based on user‟s choice as shown below.

| Choice | Operation |
| :---: | --- |
| 1 | Calculate and display area of rectangle |
| Not 1 | Calculate and display area of circle |

Use an array named as `allArea` to store the result of ten (10) areas. Set the constant variable `PI` to 3.142.

> ```java
> import java.util.Scanner;
> import java.lang.Math;
> 
> class calculateArea{
> 
>     static Scanner sc = new Scanner(System.in);
> 
>     public static void main(String[] args){
> 
>         double allArea[] = new double[10];
> 
>         for(int i = 0; i < allArea.length; i++){
> 
>             System.out.print("Enter your choice, 1 or not 1: ");
> 
>             if(sc.nextInt() == 1){allArea[i] = areaRectangle();}
>             else{allArea[i] = areaCircle();}
> 
>             System.out.println(allArea[i]);
>         }
> 
>         sc.close();
>     }
> 
>     static double areaRectangle(){
> 
>         System.out.print("Enter length and width separated by white spaces: ");
>         return sc.nextDouble() * sc.nextDouble();
>     }
> 
>     static double areaCircle(){
> 
>         final double PI = 3.142;
> 
>         System.out.print("Enter radius of circle: ");
>         return PI * Math.pow(sc.nextDouble(), 2);
>     }
> }
> ```

Haraz is going to make a research of five (5) students randomly in one (1) primary school as a sample to his study. He needs to collect particular data such as gender and BMI of the students. Write a `Java` program for Haraz to determine the number of students of every gender and maximum BMI among all students.

![q8b](https://media.discordapp.net/attachments/975199225036034088/975576256089296926/unknown.png)

> ```java
> import java.util.Scanner;
> 
> class Q8b{
> 
>     public static void main(String[] args){
> 
>         Scanner sc = new Scanner(System.in);
>         int boyCount = 0, girlCount = 0;
>         double bmi = 0.0, bmiMax = 0.0;
>         char gender = 'A';
> 
>         for(int i = 0; i < 5; i++){
> 
>             System.out.print("Enter gender (B/G): ");
>             gender = sc.next().charAt(0);
>             System.out.print("Enter BMI: ");
>             bmi = sc.nextDouble();
> 
>             if(gender == 'B' || gender == 'b'){boyCount++;}
>             else if(gender == 'G' || gender == 'g'){girlCount++;}
> 
>             if(bmi > bmiMax){bmiMax = bmi;}
>         }
>         
>         System.out.println("Number of boys: " + boyCount);
>         System.out.println("Number of girls: " + girlCount);
>         System.out.println("Maximum BMI is: " + bmiMax);
> 
>         sc.close();
>     }
> }
> ```
