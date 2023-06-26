package com.example.generadordeclaves;

import java.util.Random;

public class Clave {


    private String contraseña;

    protected String generar(int longitud) {
        Random rnd = new Random();
        StringBuilder password = new StringBuilder();
        char caracter;
        int digito;
        for (int i = 0; i < longitud; i++) {
            //Se obtiene un número al azar del 0 al 4.
            //Según este número se obtiene una mayúscula, minúscula, número, punto o guión bajo
            switch (rnd.nextInt(5)) {
                case 0:
                    caracter = (char) (rnd.nextInt('Z' - 'A' + 1) + 'A');//obtenemos una mayúscula al azar
                    password.append(caracter);
                    break;
                case 1:
                    caracter = (char) (rnd.nextInt('z' - 'a' + 1) + 'a'); //obtenemos una minúscula al azar
                    password.append(caracter);
                    break;
                case 2:
                    digito = rnd.nextInt(10); //obtenemos un dígito del 0 al 9
                    password.append(digito);
                    break;
                case 3:
                    password.append('.'); //añadimos un punto
                    break;
                case 4:
                    password.append('_'); //añadimos un guión bajo
                    break;
            }
        }
        return password.toString();
    }
}
