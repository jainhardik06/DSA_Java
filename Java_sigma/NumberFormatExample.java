public class NumberFormatExample {
    public static void main(String[] args) {
        try {
            String s = "abc";
            int num = Integer.parseInt(s); // invalid string
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
