# **Question 01**

Name the flowchart symbol based on the following statement:

1. Seven Five Eight Four (7584) is a PIN number for Ali’s Auto Teller Machine (ATM) card. The system verify the pin number before Ali is able to continue to the next step.

    > Decision

2. Mimi keyin a room type and the total number of room in hotel booking
system.

    > Input

Identify the most suitable type of control structure based on the given problem.

1. Calculate 10% commission for each of a company's salesperson.

    > Sequence

2. Calculate the book price based on category of book.

    > Selection

Describe one (1) purpose of using repetition control structure in `Java` program.

> To repeate instructions or statements until a certain condition is met.

# **Question 02**

Identify suitable characteristics of Object Oriented Programming Language based on the given description.

> | Description | Characteristic |
> | --- | :---: |
> | Capturing data and keeping it safely and securely from outside interfaces. | Encapsulation |
> | Promotes the reusability of code and eliminates the use of redundant code.<br>It is a process by which a class can be derived from a base class with all<br>features of base class and some of its own. | Inheritance |
> | Multiple definitions for a single name – functions with the same name but<br>with different functionality. | Polymorphism |
> | The ability to represent data at a very conceptual level without any details. | Abstraction |

Write three (3) lines of `Java` statements that will display the quote as shown below.

```markdown
Nothing is impossible.
The word itself says
    I'm Possible
```

> ```java
> System.out.println("Nothing is impossible.");
> System.out.println("The word itself says");
> System.out.println("\tI'm Possible");
> ```

# **Question 03**

Anwer the following questions based on the image below.

