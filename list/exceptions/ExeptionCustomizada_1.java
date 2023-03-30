package list.exceptions;

import javax.imageio.IIOException;
import javax.swing.*;
import java.io.*;

public class ExeptionCustomizada_1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exeption ou não, o programa continua...");
    }
    public static void imprimirArquivoNoConsole(String nomeArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
              bw.flush();
              br.close();
        } catch (ErroAberturaArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! Entre em contato com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeArquivo) throws ErroAberturaArquivoException {
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException e) {
            throw  new ErroAberturaArquivoException(file.getName(), file.getPath());
        }
    }
}


class ErroAberturaArquivoException extends Exception {
    private String nomeDoArquivo;
    private String diretorio;

    public ErroAberturaArquivoException( String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio =diretorio;
    }

    @Override
    public String toString() {
        return "ErroAberturaArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}
