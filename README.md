# Password Validator Library

## Description

Password Validator Library is a Java library that checks whether a password meets a set of requirements. It can check for uppercase and lowercase letters, numbers, special characters, minimum length, and spaces.

The library also provides feedback to explain which requirements a password is missing.

The purpose of this library is to allow other Java developers to check passwords without having to write the validation methods themselves.

## Requirements

- Java JDK 21 or later
- A Java project that supports external JAR files
- No additional libraries or dependencies are required

## Password Requirements

For a password to be considered valid, it must:

- Contain at least 8 characters
- Have at least one uppercase letter
- Have at least one lowercase letter
- Contain at least one number
- Contain at least one special character
- Not contain spaces or other whitespace

## Available Methods

| Method | Description |
|---|---|
| `hasMinimumLength()` | Checks if the password has at least 8 characters. |
| `hasUppercase()` | Checks for an uppercase letter. |
| `hasLowercase()` | Checks for a lowercase letter. |
| `hasNumber()` | Checks for a number. |
| `hasSpecialCharacter()` | Checks for a special character. |
| `containsSpaces()` | Checks for spaces or other whitespace. |
| `isValidPassword()` | Checks whether all requirements are met. |
| `getPasswordFeedback()` | Returns feedback about missing requirements. |

## Installation

1. Download the `PasswordValidatorLibrary.jar` file.
2. Open your Java project in IntelliJ IDEA.
3. Go to **File → Project Structure → Modules → Dependencies**.
4. Click **+** and select **JARs or Directories**.
5. Find and select the downloaded JAR file.
6. Make sure the dependency scope is set to **Compile**.
7. Click **Apply**, then **OK**.

## How to Use

Import the library into your Java class:

`import com.passwordvalidator.PasswordValidator;`

To check whether a password is valid:

`PasswordValidator.isValidPassword("Hello123!");`

This returns `true` because the password meets all the requirements.

To get feedback:

`PasswordValidator.getPasswordFeedback("hello123");`

The method returns:

```text
Password must contain an uppercase letter.
Password must contain a special character.
```

## Testing

The library was tested using a separate Java test class with different password inputs, including valid passwords, invalid passwords, empty strings, null values, and passwords containing spaces.

The compiled JAR was also imported into a separate Java project to confirm that its methods could be used without the original source code.

## Limitations

This library checks passwords against basic formatting requirements. It does not check whether passwords have been exposed in data breaches, and it does not store, encrypt, or authenticate passwords.

The minimum password length is currently fixed at 8 characters.