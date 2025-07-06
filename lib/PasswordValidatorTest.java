package lib;

public class PasswordValidatorTest {

   
    public static void run() {

        System.out.println("--- Running Password Validator Tests ---");
       
        String p1 = "MyStrongP@ssw0rd!"; 
        PasswordStrength s1 = PasswordValidator.validate.getPasswordStrength(p1);
        if (s1 == PasswordStrength.STRONG) {
            System.out.println("Test Case 1 Passed: '" + p1 + "' is STRONG.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected STRONG but got " + s1);
        }

        String p2 = "weak";
        PasswordStrength s2 = PasswordValidator.validate.getPasswordStrength(p2);
        if (s2 == PasswordStrength.INVALID) {
            System.out.println("Test Case 2 Passed: '" + p2 + "' is INVALID.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got " + s2);
        }

        String p3 = "MediumPass1";
        PasswordStrength s3 = PasswordValidator.validate.getPasswordStrength(p3);
        if (s3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: '" + p3 + "' is MEDIUM.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected MEDIUM but got " + s3);
        }

        String p4 = "user123password";
        PasswordStrength s4 = PasswordValidator.validate.getPasswordStrength(p4);
        if (s4 == PasswordStrength.WEAK) {
            System.out.println("Test Case 4 Passed: '" + p4 + "' is WEAK.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected WEAK but got " + s4);
        }

        String p5 = "abcDEF123"; 
        PasswordStrength s5 = PasswordValidator.validate.getPasswordStrength(p5);
        if (s5 == PasswordStrength.WEAK) {
        System.out.println("Test Case 5 Passed: '" + p5 + "' is WEAK.");
        } else {
        System.out.println("Test Case 5 FAILED: Expected WEAK but got " + s5);
        }

        String p6 = "12345678";
        PasswordStrength s6 = PasswordValidator.validate.getPasswordStrength(p6);
        if (s6 == PasswordStrength.INVALID) {
            System.out.println("Test Case 6 Passed: '" + p6 + "' is INVALID.");
        } else {
            System.out.println("Test Case 6 FAILED: Expected INVALID but got " + s6);
        }

        String p7 = "AlphaOmegaDelta!9ZuluXray7";
        PasswordStrength s7 = PasswordValidator.validate.getPasswordStrength(p7);
        if (s7 == PasswordStrength.STRONG) {
            System.out.println("Test Case 7 Passed: '" + p7 + "' is STRONG.");
        } else {
            System.out.println("Test Case 7 FAILED: Expected STRONG but got " + s7);
        }

        String p8 = null;
        PasswordStrength s8 = PasswordValidator.validate.getPasswordStrength(p8);
        if (s8 == PasswordStrength.INVALID) {
            System.out.println("Test Case 8 Passed: null password is INVALID.");
        } else {
            System.out.println("Test Case 8 FAILED: Expected INVALID but got " + s8);
        }

        String p9 = "";
        PasswordStrength s9 = PasswordValidator.validate.getPasswordStrength(p9);
        if (s9 == PasswordStrength.INVALID) {
            System.out.println("Test Case 9 Passed: empty password is INVALID.");
        } else {
            System.out.println("Test Case 9 FAILED: Expected INVALID but got " + s9);
        }

        System.out.println("--------------------------------");
    }
}
