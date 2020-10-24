import java.util.*;

public class GrafoDir {

  private Tupla [][] matAdj;

  public GrafoDir( int columnSize, int rowSize ) {
    matAdj = new Tupla [columnSize][rowSize];
  }

  public Tupla[][] getMatAdj() {
    return matAdj;
  }

  public void InsereAresta( 
		  int canoOrig,
		  int linhaOrig, 
		  int canoDdest, 
		  int linhaDest 
	  	) {
    if( canoOrig >= 0 
    		&& linhaOrig >= 0 
    		&& canoDdest >= 0 
    		&& linhaDest >= 0 )
      matAdj[canoOrig][linhaOrig] = new Tupla(canoDdest, linhaDest);
  }

}