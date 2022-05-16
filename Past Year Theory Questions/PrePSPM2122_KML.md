# **Question 01**

State an appropriate step and activities of problem solving in computer programming.

> | Activity | Step in Problem Solving |
> | --- | :---: |
> | To make sure the program is free from syntax error, logical error and run-time error. | Testing |
> | Analyse the problem by breaking down it into smaller parts such as identify input,<br>process and output | Problem Analysis |
> | Transform the algorithm into a set of instructions that are understood by the computer. | Implementation |

The use of appropriate control structures are very important when implement the program code. Identify the most suitable control structures to solve the following problems.

> | Problem | Control Structure |
> | --- | :---: |
> | Calculate a book price based on category. | Selection |
> | Calculate Raya bonus for each of JJ Naza’s kitchen employees. | Repetition |

A shape program read radius and apply formulae to computer and display the area and circumference of the circle. Identify the input, process and output for the given problem.

> **INPUT**
> 
> * `radius`
> 
> **PROCESS**
> 
> * Calculate `area` and `circumference` based on `radius`.
> 
> **OUTPUT**
> 
> * `area`
> * `circumference`

Determine the input, process and output of the `Java` segment below.

```java
int a = sc.nextInt();
int b = a * 4;

if (b >= 8)
    System.out.println("\tWelcome to beautiful Labuan island");
else
    System.out.print("\t\tHave a nice day");
```

> **INPUT**
> 
> * `a`
> 
> **PROCESS**
> 
> * Print message based on `a`.
> 
> **OUTPUT**
> 
> * Message "Welcome to beautiful Labuan island" or "Have a nice day"


# **Question 02**

The following formula is calculate distance between two coordinates, (*x1*,*y1*) and (*x2*,*y2*).

&emsp;distance = √((*x*2 - *x*1)² + (*y*2 - *y*1)²)

Write a pseudocode to find the distance using two coordinates.

> Start
> <br>&emsp;Read x1, y1, x2, y2
> <br>&emsp;distance = sqrt((x2-x1)\*(x2-x1) + (y2-y1)\*(y2-y1))
> <br>&emsp;Print distance
> <br>Stop

Write pseudocode to determine whether number is even or odd for 14 different positive numbers.

> Start
> <br>&emsp;Set counter = 0
> <br>&emsp;While(counter < 14)
> <br>&emsp;&emsp;Read number
> <br>&emsp;&emsp;If(number % 2 == 0)
> <br>&emsp;&emsp;&emsp;Print "even number"
> <br>&emsp;&emsp;Else
> <br>&emsp;&emsp;&emsp;Print "odd number"
> <br>&emsp;&emsp;Endif
> <br>&emsp;Endwhile
> <br>Stop

Draw flowchart based on `Java` segment given.

```java
for (n = 20; n >= 1; n = n - 1){
    if (n % 4 == 0)
        System.out.println(n);
}
```

> ![2122kml - Q2](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/2122kml%20-%20Q2.png?raw=true)

# **Question 03**

What is the output if `num` variable is 5?

```java
int num;
num = get.nextInt();

if(num <= 5)
    System.out.print("Hi, today is PRE-PSPM.");

if(num < 10)
    System.out.println("Good luck for me.");
else
    System.out.print("but today I’m back to hometown");

System.out.print("\nKML tatap dihati.");
```

> ```markdown
> Hi, today is PRE-PSPM. Good luck for me.
> 
> KML tetap dihati.
> ```

What is the output of the following code fragment, assuming `num` is 10?

```java
num = num * 2;

if(num == 20)
    System.out.print("Wilayah Persekutuan\t");

System.out.print("Labuan\t");
```

> ```markdown
> Wilayah Persekutuan   Labuan
> ```

After execution of the following code, what will be the value of `m` and `n`?

```java
int n = 678;
int m = 0;

while(n != 0){

    m = (10 * m) + (n % 10);
    n = n / 10;
}
```

> `m` is 876
> <br>`n` is 0

Given *n* = 9, *m* = 16, *a* = 2, *c* = 7. Evaluate the following statement.

1. *m* / *n* + *n* % *m*

    > 10

2. *m* + (*n* * *n* – *a* * *m*) / 2 * *a*

    > 64

Write `Java` assignment statement for the following algebraic expression.

1. distance = √((*x*2 - **x*1)² + (*y*2 - *y*1)²)

    > ```java
    > double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    > ```

