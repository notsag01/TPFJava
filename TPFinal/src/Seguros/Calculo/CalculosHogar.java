
package Seguros.Calculo;



public abstract class CalculosHogar {
    private int primaBase;
    

    public int getPrimaBase() {
        return primaBase;
    }

    public void setPrimaBase(int primaBase) {
        this.primaBase = primaBase;
    }
    
    
    public abstract double calcularPrima();
}

