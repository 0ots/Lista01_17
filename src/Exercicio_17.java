import java.util.Scanner;

import java.lang.Math;

    public class Exercicio_17 {
        
        public static void main(String[] args) {

            int quantidadelatastintaint, quantidadegalaotintaint, quantidademisturadaint;

            double area, quantidadelatastinta, precolatastinta, quantidadegalaotinta, precogalaotinta, quantidademisturada, quantidademisturadafolga, precomisturado;

            Scanner input;

            input = new Scanner(System.in);

            System.out.println("Digite o tamanho da área a ser pintada em metros quadrados: ");

            area = input.nextInt();

            input.close();

            quantidadelatastinta = Math.ceil(area / (6 * 18));

            quantidadelatastintaint = (int) quantidadelatastinta;

            precolatastinta = quantidadelatastinta * 80;

            System.out.println("Comprando em latas de 18 litros: Você precisaria de " + quantidadelatastintaint + " lata(s) de tinta e custaria um total de R$ " + precolatastinta);

            quantidadegalaotinta = Math.ceil(area / (6 * 3.6));

            quantidadegalaotintaint = (int) quantidadegalaotinta;

            precogalaotinta = quantidadegalaotinta * 25;

            System.out.println("Comprando em galões de 3.6 litros: Você precisaria de " + quantidadegalaotintaint + " lata(s) de tinta e custaria um total de R$ " + precogalaotinta);

            quantidademisturada = Math.ceil(area / (6 * 21.6));

            quantidademisturadafolga = (quantidademisturada * 10) / 100 + quantidademisturada;

            quantidademisturadaint = (int) quantidademisturadafolga;

            precomisturado = quantidademisturada * 105;

            System.out.println("Comprando misturado: Você precisaria de " + quantidademisturadaint + " unidades misturadas e custaria um total de: R$ " + precomisturado);

    }

}
