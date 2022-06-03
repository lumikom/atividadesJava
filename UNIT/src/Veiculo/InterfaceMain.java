package Veiculo;

public class InterfaceMain {
    public static void main(String[] args) {
        Aviao av1 = new Aviao();
        System.out.println(av1.acelerar());
        System.out.println(av1.buzinar());
        System.out.println(av1.freiar());
        System.out.println(av1.ligarMotor());
    }
    
}
