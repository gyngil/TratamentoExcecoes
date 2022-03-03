package br.edu.pucgoias.cmp1138;

import java.io.BufferedReader;

public class Modelo2 {

    public static void main (String args[]){
        BufferedReader reader=null;
        try {
            // cria reader, processa arquivo e demais operações
        }
        catch (Exception e) {
            // caso ocorra alguma exceção
        }
        finally {
            //garantindo o fechamento do arquivo
            if (reader != null) {
                try {
                    reader.close();
                }
                catch (Exception e) {
                    // alguma outra exceção
                }
            }
        }
    }
}
