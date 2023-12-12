package br.com.start._02_javacore._016_exception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) throws IOException {
        divisao(1,0);
        System.out.println("Código finalizado");
    }

    private static int divisao(int a, int b) throws IllegalArgumentException {
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}
