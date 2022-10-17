package algoritm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.util.stream.*;

public class InfiniteCoins {
	
	public static List<Dimes> listaDeDimes = new ArrayList<Dimes>();
	public static List<Nickels> listaDeNickels = new ArrayList<Nickels>();
	public static List<Pennies> listaDePennies= new ArrayList<Pennies>();
	public static List<Quarters> listaDeQuarters = new ArrayList<Quarters>();

	public static void MakeChange() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor = input.nextInt();
		
		
		for(Dimes aux : listaDeDimes) {
			if (aux.getCents() ) {
				listaDeDimes.add(valor);;
			}
			}
		
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
