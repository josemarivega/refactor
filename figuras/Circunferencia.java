package figuras;

public class Circunferencia {
    public static final double DOUBLE = 3.1416;
    public static final double Pi = DOUBLE;
    private double radio;
    private String color;

    public Circunferencia(double radio) {
        this.setRadio(radio);
    }

    public void imprimir() {
        /** DAM1N_B1_JoseMariaVegaRguez */
        color = "rojo";
        System.out.println("Di�metro: " + 2 * getRadio());
        System.out.println("Color: " + color);
        calcularArea();
    }

    private void calcularArea() {
        double area = 2 * Pi * getRadio() * getRadio();
        System.out.println(area);
    }

    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.getRadio();
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
}

