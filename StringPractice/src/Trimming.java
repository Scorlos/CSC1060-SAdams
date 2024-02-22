public class Trimming {
    public static void main(String[] args) {
        // This program shows the trim feature in action, it removes white space from before and after a string.
        String text = "                             hello there          ";
        System.out.println("Before: " + text);
        text = removeSpace(text);
        System.out.println("After: " + text);
    }

    public static String removeSpace(String text) {
        return text.trim();
    }
}