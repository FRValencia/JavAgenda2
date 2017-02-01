package com.raul.manager;

import com.raul.model.Command;

public class CommandParser {
    //public static String detectedParameter;             //esto sirve para que reconozca las entradas de teclado correctamente

    public static Command parse(String text){
        if (text.equalsIgnoreCase("Quit") || text.equalsIgnoreCase("q")){
            return Command.QUIT;
        }
        if (text.equalsIgnoreCase("Help") || text.equalsIgnoreCase("h")){
            return Command.HELP;
        }
        if (text.equalsIgnoreCase("Add")|| text.equalsIgnoreCase("a")){
            return Command.ADD;
        }
        if (text.equalsIgnoreCase("List")|| text.equalsIgnoreCase("l")){
            return Command.LIST;
        }
        if (text.equalsIgnoreCase("Delete")|| text.equalsIgnoreCase("d")){
            return Command.DELETE;
        }
        return Command.UNKNOWN;
    }
}
