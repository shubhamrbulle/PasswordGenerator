package com.technohackedutech;

import java.util.Random;

public class PasswordGenerator {

		    // Define character sets for different complexities
		    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
		    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    private static final String DIGITS = "0123456789";
		    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:'\",.<>?";

		    public static void main(String[] args) {
		        int length = 12; // Default password length
		        boolean useLowercase = true;
		        boolean useUppercase = true;
		        boolean useDigits = true;
		        boolean useSpecialChars = false;

		        // Customize based on user-defined criteria

		        // Generate the password
		        String password = generatePassword(length, useLowercase, useUppercase, useDigits, useSpecialChars);

		        System.out.println("Generated Password: " + password);
		    }

		    public static String generatePassword(int length, boolean useLowercase, boolean useUppercase, boolean useDigits, boolean useSpecialChars) {
		        // Create a character set based on complexity criteria
		        StringBuilder charset = new StringBuilder();
		        if (useLowercase) {
		            charset.append(LOWERCASE_CHARS);
		        }
		        if (useUppercase) {
		            charset.append(UPPERCASE_CHARS);
		        }
		        if (useDigits) {
		            charset.append(DIGITS);
		        }
		        if (useSpecialChars) {
		            charset.append(SPECIAL_CHARS);
		        }

		        if (charset.length() == 0) {
		            System.out.println("Please select at least one character set for the password.");
		            return "";
		        }

		        Random random = new Random();
		        StringBuilder password = new StringBuilder();

		        for (int i = 0; i < length; i++) {
		            int randomIndex = random.nextInt(charset.length());
		            char randomChar = charset.charAt(randomIndex);
		            password.append(randomChar);
		        }

		        return password.toString();
		    }
		}
	
