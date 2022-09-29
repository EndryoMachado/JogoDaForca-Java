import java.util.Scanner;

public class JogoDaForca
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
	    
	    while(chance != 0){
	        System.out.println("Chances: " + chance);
	        System.out.println(asteristicos);
	        letra = input.next().charAt(0);
	        
	        StringBuilder newString = new StringBuilder(asteristicos);
	        for(int i = 0; i < palavra.length(); i++){
	            if(palavra.charAt(i) == letra){
	                newString.setCharAt(i, letra);
	            }
	        }
	        
	        if(asteristicos.equals(""+newString)){
	            chance--;
	            if(chance == 0){
	                System.out.println("Você perdeu");
	            }
	        }else{
	            asteristicos = ""+newString;
	        }
	        
	        if(asteristicos.equals(palavra)){
	            System.out.println("Você venceu");
	            break;
	        }
	        
	    }
	    
	}
}
