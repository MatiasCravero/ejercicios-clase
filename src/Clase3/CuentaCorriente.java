package Clase3;

public class CuentaCorriente {
    public String cbu;
    public double saldo;

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(){

    }

    public CuentaCorriente(double saldo, String cbu){
        this.cbu = cbu;
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        this.saldo = cuentaCorriente.saldo;
        this.cbu = cuentaCorriente.cbu;
    }

    public void Ingreso(double monto){
        this.saldo += monto;
    }

    public void Egreso(double monto){
        if (this.saldo - monto < 0){
            System.out.println("Usted no tiene el saldo necesario");
        }else {
            this.saldo -= monto;
        }
    }

    public void Reintegro(double monto, String cuenta){
        this.saldo += monto;
        System.out.println("Usted a recibido un reintegro por: " + monto);
    }

    public void Transferencia(double monto, CuentaCorriente cuenta){
        if (this.saldo - monto >= 0){
            cuenta.saldo += monto;
            this.saldo -= monto;

            System.out.println("Usted realizó una transferencia por: " + monto + "a la cuenta con cbu: " + cuenta.cbu);
        }
        else{
            System.out.println("Usted no cuenta con el saldo necesario para la operación");
        }

    }
}
