# **Question 01**

Problem solving is the process of transforming the description of a problem into a solution. State the appropriate step of problem solving in computer programming for each of the following statement.

> | Statement | Steps |
> | --- | :---: |
> | Evaluate the program by entering a specific value.| Testing |
> | Write a final report for future references.| Documentation |
> | The process of converting the algorithm by writing a computer program using<br>a `Java` programming language. | Implementation |

Raja Workshop will give a discount of 10% from the total price if the amount of total price is more than RM200 and customer is a member of Raja Workshop. Calculate and display the total price after discount that customer has to pay. Identify the input, process and output based on the problem above.

> **INPUT**
> 
> * `totalPrice`
> * `isMember`
> 
> **PROCESS**
> 
> * Calculate and display `priceAfterDiscount` based on `totalPrice` and `isMember`.
> 
> **OUTPUT**
> 
> * `priceAfterDiscount`

Raihanah wishes to buy a set of dining table from Impian Furniture. The interest charge, 3 percent is based on the balance of payment after deducting down payment. Calculate the monthly payment for her if she wishes to pay installment for one year. Identify the input, process and output based on the problem above.

> **INPUT**
> 
> * `price`
> * `downPayment`
> 
> **PROCESS**
> 
> * Calculate `monthlyPayment` based on `price` and `downPayment`.
> 
> **OUTPUT**
> 
> * `monthlyPayment`

# **Question 02**

JomHantar Courier Company wants to use a computer program to determine payable sum of their mileage claims. Their programmer asks for your help to write the pseudocode. The payable sum is calculated using this table.

| Kilometer (km) | Cents per KM |
| :---: | :---: |
| First 500 | 50 |
| Next 200 | 40 |
| Each extra km | 30 |

Example:

* If the mileage is 100 km, the payable sum is RM50.00.
* If the mileage is 600 km, the payable sum RM290.00 (that is 250 + 40).
* If the mileage is 800 km, the payable sum RM360.00 (that is 250 + 80 + 30).

> Start
> <br>&emsp;Read km
> <br>&emsp;If(km > 700)
> <br>&emsp;&emsp;payment = 500 * 0.50 + 200 * 0.40 + (km - 700) * 0.30
> <br>&emsp;Else if(km > 500)
> <br>&emsp;&emsp;payment = 500 * 0.50 + (km - 500) * 0.40
> <br>&emsp;Else
> <br>&emsp;&emsp;payment = km * 0.50
> <br>&emsp;Endif
> <br>&emsp;Print payment
> <br>Stop

Draw a flowchart to ask the user for the length of their bus/car ride until the user enters 0. Print the average of the lengths.

> ![2122kmm - Q2](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/2122kmm%20-%20Q2.png?raw=true)
>
> Mistake Correction: First action `set count = 0, sum = 0` should be `count = 0, sum = 0` without the word `set`.

# **Question 03**

What is the output of the following program?

```java
public class Program{

    public static void main(String[] args){

        System.out.print("Hello");
        System.out.println(" Guys!");
        System.out.print(20 + 22 + "\nA" + "\nB");
    }
}
```

> ```markdown
> Hello Guys!
> 44
> A
> B
> ```

An identifier is a word that you make up to refer to a Java programming element by name. Identifiers most commonly used for variables, classes, methods, and parameters. Suppose the value for variables a, b, c, d, e, and f is 1, 3, 5, 7, 9 and 1 respectively. Evaluate the following expressions:

1. b / f – (a + a * b)

    > -1

2. 5 - (a + b * f) – a / b

    > 1

3. a == b + c || true && d / e >= (f – e)

    > true

Convert the following algebraic expression into Java expression.

1. y = 2x² + 8x - 2

    > `y = (2 * x * x) + (8 * x) - 2;`

2. val = 7p (2r + w)

    > `val = 7 * p * (2 * r + w);`

# **Question 04**

The use of child car seats has become mandatory in Malaysia since January 2020. To abide this rule, there are three categories of car seats according to the age as below:

