package br.com.unit.prova.questao2;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        this.desafiante = lutador1;
        this.desafiado = lutador2;
        if (lutador1.equals(lutador2)) {
            System.out.println("Luta não foi aprovada, lutadores iguais");
            this.setAprovada(false);
        } else {
            if (lutador1.getCategoria().equals(lutador2.getCategoria())) {
                System.out.println("Luta Aprovada!");
                this.setAprovada(true);

            } else {
                this.setAprovada(false);
                System.out.println("Luta não foi aprovada, categorias diferentes!");
            }
        }

    }

    public void lutar() {
        Random gerador = new Random();
        int valor;
        valor = gerador.nextInt(3);
        if (aprovada == false){
            System.out.println("Luta não permitida");
        }else{
            if (valor == 0) {
                desafiado.ganharLuta();
                desafiante.perderLuta();
                System.out.println(desafiado.getNome() + " ganhou");

            }
            if (valor == 1) {
                desafiante.ganharLuta();
                desafiado.perderLuta();
                System.out.println(desafiante.getNome() + " ganhou");

            }
            if (valor == 2) {
                desafiante.empatarLuta();
                desafiado.empatarLuta();
                System.out.println("A luta empatou");
            }
        
        }

    }
}