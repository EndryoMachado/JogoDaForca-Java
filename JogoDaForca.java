import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    String[] palavras ={"abacate", "carro", "bicicleta", "programador", "frango"};
	    Scanner input = new Scanner(System.in);
	    int n = (int) (Math.random()*5), chance = 5;
	    String palavra, asteristicos = "";
	    char letra;
	    palavra = palavras[n];
	    for(int i = 0; i < palavra.length(); i++){
	        asteristicos += "*";
	    }
	    System.out.println(palavra);
	    clearConsole();
	    while(chance != 0){
	        
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
	            System.out.println(asteristicos);
	            System.out.println("Você venceu");
	            break;
	        }
	        
	    }
	    
	}
}
