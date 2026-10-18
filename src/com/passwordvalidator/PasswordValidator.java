
package com.passwordvalidator;

/**
 * A library for checking if passwords meet basic requirements.
 * It checks password length, letters, numbers, special characters,
 * and spaces. It can also return feedback about missing requirements.
 */

public class PasswordValidator {

    /**
     * Checks if a password has at least 8 characters.
     *
     * @param password The password being checked.
     * @return true if the password is at least 8 characters long.
     */

    public static boolean hasMinimumLength(String password) {
        return password != null && password.length() >= 8;
    }

    /**
     * Checks if a password contains an uppercase letter.
     *
     * @param password The password being checked.
     * @return true if an uppercase letter is found.
     */

    public static boolean hasUppercase(String password) {

        if (password == null) {
            return false;
        }

        // Go through each character looking for an uppercase letter
        for (char c : password.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks if a password contains a lowercase letter.
     *
     * @param password The password being checked.
     * @return true if a lowercase letter is found.
     */

    public static boolean hasLowercase(String password) {

        if (password == null) {
            return false;
        }

        // Go through each character looking for a lowercase letter
        for (char c : password.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks if a password contains a number.
     *
     * @param password The password being checked.
     * @return true if a number from 0 to 9 is found.
     */

    public static boolean hasNumber(String password) {

        if (password == null) {
            return false;
        }

        // Check each character for a number
        for (char c : password.toCharArray()) {
            if (c >= '0' && c <= '9') {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks if a password contains a special character.
     * Special characters are anything other than letters,
     * numbers, or whitespace.
     *
     * @param password The password being checked.
     * @return true if a special character is found.
     */

    public static boolean hasSpecialCharacter(String password) {

        if (password == null) {
            return false;
        }

        // Look for a character that is not a letter, number, or space
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c) &&
                    !Character.isWhitespace(c)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks if a password contains spaces or other whitespace.
     *
     * @param password The password being checked.
     * @return true if whitespace is found.
     */

    public static boolean containsSpaces(String password) {

        if (password == null) {
            return false;
        }

        // Check each character for whitespace
        for (char c : password.toCharArray()) {
            if (Character.isWhitespace(c)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks if a password meets all the requirements.
     * A valid password must have at least 8 characters,
     * uppercase and lowercase letters, a number,
     * a special character, and no spaces.
     *
     * @param password The password being checked.
     * @return true if all password requirements are met.
     */

    public static boolean isValidPassword(String password) {

        if (password == null) {
            return false;
        }

        // All requirements must be true for the password to be valid
        return hasMinimumLength(password)
                && hasUppercase(password)
                && hasLowercase(password)
                && hasNumber(password)
                && hasSpecialCharacter(password)
                && !containsSpaces(password);
    }

    /**
     * Gives feedback about any password requirements that are missing.
     * If the password passes all checks, it returns a valid message.
     *
     * @param password The password being checked.
     * @return A message explaining whether the password is valid
     *         or which requirements are missing.
     */

    public static String getPasswordFeedback(String password) {

        if (password == null) {
            return "Password cannot be null.";
        }

        if (isValidPassword(password)) {
            return "Password is valid.";
        }

        // Store the messages for any requirements that are missing
        String feedback = "";

        if (!hasMinimumLength(password)) {
            feedback += "Password must be at least 8 characters long.\n";
        }

        if (!hasUppercase(password)) {
            feedback += "Password must contain an uppercase letter.\n";
        }

        if (!hasLowercase(password)) {
            feedback += "Password must contain a lowercase letter.\n";
        }

        if (!hasNumber(password)) {
            feedback += "Password must contain a number.\n";
        }

        if (!hasSpecialCharacter(password)) {
            feedback += "Password must contain a special character.\n";
        }

        if (containsSpaces(password)) {
            feedback += "Password must not contain spaces.\n";
        }

        return feedback;
    }
}
