import java.util.*;
import java.io.*;

public class Huffman{


    public static void main(String args[]) throws IOException{
        Scanner in = new Scanner(System.in);
		System.out.println("Digite o nome do arquivo: ");
        String nome_arquivo = in.next();
        InputStream file = new FileInputStream(nome_arquivo); 
        BufferedReader br = new BufferedReader(new InputStreamReader(file)); 

        String next;
        while((next = br.readLine()) != null){
            next = next + "\n";
            String[] caracteres = next.split("(?!^)");
            for(int i = 0; i < caracteres.length; i ++){
                System.out.println(caracteres[i]);
            }
        }
    }
}