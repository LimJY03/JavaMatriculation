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

Write a Java program **segment** that will determine suitable type of car seat and its final price to a customer [Assume one customer has one child only]. Price of Rear- Facing car seat is RM454 with a 10% discount, price of Forward-Facing car seat is double the price of Booster seat. Booster seat is sold at RM178. (Assume all variables are already declared)

