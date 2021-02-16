package edu.epam.upskilllab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter your name:");
        String name = reader.readLine();
        reader.close();
        System.out.println("Nice to meet you " + name + "!");
    }
}
