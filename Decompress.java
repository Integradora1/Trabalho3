import java.util.*;
import java.io.*;
import java.nio.file.*;


public class Decompress{
	
	public static void main(String args[]) throws IOException{

		Path path = Paths.get("saida.bin");
		byte[] byts =  Files.readAllBytes(path);
		BitSet bits = BitSet.valueOf(byts);
		for(int i = 0; i < bits.length(); i++){
            System.out.print(bits.get(i) ? '1' : '0');
        }

        System.out.println();
	}
}