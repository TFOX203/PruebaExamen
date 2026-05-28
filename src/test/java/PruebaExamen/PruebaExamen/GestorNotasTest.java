package PruebaExamen.PruebaExamen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorNotasTest {

    GestorNotas gestor = new GestorNotas();

    // Tests de calcularMedia
    @Test
    public void testCalcularMedia() {
        assertEquals(6.666666666666667, gestor.calcularMedia(5, 7, 8), 0.001);
    }

    // Tests de estaAprobado
    @Test
    public void testAprobado() {
        assertTrue(gestor.estaAprobado(6));
    }

    @Test
    public void testSuspenso() {
        assertFalse(gestor.estaAprobado(4));
    }

    @Test
    public void testJustoAprobado() {
        assertTrue(gestor.estaAprobado(5));  // límite exacto
    }

    // Tests de notaTexto
    @Test
    public void testNotaSuspenso() {
        assertEquals("Suspenso", gestor.notaTexto(4));
    }

    @Test
    public void testNotaAprobado() {
        assertEquals("Aprobado", gestor.notaTexto(6));
    }

    @Test
    public void testNotaNotable() {
        assertEquals("Notable", gestor.notaTexto(8));
    }

    @Test
    public void testNotaSobresaliente() {
        assertEquals("Sobresaliente", gestor.notaTexto(9));
    }
}
