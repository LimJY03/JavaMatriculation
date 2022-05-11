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

> Start
> <br>&emsp;Read r
> <br>&emsp;Set PI = 3.141592653
> <br>&emsp;V = (4/3) * PI * r * r * r
> <br>&emsp;Print V
> <br>Stop

Write a pseudocode to solve the following problem.

Econjaya Kok Lanas is doing year end sales promotion. If a customer purchases more than 5 items AND the total purchase price is above RM100.00, the customer will be given 15% discount. If purchasing less than or equal to 5 items, a 5% discount will be given regardless of the total purchase price. Calculate the pay price to be paid by the customer.

> Start
> <br>&emsp;Set counter = 0
> <br>&emsp;Set priceTotal = 0
> <br>&emsp;Read items
> <br>&emsp;Read itemPrice
> <br>&emsp;Determine itemCount
> <br>&emsp;While(counter < itemCount)
> <br>&emsp;&emsp;priceTotal = priceTotal + itemPrice
> <br>&emsp;Endwhile
> <br>&emsp;If(itemCount > 5 && priceTotal > 100)
> <br>&emsp;&emsp;discount = 15
> <br>&emsp;Else
> <br>&emsp;&emsp;discount = 5
> <br>&emsp;Endif
> <br>&emsp;pricePay = priceTotal * (1 - (discount / 100))
> <br>&emsp;Print pricePay
> <br>Stop

Study the statement below, and then draw a flowchart to solve the problem.

"Let's take N = 50 as a limit, then the program should print all numbers less than 50 which are divisible by 5. For this, divide each number from 0 to N by 5 and check their remainder. If the remainder is 0, simply print that number."

