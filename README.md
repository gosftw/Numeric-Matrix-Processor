# Numeric-Matrix-Processor
Numeric Matrix Processor project from hyperskill.org

## Implementation
Main clases are on src file

## Stage #1: Addition

### Description

Matrices can be presented in a code like 2D-arrays. They have many cases where they can be applied: 
digital image processing, graph representation, and algorithms on a graph, drawing graphics, 
graphics effects, applied maths, statistics, physics and much more.

As you can see, it contains N rows and M columns.

Let’s start with adding matrices.

Two matrices must have an equal number of rows and columns to be added. The sum of two matrices A and B
will be a matrix which has the same number of rows and columns as do A and B. 

The sum of A and B, denoted A+B or B+A, is computed by adding corresponding elements of A: Ai×j+Bi×j. 
Notice that the first element in the index i×j represents a number of rows, the second represents 
a number of columns. The general formula for adding two matrices are shown below:

You should output the result of a sum of A and B matrices or ERROR message if it’s impossible.

## Stage #2: Multiplication on a constant

### Description

In this stage, you should write a program that multiplies a matrix to a constant. 
To do this you need just enough to multiply every element of this matrix on this constant. 

The first line of standard input is numbers N and M. Next N lines are elements of a matrix. 
The last line contains a constant.

You should output a result of the multiplication of the given matrix to the given constant.

## Stage #3: Matrix multiplication

### Description

Next stage - multiplication of matrices. 
This operation is more complex than you might think because it’s not enough to multiply 
corresponding elements to get true multiplication of matrices. Multiplication of An×m 
matrix with N rows and M columns and Bm×k matrix with M rows and K columns is Cn×k=An×m∗Bm×k 
matrix with N rows and K columns where every element is a sum of multiplication M elements 
across rows of A matrix on M elements down columns of B matrix. 
Notice how sizes of matrices are different - the only restriction is that the number of 
columns for the first matrix should be equal to the number of rows for the second matrix.

Write a program that output multiplication of A and B matrices. 
Also, you should write the main menu where you can apply different operations on matrices. 
Also, you should support floating-point numbers.

### Output example

Below is an example of how your output might look.

1. Add matrices
2. Multiply matrix to a constant
3. Multiply matrices
0. Exit
Your choice: 3
Enter size of first matrix: 3 3
Enter first matrix:
1 7 7
6 6 4
4 2 1
Enter size of second matrix: 3 3
3 2 4
5 5 9
8 0 10
The multiplication result is:
94 37 137
80 42 118
30 18 44

1. Add matrices
2. Multiply matrix to a constant
3. Multiply matrices
0. Exit
Your choice: 0



## Stage #4: Matrix transposition

### Description

In this stage, you should implement a matrix transposition.
Matrix transposition is an operation in linear algebra that exchange matrix rows on matrix 
columns and returns a new matrix in result. This is an operation just with a single matrix.

There are 4 types of matrix transposition :

transposition relatively main diagonal

transposition relatively side diagonal

transposition by vertical line

transposition by horizontal line

So, in this stage, you should write a program that can transpose matrices.

### Output example

Below is an example of how your output might look.

1. Add matrices
2. Multiply matrix to a constant
3. Multiply matrices
4. Transpose matrix
0. Exit
Your choice: 4

1. Main diagonal
2. Side diagonal
3. Vertical line
4. Horizontal line
Your chouce: 1
Enter matrix size: 3 3
Enter matrix:
1 7 7
6 6 4
4 2 1
The result is:
1 6 4
7 6 2
7 4 1

1. Add matrices
2. Multiply matrix to a constant
3. Multiply matrices
4. Transpose matrix
0. Exit
Your choice: 0

## Stage #5: Determinant

### Description

In this stage you should write a program that calculates a determinant of a matrix.
You can watch the first 6 videos about linear algebra from this playlist to understand 
the essence of the determinant and why it so important. To understand how to actually 
calculate the determinant of any square matrix, you can watch this video and this videos.

A determinant is a single number that can be computed from elements of a square matrix. 
There is a classical way to find the determinant of a matrix with order < 3.

A determinant of a 2-order matrix is equal to the difference between multiplication 
elements on the main diagonal and elements on the side diagonal.

We often need to find the determinant of a matrix of more than order 2.
In this case we have to use expansion by rows or columns where the determinant is equal
to a sum of a single row or a single column multiplied by the cofactors of the elements in
the corresponding row or column. To do this, you should use a recursive method.

### Output example

Below is an example of how your output might look.

1. Add matrices
2. Multiply matrix to a constant
3. Multiply matrices
4. Transpose matrix
5. Calculate a determinant
0. Exit
Your choice: 5
Enter matrix size: 3 3
Enter matrix:
1 7 7
6 6 4
4 2 1
The result is:
-16

1. Add matrices
2. Multiply matrix to a constant
3. Multiply matrices
4. Transpose matrix
5. Calculate a determinant
0. Exit
Your choice: 5
Enter matrix size: 5 5
Enter matrix:
1 2 3 4 5
4 5 6 4 3
0 0 0 1 5
1 3 9 8 7
5 8 4 7 11
The determinant is:
191

1. Add matrices
2. Multiply matrix to a constant
3. Multiply matrices
4. Transpose matrix
5. Calculate a determinant
0. Exit
Your choice: 0

## Stage #6: Inverse matrix

### Description

In this stage, you should find an inverse of a matrix. You need to use the knowledge you’ve got in the previous stages.
Inverse matrix Ai is the matrix, the product of which to original matrix A is equal to the identity matrix.
To get the idea about inverse matrices you can watch this video.

The identity matrix is the matrix in which all elements of the main diagonal are ones and other are zeros.
       
Ai= (1 / det(A)) * C'

As you can see it contains a lot of operations you implemented in the previous stages.
It is: finding cofactors of all the elements of the matrix, transposition of the matrix,
finding the determinant of a matrix, multiplication of a matrix by a constant.

Also, you can implement a method that can print a matrix in a readable way - every column would be correctly aligned.
And you can round the results by two or more digits.

### Output example

Below is an example of how your output might look.

1. Add matrices
2. Multiply matrix to a constant
3. Multiply matrices
4. Transpose matrix
5. Calculate a determinant
6. Inverse matrix
0. Exit
Your choice: 6
Enter matrix size: 3 3
Enter matrix:
2 -1 0
0 1 2
1 1 0
The result is:
 0.33   0  0.33
-0.33   0  0.66
 0.16 0.5 -0.33

1. Add matrices
2. Multiply matrix to a constant
3. Multiply matrices
4. Transpose matrix
5. Calculate a determinant
6. Inverse matrix
0. Exit
Your choice: 0
