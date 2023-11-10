import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] dna = new String[6][6];
        int rows = 6;
        int cols = 6;

        String row = "";
        for (int i = 0; i < rows; i++) {
            Boolean bo = true;
            while (bo) {
                System.out.println("Ingrese su ADN (Las letras deben ser A, T, C o G");
                String string = leer.next().toUpperCase();
                if (string.length() == 6) {
                    if (valid_str(string)) {
                        row = string;
                        bo = false;
                    } else {
                        System.out.println("Ingreso mal. Intente otra vez.");
                    }
                } else {
                    System.out.println("Ingreso mal la cantidad de letras. Deben ser 6.");
                }
            }
            dna[i] = row.split("");
        }
        show_matriz(dna);

        if (is_mutant(dna)) {
            System.out.println("Es mutante.");
        }else {
            System.out.println("No es mutante. ");
        }

    }

    public static boolean valid_str(String string) {
        char[] string_lt = string.toCharArray();
        char[] valid_letters = {'A', 'T', 'C', 'G'};
        for (char i : string_lt) {
            boolean isValid = false;
            for (char j : valid_letters) {
                if (i == j) {
                    isValid = true;
                    break;
                }
            }

            if (!isValid) {
                return false;
            }
        }
        return true;
    }

    public static void show_matriz(String[][] mat) {
        for (String[] row : mat) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Da vuelta las filas de la matriz.
    public static String[][] inverted_rows(String[][] dna) {
        String[][] inv = new String[dna.length][dna[0].length];
        for (int i = 0; i < dna.length; i++) {
            for (int j = 0; j < dna[i].length; j++) {
                inv[i][j] = dna[i][dna.length - j - 1];
            }
        }
        return inv;
    }

    // Busca la diagonal principal.
    public static String[] main_diagonal(String[][] dna) {
        String[] main_diagonal = new String[6];
        for (int i = 0; i < 6; i++) {
            main_diagonal[i] = dna[i][i];
        }
        return main_diagonal;
    }

    // Busca la diagonal secundaria.
    public static String[] second_diagonal(String[][] dna) {
        String[] second_diag = new String[6];
        for (int i = 0; i < 6; i++) {
            second_diag[i] = dna[i][6 - i - 1];
        }
        return second_diag;
    }

    // Busca la diagonal al lado de la principal/secundaria.
    public static String[] main2_diagonal_row(String[][] dna) {
        String[] main2 = new String[5];
        for (int i = 0; i < 5; i++) {
            main2[i] = dna[i][i + 1];
        }
        return main2;
    }

    public static String[] main3_diagonal_row(String[][] dna) {
        String[] main3 = new String[5];
        for (int i = 0; i < 4; i++) {
            main3[i] = dna[i][i + 1];
        }
        return main3;
    }

    public static String[] main4_diagonal_col(String[][] dna) {
        String[] main4 = new String[5];
        for (int i = 0; i < 5; i++) {
            main4[i] = dna[i + 1][i];
        }
        return main4;
    }

        public static String[] main5_diagonal_col(String[][] dna) {
            String[] main5 = new String[5];
            for (int i = 0; i < 4; i++) {
                main5[i] = dna[i + 2][i];
            }
            return main5;
        }

    public static int horizontal(String[][] dna) {
        int count = 0;
        for (String[] row : dna) {
            int count2 = 1;
            for (int j = 1; j < row.length; j++) {
                if (row[j].equals(row[j - 1])) {
                    count2 += 1;
                    if (count2 == 4) {
                        count += 1;
                        break; // No need to continue checking this row
                    }
                } else {
                    count2 = 1;
                }
            }
        }
        return count;
    }

    public static int vertical(String[][] dna) {
        int count = 0;
        for (int col = 0; col < dna[0].length; col++) {
            int count2 = 1;
            for (int i = 1; i < dna.length; i++) {
                if (dna[i][col].equals(dna[i - 1][col])) {
                    count2 += 1;
                    if (count2 == 4) {
                        count += 1;
                        break; // No need to continue checking this column
                    }
                } else {
                    count2 = 1;
                }
            }
        }
        return count;
    }

    public static int count_diagonals(String[] diagonal) {
        int count = 1;
        for (int j = 0; j < diagonal.length - 1; j++) {
            if (diagonal[j].equals(diagonal[j + 1])) {
                count += 1;
                if (count == 4) {
                    return 1;
                }
            } else {
                count = 1;
            }
        }
        return 0;
    }


    public static boolean is_mutant(String [][] dna){
            String[][] inv = inverted_rows(dna);
            int count = 0;
            String[] main_or = main_diagonal(dna);
            String[] second = second_diagonal(dna);
            String[] main2 = main2_diagonal_row(dna);
            String[] main3 = main3_diagonal_row(dna);
            String[] main4 = main4_diagonal_col(dna);
            String[] main5 = main5_diagonal_col(dna);
            String[] second2 = main2_diagonal_row(inv);
            String[] second3 = main3_diagonal_row(inv);
            String[] second4 = main4_diagonal_col(inv);
            String[] second5 = main5_diagonal_col(inv);
            count += horizontal(dna);
            count += vertical(dna);
            count += count_diagonals(main_or);
            count += count_diagonals(second);
            count += count_diagonals(main2);
            count += count_diagonals(main3);
            count += count_diagonals(main4);
            count += count_diagonals(main5);
            count += count_diagonals(second2);
            count += count_diagonals(second3);
            count += count_diagonals(second4);
            count += count_diagonals(second5);
            if (count > 1) {
                return true;
            }else {
                return false;
            }

    }

}