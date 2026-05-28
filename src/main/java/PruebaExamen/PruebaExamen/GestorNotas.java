package PruebaExamen.PruebaExamen;



public class GestorNotas {

    // Método 1: calcula la media de tres notas
    public double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    // Método 2: indica si el alumno ha aprobado
    public boolean estaAprobado(double media) {
        return media >= 5;
    }

    // Método 3: devuelve la calificación en texto
    public String notaTexto(double media) {
        if (media < 5) {
            return "Suspenso";
        } else if (media < 7) {
            return "Aprobado";
        } else if (media < 9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }
}



