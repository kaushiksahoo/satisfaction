# Satisfaction

## Statement
Gordon Ramsey, a very smart guy, like seating food. Now, Gordon is at a restaurant and he has many different types of food to choose from. Gordon gets x amount of satisfaction and requires y amount of time to eat an item from the menu. Given t minutes, write a java program that reads the text file and ﬁnds out the maximum satisfaction that Gordon can get from eating at the restaurant. You will be given a text file with the following format:

```
[t][Number of items on menu]
[amount of satisfaction from eating dish 1][time taken for dish 1]
[amount of satisfaction from dish 2][time taken for dish 2]
```

## Solution
I've followed 0-1 knapsack algorithm with dynamic programming to solve the problem. It tries to get max satisfaction for each item combination for time [0 - t].

*Knapsack algorithm credits:* http://www.geeksforgeeks.org/knapsack-problem/
