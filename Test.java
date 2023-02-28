public class Test {
    public static void main(String[] args) {
        TestNumber1();
        TestNumber2();
    }

    // swap the first string to the second string
    // first string should be the second string
    public static String TestNumber1() {
        String one = "firstString";
        String two = "secondString";
        
        String temp = one;
        one = two;
        two = temp;

        System.out.println("Variable one is " + one + "and two is " + two);
        return "Variable one is " + one + "and two is " + two;
    }

    // Check if the string is palindrome
    public static void TestNumber2() {
        String str = "12321", reverseStr = "";
    
        int strLength = str.length();

        for (int i = (strLength - 1); i>=0; --i) {
            reverseStr = reverseStr + str.charAt(i);

            System.out.println(reverseStr);
        }
    
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
          System.out.println(str + " is a Palindrome.");
        }
        else {
          System.out.println(str + " is not a Palindrome.");
        }
    }
}

