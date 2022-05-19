# **Question 01**

Identify the correct step for problem solving based on the statement given.

> | Statements | Step in Problem Solving |
> | :--- | :---: |
> | Checks the syntax of your program to make sure the<br>programming language was used correctly or giving<br>you the syntax-error messages. | Testing |
> | Transform the algorithm into a set of instructions that<br>are understood by the computer. | Implementation |
> | A written detailed description of the programming<br>cycle and facts about the program. | Documentation |

Based on the algorithm below, identify input, process and output.

&emsp;&emsp;Begin
<br>&emsp;&emsp;&emsp;Read Ktn
<br>&emsp;&emsp;&emsp;If(Ktn less or equal to 10)
<br>&emsp;&emsp;&emsp;&emsp;Display "I like cartoons"
<br>&emsp;&emsp;&emsp;&emsp;Ktn = Ktn + 5
<br>&emsp;&emsp;&emsp;Endif
<br>&emsp;&emsp;&emsp;If(Ktn less than 15)
<br>&emsp;&emsp;&emsp;&emsp;Display "Upin Ipin"
<br>&emsp;&emsp;&emsp;Else
<br>&emsp;&emsp;&emsp;&emsp;Display "Umar Hanna"
<br>&emsp;&emsp;&emsp;Endif
<br>&emsp;&emsp;End

> **INPUT**
> 
> * `Ktn`
>
> **PROCESS**
>
> * Display "I like cartoons" if `Ktn` less than or equal to 10
> * Increase `Ktn` by 5.
> * Display "Upin Ipin" if `Ktn` less than 15
> * Display "Umar Hanna" if `Ktn` greater or equal to 15
>
> **OUTPUT**
> 
> * "I like cartoons"
> * "Upin Ipin"
> * "Umar Hanna"

Write the problem analysis based on the situation below.

You need to develop a program to accept marks for N students. The program will display the average mark and the number of student who get a mark more than 80.

> **INPUT**
> 
> * `N`
> * `mark`
>
> **PROCESS**
>
> * Calculate `markAvg` based on `N` and `mark`.
> * Determine `moreThan80` based on `mark`.
>
> **OUTPUT**
>
> * `markAvg`
> * `moreThan80`

# **Question 02**

Study the formula below.

&emsp;***V* = (4/3) π *r*³**

Calculate and display volume (*V*) but radius (*r*) must be entered by user. Write a pseudocode based on the given formula.

> START
> <br>&emsp;SET PI = 3.14159265
> <br>&emsp;INPUT r
> <br>&emsp;V = (4/3) × PI × r × r × r
> <br>&emsp;PRINT V
> <br>STOP

Write a pseudocode to solve the following problem.

Econjaya Kok Lanas is doing year end sales promotion. If a customer purchases more than 5 items AND the total purchase price is above RM100.00, the customer will be given 15% discount. If purchasing less than or equal to 5 items, a 5% discount will be given regardless of the total purchase price. Calculate the pay price to be paid by the customer.

> START
> <br>&emsp;SET counter = 0
> <br>&emsp;SET priceTotal = 0
> <br>&emsp;INPUT items
> <br>&emsp;INPUT itemPrice
> <br>&emsp;INPUT itemCount
> <br>&emsp;WHILE counter < itemCount
> <br>&emsp;&emsp;priceTotal = priceTotal + itemPrice
> <br>&emsp;ENDWHILE
> <br>&emsp;IF itemCount > 5 && priceTotal > 100 THEN
> <br>&emsp;&emsp;discount = 15
> <br>&emsp;ELSE
> <br>&emsp;&emsp;discount = 5
> <br>&emsp;ENDIF
> <br>&emsp;pricePay = priceTotal * (1 - (discount / 100))
> <br>&emsp;PRINT pricePay
> <br>STOP

Study the statement below, and then draw a flowchart to solve the problem.

"Let's take N = 50 as a limit, then the program should print all numbers less than 50 which are divisible by 5. For this, divide each number from 0 to N by 5 and check their remainder. If the remainder is 0, simply print that number."

> ![2021kmkt - Q2](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/2021kmkt%20-%20Q2.png?raw=true)

# **Question 03**

Trace the output for the `Java` code below:

```java
double x;
int y = 7, z = 15;

x = 2 % 12;
System.out.println(x + 1);

z = z / y;
System.out.println(z - 1);
```

> ```markdown
> 3.0
> 1
> ```

Given that `a` = 3, `b` = 10, and `c` = 6. Determine the truth value of the following expression.

&emsp;`!(c!=a) || !(a==b) && (3==6)`

> false

Write `Java` assignment statements for the following algebraic equations.

&emsp;*f* = (*e*(*e* + 3) / 2)²

> ```java
> f = Math.pow((e(e + 3) / 2), 2);
> ```

# **Question 04**

Kota Bharu Shopping Complex needs to upgrade their parking payment system. For the first 2 hours the system will charge RM3.00. For the next two hours, the charge is RM2.00 per hour and RM1.00 for the next subsequent hours. Write a program segment to calculate the total parking fees.

> ```java
> hour = sc.nextInt();
> 
> if(hour > 4){
>     totalFee = 2 * 3.0 + 2 * 2.0 + (hour - 4) * 1.0;
> }
> else if(hour > 2){
>     totalFee = 2 * 3.0 + (hour - 2) * 2.0;
> }
> else{
>     totalFee = hour * 3.0;
> }
> 
> System.out.print("Your total parking fee is " + totalFee);
> ```