![q3](https://media.discordapp.net/attachments/975199225036034088/975332510361878528/unknown.png)

State two (2) `Java` reserved word used in the image above.

> `int` and `void`

There are a few rules of naming identifiers. Write two (2) examples when the rules of naming identifiers are not followed (use identifiers from the image above).

> An identifier should start with alphabets A - Z or a - z or $ or _. It should not start with a number like `2price`.
>
> `Java` reserved words like `public` should not be used as an identifier.

Write the output if the data type of variables `int` is changed to `double`.

> ```markdown
> The price of the item is 29.0
> The tax is 1.0
> The total is 31.0
> ```

# **Question 04**

Given an array as below:

```java
String[] kolejMatrikulasi = {"KMNS", "KMM", "KMPP", "KMPk", "KMPh", "KMJ"};
```

1. State the index for KMPP.

    > 2

2. What is the value of `kolejMatrikulasi.length`?

    > 6

3. What is the index of the last item in the array?

    > 5

4. Give the value of `kolejMatrikulasi[4]`.

    > KMPh

Write a `Java` code fragment to do the following tasks:

1. Set the value of the third element of the array `listNumber` to four times the value of the seventh element, plus 30.

    > ```java
    > listNumber[2] = 4 * listNumber[6] + 30;
    > ```

2. Declare an array `studentScore`, and initialize its components to 98.5, 75.5, 36.5, 88.5 and 67.4.

    > ```java
    > double studentScore[] = {98.5, 75.5, 36.5, 88.5, 64.7};
    > ```

State one (1) advantage of using method in `Java` programming.

> Methods make the code more readable and easier to debug.

Name two (2) types of method in `Java` programming.

> Standard Library Methods and User-Defined Methods

In the following program code, identifier the segments that has the below structure.

```java
import java.util.Scanner;

class CalculatePayment{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);   

        System.out.print("Enter discount 5 or 10 =");
        double cut = input.nextDouble();
        System.out.print("Enter price=");
        double price = input.nextDouble();   

        System.out.print("Payment = RM "+ printPrice(cut, price));
    }  

    public static double printPrice (double a, double RM){

        double discount = RM *(a / 100);
        double discountPrice = RM - discount;
        return discountPrice;
    }
 }
```

> | Method Structure | Statement / Code | 
> | :---: | :---: |
> | Parameter List | `double a, double RM` |
> | Return Value Type | `void` and `double` |
> | Method Header | `public static void main(String[] args)` and<br>`public static double printPrice (double a, double RM)` |
> | Method Call | `printPrice(cut, price)` |

Write a non-static method `isMultiple` that determines, for a pair of integers, whether the second integer is a multiple of the first. The method should take two integer arguments, return `true` if the second is a multiple of the first, and return `false` otherwise.

> ```java
> boolean isMultiple(int n1, int n2){
> 
>     return (n2 % n1 == 0);
> }
> ```

Write a static method called `max3` that accepts three parameters (all integers) and returns the largest one.

> ```java
> static max3(int n1, int n2, int n3){
> 
>     return (n1 > n2 && n1 > n3) ? n1 : (n2 > n1 && n2 > n3) ? n2 : n3;
> }
> ```

Write the statement to call the method `max3()`.

> ```java
> int largest = max3(x, y, z);
> ```

# **Question 05**

Identify the step in problem solving based on the description.

> | Description | Problem Solving Steps |
> | --- | :---: |
> | Transform the algorithm into a set of instructions that understood by the computer. | Implementation |
> | Specifically, the task of defining the problem consists of identifying what it is you know<br>(input: given data), and what it is you want to obtain (output: the result). | Problem Analysis |
> | Checks the syntax of your program to make sure the programming language was used<br>correctly, giving you all the syntax-error messages. | Testing |
> | A written detailed description of the programming cycle and facts about the program. | Documentation |
> | One way of describing a computer program to someone who doesn’t understand how<br>to program a computer. | Design a Solution |

GSB Cinema Berhad charges people of varying age for a concert ticket. The charges as per age are given below:

| Age | Charge |
| :---: | :---: |
| <16 | 7 |
| <65 | 10 |
| >= 65 | 5 |

Identify the input, process, output for this problem.

> **INPUT**
> 
> * `age`
> 
> **PROCESS**
> 
> * Determine `charge` based on `age`.
> 
> **OUTPUT**
> 
> * `charge`

ELLE Sdn. Bhd. wants to develop a system that shows the number of seats left in two different cinemas after selling the movie tickets. The total seats in Cinema A are 30 while in Cinema B, the total seats are 45. The ticket price is RM 10.00 per person. User is given the number of customers who bought the tickets of both cinemas separately. Finally, calculate the total sales. Identify the input, process, output for this problem.

> **INPUT**
> 
> * `aCount`
> * `bCount`
> 
> **PROCESS**
> 
> * Calculate `totalSales` based on `aCount` and `bCount`.
> 
> **OUTPUT**
> 
> * `totalSales`

Draw a flowchart that accepts mark of N students in a class. Calculate and display the average mark and the number of student whose mark is below than 40.

> ![1920kmpp - q5](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/1920kmpp%20-%20Q5.png?raw=true)

A survey is being carried out which involves reading and recording sound levels near a busy road junction. A sound level of 0 decibels (0 dB) indicate the end of the data. Write an algorithm, using pseudocode, which inputs all the sound levels and after a sound level of 0 is input, outputs the average sound level and the highest recorded sound level.

> START
> <br>&emsp;SET count = 0
> <br>&emsp;SET sum = 0
> <br>&emsp;SET soundHighest = 0
> <br>&emsp;INPUT soundLevel
> <br>&emsp;WHILE soundLevel != 0
> <br>&emsp;&emsp;READ soundLevel
> <br>&emsp;&emsp;sum = sum + soundLevel
> <br>&emsp;&emsp;count = count + 1
> <br>&emsp;&emsp;IF soundLevel > soundHighest THEN
> <br>&emsp;&emsp;&emsp;soundHighest = soundLevel
> <br>&emsp;&emsp;ENDIF
> <br>&emsp;ENDWHILE
> <br>&emsp;average = sum / count
> <br>&emsp;PRINT average
> <br>&emsp;PRINT soundHighest
> <br>STOP

# **Question 06**

Write a Java assignment statement to calculate the circumference of a circle.

> ```java
> double circumference = 2 * 3.141592653 * radius;
> ```

Create a Scanner object name `nakmasuk` and wriet a `Java` input statement that will accept  `mySalary` as a decimal value.

> ```java
> Scanner nakmasuk = new Scanner(System.in);
> double mySalary = nakmasuk.nextDouble();
> ```

Write an output statement that will display “Congratulations!!! You did well” together with the value of the `totalBonus`.

> ```java
> System.out.println("Congratulations!!! You did well" + totalBonus);
> ```

Write a `Java` statement to do the following tasks:

1. Declare and initialize a variable of type int to hold a number of song in a music collection.

> ```java
> int songCount = 0;
> ```

2. Declare a variable of type int to hold the number of feet and initialize to 5280.

> ```java
> int feet  5280;
> ```

3. Declare a constant of type char to hold the default gender value M for male.

> ```java
> final char GENDER = 'M';
> ```

What is the value of the result after the statement?

> | Statement | Result | 
> | --- | :---: |
> | `result = 3 * ((18 -4) / 2);` | 21 |
> | `result = ( 19 % 8 ) > 3 - 4 ;` | `true` |
> | `if( 6 + 3 >= 9 % 2 \|\| 3 % 8 < 4 - 2)`<br>&emsp;`result = 1;`<br>`else`<br>&emsp;`result = 2;` | 1 |

Write `Java` assignment statements for the following algebraic equations.

1. 0.5(*x*² + *y*²)

> ```java
> result = 0.5 * (Math.pow(x, 2) + Math.pow(y, 2));
> ```

2. 2*a* / (*b* + *c*)

> ```java
> result = 2 * a / (b + c);
> ```

3. (*x* + *y*) / 2

> ```java
> result = (x + y) / 2;
> ```

# **Question 07**

Analyse the following code segment:

```java
int i = 1, x = 0;

while(i < 4) {

    int y = input.nextInt();

    if (x > y)
        x = y;

    i = i + 1;
}

System.out.println(x);
```

What is the output when the inputs (8, -5, -1) are entered?

> ```markdown
> -5
> ```

State the purpose of the code segment above.

> To determine the smallest value entered by user.

Rewrite the code segment above by using `for` loop.

> ```java
> int x = 0;
> 
> for(int i = 0; i < 4; i++){
> 
>     int y = input.nextInt();
> 
>     if (x > y)
>         x = y;
> }
> 
> System.out.println(x);
> ```

Identify and fix the errors in the following code segment.

```java
if (score >= 100);
    System.out.println("Your Grade is A");

int sum = 0;

for (int i = 1, i <= 10, i++)
    sum += i;

System.out.println(sum);
```

> Error type: Syntax Error
>
> ```java
> if (score >= 100)
>     System.out.println("Your Grade is A");
> 
> int sum = 0;
> 
> for (int i = 1; i <= 10; i++)
>     sum += i;
> 
> System.out.println(sum);
> ```

Identify the following errors in the following code segment and fix it.

```java
int sum = 0, i = 1;
while (i < 10){

    sum = sum + i;

    System.out.println(sum);

    i = i - 1;
}
```

> Error type: Logic Error
> 
> ```java
> int sum = 0, i = 1;
> while (i < 10){
> 
>     sum = sum + i;
> 
>     System.out.println(sum);
> 
>     i++;
> }
> ```

# **Question 08**

Write a method call for a non-static method name `convertFah` that converts a temperature from Fahrenheit to Celsius (5/9)(*F* − 32) where F is the Fahrenheit temperature and C is the Celsius temperature). Given the class name is `convertTemp`.

