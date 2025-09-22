package lib;
import java.util.regex.Pattern;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     */
    
    public static class validate {
        
        private static final String HAS_UPPERCASE_REGEX = ".*[A-Z].*";
        private static final String HAS_LOWERCASE_REGEX = ".*[a-z].*";
        private static final String HAS_DIGIT_REGEX = ".*\\d.*";
        private static final String HAS_SPECIAL_CHAR_REGEX = ".*[^a-zA-Z0-9].*";

        private static final int MIN_LENGTH = 8;
        private static final int MAX_LENGTH = 64;
        
        public static PasswordStrength getPasswordStrength(String password) {
        if (password == null || password.isEmpty()) {
            return PasswordStrength.INVALID;
        }
        
        int score = 0;

        if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) {
            return PasswordStrength.INVALID;
        } else if (password.length() >= MIN_LENGTH && password.length() <= MAX_LENGTH) {
            score += 1; 
            if (password.length() >= 12) { 
                score += 1;
            }
        }

        if (Pattern.matches(HAS_UPPERCASE_REGEX, password)) {
            score += 1;
        }
        if (Pattern.matches(HAS_LOWERCASE_REGEX, password)) {
            score += 1;
        }
        if (Pattern.matches(HAS_DIGIT_REGEX, password)) {
            score += 1;
        }
        if (Pattern.matches(HAS_SPECIAL_CHAR_REGEX, password)) {
            score += 1;
        }

        if (password.toLowerCase().contains("password") ||
            password.toLowerCase().contains("123456") ||
            password.toLowerCase().contains("abcdef")) {
            score -= 2; 
        }

        if (score < 0) {
            score = 0;
        }

        if (score >= 5) { 
            return PasswordStrength.STRONG;
        } else if (score >= 3) {
            return PasswordStrength.MEDIUM;
        } else if (score >= 1) { 
            return PasswordStrength.WEAK;
        } else {
            return PasswordStrength.INVALID;
        }
    }

        public static boolean isValidForSubmission(String password) {
            return getPasswordStrength(password) != PasswordStrength.INVALID;
        }
    
    }
}