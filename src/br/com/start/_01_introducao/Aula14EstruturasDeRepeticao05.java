package br.com.start._01_introducao;

public class Aula14EstruturasDeRepeticao05 {
    // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
    // condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + "x R$ " + valorParcela);
        }
    }
}
