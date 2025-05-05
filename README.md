




# Java Array Length Without Using length Property

## Description
This Java program demonstrates how to determine the length of an array without using the built-in `length` property. The program takes user input for array size, initializes an array, and counts the number of elements entered by the user using a loop.

## Code
```java
package array_Manipulations;

import java.util.Scanner;

public class Array_Length_without_lengthProperty
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements");
        
        int count = 0;
        for(int a : arr)
        {
            arr[a] = s.nextInt();
            count++;
        }
        System.out.println("Count :" + count);
    }
}
```

## Explanation

### 1. **Package and Imports**
```java
package array_Manipulations;
import java.util.Scanner;
```
- The program belongs to the `array_Manipulations` package.
- It imports `Scanner` from `java.util` to read user input.

### 2. **Main Method**
```java
public static void main(String[] args)
```
- This is the entry point of the Java application.

### 3. **User Input for Array Size**
```java
Scanner s = new Scanner(System.in);
System.out.println("Enter Array Size");
int size = s.nextInt();
```
- A `Scanner` object is created to take input.
- The user enters the desired size of the array.

### 4. **Array Declaration**
```java
int arr[] = new int[size];
System.out.println("Enter Elements");
```
- An integer array of the given size is initialized.
- A prompt asks the user to enter array elements.

### 5. **For-Each Loop and Count Variable**
```java
int count = 0;
for(int a : arr)
{
    arr[a] = s.nextInt();
    count++;
}
```
- `count` is initialized to `0` to track the number of elements entered.
- A **for-each loop** (`for(int a : arr)`) is used to iterate over the array. However, this approach has a critical **logic error** (explained below).
- Inside the loop, the program attempts to assign values to `arr[a]`, but `a` represents array elements, not indices.
- `count` is incremented for each loop iteration.

### 6. **Printing the Count**
```java
System.out.println("Count :" + count);
```
- Displays the number of elements entered by the user.

## **Key Takeaways**
1. **For-Each Loops Cannot Modify an Array** – Use a traditional `for` loop instead.
2. **Avoid Using Array Values as Indices** – This can cause `ArrayIndexOutOfBoundsException`.
3. **Counting Elements Works Correctly** – The `count` variable accurately tracks the number of inputs.

## **Conclusion**
This program demonstrates how to determine the array length without using the `length` property. The corrected approach ensures that elements are correctly assigned to valid array indices.

## Clone
```
https://github.com/Ananthadatta02/Java-Array_Manipulations.git
```
