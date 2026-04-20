package model;

public class Main {
    
    public static void main(String[] args) {
        
        Conta conta = new Conta(123, "Cristhian", 1000.0, 500.0);

        
        if (conta.saca(1200)) {
            System.out.println("Eba!!! Consegui sacar!");
        } else {
            System.out.println("Catapimbas!!! Nao consegui sacar!");
        }

        
        conta.deposita(300);

        
        System.out.println("Saldo atual sera: " + conta.getSaldo());
    }
    
}