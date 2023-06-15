package actividades.actividad3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Ejecutable {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/ficheros/fichero1.txt");
        FileReader fr2 = new FileReader("src/ficheros/fichero2.txt");
        FileWriter fw = new FileWriter("src/ficheros/fichero3.txt");

        int numero;
        String texto1 =" Contenido del Fichero Uno: ";
        String texto2 = " Contenido del Fichero Dos: ";
        String resultado;
        char caracter;

           do{
            numero= fr.read();
            caracter = (char)numero;
            if (numero!=-1){
                texto1 += caracter ;
            }

        }while(numero!=-1);

           do{
            numero= fr2.read();
            caracter = (char)numero;
            if (numero!=-1){
                texto2 += caracter ;
            }

        }while(numero!=-1);

           resultado =  texto1 + "\n" + texto2;
           fw.write(resultado);
           fr.close();
           fw.close();
           fw.close();









    }
}



