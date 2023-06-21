package controller;

import java.io.IOException;

public class Launcher {
    /**
     * Este metodo permite lanzar el comando que permite ejecutar el
     * script de python
     * @param medition indica si queremos el grafico sobre la humedad o sobre la temperatura
     * @param graphic indica el tipo de grafico que queremos
     */
    public static boolean Launch(String medition, String graphic){
        try {
            Process process = Runtime.getRuntime().exec(createCommand(medition,graphic));
            return process.waitFor() == 0;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Este metodo permite crear el comando que ejecuta el script de python
     * @param firstParam primer parametro del script
     * @param secondParam segundo parametro del script
     * @return el comando creado
     */
    public static String createCommand(String firstParam, String secondParam){
        StringBuilder command = new StringBuilder();
        command.append("python ./src/python/main.py ");
        command.append(firstParam);
        command.append(" ");
        command.append(secondParam);
        return command.toString();
    }
}
