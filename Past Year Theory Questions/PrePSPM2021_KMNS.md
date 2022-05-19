# **Question 01**

Write an IPO analysis to display “Android”, “Mac OS x” or “Linux” when user enter value 1, 2 or respectively. Otherwise, display “Windows 10”.

> **INPUT**
> 
> * `value`
> 
> **PROCESS**
> 
> * Determine and display respective message based on `value`.
> 
> **OUTPUT**
> 
> * "Android" or "Mac OS x" or "Linux" or "Windows 10"

Write an IPO analysis to input age and gender, the display the insurance policy rate repeteadly for n of customers according to certain conditions given in the table below:

<table>
    <tr>
        <td rowspan = 2>Male</td>
        <td>Age < 21</td>
        <td>Policy rate = 0.05</td>
    </tr>
    <tr>
        <td>Age ≥ 21</td>
        <td>Policy rate = 0.035</td>
    </tr>
    <tr>
        <td rowspan = 2>Female</td>
        <td>Age < 21</td>
        <td>Policy rate = 0.04</td>
    </tr>
    <tr>
        <td>Age ≥ 21</td>
        <td>Policy rate = 0.025</td>
    </tr>
</table>

> **INPUT**
> 
> * `age`
> * `gender`
> * `n`
> 
> **PROCESS**
> 
> * Determine and display `policyRate` based on `age` and `gender` repeatedly for `n` times.
> 
> **OUTPUT**
> 
> * `policyRate`

NCJ Corporation and Training wishes to perform a mini seminar to KMNS students. The seminar will be held for 2 days and the charge is RM250 per person. Write the IPO of the program that calculates and displays the nett profit for the seminar after the deduction of:

* seminar hall rental: RM500 per day
* charges for motivator: RM1000
* meal : RM25 per person (daily)

> **INPUT**
> 
> * `participantCount`
> 
> **PROCESS**
> 
> * Calculate `nettProfit` based on `participantCount` after deducting `hallRent`, `motivatorFee` and `meal` for `participantCount`.
> 
> **OUTPUT**
> 
> * `nettProfit`

Write a pseudocode that compute the payment of electricity consumption. Inputs are previous meter reading and current meter reading. This program will calculate for 10 transactions for each time. Payment rate required are as followings.

| Electricity Usage | Charges (RM) |
| --- | --- |
| First 100 Unit | 20.00 |
| Exceed 100 to 300 Unit | 0.22 per unit |
| Greater than 300 Unit | 0.28 per unit |

> START
> <br>&emsp;SET count = 0
> <br>&emsp;WHILE count < 10
> <br>&emsp;&emsp;INPUT meterPrevious
> <br>&emsp;&emsp;INPUT meterCurrent
> <br>&emsp;&emsp;consumption = meterCurrent - meterPrevious
> <br>&emsp;&emsp;IF consumption > 300 THEN
> <br>&emsp;&emsp;&emsp;payment = 20 + 200 × 0.22 + (consumption - 300) × 0.28
> <br>&emsp;&emsp;ELSE IF consumption > 100 THEN
> <br>&emsp;&emsp;&emsp;payment = 20 + (consumption - 200) × 0.22
> <br>&emsp;&emsp;ELSE
> <br>&emsp;&emsp;&emsp;payment = 100
> <br>&emsp;&emsp;ENDIF
> <br>&emsp;&emsp;PRINT payment
> <br>&emsp;&emsp;PRINT = count + 1
> <br>&emsp;ENDWHILE
> <br>STOP

Draw a flowchart with selection structure to display “Weekend” if the input for variable day is “Sun” or “Sat”. Otherwise display “Weekdays”.

> ![1920 - Q4a](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/1920%20-%20Q4a.png?raw=true)

Draw a flowchart to helps user calculates total payment if you buy apples and grapes based on the given cost as below:

* Apple: RM4.00 per kg
* Grapes: RM6.50 per kg.

> ![2021kmns - Q2(2)](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/2021kmns%20-%20Q2(2).png?raw=true)

# **Question 03**

Write a method header for the following functions:

1. Function `howMany()` takes no arguments and returns no values.

    > ```java
    > void howMany()
    > ```

2. Function `radiusCircle()` takes two (2) double arguments but returns nothing.

    > ```java
    > void radiusCircle(double n1, double n2)
    > ```

3. Function `today()` that takes one (1) decimal value and one integer argument and returns a double value.

    > ```java
    > double today(double n1, int n2)
    > ```

4. Function `calculateBonus()` which receive the total year of service and salary and display the salary in function.

    > ```java
    > void calculateBonus(int year, double salary)
    > ```

Based on the program below, what is the possible value of variable `number` in order for the statement “rejected” to be printed?

```java
if (number % 3 == 1)
    System.out.print("rejected");
```

> 4

Suppose `iter`, `sum` and `xNum` are integer variables and the input values are 20, 15, 4, 45 and -1 consecutively. What is the output of the code below:

