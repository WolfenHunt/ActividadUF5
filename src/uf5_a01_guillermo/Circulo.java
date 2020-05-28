package uf5_a01_guillermo;


public class Circulo implements Comparable<Circulo> {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(float radio) {
        this.radio = radio;
    }
    //Calculo del area de un circulo
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
    //Calculo del perimetro de un circulo
    public double perimetro() {
        return Math.PI * radio * 2;
    }
    
    @Override
    public int compareTo(Circulo a) {
        if (a.getRadio() > radio) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return String.format("El Radio és:%.2f El Area és: %.2f  El Perimetro és: %.2f%n ", radio, area(),perimetro() );
    }

}