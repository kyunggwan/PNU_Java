package SelfStudy;
//행렬 
public class Practicearr {

	public static void main(String[] args) {
	
		int [][]a;
		int [][]b;
		int [][]c;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				for(int k=0; k<a.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;

	}

}
