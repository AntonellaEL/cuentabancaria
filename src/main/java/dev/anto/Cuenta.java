package dev.anto;

public class Cuenta {

    protected float saldo; 
    protected int numConsignaciones = 0;
    protected int numRetiros = 0;
    protected float tasaAnual;
    protected float comMensual = 0;
    
    
    public Cuenta(float saldo, float tasaAnual) {
    this.saldo = saldo;
    this.tasaAnual = tasaAnual;
    }
    
    public void consignar(float cantidad) {
    saldo = saldo + cantidad; 
    
    numConsignaciones = numConsignaciones + 1;
    }
    
    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
       
        if (nuevoSaldo >= 0) {
        saldo -= cantidad;
        numRetiros = numRetiros + 1;
        } else {
        System.out.println("la cantidad que quiere retirar sobrepasa el saldo actual");
        }
        }
        
        public void calcularInterés() {
        float tasaMensual = tasaAnual / 12; 
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual; 
        }
     
        public void extractoMensual() {
        saldo -= comMensual;
        calcularInterés();
        }
        
    }