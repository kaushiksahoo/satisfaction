package com.example.satisfaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class SatisfactionApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SatisfactionApplication.class);

	@Autowired
	private Knapsack knapsack;

	public static void main(String[] args) {
		SpringApplication.run(SatisfactionApplication.class, args);
	}

	/**
	 * Calculates max satisfaction by reading file 'data.txt'
	 */
	@Override
	public void run(String... args) {
		int t = 0;
		int n = 0;
		Item[] items = null;

		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new ClassPathResource("data.txt").getInputStream()))) {

			String[] meta = br.readLine().split(" ");
			t = Integer.parseInt(meta[0]);
			n = Integer.parseInt(meta[1]);

			items = new Item[n];

			for (int i = 0; i < n; i++) {
				String[] line = br.readLine().split(" ");
				items[i] = new Item(Integer.parseInt(line[1]), Integer.parseInt(line[0]));
			}
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
		
		System.out.println(knapsack.findMaxSatisfaction(t, n, items));
	}
}