> ```java
> convertTemp converter = new convertTemp();
> double fah = converter.convertFah(temp);
> ```

A weather station in Kepala Batas has been keeping track of the fastest wind speed over the two weeks. Write a full `Java` program to do the followings:

* Calculate the average wind speed over the two weeks.
* Find the days on which the highest wind speed and the lowest wind speed were recorded.
* Calculate the difference between the highest wind speeds recorded and average wind speed.
* Display all your calculations and findings.

> ```java
> import java.util.Scanner;
> 
> class KepalaBatasWind{
> 
>     public static void main(String[] args){
> 
>         Scanner sc = new Scanner(System.in);
>         double windSpeed = 0.0, windSpeedTotal = 0.0, windSpeedHighest = 0.0, windSpeedLowest = 99999.9, windSpeedAverage = 0.0;
> 
>         for(int i = 0; i < 14; i++){
> 
>             System.out.print("Enter wind speed for day " + (i + 1));
>             windSpeed = sc.nextDouble();
> 
>             if(windSpeed > windSpeedHighest){windSpeedHighest = windSpeed;}
>             if(windSpeed < windSpeedLowest){windSpeedLowest = windSpeed;}
> 
>             windSpeedTotal += windSpeed;
>         }
> 
>         windSpeedAverage = windSpeedTotal / 14;
> 
>         System.out.println("The highest wind speed is " + windSpeedHighest);
>         System.out.println("The lowest wind speed is " + windSpeedLowest);
>         System.out.println("The difference between highest wind speed and average wind speed is " + (windSpeedHighest - windSpeedAverage));
> 
>         sc.close();
>     }
> }
> ```
