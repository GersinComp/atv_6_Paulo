import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.setLado1(Float.valueOf(JOptionPane.showInputDialog(null,"informe o lado1: \n")));
        triangulo.setLado2(Float.valueOf(JOptionPane.showInputDialog(null,"informe o lado2: \n")));
        triangulo.setLado3(Float.valueOf(JOptionPane.showInputDialog(null,"informe o lado3: \n")));

        System.out.println("O triângulo é equilátero? " + triangulo.isEquilatero());
        System.out.println("O triângulo é isósceles? " + triangulo.isIsosceles());
        System.out.println("O triângulo é escaleno? " + triangulo.isEscaleno());

        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
    }
}
