
package Seguros.Calculo;


public class SHPrima extends CalculosHogar{

    @Override
    public double calcularPrima() {
        return this.getPrimaBase() *1.25;
    }
    
}
