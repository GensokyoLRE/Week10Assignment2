
public class Recursive {
    static int index = 0;
    static char match;
    /*
    * recursive method to output every other element in the given array backwards,
    * ending with the element at index k.
    * An example input arrary {1,2,3,4,5,6,7,8,9,10}, called with k=2, should output 9753
    */
    public static void printEveryOther(final int[] ia, final int k) {
        if (null == ia){
            System.out.println(ia.toString());
        } else if (!(k>8)){
            System.out.print(ia[ia.length-k]);
            printEveryOther(ia,k+2);
        }
    }

    /*
    * recursively take in a string and place a * between adjacent letters that are the same
    * An example input String "hello" should return hel*lo.
    */
    public static String printStars(final String s){
        try{
            if (s == null){
                return null;
            }
            if (s.indexOf(index) != 0 && s.indexOf(index) != 0 && index != s.length()){
                if (s.length() > index && s.charAt(index) == s.charAt(index+1)){
                    System.out.print(s.charAt(index) + "*" + s.charAt(index+1));
                    match = s.charAt(index+1);
                    index += 1;
                    printStars(s);
                }
            }
            if (s.length() > index){
                if (s.charAt(index+1) != s.charAt(index) && s.charAt(index) != match){
                    System.out.print(s.charAt(index) + "" + s.charAt(index+1));
                } else {
                    System.out.print(s.charAt(index+1));
                }
                index += 2;
                printStars(s);
            }
        } catch (Exception e){
            System.err.println("My name is Phil, and YOU JUST GOT ERR'D: " + e.getMessage());
        }
        return "\nDone";
    }

    public static void main(String[] args) {
        printEveryOther(new int[]{1,2,3,4,5,6,7,8,9,10}, 2);
        System.out.print("\n");
       System.out.println(printStars("Hello"));
    }
}