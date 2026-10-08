public class StringOperations {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Length: " + str1.length());
        System.out.println("Concatenation: " + str1.concat(" " + str2));
        System.out.println("Uppercase: " + str1.toUpperCase());

        System.out.println("Lowercase: " + str2.toLowerCase());

        System.out.println("Character at index 1: " + str1.charAt(1));

        System.out.println("Substring: " + str1.substring(1, 4));

        System.out.println("Equals: " + str1.equals(str2));

        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("HELLO"));

        System.out.println("Replace: " + str1.replace('l', 'x'));
        System.out.println("Contains 'ell': " + str1.contains("ell"));


        System.out.println("Starts with 'He': " + str1.startsWith("He"));

        System.out.println("Ends with 'lo': " + str1.endsWith("lo"));

        System.out.println("Index of 'l': " + str1.indexOf('l'));
        String str3 = "   Java Programming   ";
        System.out.println("Trimmed: '" + str3.trim() + "'");
    }
}