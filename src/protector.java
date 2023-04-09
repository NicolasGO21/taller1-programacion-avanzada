import edu.princeton.cs.stdlib.StdDraw;
import java.awt .*;
import static edu.princeton.cs.stdlib.StdRandom.shuffle;

public class protector {

    /**
     * The main
     */
    public static void main(String[] args) {

        //Rango de dibujo
        double min = -1.0;
        double max = 1.0;

        //definicion de la escala del lienzo de dibujo
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);

        // Evitar el parpadeo de la pantalla
        StdDraw.enableDoubleBuffering();

        // Definiendo una paleta de colores
        Color[] colores = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN, Color.orange, Color.MAGENTA};

        // Velocidad inicial de las lineas
        double vx = Math.random() / 300;
        double vy = Math.random() / 300;

        // distancia horizontal y vertical entre cada linea
        double distanciax = 0.05;
        double distnaciay = 0.08;

        //Generacion de 6 pares ordenados(x,y) , considerando una distancia entre cada linea
        double x0 = min / 2.5 + (max / 2.5 - min / 2.5) * Math.random();
        double y0 = min / 2.5 + (max / 2.5 - min / 2.5) * Math.random();

        double x1 = min / 2.5 + (max / 2.5 - min / 2.5) * Math.random();
        double y1 = min / 2.5 + (max / 2.5 - min / 2.5) * Math.random();

        double x2 = x0 + distanciax;
        double y2 = y0 + distnaciay;

        double x3 = x1 + distanciax;
        double y3 = y1 + distnaciay;

        double x4 = x0 + distanciax * 2;
        double y4 = y0 + distnaciay * 2;

        double x5 = x1 + distanciax * 2;
        double y5 = y1 + distnaciay * 2;

        double x6 = x0 + distanciax * 3;
        double y6 = y0 + distnaciay * 3;

        double x7 = x1 + distanciax * 3;
        double y7 = y1 + distnaciay * 3;

        double x8 = x0 + distanciax * 4;
        double y8 = y0 + distnaciay * 4;

        double x9 = x1 + distanciax * 4;
        double y9 = y1 + distnaciay * 4;

        double x10 = x0 + distanciax * 5;
        double y10 = y0 + distnaciay * 5;

        double x11 = x1 + distanciax * 5;
        double y11 = y1 + distnaciay * 5;

        //Dibujo de lineas
        while (true) {

            // valores de la velocidad al iniciar el ciclo
            double vx2= vx;
            double vy2= vy;

            // nuevos valores de la velocidad, estos cambian en caso de que una linea llegur a un borde
            vx=bordes.reboteX(vx,x0);
            vx=bordes.reboteX(vx,x1);
            vx=bordes.reboteX(vx,x10);
            vx=bordes.reboteX(vx,x11);
            vy=bordes.reboteY(vy,y0);
            vy=bordes.reboteY(vy,y1);
            vy=bordes.reboteY(vy,y10);
            vy=bordes.reboteY(vy,y11);

            // Comparacion de la velocidad al incio del ciclo y la actual, en caso de cambios en la velocidad la lista de colores se desordena
            if (vx2 != vx){
                shuffle(colores);
            }
            if (vy2 != vy){
                shuffle(colores);
            }


            //actualizacion de la posicion de los pares ordenados(x,y) de las 6 lineas
            x0 += vx;
            y0 += vy;
            x1 += vx;
            y1 += vy;
            x2 += vx;
            y2 += vy;
            x3 += vx;
            y3 += vy;
            x4 += vx;
            y4 += vy;
            x5 += vx;
            y5 += vy;
            x6 += vx;
            y6 += vy;
            x7 += vx;
            y7 += vy;
            x8 += vx;
            y8 += vy;
            x9 += vx;
            y9 += vy;
            x10 += vx;
            y10 += vy;
            x11 += vx;
            y11 += vy;

            //Limpiar el fondo
            StdDraw.clear();

            // Eleccion del color dentro de la lista "colores" y dibujo de los pares ordenados
            StdDraw.setPenColor(colores[1]);
            StdDraw.line(x0, y0, x1, y1);
            StdDraw.setPenColor(colores[2]);
            StdDraw.line(x2, y2, x3, y3);
            StdDraw.setPenColor(colores[3]);
            StdDraw.line(x4, y4, x5, y5);
            StdDraw.setPenColor(colores[4]);
            StdDraw.line(x6, y6, x7, y7);
            StdDraw.setPenColor(colores[5]);
            StdDraw.line(x8, y8, x9, y9);
            StdDraw.setPenColor(colores[0]);
            StdDraw.line(x10, y10, x11, y11);

            //Mostrar la pantalla
            StdDraw.show();


        }
    }
}