![Q4](https://media.discordapp.net/attachments/975199225036034088/975909090347876362/unknown.png)

Write a `Java` program **segment** that will determine suitable type of car seat and its final price to a customer [Assume one customer has one child only]. Price of Rear-Facing car seat is RM454 with a 10% discount, price of Forward-Facing car seat is double the price of Booster seat. Booster seat is sold at RM178. (Assume all variables are already declared)

> ```java
> System.out.print("Enter age of your trial: ");
> age = sc.nextInt();
> 
> if(age < 3){
>     type = "REAR-FACING CAR SEAR";
>     price = 454 * (1 - 0.1);
> }
> else if(age > 5){
>     type = "BOOSTER SEAT";
>     price = 178;
> }
> else{
>     type = "FORWARD-FACING CAR SEAT";
>     price = 178 * 2;
> }
> ```

Determine the error(s) in the following program that allows user to repeatedly enter a number until he/she has entered any negative number. Then, give the right coding.

```java
int num = sc.nextInt();

while(num > 0){
    num = num + 1;
}
```

> 1. `while(num > 0)` should be corrected to `while(num >= 0)` since 0 is not a negative number.
> 2. `num = num + 1;` should be corrected to `num = sc.nextInt();` as it is supposed to be an input instead of increment of variable `num`.

What is the output of the following program segment?

```java
int num1 = 20;
double num2;

while(num1 < 32){

    num2 = num1 % 3 + 2;

    System.out.print(num2 + 1);
    System.out.println();

    num1 = num1 + 3;
}
```

> ```markdown
> 5.0
> 5.0
> 5.0
> 5.0
> ```

Use `for` statement to rewrite the program segment above.

> ```java
> double num2;
> 
> for(int num1 = 20; num1 < 32; num1 += 3){
> 
>     num2 = num1 % 3 + 2;
> 
>     System.out.print(num2 + 1);
>     System.out.println();
> }
> ```

# **Question 05**

What's wrong with the following main method program?

```java
public class Rectangle{

    public static void main(String[] args){

        Rectangle myRect;
        int width = 40;
        int height = 50l
        System.out.println("Rectangle area is " + myRect.area());
    }
}
```

> The object `myRect` is not created.

Write the correct syntax for error mentioned above.

> ```java
> Rectangle myRect = new Rectangle();
> ```

What is the output from the following `Java` program fragment?

```java
public class Method{

    public static void main(String[] args){

        Method myMethod = new Method();
        int A = 10, B = 20;

        myMethod.update(A, B);

        System.out.println(A + " " + B);
    }

    void update(int x, int y){

        x += y;
        y += x;
        System.out.println(x + " " + y);
    }
}
```

> ```markdown
> 30 50
> 10 20
> ```

# **Question 06**

Write a `Java` program to create a single dimensional array of 9 integers, and print the followings:

* sum of elements present at even indexes in array
* sum of elements present at odd indexes in array.
* sum for all integers in array
* sum of even integers exist in the array
* average
* number of elements below average
* maximum integer
* minimum integer

> ```java
> import java.util.Scanner;
> 
> class Q6{
> 
>     public static void main(String[] args){
> 
>         Scanner sc = new Scanner(System.in);
>         int num[] = new int[9], sumEvenIndex = 0, sumOddIndex = 0, sumAll = 0, sumEvenInt = 0, belowAvg = 0, intMax = 0, intMin = 9999999;
>         double average = 0.0;
> 
>         for(int i = 0; i < num.length; i++){
> 
>             System.out.print("Enter integer #" + (i + 1) + ": ");
>             num[i] = sc.nextInt();
> 
>             // Sum of elements present at even indexes and odd indexes in array
>             if(i % 2 == 0){sumEvenIndex += num[i];}
>             else{sumOddIndex += num[i];}
> 
>             // Sum for all integers in array
>             sumAll += num[i];
> 
>             // Sum of even integers exist in the array
>             if(num[i] % 2 == 0){sumEvenInt += num[i];}
> 
>             // Determine maximum and minimum integer
>             if(num[i] > intMax){intMax = num[i];}
>             if(num[i] < intMin){intMin = num[i];}
>         }
>         
>         // Determine average
>         average = (sumAll + 0.0) / num.length; // Convert (sumAll + 0.0) to double so will be double / int = double
> 
>         // Determine number of elements below average
>         for(int j = 0; j < num.length; j++){
> 
>             if(num[j] < average){belowAvg++;}
>         }
> 
>         System.out.println("Sum of elements present at even indexes in array is " + sumEvenIndex);
>         System.out.println("Sum of elements present at odd indexes in array is " + sumOddIndex);
>         System.out.println("Sum of all integers in array is " + sumAll);
>         System.out.println("Sum of even integers exist in array is " + sumEvenInt);
>         System.out.println("Average is " + average);
>         System.out.println("Number of elements below average is " + belowAvg);
>         System.out.println("Maximum integer is " + intMax);
>         System.out.println("Minimum integer is " + intMin);
> 
>         sc.close();
>     }
> }
> ```