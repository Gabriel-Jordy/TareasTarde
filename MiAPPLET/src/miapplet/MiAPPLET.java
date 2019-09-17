package miapplet;
import java.awt.Color;
import java.awt.Graphics;
public class MiAPPLET extends java.applet.Applet{
    public final int FIGUREHEIGHT = 280;
    public final int FIGUREWIDTH = 445;
    Color ROJO = new Color(182, 100, 110);
    Color NEGROGRIS = new Color(150, 70, 80);
    Color AZUL = new Color(35, 206, 255);
    Color ORO = new Color(240, 220, 0);
 public void paint(Graphics micarro) {
        // Fondo
        micarro.setColor(Color.white);
        micarro.fillRect(0, 0, FIGUREWIDTH, FIGUREHEIGHT);

        // LLanta De Adelante
        micarro.setColor(Color.black);
        micarro.fillOval(20, 170, 100, 100);
        micarro.setColor(Color.white);
        micarro.fillOval(30, 180, 80, 80);
        micarro.setColor(Color.black);
        micarro.drawOval(40, 190, 60, 60);

        // Llanta De Atras
        micarro.setColor(Color.black);
        micarro.fillOval(270, 170, 100, 100);
        micarro.setColor(Color.white);
        micarro.fillOval(280, 180, 80, 80);
        micarro.setColor(Color.black);
        micarro.drawOval(290, 190, 60, 60);

        // Capo
        micarro.setColor(NEGROGRIS);
        micarro.fillRect(10, 113, 122, 12);
        micarro.setColor(ROJO);
        micarro.fillRect(10, 123, 122, 82);

        // Antena
        micarro.setColor(ORO);
        micarro.fillOval(10, 105, 10, 10);

        //  Ventana
        micarro.setColor(AZUL);
        micarro.fillRect(130, 15, 130, 100);

        // Puerta
        micarro.setColor(ROJO);
        micarro.fillRect(130, 113, 130, 92);

        // Asientos
        micarro.setColor(ROJO);
        micarro.fillRect(258, 15, 122, 190);

        // Baul
        micarro.setColor(ROJO);
        micarro.fillRect(378, 80, 57, 125);

        // Tablero
        micarro.fillRect(118, 205, 154, 10);

        // Retrovisor
        micarro.setColor(Color.black);
        micarro.drawLine(131, 15, 110, 30);
        micarro.drawLine(131, 16, 110, 31);
        micarro.drawLine(131, 17, 110, 32);

        // Manija
        micarro.setColor(Color.black);
        micarro.drawLine(145, 125, 170, 125);
        micarro.drawLine(145, 124, 170, 124);
        micarro.drawLine(145, 123, 170, 123);
        
        //Estrellas
        int[] coordenadasX = {630, 650, 710, 660, 680, 630, 580, 600, 550, 610};
        int[] coordenadasY = {20, 90, 90, 130, 200, 160, 200, 130, 90, 90};
        int nPuntos = 10;
        micarro.drawPolygon(coordenadasX, coordenadasY, nPuntos);
       
        int[] coordenadassX = {340, 360, 420, 370, 390, 340, 290, 310, 260, 320};
        int[] coordenadassY = {20, 90, 90, 130, 200, 160, 200, 130, 90, 90};
        int nPuntoss = 10;

        micarro.drawPolygon(coordenadassX, coordenadassY, nPuntoss);
       
        micarro.setColor(Color.RED);
        micarro.drawString("MI CARRO",400,10);
        micarro.drawLine(900,10,10,10);
        micarro.setColor(Color.GREEN);
        micarro.drawString("JORDY FIGUEROA",400,300);
        micarro.drawLine(900,300,10,300);
        micarro.setColor(Color.BLUE);
        micarro.drawLine(900, 10, 900, 300);
    }
}


