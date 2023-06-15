package actividades.actividad1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) throws IOException {

        FileWriter fw= new FileWriter("src/ficheros/fichero1.txt");
        Scanner scanner = new Scanner(System.in);
        String texto = "";

        do {
            System.out.print("Introduce un texto con al menos 30 caracteres: ");
            texto = scanner.nextLine();

            if (texto.length() < 30) {

                System.out.println("El texto es demasiado corto. Faltan " + (30 - texto.length()) + " caracteres.");
            }
        } while (texto.length() < 30);

        texto = texto.replace(" ","_").toUpperCase();

        fw.write(texto);
        fw.close();


        System.out.println ("Texto guardado en el fichero.");
    }




}
