package excepciones;

@SuppressWarnings("serial")
public class ExcepcionProducto extends RuntimeException {
    public ExcepcionProducto (String mensaje) {
        super(mensaje);
    }

}
