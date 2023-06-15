package actividades.actividad2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

        public class Ejecutable {

                public static void main(String[] args) throws IOException {
                        FileReader fr = new FileReader("src/ficheros/fichero2.txt");
                        int numero;
                        char caracter;
                        String texto = "";

                        do{
                                numero= fr.read();
                                caracter = (char)numero;
                                if (numero!=-1){
                                        texto += caracter + "_" + numero +",";
                                }




                        }while(numero!=-1);
                        fr.close();

                        System.out.println(texto);







                }
        }



