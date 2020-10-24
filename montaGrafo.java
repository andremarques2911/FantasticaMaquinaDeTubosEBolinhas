int columnSize = Integer.parseInt(linhaVtr[0]);
int rowSize = Integer.parseInt(linhaVtr[1]);	
int[] contCanos = new int[columnSize];
G = new GrafoDir(columnSize, rowSize);

linha = br.readLine();
while(linha != null) {
	linhaVtr = linha.split(" ");
	G.InsereAresta(
		Integer.parseInt(linhaVtr[0]), 
		Integer.parseInt(linhaVtr[1]), 
		Integer.parseInt(linhaVtr[2]),
		Integer.parseInt(linhaVtr[3])
	);
	linha = br.readLine();
}
int canoAtual = 0;