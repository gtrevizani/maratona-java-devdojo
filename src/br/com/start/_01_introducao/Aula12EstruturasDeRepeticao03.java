package br.com.start._01_introducao;

public class Aula12EstruturasDeRepeticao03 {
    //Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50
    public static void main(String[] args) {
        int valorMax = 50;
        for(int i=0; i <= valorMax; i++){
            if(i>25) {
                break;
            }
            System.out.println("i = " + i);
        }

    }
}