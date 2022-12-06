import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] massiv;
        Scanner in = new Scanner(System.in);
        massiv = new int[6];
        massiv[0] = 2;
        massiv[1] = 1;
        massiv[2] = 5;
        massiv[3] = 3;
        massiv[4] =-1;
        System.out.println("Задание 1:");
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
        System.out.println("Задание 2:");
        int a = massiv.length - 1;
        while (a >= 0) {
            System.out.println(massiv[a]);
            a = a - 1;
        }
        System.out.println("Задание 3:");
        for (int b = 0; b < massiv.length; b++) {
            if (massiv[b] % 2 == 0) {
                System.out.println(massiv[b]);
            }
        }
        System.out.println("Задание 4:");
        for (int c = 0; c < massiv.length; c++) {
            if (massiv[c] % 2 != 0) {
                System.out.println(massiv[c]);
            }
        }
        System.out.println("Задание 5:");
        for (int x = 0; x < massiv.length; x++) {

            System.out.println(massiv[x]);
            if (massiv[x] == -1) break;
        }
        System.out.println("Задание 6:");
        System.out.println("Какое знычение добавить в конец массива?");
        int y = in.nextInt();
        massiv[5] = y;
        for (int x = 0; x < massiv.length; x++) {
            System.out.println(massiv[x]);
        }
        System.out.println("Задание 7:");
        System.out.println("Какое знычение добавить в начало массива?");
        int d = in.nextInt();
        massiv[0] = d;
        for (int e = 0; e < massiv.length; e++) {
            System.out.println(massiv[e]);
        }
        System.out.println("Задание 8:");
        System.out.println("Какое знычение добавить в ячейку 4?");
        int f = in.nextInt();
        massiv[3] = f;
        for (int m = 0; m < massiv.length; m++) {
            System.out.println(massiv[m]);
        }
        System.out.println("Задание 9:");
        int z = 0;
        massiv[5] = z;
        for (int m = 0; m < massiv.length; m++) {
            System.out.println(massiv[m]);
        }
        System.out.println("Задание 10:");
        massiv[0] = z;
        for (int m = 0; m < massiv.length; m++) {
            System.out.println(massiv[m]);
        }
        System.out.println("Задание 11:");
        System.out.println("Какое значение убрать из ячейки? (ot 0 do 5)");
        int p = in.nextInt();
        massiv[p] = z;
        for (int m = 0; m < massiv.length; m++) {
            System.out.println(massiv[m]);
        }
    }
}