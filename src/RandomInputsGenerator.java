
import java.lang.Math;
import java.io.File;
import java.io.IOException;  
import java.io.FileWriter;

public class RandomInputsGenerator {

	/*Abre um arquivo de texto no path designado*/
	public static void openFile() {

	    try {
	    	File file = new File ("C:\\Users\\tc.isprogis\\eclipse-workspace\\RandomInputs\\RandomInputs.txt");
	        if (file.createNewFile()) {
	          System.out.println("File created: " + file.getName());
	        } else {
	          System.out.println("File already exists.");
	        }
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }

		}

	/*Numeros randomicos na forma 
	 * 
	 * (Math.random()*((max-min)+1))+min que inclue o maximo através do +1
	 * 
	 * Dessa forma podemos afirmar que vai ser true
	 * 
	 * */
	public static int generateRandomNumberInRange(int min, int max) {
		return (int) ((Math.random()*((max-min)+1))+min);
		
	}
	
	public static void writeInFile(int num) {
		
		 try {
			 	//para modo de appending so adicionar , true depois do path caso queira
				FileWriter myWriter = new FileWriter("C:\\Users\\tc.isprogis\\eclipse-workspace\\RandomInputs\\RandomInputs.txt", true);
				myWriter.write(String.valueOf(num)+"\n");
				myWriter.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	
	
	public static void main(String args[]) {
		
		openFile();
		//num = generateRandomNumberInRange(100,75);
		//writeInFile(num);
		
		/*Agora o que falta é organizar a lógica do que queremos testar aqui
		  De modo que, escolhido o programa e os casos de testes possa-se alterar aqui para gerar numeros randomicos 
		  dentro do limite aceitavel para que o Junit esteja correto e assim o PITEST possa rodar
		*/
		int freqAbaixo75, freq75Mais, nota1Baixa, nota1BaixaMenor30, nota1Alta, nota2Baixa, nota2BaixaMenor30, nota2Alta, notaFinalBaixa, notaFinalAlta;
		freqAbaixo75 = generateRandomNumberInRange(74,0);
		writeInFile(freqAbaixo75);
		
		freq75Mais = generateRandomNumberInRange(100,75);
		writeInFile(freq75Mais);
		
		nota1Baixa = generateRandomNumberInRange(50,30);
		writeInFile(nota1Baixa);
		
		nota1BaixaMenor30 = generateRandomNumberInRange(30,0);
		writeInFile(nota1BaixaMenor30);
		
		nota1Alta = generateRandomNumberInRange(100,70);
		writeInFile(nota1Alta);
		
		nota2Baixa = generateRandomNumberInRange(50,30);
		writeInFile(nota2Baixa);
		
		nota2BaixaMenor30 = generateRandomNumberInRange(30,0);
		writeInFile(nota2BaixaMenor30);
		
		nota2Alta = generateRandomNumberInRange(100,70);
		writeInFile(nota2Alta);
		
		notaFinalBaixa = generateRandomNumberInRange(50,0);
		writeInFile(notaFinalBaixa);
		
		notaFinalAlta = generateRandomNumberInRange(100,70);
		writeInFile(notaFinalAlta);
	}
	
	
}
