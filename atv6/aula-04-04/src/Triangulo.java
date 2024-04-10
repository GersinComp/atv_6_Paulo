import javax.swing.JOptionPane;
import java.util.Objects;

public class Triangulo {
    private Float lado1;
    private Float lado2;
    private Float lado3;
    private Float area;
    private Float perimetro;

    public boolean isEquilatero() {
        return Objects.equals(lado1, lado2) && Objects.equals(lado2, lado3);
    }

    public boolean isIsosceles() {
        return Objects.equals(lado1, lado2) || Objects.equals(lado1, lado3) || Objects.equals(lado2, lado3);
    }

    public boolean isEscaleno() {
        return !Objects.equals(lado1, lado2) && !Objects.equals(lado1, lado3) && !Objects.equals(lado2, lado3);
    }

    public float calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public float calcularArea() {
        float semiperimetro = (float) (calcularPerimetro() / 2.0);
        return (float) Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }



    public Float getLado1() {
        return lado1;
    }

    public void setLado1(Float lado1) {
        this.lado1 = lado1;
    }

    public Float getLado2() {
        return lado2;
    }

    public void setLado2(Float lado2) {
        this.lado2 = lado2;
    }

    public Float getLado3() {
        return lado3;
    }

    public void setLado3(Float lado3) {
        this.lado3 = lado3;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Float perimetro) {
        this.perimetro = perimetro;
    }

    public Triangulo() {

    }
}
