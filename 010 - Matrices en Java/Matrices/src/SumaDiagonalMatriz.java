public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        // Titulo del programa y matriz
        System.out.println("*** Suma de la Diagonal de una Matriz ***");
        int[][] matriz = new int[][]{
            {100,200,300},
            {400,500,600},
            {700,800,900}
        };
        int sumaDiagonal = 0;
        String texto = "La Suma de:";

        // Sumar cuando sean iguales
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz[fil].length; col++) {
                if (fil == col) {
                    sumaDiagonal += matriz[fil][col];
                    texto += " matriz[" + fil + "][" + col + "]: " + matriz[fil][col] + ",";
                }
            }
        }
        texto += " = " + sumaDiagonal;
        System.out.println(texto);
    }
}
