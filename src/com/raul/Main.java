package com.raul;

import com.raul.controller.Core;
import com.raul.view.Title;

public class Main {

    public static void main(String[] args) {
        Title.printTitle();								//Arrancamos con el mensaje de bienvenida alojado en la clase Title
        Core core = new Core();							//Invocamos a Core para comenzar las actividades a partir de él
        core.start();									//Ejecutamos
    }
}
