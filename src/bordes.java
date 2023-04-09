

public class bordes {
    /**
     * subprograma que verifica la colision con los bordes de la ventana en el eje Y y X respectivamente
     */
    public static double reboteY(double velocidad, double posicion){
        if (Math.abs(velocidad+posicion)> 1.0){
            velocidad = -velocidad;

        }
        return (velocidad);

    }


    public static double reboteX(double velocidad, double posicion) {
        if (Math.abs(velocidad + posicion) > 1.0) {
            velocidad = -velocidad;

        }
        return (velocidad);
    }

}

