# What is Anonymous array in Java?
Anonymous array are those array in java with out any name.
         Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.

An array in Java without any name is anonymous array. It is an array just for creating and using instantly.
1.We can create an array without name, such type of nameless arrays are called anonymous array.
2.The main purpose of anonymous array is just for instant use (just for one time usage) .

## Syntax:
// anonymous int array new int[] { 1, 2, 3, 4}; // anonymous char array new char[] {'x', 'y', 'z'); // anonymous String array new String[] {"Geeks", "for", "Geeks"}; // anonymous multidimensional array new int[][] { {10, 20}, {30, 40, 50} };

## Example:
// Java program to illustrate the  
// concept of anonymous array 
```java script
class Test { 
    public static void main(String[] args) 
    { 
          // anonymous array 
          sum(new int[]{ 1, 2, 3 }); 
    } 
    public static void sum(int[] a) 
    { 
        int total = 0; 
  
        // using for-each loop 
        for (int i : a)  
            total = total + i; 
          
        System.out.println("The sum is:" + total); 
    } 
} 
 
```
### Output
The sum is 6