package br.com.start._01_introducao;

public class Aula16Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double
        // char '\u0000'
        // boolean false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
