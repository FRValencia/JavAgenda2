package com.raul.controller;
/*
import com.raul.manager.AgendaManager;
import com.raul.manager.CommandParser;
import com.raul.model.Agenda;
import com.raul.model.Command;
import com.raul.view.Message;
import com.raul.view.Prompt;
import org.apache.velocity.util.ArrayListWrapper;
*/

import com.raul.model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Core {

    public static void main(String[] args) {
        //creamos la lista vacia
        List<Contact> agenda = new ArrayList<>();
        System.out.println("List "+ agenda);


    }
}







    Agenda agenda = new Agenda();

    public void start() {
        boolean end = false;
        int errorCounter = 0;

        while (!end) {

            String command = Prompt.read();
            Command com = CommandParser.parse(command);

            switch (com) {                                       //usmos un switch, segun valga el com, haces una cosa u otra

                case QUIT:
                    System.out.println("Bye");
                    end = true;
                    System.exit(0);
                    break;
                case HELP:
                    errorCounter = 0;
                    Message.printHelp();
                    break;
                case LIST:
                    errorCounter = 0;
                    agenda.print();
                    break;
                case ADD:
                    AgendaManager.add(agenda);
                    System.out.println("Introduzca siguiente tarea");

                    break;
                case DELETE:
                    AgendaManager.delete(agenda);

                    break;
                case UNKNOWN:
                    errorCounter = errorCounter + 1;
                    Message.printUnknownCommand(errorCounter);
                    break;
            }
        }
