import java.util.Scanner;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new FileReader("palavras.txt"));
       String linha = br.readLine();
       int qtdeLinhas = 0;
        while(linha != null){
            linha = br.readLine();
            qtdeLinhas++;
        }
    	 br.close();
	    Scanner input = new Scanner(System.in);
	    int n = (int) (Math.random()*qtdeLinhas+1), chance = 5;
	    String palavra = "", asteristicos = "";
	    char letra;
	    
	    BufferedReader br2 = new BufferedReader(new FileReader("palavras.txt"));
    	 for(int i = 1; i <= n; i++){
    	     linha = br2.readLine();
    	     palavra = linha;
    	 }
	    
	    for(int i = 0; i < palavra.length(); i++){
	        asteristicos += "*";
	    }
	    //System.out.println(palavra);
	    while(chance != 0){
	        System.out.print("\033[H\033[2J");
            	System.out.flush();
	        System.out.println("Chances: " + chance);
	        System.out.println(asteristicos);
	        letra = input.next().charAt(0);
	        
	        StringBuilder newString = new StringBuilder(asteristicos);
	        for(int i = 0; i < palavra.length(); i++){
	            if(palavra.charAt(i) == letra && asteristicos.contains(""+letra) == false){
	                newString.setCharAt(i, letra);
	            }
	        }
	        
	        if(asteristicos.equals(""+newString) && asteristicos.contains(""+letra) == false){
	            chance--;
	            if(chance == 0){
	                System.out.println("Você perdeu.\nA palavra era: "+palavra);
	            }
	        }else{
	            asteristicos = ""+newString;
	        }
	        
	        if(asteristicos.equals(palavra)){
	            System.out.print("\033[H\033[2J");
                System.out.flush();
	            System.out.println(asteristicos);
	            System.out.println("Você venceu");
	            break;
	        }
	        
	    }
	    
	}
}
