package com.test.rmit;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userService.login(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed! Invalid credentials.");
        }

        scanner.close();
    }
}
