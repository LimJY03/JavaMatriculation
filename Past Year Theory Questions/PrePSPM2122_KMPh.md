# **Question 01**

Tech Superb is a software development company. They got an offer to develop an apps called Shopink for a company to assist them in online shopping with their customers.

Identify which of the problem solving step is taken in order to develop the Shopink apps by using the suitable integrated development environment (IDE).

> Implementation

During the testing session, the programmer noticed that the apps is displaying the incorrect output. Identify the type of programming error based on the situation given.

> Logic Error

Discuss one (1) benefit of design a solution step before develop the Shopink apps.

> It provides well-defined step by step solution to effectively solve the problem. This allows programmers to track for defects before implementing it into the code.

Justify one (1) importance of documentation in the project development.

> It provides insightful information about the project so that any maintainance with other programmers can be done easily as the program can be easily understood.

As a system analyst, create an IPO chart for the Shopink apps to accepts a list of items from customers and calculate the total price.

> **INPUT**
> 
> * `item`
> * `price`
> 
> **PROCESS**
> 
> * Calculate `priceTotal` based on `item` and `price`.
> 
> **OUTPUT**
> 
> * `priceTotal`

# **Question 02**

The total wage of part time staff at "MAP OF THE SOUL” store is based on the wages per hour and t"e number of hours worked. In addition, if the staff has worked for more than 35 hours, then she or he can gets twice the wages per hour, for every extra hour that she or he has worked, otherwise the wages is based on the rate per hour.

Calculate and display the total wage using the pseudocode algorithm.

> Start
> <br>&emsp;Read hours
> <br>&emsp;Read wagePerHour
> <br>&emsp;If(hours > 35)
> <br>&emsp;&emsp;wages = 35 * wagePerHour + (hourws - 35) * (2 * wagePerHour)
> <br>&emsp;Else
> <br>&emsp;&emsp;wages = hours * wagePerHour
> <br>&emsp;Endif
> <br>&emsp;Print wages
> <br>Stop

The pseudocode below is an algorithm to determine whether a number input by the user is a prime number or not. Create a flowchart based on the given pseudocode.

```markdown
Begin
    input number
    Set divisor to 2
    Set isPrime to 1
    while divisor < number & isPrime = 1
        if number % Divisor = 0
            Set isPrime to 0
        Increase divisor by 1
    end while
    if isPrime = 1
        display "Pri"e”
    else
        display "Not Pri"e”
End
```

> ![2122kmph - Q2](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/2122kmph%20-%20Q2.png?raw=true)

# **Question 03**

Consider the following `Java` Segment.

```java
1.  public class Introjav{ 
2.  
3.      public static void main(String[] args){
4.  
5.          // formula to calculate price
6.          double price = 0.32 * price;
7.          System.out.print("The price is:" + price);
8.      }
9.  }
```

Explain the purpose of the programming statement in line 5.

> To give description about the program segment.

Give two (2) keywords use in `Java` Program.

> `double` and `class`

State whether each of the following is Valid or Invalid Identifier.

> | Identifier | Valid / Invalid |
> | :---: | :---: |
> | `$money` | Valid |
> | `#Task` | Invalid |

Convert the following into `Java` assignment statement.

1. if (number divisible by 3)

    > ```java
    > if(number % 3 == 0)
    > ```

2. y= √(a² + b²) + ab

    > ```java
    > y = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a * b;
    > ```

The following java code contain syntax error. Rewrite the correct version of the code.

> | Java Code | Corrected Version |
> | --- | --- |
> | `char grade=sc.nextInt()` | `char grade = sc.next().charAt(0);` |
> | `if grade = a;` | `if(grade == 'a')` |

Declare `fname` and `sname` as String variables, then initialize `fname` to Muhammad and `sname` to Khairul.

> ```java
> String fname = "Muhammad", sname = "Khairul";
> ```

Write the output after the following program is executed.

