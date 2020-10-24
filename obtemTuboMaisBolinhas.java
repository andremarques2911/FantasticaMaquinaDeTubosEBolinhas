int maior = 0;
int qtdMaior = 0;
for (int i = 0; i < contCanos.length; i++) {
	if(contCanos[i] > qtdMaior) {
		maior = i;
		qtdMaior = contCanos[i];
	}
}