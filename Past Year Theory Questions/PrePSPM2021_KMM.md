# **Question 01**

Table below shows the rate that is used to calculate the delivery cost based on the area code and distance.

<table>
    <thead>
        <th style="text-align: center">&emsp;Area code&emsp;</th>
        <th style="text-align: center">Distance</th>
        <th style="text-align: center">Delivery cost per<br>kilometer (RM)</th>
    </thead>
    <tbody>
        <tr>
            <td rowspan = 2>1</td>
            <td>&emsp;Under 5 kilometers&emsp;</td>
            <td>1.60</td>
        </tr>
        <tr>
            <td>&emsp;5 kilometers or more&emsp;</td>
            <td>2.50</td>
        </tr>
        <tr>
            <td rowspan = 2>2</td>
            <td>&emsp;Under 5 kilometers&emsp;</td>
            <td>3.70</td>
        </tr>
        <tr>
            <td>&emsp;5 kilometers or more&emsp;</td>
            <td>4.90</td>
        </tr>
    </tbody>
</table>

If the input for the area code is other than the above, the message "Wrong area code" will be displayed. Identify the Input, Process, Output for this problem.

> **INPUT**
> 
> * `areaCode`
> * `distance`
> 
> **PROCESS**
> 
> * Determine and calculate `deliveryCost` based on `areaCode` and `distance`.
> 
> **OUTPUT**
> 
> * `deliveryCost`

The Dapur Kampung Café prints a receipt for its customers as shown below. The unit price for each item is fixed and stored by the system. The date and time are automatically generated from the system.

