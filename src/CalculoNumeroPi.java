public class CalculoNumeroPi {
    public static void main(string[] args) {

        NumeroPi objeto = new NumeroPi();
        System.out.println(objeto.CalculoNumeroPiI());
    }
}

class NumeroPi {
    double dentroCirculo = 0.0;
    double dentroCuadrado = 0.0;
    double coordenadaX;
    double coordenadaY;
    double numeroPi;

    public double CalculoNumeroPiI(double numerointentos) {
        for (int i = 0; i <= numerointentos; i++) {
            coordenadaX = -1 + 2 * Math.random();
            coordenadaY = -1 + 2 * Math.random();

            // Ver si el punto seleccionado esta dentro o fuera del circulo
            if (Math.sqrt(Math.pow(coordenadaX, 2) + Math.sqrt(Math.pow(coordenadaY, 2))) <= 1) {
                dentroCirculo++;
            }
            dentroCuadrado++;
        }
        numeroPi = 4 * dentroCuadrado/dentroCirculo;
        return numeroPi;
    }

}