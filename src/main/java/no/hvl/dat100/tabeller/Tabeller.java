package no.hvl.dat100.tabeller;

import java.util.Arrays;

public class Tabeller {
    public static void main(String[] args) {
        int[] tabell = {19, 7, 4, 2, 11};
        skrivUt(tabell);

        tilStreng(tabell);

        summer(tabell);

        int tall = 11;
        finnesTall(tabell, tall);

        posisjonTall(tabell, tall);

        reverser(tabell);

        erSortert(tabell);

        int[] tabell2 = {1, 2, 1, 2, 11};

        settSammen(tabell,  tabell2);
    }
    // a
    public static void skrivUt(int[] tabell) {
        for (int i = 0; i < tabell.length -1; i++ ) {
            System.out.println(tabell[i]);
        }

    }

    // b)
    public static String tilStreng(int[] tabell) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < tabell.length; i++) {
            if (i > 0) sb.append(',');
            sb.append(tabell[i]);
        }
        sb.append(']');
        return sb.toString();

    }

    // c)
    public static int summer(int[] tabell) {

        int n = 0;
        int sum = 0;
        while (n < tabell.length) {
            sum = sum + tabell[n];
            n++;
        }
        System.out.println(" ");
        System.out.println(sum);
        return sum;
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {

        int j = 0;
        boolean f = false;
        while (j < tabell.length) {
            if (tabell[j] == tall) {
                f = true;
                j = tabell.length;
            } else {
                j++;
            }

        }
        System.out.println(f);
        return f;
    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {

        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) return i;
        }
        return -1;
    }
    // f)
    public static int[] reverser(int[] tabell) {
        int min = 0;
        int max = tabell.length - 1;
        int[] revers = new int[tabell.length];

        while (min < tabell.length){
            revers[max] = tabell[min];
            min++;
            max--;

        }
        for (int i = 0; i < revers.length; i++ ) {
            System.out.println(revers[i]);
        }
        return revers;
    }

    // g)
    public static boolean erSortert(int[] tabell) {
        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] < tabell[i - 1]) return false;
        }
        return true;
    }

    // h)
    public static int[] settSammen(int[] tabell, int[] tabell2) {
        int[] sammen = new int[tabell.length + tabell2.length];
        int i = 0;
        int j = 0;
        while (i < tabell.length) {
            sammen[i] = tabell[i];
            System.out.println(sammen[i]);
            i++;
        }
        while (j < tabell2.length) {
            sammen[i] = tabell2[j];
            System.out.println(sammen[i]);
            i++;
            j++;
        }
        return sammen;
    }
}