![receipt PrePSPM2021_KMM Q1](https://media.discordapp.net/attachments/975199225036034088/975199236348067850/unknown.png)

State one (1) input required by the system.

> quantity

State one (1) output produced by the system.

> total

State one (1) process involved to produce the above output.

> Calculate total based on quantity and unit price.

Identify the steps in problems solving which involve the situations below.

> | Situation | Problem Solving Step |
> | --- | :---: |
> | Test the system and record all the problem found | Testing |
> | The design of pseudocode and flowchart | Design a Solution |
> | Ahmad is analyzing the process of a system that his team needs to develop. | Problem Analysis |

# **Question 02**

The following procedure describe how a bookstore calculates the price of an order from the total book price and the number of book that were ordered. Draw the flowchart for the procedure.

<div style = "border: 1px solid white; padding: 10px; border-radius: 10px">
    First enter the total book price and the number of books. Then calculate the tax (7.5% of the total book price) and calculate the shipping charge (RM 2 per book). Next, the price of the order is the sum of the total book price, the tax and the shipping charge. Print the price of the order.
</div>
<br>

> ![2021kmm - Q2](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/2021kmm%20-%20Q2(1).png?raw=true)

Allowance for part time lecturers are based on total lecture hours.

* First 12 hours = RM100 per hour
* Every subsequent hour = RM50 per hour

Prepare a flowchart to print the total allowance of a lecturer.

> ![2021kmm - Q2(2)](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/2021kmm%20-%20Q2(2).png?raw=true)

Write the pseudocode for a program that finds sum of squares of the first 30 integers: 1² + 2² + 3² + ... by using `while` loop. Then, display the average.

> Start
> <br>&emsp;Set i = 1
> <br>&emsp;Set sum = 0
> <br>&emsp;While(i <= 30)
> <br>&emsp;&emsp;sum = sum + (i * i)
> <br>&emsp;&emsp;count = count + 1
> <br>&emsp;Endwhile
> <br>&emsp;Print sum
> <br>&emsp;average = sum / 30
> <br>&emsp;Print average
> <br>Stop

# **Question 03**

Write a complete `Java` program to display the conversion result of 37.8 degree Celsius to Fahrenheit using the formula:

&emsp;Fahrenheit = degree in Celsius × 9/5 + 32

> ```java
> class CelsiusToFahrenheit{
> 
>     public static void main(String[] args){
> 
>         double celcius = 37.8;
> 
>         double toFahrenheit = celcius * 1.8 + 32;
> 
>         System.out.println("The conversion result of 37.8 degree Celsius is " + toFahrenheit)
>     }
> }
> ```

Explain types of error as stated below.

1. Logic Error

    This error occurs when the program does not operate in the way it is intended to.

2. Syntax Error

    This error occurs when the code does not follow the syntax rule of the programming language, that is detected by the compiler.

3. Run-time Error

    This error occurs when the program is running. It causes the program to terminate abnormally. The typical run-time error is due to input mistakes.

# **Question 04**

Create a flowchart for a program to calculate delivery cost in Ringgit Malaysia (RM) for a parcel based on the weight, as given in the following table.

| Weight (kg) | Rate per kg (RM) |
| :---: | :---: |
| Under 1kg | 15.00 |
| 1kg - 3kg | 13.00 |
| Over 3kg | 10.00 |

> ![2021kmm - Q2(3)](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/2021kmm%20-%20Q2(3).png?raw=true)

Write `for` statement to rewrite the following `Java` segment.

```java
int n = 20;

while (n >= 1){

    if(n % 5 == 0)
        System.out.println(n);
    
    n = n - 1;
}
```

> ```java
> for(int n = 20; n >= 1; n--){
> 
>     if(n % 5 == 0){
>         System.out.println(n);
>     }
> }
> ```

Produce output for the `Java` segment above.

> ```markdown
> 20
> 15
> 10
> 5
> ```

# **Question 05**

What will be the output for the folllowing program?

```java
int x = 12, y = x - 6;

if (y >= 6)
    System.out.print(“\nThank you “);
else
    System.out.println (“\tHave a nice day “);

System.out.println(“\tTill meet again”);
```

> ```markdown
> 
> Thank you     Till meet again
> ```

Write a `Java` public method name `divisibleBy3()` that returns `true` or `false`. The method receives an `int` named `number` and evaluate whether the number is divisible by 3 or not.

```java
boolean divisibleBy3(int x){

    return (x % 3) == 0;
}
```

# **Question 06**

Write a `Java` program using one-dimensional array to solve the following problem:

Bidara Teguh company pays its 30 salesperson on a commission basis. The salesperson receives RM200 per week plus 9% commission of their gross sales for that week. For example, a salesperson who grosses RM5000 in sales in a week receives RM200 plus 9% of RM5000 or a total of 650.
Write a `Java` program (using an array of counters) that determines how many of the salespeople earned salaries in each of the following ranges (assume that each salesperson’s salary is shorten to an integer amount)

* RM700-799
* RM800-899
* RM900-999
* RM1000-over

Find also the highest and lowest salary earned by Bidara Teguh saleperson.

> ```java
> import java.util.Scanner;
> 
> class Q6{
> 
>     public static void main(String[] args){
> 
>         Scanner sc = new Scanner(System.in);
>         double salary[] = new double[30], salaryHighest = 0.0, salaryLowest = 99999.0;
>         int count700 = 0, count800 = 0, count900 = 0, count1000 = 0;
> 
>         for(int i = 0; i < 30; i++){
> 
>             System.out.print("Enter gross sales for salesperson #" + (i + 1) + ": ");
>             salary[i] = sc.nextInt() * 0.09 + 200;
> 
>             if(salary[i] > 1000){count1000++;}
>             else if(salary[i] > 900){count900++;}
>             else if(salary[i] > 800){count800++;}
>             else if(salary[i] > 700){count700++;}
> 
>             if(salary[i] > salaryHighest){salaryHighest = salary[i];}
>             
>             if(salary[i] < salaryLowest){salaryLowest = salary[i];}
>         }
>         
>         System.out.println("There are " + count700 + " salesman that have salaries between RM700 to RM799");
>         System.out.println("There are " + count800 + " salesman that have salaries between RM800 to RM899");
>         System.out.println("There are " + count900 + " salesman that have salaries between RM900 to RM999");
>         System.out.println("There are " + count1000 + " salesman that have salaries over RM1000");
> 
>         System.out.println("The highest salary earned is RM" + String.format("%.2f", salaryHighest));
>         System.out.println("The lowest salary earned is RM" + String.format("%.2f", salaryLowest));
> 
>         sc.close();
>     }
> }
> ```