package br.com.start.javacore._015_polimorfismo.services;

import br.com.start.javacore._015_polimorfismo.model.Produto;
import br.com.start.javacore._015_polimorfismo.model.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto: " + imposto);

        if(produto instanceof Tomate){
            String dataValidade = ((Tomate) produto).getDataValidade();

            System.out.println(dataValidade);
        }
    }
}
