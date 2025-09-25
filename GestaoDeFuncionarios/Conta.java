package GestaoDeFuncionarios;

public class Conta {
    private String numero;
    double saldo;
    
    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
    

    
