package br.senac.rn.introducao.teste;

import br.senac.rn.introducao.Lampada;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada("Preto" , 80);
        lampada.cor = "Branca";
        lampada.potencia = 80;

        lampada.acende();

        lampada.FREQUENCIA = 100;



        System.out.println(lampada.FREQUENCIA);
    }
}
