package list.exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedExeption {
    public static void main(String[] args)  {
        String nomeDoArquivo = "harry-potter.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que deseja imprimir " +e.getCause());
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exepcion ou não, o programa continua...");
    }
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        }while (line !=null);
        bw.flush();
        br.close();
    }
}