```java
int iter = 0, sum = 0, xNum;
xNum = y.nextInt();

while (iter < 4){

    sum = sum + xNum;
    xNum = y.nextInt();
    iter = iter + 1;
}

System.out.print(sum);
```

> ```markdown
> 84
> ```

Convert the above `while` loop structure to `for` loop structure.

> ```java
> int sum = 0, xNum;
> xNum = y.nextInt();
> 
> for(int iter = 0, iter < 4, iter++){
> 
>     sum += xNum;
>     xNum = y.nextInt();
> }
> 
> System.out.prin(sum);
> ```

What is the output of the following program?

```java
int max = 4, n = 1;

for (int k = 1; k <= max; k++){

    System.out.println(n);
    n = max + 2;
}

System.out.println(k);
```

> ```markdown
> 1
> 6
> 6
> 6
> 5
> ```

# **Question 04**

Based on the following `Java` code, the purpose of the `Java` code is to calculate the sum of number from 10 to 100 increment by 10. Identify the type of errors and rewrite the correct Java code:

```java
int sum = 0;

while (counter >=100){

    sum = counter;
    counter add 10 to counter;
}

System.out.print("Sum of all number is");
```

> Syntax Error and Runtime Error
> 
> ```java
> int sum = 0, counter = 10;
> 
> while(counter <= 100){ //Fixed Runtime Error: Infinite Loop
> 
>     sum += counter;
>     counter += 10; //Fixed Syntax Error: calculate add 10 to counter.
> }
> 
> System.out.println("Sum of all multiplications of 10 from 10 to 100 is" + sum);
> ```

Write `Java` statement for the following operations:

1. *x* = √((*ab*)³ + (*c + d*)²)

    > ```java
    > x = Math.sqrt(Math.pow((a * b), 3) + Math.pow((c + d), 2));
    > ```

2. print 10(*y* / 7)

    > ```java
    > System.out.print(10 * (y / 7.0));
    > ```

# **Question 05**

Complete the given `Java` statements to produce the following output by using `while` loop.

&emsp;Output : 20,18,16,14,12,10, Awesome!

> ```java
> int n = 20;
> 
> while (n >= 10){
> 
>     System.out.print(n+ ", ");
>     n -= 2;
> }
> 
> System.out.print("Awesome!");
> ```

Write a `Java` segment to read integers and display the sum of positive numbers that can be divided by 5. The program will terminate when user enter any negative number.

> ```java
> int sum = 0;
> 
> System.out.print("Enter an integer");
> integers = sc.nextInt();
> 
> while(integers >= 0){
> 
>     if(integers % 5 == 0){
>         sum += integers;
>     }
> 
>     System.out.print("Enter an integer");
>     integers = sc.nextInt();
> }
> 
> System.out.println("Sum is: " + sum);
> ```

Syarikat Jelita Sdn Bhd is a bus company located in Butterworth. The company requires you to develop a program to calculate the ticket price of the ticket based on destination.

| Code | Destination | Price (RM) |
| :---: | :---: | :---: |
| 1 | Kuala Lumpur | 45.00 |
| 2 | Ipoh | 28.00 |
| 3 | Kota Bharu | 55.50 |

Write a method name `calcPrice()` which receives the destination code and quantity of ticket through its parameters. An additional travel insurance worth 5% of ticket price will be imposed to each passenger. Calculate the ticket price, insurance value and total ticket price. Display the result in this function.

Then, write a main method that asked the user to enter destination code and quantity of the ticket. Send the parameter through the caller named `calcPrice()`. The program continues until user press ‘N’ to stop.

> ```java
> import java.util.Scanner;
> 
> class Q5c{
> 
>     public static void main(String[] args){
> 
>         Scanner sc = new Scanner(System.in);
>         Q5c bus = new Q5c();
>         char input = 'Y';
> 
>         System.out.print("Do you want to start? (Y/N): ");
>         input = sc.next().charAt(0);
> 
>         while(input != 'N'){
> 
>             System.out.print("Enter destination code and ticket quantity separated by white space: ");
>             bus.calcPrice(sc.nextInt(), sc.nextInt());
> 
>             System.out.print("Do you want to continue? (Y/N): ");
>             input = sc.next().charAt(0);
>         }
> 
>         sc.close();
>     }
> 
>     void calcPrice(int code, int count){
> 
>         double price = 0.0;
> 
>         if(code == 1){price = 45.0;}
>         else if(code == 2){price = 28.0;}
>         else if(code == 3){price = 55.5;}
> 
>         System.out.println("Ticket Price is RM" + String.format("%.2f", (price * count)));
>         System.out.println("Insurance is RM" + String.format("%.2f", (price * count * 0.05)));
>         System.out.println("Total Price is RM" + String.format("%.2f", (price * count * 1.05)));
>     }
> }
> ```
