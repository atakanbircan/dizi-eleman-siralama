import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int boyut,eleman;
        Scanner input=new Scanner(System.in);
        System.out.println("Dizinin Boyutu: ");
        boyut=input.nextInt();
        int[]list=new int[boyut];
        for (int a=1;a<=boyut;a++){
            System.out.println(a+"."+" Elamanı : ");
            list[a-1]=input.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}