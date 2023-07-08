package com.mycompany.cv;

import OBJECTS.*;
import java.util.Scanner;

public class CV {

    public static void main(String[] args) {
        User usuario = new User("Hector de Jesus", "HectorVega22", "hector221102", 1234);
        Scanner sc = new Scanner(System.in);
        String password = "";
        String username = "";
        do {
            
            System.out.println("Ingrese su usuario: ");
            username = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            password = sc.nextLine();

        } while (!usuario.login(username, password));
        System.out.println(usuario.saludo());

    }
}
