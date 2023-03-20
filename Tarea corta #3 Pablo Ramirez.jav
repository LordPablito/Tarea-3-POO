//Pablo Ramirez 2019246933

public abstract class Figura{
    public abstract double calcularArea();
    public abstract int obtenerNumeroLados();
}

public class Rectangulo extends Figura{
    private double base;
    private double altura;
    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }
    public double calcularArea(){
        return base*altura;
    }    

}
public class Trian extends Figura{
    private double base;
    private double altura;
    public Trian (double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }
    public double calcularArea(){
        return (base*altura)/2;
    }    

}
public class Circulo extends Figura{
    private double radio;
    public Circulo (double pRadio){
        radio = pRadio;
    }
    public double calcularArea(){
        return Math.PI * radio * radio;
    }    

}
public int compareTo(Figura figuraPorComparar){
    double areaPorComparar = figuraPorComparar.calcularArea();
    double miArea = this.calcularArea();
    if(miArea==areaPorComparar){
        int ladosPorComparar = figuraPorComparar.obtenerNumeroLados();
        int misLados = this.obtenerNumeroLados();
        if(misLados == ladosPorComparar) {
            return 0;
        } else if (misLados > ladosPorComparar) {
            return 1;
        } else {
            return -1;
        }
    } else if (miArea > areaPorComparar){
        return 1;
    } else {
        return -1;
    }
}
  