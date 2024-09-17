package bronze.da20240914.Problem1;
import java.util.*;


public class LogicalMoos {
    public static int N, Q;
    public boolean AndMethod(List<String> a){
        return true;
    }
    public boolean OrMethod(List<String> a){
        return false;
    }
    public static boolean CheckLogic(int a, int b, boolean c, String d){
        List<String> logic = new ArrayList<String>(Arrays.asList(d.split(" ")));
        for (int i = 0; i < Q; i++) {
            for (int l = a; l <= b; l++)
                logic.removeFirst();
            System.out.println(logic);
            for (int g = 1; g < N; g += 2) {
                if (logic.get(i).equals("and")) {

                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), Q = sc.nextInt();
        String logics = sc.next();
        if (CheckLogic(1, 1, false, "false and true or true")){
            System.out.print("Y");
        }

    }
}
