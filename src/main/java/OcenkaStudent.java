/*Од тастатура се внесува максимален број на поени кои студентот може да ги
добие на тестот кој го решавал, во зависност од поените според формулата (оценка =
освоени бодови/максимален број на бодови) * 100, на екран да се испечати која
оценка ја добил студентот, доколку се внесе поголем број на поени од максималниот
број соодветно да се постапи.  */
import java.util.Scanner;
public class OcenkaStudent {

	public static void main(String[] args) {
		double maxP=0, osvP=0, procent=0;
		System.out.println("Vnesi maksimum bodovi koi moze da se osvojat na testot\n");
		Scanner tastatura =new Scanner(System.in);
		maxP=tastatura.nextDouble();
		System.out.println("Vnesi osvoeni bodovi\n");
		osvP=tastatura.nextDouble();
		procent=(osvP/maxP)*100;
		System.out.println("osvoeni se "+osvP+" od "+ maxP+" znaci ima "+procent+"%");
		if(osvP>maxP) {
			System.out.println("Osvoeni se povekje od maksimalnata kolicina bodovi");
			System.exit(0);
			}
		if(procent<51){
			System.out.println("studentot padnal");
			
		} else if(procent<=60 && procent >=51){
			System.out.println("studentot dobil 6");
			
		}else if(procent<=70 && procent >=61){
			System.out.println("studentot dobil 7");
			
		}else if(procent<=80 && procent >=71){
			System.out.println("studentot dobil 8");
			
		}else if(procent<=90 && procent >=81){
			System.out.println("studentot dobil 9");
			
		}else if(procent>90 && procent <=100){
			System.out.println("studentot dobil 10");
			
		}
		
	}

}