Rewrite the following program segment using the while loop.

```java
for(int x = 1; x <= 5; x++)
    System.out.print(x % 2);

System.out.print("\n" + x);
```

> ```java
> int x = 1
> 
> while(x <= 5){
> 
>     System.out.print(x % 2);> 
>     x++
> }
> 
> System.out.print("\n" + x);
> ```

Write down the output of the above code.

> ```markdown
> 10101
> 6
> ```

Perpustakaan Ibnu Firnas needs you to create a self service book-borrowing system. The system will accept student id, book id. There is no limitation for the number of books borrowed until user input `N` to stop the process. The ticket printed will show the student id and total number of books borrowed. Complete the `Java` code given.

> ```java
> import java.util.Scanner;
> 
> class BorrowSystem{
> 
>     public static void main(String[] args){
> 
>         Scanner sc = new Scanner(System.in);
>         char input = '';
>         String bookID = "";
>         int ID = 0, bookCount = 0;
> 
>         System.out.print("Enter Student ID: ");
>         ID = sc.nextInt();
> 
>         System.out.print("Need to borrow book (Y/N): ");
>         input = sc.next().charAt(0);
> 
>         while(input != 'N'){
> 
>             System.out.print("Enter Book ID: ");
>             bookID = sc.next();
>             bookCount++;
> 
>             System.out.print("Need to borrow more book (Y/N): ")
>             input = sc.next().charAt(0);
>         }
> 
>         System.out.println("Student ID: ") + ID;
>         System.out.println("Number of books borrowed: " + bookCount);
> 
>         sc.close();
>     }
> }
> ```

Based on the coding below, identify and explain the type of programming error occurred in the Arithmetic Operation program.

```java
import java.util.Scanner;

class Arithmetic Operation{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1 = in.nextInt();
        System.out.println("Enter second number :");
        int num2 = in.nextInt();

        // Perform arithmetic operations.
        int sum = num1 + num2;
        int difference= num1 + num2;
        int product = num1 / num2;
        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + difference);
        System.out.println("Product : " + product);
    }   
}
```

```markdown
Enter first number :
20
Enter second number :
10
Sum : 30
Difference : 30
Product : 2
```

> Logic error. The result for `difference` and `product` is wrong because the arithmetic operator to find `difference` and `product` used is wrong. It should be `-` for difference instead of `+` and `*` for product instead of `/`.

# **Question 5**

Suppose an array of character type with the name `college` is registered as follows
along with its contents.

```java
char[] college = {'m','a','t','r','i','k','u','l','a','s','i','k','e','l','a','n','t','a','n'};
```

Write a repetition code segment to calculate the frequency of the ‘a’ character in the college array list.

> ```java
> int freqA = 0;
> 
> for(int i = 0; i < college.length; i++){
> 
>     if(college[i] == 'a'){
> 
>         freqA++;
>     }
> }
> ```

A main method program inputs to the following variables:

&emsp;`num1`: 24, `num2`: 4, `num3`: 21

Write a `Java` method bane `FindMin` that returns the minimum value. The method receives integers value from the main method and finds the minimum value.

> ```java
> int FindMin(int n1, int n2, int n3){
> 
>     return (n1 < n2 && n1 < n3) ? n1 : (n2 < n1 && n2 < n3) ? n2 : n3;
> }
> ```

# **Question 6**

You are working for an online retail store that sells clothing. Your manager asks you to develop
the java program using an array with program name Sales.java so that it records and prints all clothes’ sales for 7 different brands. Finally, the program will also display the total sales, average, lowest and highest monthly sales volume along with the clothes brands.

> ```java
> import java.util.Scanner;
> 
> class Sales{
> 
>     public static void main(String[] args){
> 
>         Scanner sc = new Scanner(System.in);
>         String clothesBrand[] = new String[7], brandLowest = "", brandHighest = "";
>         double clothesSales[] = new double[7], salesLowest = 99999.0, salesHighest = 0.0, salesTotal = 0.0, salesAvg = 0.0;
> 
>         for(int i = 0; i < 7; i++){
> 
>             System.out.print("Enter brand name #" + (i + 1) + ": ");
>             clothesBrand[i] = sc.next();
>             System.out.print("Enter sales volume for " + clothesBrand[i] + ": ");
>             clothesSales[i] = sc.nextDouble();
> 
>             if(clothesSales[i] > salesHighest){
>                 salesHighest = clothesSales[i];
>                 brandHighest = clothesBrand[i];
>             }
> 
>             if(clothesSales[i] < salesLowest){
>                 salesLowest = clothesSales[i];
>                 brandLowest = clothesBrand[i];
>             }
>             
>             salesTotal += clothesSales[i];
>         }
> 
>         for(int j = 0; j < 7; j++){
>             
>             System.out.println(clothesBrand[j] + " has sales of RM" + String.format("%.2f", clothesSales[j]));
>         }
> 
>         System.out.println("Total Sales is RM" + String.format("%.2f", salesTotal));
>         System.out.println("Average Sales is RM" + String.format("%.2f", (salesTotal / 7)));
>         System.out.println("Highest Sales is RM" + String.format("%.2f", salesHighest) + " from " + brandHighest);
>         System.out.println("Lowest Sales is RM" + String.format("%.2f", salesLowest) + " from " + brandLowest);
>
>         sc.close();
>     }
> }
> ```
