package controller;

import java.awt.*;

/**
 * Esta interfaz contiene costantes que nos permiten configurar la interfaz
 */
public interface Constantes {
    /**
     * Indica el tipo de letra que tendran los botones
     */
    Font BTN_FONT = new Font("Segoe UI",Font.BOLD,16);
    /**
     * Indica el color de fondo de la ventana
     */
    Color BACKGROUND_COLOR = new Color(210,218,226);
    /**
     * Indica el color de fondo de los botones azules (Humedad)
     */
    Color BLUE_BUTTON_COLOR = new Color(15,118,249);
    /**
     * Indica el color de fondo de los botones rojos (Temperatura)
     */
    Color RED_BUTTON_COLOR = new Color(245,59,87);

}
