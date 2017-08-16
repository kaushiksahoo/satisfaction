/*
 * Credits: http://www.geeksforgeeks.org/knapsack-problem/
 */
package com.example.satisfaction;

import org.springframework.stereotype.Component;

/**
 * 0-1 Knapsack problem solver
 */
@Component
public class Knapsack {

	/**
	 * Finds max possible satisfaction in the given time limit.
	 * @param t time limit
	 * @param n number of items in menu
	 * @param items array of items.
	 * @return max possible satisfaction in the given time limit.
	 * 
	 * @see Item
	 */
	public int findMaxSatisfaction(int t, int n, Item[] items) {
		int ks[][] = new int[n + 1][t + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= t; j++) {
				if (i == 0 || j == 0)
					ks[i][j] = 0;
				else if (items[i - 1].getTime() <= j)
					ks[i][j] = Integer.max(items[i - 1].getSatisfaction() + ks[i - 1][j - items[i - 1].getTime()],
							ks[i - 1][j]);
				else
					ks[i][j] = ks[i - 1][j];
			}
		}

		return ks[n][t];
	}
}