```java
if(cases == 0)
    System.out.print("Green zone.");
else if(cases <= 40)
    System.out.print("Yellow zone.");
else
    System.out.print("Red zone.");

System.out.print("Stay safe everyone!");
```

> | Input | Output |
> | :---: | :---: |
> | 0 | `Green zone.Stay safe everyone!` |
> | 40 | `Yellow zone.Stay safe everyone!` |
> | 41 | `Red zone.Stay safe everyone!` |

Use a while statement to rewrite the following `Java` statement.

```java
import java.util.Scanner;

    class Odd{

        public static void main(String[] args){

            Scanner read = new Scanner(System.in);
            int limit = 10, odd = 0;

            for (int i = 0; i < limit; i = i + 1){
                
                int n = read.nextInt();
                
                if(n % 2 == 1)
                    odd = odd + 1;
            }

        System.out.print("Number of odd integer is " + odd);
    }
}
```

> ```java
> import java.util.Scanner;
> 
>     class Odd{
> 
>         public static void main(String[] args){
> 
>             Scanner read = new Scanner(System.in);
>             int limit = 10, odd = 0, i = 0;
> 
>             while(i < limit){
> 
>                 int n = read.nextInt();
> 
>                 if(n % 2 == 0){odd++;}
> 
>                 i++;
>             }
> 
>         System.out.print("Number of odd integer is " + odd);
>     }
> }
> ```

Consider the following `Java` program.

```java
import java.util.Scanner;

class AverageHeight{

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);
        int bil = 0;
        double height, average, total = 0;

        height = read.nextDouble();

        while(height != -1){

            total = total + height;
            bil = bil + 1;

            height = read.nextDouble();
        }

        average = total / bil;
        System.out.print("Average height is " + average);
    }
}
```

Supposed the input is `1.55 1.75 1.81 1.49 1.63 -1`, what will be the output of the program? How many inputs entered? How many times program is executing?

> Output: `Average height is 1.646`.
> <br>Number of inputs: 6.
> <br>Execute count: 5.

Declare and initialize a group of BMI in an array as follows:

&emsp;25.1, 14.5, 16.8, 18.9, 17.4, 13.2, 20.9

> ```java
> double[] BMI = {25.1, 14.5, 16.8, 18.9, 17.4, 13.2, 20.9};
> ```

Write a method header to compute the highest of three floating-point numbers.

> ```java
> double highest(double n1, double n2, double n3)
> ```

# **Question 04**

Develop an **Error Free Program** that prompt user to enter and store 10 number into array named `arrNum` **without importing** `Scanner` class from `Java` package. The program will calculate the sum of all even number and determine the highest number entered by the user.

> ```java
> class ErrorFreeProgram{
> 
>     public static void main(String[] args){
> 
>         java.util.Scanner sc = new java.util.Scanner(System.in);
>         int arrNum[] = new int[10], sumEven = 0, numHighest = 0;
> 
>         for(int i = 0; i < 10; i++){
> 
>             System.out.print("Enter a number: ");
>             arrNum[i] = sc.nextInt();
> 
>             if(arrNum[i] % 2 == 0){sumEven += arrNum[i];}
> 
>             if(arrNum[i] > numHighest){numHighest = arrNum[i];}
>         }
> 
>         System.out.println("Max value entered: " + numHighest);
>         System.out.println("Sum of even number: " + sumEven);
>         
>         sc.close();
>     }
> }
> ```

Write a method named `sumNumber` to find the sum of numbers from 1 to 30 and return the result by invoke from `main` method. (Use `call` as the object for method call)

> ```java
> class Q4b{
> 
>     public static void main(String[] args){
> 
>         Q4b call = new Q4b();
>         int sum = call.sumNumber();
> 
>         System.out.println("The sum of numbers from 1 to 30 is " + sum);
>     }
> 
>     int sumNumber(){
> 
>         int sum = 0;        
> 
>         for(int i = 0; i <= 30; i++){
>             sum += i;
>         }
>         
>         return sum;
>     }
> }
> ```