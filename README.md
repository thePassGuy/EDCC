# Style Guide for CS&141 class

## Table of Content

*	Naming Conventions 
*	Comments
*	Classes and Methods 
*	Variables and Constants
* 	Brace Style

## Comments

### class comments 
~~~~
/** 
 * This class represents a single Car used in the CarLot application. 
 * 
 * @author Fred Flintstone 
 * @author Barney Rubble 
 * @version 1.1 5/5/2016 
 * 
 * References: 
 * - http://stackoverflow.com/questions/157944/create-arraylist-from-array 
 * - http://www.mkyong.com/java/how-do-convert-array-to-list-in-java/ 
 **/ 
 ~~~~ 
 
###	method comments
~~~~ 
/** 
 * This method calculates the price of the car given a desired mark-up and 
 * any discount provided. 
 * 
 * @param markup 
 * the percentage of the cost of the car to be added, entered 
 * as a decimal (i.e. 10% = 0.10) 
 * @param discount 
 * the dollar amount to be subtracted from the total 
 * @return the final retail price of the car 
 * @throws IOException 
 **/ 
 
 ~~~~ 
 
## Classes and Methods
*	A class lists all fields, then constructors, then getters and setters, and then any other methods,
in that order.
*	There is always one blank line between methods but no blank line between a method comment
and the method header.
*	All non-final variables must be private. However, instance variables of a private inner class
may be public. Methods and final variables can be either public or private, as appropriate.
*	Methods use 1TBS, where the opening brace is placed on the same line as the method header
and the closing brace is placed on its own line.
~~~~
public double calculatePrice(double markup, double discount) {
 . . .
}
~~~~
*	Parameter names must be explicit (i.e. markup instead of m).

## Variables and Constants

 Do not define all variables at the beginning of a method. They are defined as needed, even
within a loop. This is because the Java compiler is very efficient, and code written with variables
defined close to first use will perform better. Also, it helps keep the scope of variables as small
as possible:
~~~~
double xold = Integer.valueOf(input);
boolean done = false;
while (!done) {
 double xnew = (xold + a / xold) / 2;
 . . .
}
~~~~
*	Do not define two variables on the same line:
~~~~
int dimes = 0, nickels = 0; // BAD
~~~~
Instead, use two separate definitions:
~~~~
int dimes = 0; // GOOD
int nickels = 0;
~~~~
*	If the constant is used by multiple methods, declare it as static final. If no other class will
use it, define the static final variable as private.
*	Do not use magic numbers. (Any number except -1, 0, and 1 is considered magic):
~~~~
public static final int DAYS_PER_YEAR = 365;
~~~~
*	When declaring array variables, group the [] with the type, not the variable.
~~~~
int[] values; // GOOD
int values[]; // BAD
~~~~
*	When using collections, use type parameters and not "raw"types.
~~~~
ArrayList<String> names = new ArrayList<String>(); // GOOD
ArrayList names = new ArrayList(); // BAD
~~~~

## Reference

https://edcc.instructure.com/courses/1324895/files/66400231?module_item_id=17697955
