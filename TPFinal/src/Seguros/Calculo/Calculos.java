
package Seguros.Calculo;



public abstract class Calculos {
    private int coberturaHogar;

    public int getCoberturaHogar() {
        return coberturaHogar;
    }

    public void setCoberturaHogar(int coberturaHogar) {
        this.coberturaHogar = coberturaHogar;
    }
    
    
    public abstract double calcularPrima();
}

