package silver.da20240915.p1.Bessie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sInterview {
    public static int[] FA = new int[3];
    public static int[] RecurCowMethod(int[] Farmer, int t, int c, int FarmerN, int CowN, List<Integer> TimeOfCow){
        while (a) {
            t += 1;
            for (int i = 0; i < FarmerN; i++) {
                if (t == Farmer[i]) {
                    c++;
                    if (c + FarmerN > CowN){
                        a = false;
                        break;}
                    Farmer[i] += TimeOfCow.get(FarmerN + c - 1);
                    System.out.println(t+" "+c+" "+ Arrays.toString(Farmer));
                }
            }
        }
        return FA;
    }

    public static boolean a = true;

    public static void main(String[] args) {
        int t = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        int CowN = sc.nextInt(), FarmerN = sc.nextInt();
        int[] Farmer = new int[FarmerN];
        List<Integer> TimeOfCow = new ArrayList<Integer>();
        sc.nextLine();
        String TimeC = sc.nextLine();
        for (String s : TimeC.split(" ")) {
            TimeOfCow.add(Integer.parseInt(s));
        }
        for (int i = 0; i < FarmerN; i++){
            System.out.println(TimeOfCow.get(i));
            Farmer[i] = TimeOfCow.get(i);}

        while (a) {
            t += 1;
            for (int i = 0; i < FarmerN; i++) {
                if (t == Farmer[i]) {
                    c++;
                    if (c + FarmerN > CowN){
                        a = false;
                        break;}
                    System.out.println(CowN);
                    Farmer[i] += TimeOfCow.get(FarmerN + c - 1);
                }
            }
        }
        System.out.println(t);
    }
}
