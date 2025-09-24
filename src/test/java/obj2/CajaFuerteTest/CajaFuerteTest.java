package obj2.CajaFuerteTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import obj2.CajaFuerte.CajaFuerte;

public class CajaFuerteTest {
    @Test
    public void sePuedeCrearInstanciaDeCajaFuerte() {
        CajaFuerte cajaFuerte = new CajaFuerte();
        assertNotNull(cajaFuerte);
    }
    @Test
    public void cajaFuerteSeAbre() {
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(1234);
        assertTrue(caja.estaAbierta());
    }
    @Test
    public void cajaFuerteSeCierra() {
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        assertFalse(caja.estaAbierta());
    }
    @Test
    public void cajaFuerteSeAbreConCodigoCorrecto() {
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(1234);
        assertTrue(caja.estaAbierta());
    }
    @Test
    public void cajaFuerteNoSeAbreConCodigoIncorrecto() {
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(2345);
        assertFalse(caja.estaAbierta());
    }
    @Test
    public void cajaFuerteNoDeberiaCambiarSuCodigoMientrasEstaCerrada() {
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.cerrar(2525);
        caja.abrir(2525);
        assertFalse(caja.estaAbierta());
    }
}