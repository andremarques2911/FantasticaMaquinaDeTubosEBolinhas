import java.util.Scanner;
import java.io.*;

public class GDirTest {

private static String[] vetStr;

public static void main( String[] args ) {
	GrafoDir G;
	File arquivo = new File("./casos/cohen/caso8.txt");
	try {
		double ant = System.currentTimeMillis(); 
		
		FileReader fr = new FileReader(arquivo);
		BufferedReader br = new BufferedReader(fr);
		String linha = br.readLine();
		String[] linhaVtr = linha.split(" ");
		
		int columnSize = Integer.parseInt(linhaVtr[0]);
		int rowSize = Integer.parseInt(linhaVtr[1]);	
		int[] contCanos = new int[columnSize];
		G = new GrafoDir(columnSize, rowSize);

		linha = br.readLine();
		while(linha != null) {
			linhaVtr = linha.split(" ");
			G.InsereAresta(Integer.parseInt(linhaVtr[0]), Integer.parseInt(linhaVtr[1]), Integer.parseInt(linhaVtr[2]), Integer.parseInt(linhaVtr[3]));
			linha = br.readLine();
		}
		int canoAtual = 0;
		
		Tupla[][] matAdj = G.getMatAdj();
		int canosContador = 0;
		int contI = 0;
		int contJ = 0;
		while( canosContador < columnSize ) {
			contI = canosContador;
			canoAtual = canosContador;
			while( contJ < rowSize ) {
				Tupla coord = matAdj[contI][contJ];
				if( coord != null ) {
					canoAtual = coord.getCano();
					contI = coord.getCano();
					contJ = coord.getLinha();
				} else {
					contJ++;
				}
			}
			contCanos[canoAtual]++;
			contJ = 0;
			canosContador++;
		}
		
		int maior = 0;
		int qtdMaior = 0;
		for (int i = 0; i < contCanos.length; i++) {
			if(contCanos[i] > qtdMaior) {
				maior = i;
				qtdMaior = contCanos[i];
			}
		}
		
		double pos = System.currentTimeMillis();
		
		System.out.println("Cano: " + maior);
		System.out.println("Quantidade: " + qtdMaior);
		
		double res = pos - ant;
		System.out.println("Tempo: " + res);
		br.close();
		fr.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}
}