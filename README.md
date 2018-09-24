# Java Problem Set 0

## Setting up & orientation

Fork [Java Problem Set 0](https://repl.it/@kellylougheed/Java-Problem-Set-0) from repl.it.

**Main.java** will serve as the **runner** for your problem set. After you code your programs in separate files, you can press "run," and Main will execute each one of your programs in a row. The code in Main might look confusing right now, but you don't need to interact with it yet (and we will learn all about it in Unit 2)!

Complete each problem in the appropriately named file (e.g. complete "Problem 0-0: Hello World" in HelloWorld.java).

At the top of each file, there is a place for you to comment on the description of the program, your name, and the date. Please also add comments throughout your program about what your code is doing if it is not self-explanatory.

```
/*
 * Multi-line Java comment
 */
 ```

```
// Single-line Java comment
```

## Problems

### 0-0: Hello World

Write a program that outputs “Hello, world!” to the screen.

### 0-1: Haiku

Write a haiku about computer science or Java. Then write a program that outputs your haiku in three separate lines to the screen.

### 0-2: ASCII Art

Create or [find some ASCII art](https://www.asciiart.eu/). Write a program that prints the ASCII art to the screen.

### 0-3: Travel Agent

Write a program that acts as a travel agent. It should:
- ask you where you would like to travel to, and give you three different countries as options (e.g. Italy)
- depending on what country you select, give you three different options of activities in that country (e.g. tour of the Colosseum in Rome)
- total up your airfare to that country and the cost of that activity and print the total

Sample program output:
```
Where would you like to travel?
a) Italy
b) France
c) Morocco
a
What would you like to do?
a) Tour of the Colosseum in Rome
b) Tour of Pompeii in Naples
c) Tour of the Vatican in Rome
a
Your tour of the Colosseum in Rome and plane trip to Italy will cost $780 total.
```

Feel free to briefly research plane trip prices and activities in each country, but also feel free to make them up!

**Challenge**: Allow the user to select multiple activities to do in a country. Hint: you may need to look into [while loops](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html). (+2 pts)

### 0-4: Calculator

Write a program where the user can select a mathematical operation and input two integer. The program should then print the correct answer.

Sample program output:
```
Please select an operation:
a) addition
b) subtraction
c) multiplication
d) division
a
First integer:
2
Second integer:
3
2 + 2 is 5
```

**Challenge**: Have your program calculate and print the remainder for division. (+1 pt)

**Challenge**: Have your program take in floats instead of integers so that it can more accurately perform division. (+1 pt)

### 0-5: Personality Quiz

Write a personality quiz where you ask the user questions about themselves. Based on the number of “a” answers, “b” answers, “c” answers, or “d” answers (etc), the user gets a different result.

Here is an [example written in Python](https://repl.it/@kellylougheed/Sorting-Hat).

### 0-6: ROT13

[ROT13](https://en.wikipedia.org/wiki/ROT13) is a cipher that encrypts text by shifting all the letters 13 letters forward on the alphabet. Write a program that takes in plaintext and returns text encrypted in ROT13.

If you remember the Caesar Cipher problem from CS50, this problem is similar!

### 0-7: For Loop Factorial

Write a program that takes in an integer and prints its [factorial](https://en.wikipedia.org/wiki/Factorial) after calculating the factorial with a [for loop](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html).

### 0-8: Guess the Number

Write a program where the user thinks of a number between 1 and 10 and the computer tries to guess it. The user can type “y” or “n” to tell the computer if it is correct or not.

Sample program output:
```
Think of a number between 1 and 10.
Is the number 3? (y/n)
n
Is the number 7? (y/n)
y
```

There are several ways to solve this problem. The most straightforward way is to have the program guess the numbers 1 to 10 in order (totally acceptable); you could also have the computer guess [randomly](https://www.leepoint.net/algorithms/random/random-api.html) (more challenging).

**Challenge**: Use [binary search](https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search) to make your program’s guessing more efficient. Instead of offering “yes” or “no” as user responses, you will need to offer “higher,” “lower,” or “correct.” (+3 pts)

**Challenge**: Learn about [ArrayLists](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html) and use one to keep track of numbers that the computer has guessed so far so that it doesn't repeat any guesses (assuming you are not using binary search). (+3 pts)

Note: Although students can earn extra points for challenges, grades are capped at 100%.