2. Print *𝜋𝑟*²

    > ```java
    > System.out.println(3.1412592653 * r * r);
    > ```

An internet service provider has three different subscription packages for its customer:

* Package A : RM19.95 per month for 10 hours of access are provided. Additional hours are RM2.00 an hour.
* Package B : RM35.95 per month for 20 hours of access are provided. Additional hours are RM1.00 an hour.
* Package C : RM69.95 per month unlimited access are provided.

Write a program segment to display the total payment.

> ```java
> hours = sc.nextInt();
> packageType = sc.next().charAt(0);
> 
> if(packageType == 'A'){
> 
>     if(hours > 10){
>         totalPayment = 10 * 19.95 + (hours - 10) * 2.0;
>     }
>     else{
>         totalPayment = hours * 19.95;
>     }
> }
> else if(packageType == 'B'){
> 
>     if(hours > 20){
>         totalPayment = 20 * 35.95 + (hours - 20) * 1.0;
>     }
>     else{
>         totalPayment = hours * 35.95;
>     }
> }
> else if(packageType == 'C'){
> 
>     totalPayment = 69.95;
> }
> 
> System.out.println("Total payment is RM" + String.format("%.2f", totalPayment));
> ```

Complete the given `Java` to call method `highestNumber` in `main` method.

> ```java
> public class KMLSC025{
> 
>     public static void main(String[] args){
> 
>         KMLSC025 met = new KMLSC025();
>         int x = 3, y = 6;
> 
>         met.highestNumber(x, y);
>     }
> 
>     void highestNumber(int n1, int n2){
> 
>         if(n1 > n2){
>             System.out.println("x is the highest number");
>         }
>         else{
>             System.out.println("y is the highest number");
>         }
>     }
> }
> ```

# **Question 04**

Write `Java` program segment that will display the area of triangle. The side length input by user.

> ```java
> double base = sc.nextDouble();
> double height = sc.nextDouble();
> 
> System.out.println("The area of triangle is " + 0.5 * base * height);
> ```

Modify the program above to allow the user to display area of triangles repeatedly and program will terminate when the user enter code ‘N’. 

> ```java
> double base = 0.0, height = 0.0;
> char code = sc.next().charAt(0);
> 
> while(code != 'N'){
> 
>     base = sc.nextDouble();
>     height = sc.nextDouble();
> 
>     System.out.println("The area of triangle is " + 0.5 * base * height);
> 
>     code = sc.next().charAt(0);
> }
> ```

Write a program segment that uses non-static method named `convertFah` that returns Celsius. The method receives double named `Fahrenheit`. Converts a temperature from Fahrenheit to Celsius (5/9 (F-32)) where F is the Fahrenheit temperature. Given the class name `convertTemp`.

> ```java
> public static void main(String[] args){
> 
>     convertTemp temperature = new convertTemp();
>     System.out.println("The converted temperature is " + temperature.convertFah(sc.nextDouble()));
> }
> 
> double convertFah(double fah){
> 
>     return 5.0 / 9.0 * (fah - 32);
> }
> ```

You are required to develop `Java` program. The program should be able to:

1. Calculate and display the average temperature for a week.
2. Determine the maximum and minimum temperature.
3. Calculate and display total number of temperatures that are less than average.

The elements of array `temp` are {37.9, 37.8, 39.2, 40.1, 36.9, 37.2, 38.3}.

> ```java
> class Q4{
> 
>     public static void main(String[] args){
> 
>         double temp[] = {37.9, 37.8, 39.2, 40.1, 36.9, 37.2, 38.3}, tempMax = 0.0, tempMin = 99.0, tempSum = 0.0, tempAvg = 0.0;
>         int belowAvg = 0;
> 
>         for(int i = 0; i < temp.length; i++){
> 
>             if(temp[i] > tempMax){tempMax = temp[i];}
>             if(temp[i] < tempMin){tempMin = temp[i];}
> 
>             tempSum += temp[i];
>         }
> 
>         tempAvg = tempSum / temp.length;
> 
>         for(int j = 0; j < temp.length; j++){
> 
>             if(temp[j] < tempAvg){belowAvg++;}
>         }
> 
>         System.out.println("The average temperature is " + tempAvg);
>         System.out.println("The maximum temperature is " + tempMax);
>         System.out.println("The minimum temperature is " + tempMin);
>         System.out.println("There are " + belowAvg + " temperatures that are below average.");
>     }
> }
> ```