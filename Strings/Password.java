// A password is said to be strong if it satisfies the following criteria: 

// It contains at least one lowercase English character.
// It contains at least one uppercase English character.
// It contains at least one special character. The special characters are: !@#$%^&*()-+
// Its length is at least 8.
// It contains at least one digit.
// Given a string, find its strength. Let a strong password is one that satisfies all above conditions. 
// A moderate password is one that satisfies first 
// three conditions and has length at least 6. Otherwise password is weak.

public class Password {
    public static void main(String[] args) {
        String password1 = "GeeksforGeeks!@12";
        String password2 = "gfg!@12";
        String password3 = "weak";

        System.out.println(password1 + " → " + checkStrength(password1));
        System.out.println(password2 + " → " + checkStrength(password2));
        System.out.println(password3 + " → " + checkStrength(password3));
    }

    static String checkStrength(String password){
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;
        boolean hasDigit = false;

        String SpecialChars = "!@#$%^&*()-+";

        for(char ch: password.toCharArray()){
            if(Character.isUpperCase(ch)) hasUpper = true;
            if(Character.isLowerCase(ch)) hasLower = true;
            if(Character.isDigit(ch)) hasDigit = true;

            if(SpecialChars.indexOf(ch) != -1)  hasSpecial = true;
        }

        int length = password.length();

        if(hasLower && hasUpper && hasDigit && hasSpecial && length>=8){
            return "Strong";
        }

        if(hasDigit && hasUpper && hasSpecial && length>=6){
            return "Moderate";
        }


        return "Week";
    }
}
