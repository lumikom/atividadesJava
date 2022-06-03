package Veiculo;

public class Aviao implements Veiculo {
    public String ligarMotor() {
        return "Ligando Motor";
    }

    public String acelerar() {
        return "Acelerando Avião";
    }

    public String freiar() {
        return "Freiando Avião";
    }

    public String buzinar() {
        return "Buzinando";
    }
}