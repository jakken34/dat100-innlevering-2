package no.hvl.dat100.matriser;

public class    Matriser {
    public static void main(String[] args) {
        int[][] randomTall = {{1,5,7},{2,8,9}};

        int[][] randomTallOppgave1 = { {1,2,3}, {4,5,6}, {7,8,9} };

        int tall = 2;

        skrivUt(randomTall);

        System.out.println(tilStreng(randomTallOppgave1));

        skrivUt(skaler(tall,randomTall));

        int[][] randomTall2 = {{1,5,7},{2,8,9}};
        int[][] randomTall3 = {{1,5,7},{2,8,9}};

        System.out.println(erLik(randomTall2, randomTall3));

        int[][] askalert = { {2,4,6}, {8,10,12}, {14,16,18} };
        int[][] cskalert = { {2,4,6}, {8,10,12}, {14,16,18}, {20,22,24} };

        skrivUt(skaler(tall,askalert));

        skrivUt(skaler(tall,cskalert));


    }

    // a)
    public static void skrivUt ( int[][] matrise){

        for (int i = 0; matrise.length > i; i++){
            for (int tall: matrise[i]) {
                System.out.print(tall + " ");
            }
        }
        System.out.println(" ");
    }


    // b)
    public static String tilStreng(int[][] matrise) {
        String s = "";
        for (int[] rad : matrise) {
            for (int verdi : rad) {
                s += verdi + " ";
            }
            s += "\n";
        }
        return s;
    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {
        int[][] kopi = new int[matrise.length][];
        for (int i = 0; i < matrise.length; i++) {
            kopi[i] = new int[matrise[i].length];
            for (int j = 0; j < matrise[i].length; j++) {
                kopi[i][j] = matrise[i][j] * tall;
            }
        }
        return kopi;

    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) return false;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
}