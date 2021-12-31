<h4>Sliding Window Maximum</h4>
<hr/>
<b>Problem Description</b>

Given an array of integers A. There is a sliding window of size B which is moving from the very left of the array to the very right. You can only see the B numbers in the window. Each time the sliding window moves rightwards by one position. You have to find the maximum for each window.

Return an array C, where C[i] is the maximum value in the array from A[i] to A[i+B-1].

Refer to the given example for clarity.

NOTE: If B > length of the array, return 1 element with the max of the array.

<hr/>

<b>Problem Constraints</b>

1 <= |A|, B <= 106

<hr/>

<b>Input Format</b>

The first argument given is the integer array A.

The second argument given is the integer B.

<hr/>

<b>Output Format</b>

Return an array C, where C[i] is the maximum value of from A[i] to A[i+B-1].

<hr/>

<b>Example Input</b>

Input 1:

A = [1, 3, -1, -3, 5, 3, 6, 7]
B = 3

Input 2:

A = [1, 2, 3, 4, 2, 7, 1, 3, 6]
B = 6

<hr/>

<b>Example Output</b>

Output 1:

[3, 3, 5, 5, 6, 7]

Output 2:

[7, 7, 7, 7]
<hr/>

<b>Example Explanation</b>

Explanation 1:

Window position     | Max
 --------------------|-------
[1 3 -1] -3 5 3 6 7 | 3
1 [3 -1 -3] 5 3 6 7 | 3
1 3 [-1 -3 5] 3 6 7 | 5
1 3 -1 [-3 5 3] 6 7 | 5
1 3 -1 -3 [5 3 6] 7 | 6
1 3 -1 -3 5 [3 6 7] | 7
Explanation 2:

Window position     | Max
 --------------------|-------
[1 2 3 4 2 7] 1 3 6 | 7
1 [2 3 4 2 7 1] 3 6 | 7
1 2 [3 4 2 7 1 3] 6 | 7
1 2 3 [4 2 7 1 3 6] | 7