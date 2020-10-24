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