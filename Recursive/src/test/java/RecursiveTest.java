public class RecursiveTest extends Recursive {
    public static void main(String[] args) {
        String s1 = "\nBobble bobby boy";
        String testS1 = printStars(s1);
        String s2 = "\nPretty parmesan wheels piss Pillington";
        String testS2 = printStars(s2);
        String dummy1 = "";
        String testD1 = printStars(dummy1);
        String testD2 = printStars(null);
        String[] dummy3 = new String[1];
        String testD3 = printStars(dummy3.toString());

        System.out.printf("\n%s\n%s\n%s\n%s\n%s",testS1,testS2,testD1,testD2,testD3);
    }
}
