package obj2.CajaFuerte;


public class CajaFuerte {
    Boolean abierta = true;
    Integer codigo;
    public void abrir(Integer codigoIngresado) {
        if (this.esCorrectoElCodigo(codigoIngresado)) {
            this.abierta = true;
        }
    }

    private Boolean esCorrectoElCodigo(Integer codigo) {
        return this.codigo.equals(codigo);
    }

    public Boolean estaAbierta() {
        return abierta;
    }

    public void cerrar(Integer codigoIngresado) {
        if (this.estaAbierta()) {
            this.abierta = false;
            this.codigo = codigoIngresado;
        }
    }

}
