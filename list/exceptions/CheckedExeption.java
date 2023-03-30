package list.exceptions;

import java.io.*;

public class CheckedExeption {
    public static void main(String[] args) throws IOException {
        String nomeDoArquivo = "harry-potter.txt";
        imprimirArquivoNoConsole(nomeDoArquivo);

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