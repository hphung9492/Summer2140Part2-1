package Reviews;

public class ConcateString {
    public static void main(String[] args) {

        System.out.println(getString(3,"you"))  ;

    }

    public static String getString(int n, String s){


        String result = "";
        for(int i = 0; i < n; i++){
            result += s;
        }
        return result;
    }
}
