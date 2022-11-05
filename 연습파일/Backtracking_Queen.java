package Queen8;

public class Backtracking_Queen {
	public static void SolveQueen(int[][] d) {
		int count = 0;
		int ix, iy;
		QueenStack st = new QueenStack(8);

		
		// 퀸을 모든 행에 배치할 동안
		while ( count< d[0].length) {
			// 0행부터 검사하겠다
			ix = 0;
			iy = count;
			// iy열의 행ix 1행, 2행, 3행들을 다 검사 하겠다.
			while (ix < d.length) {
				Point px = new Point(ix, iy);
				
				// 체크해서 가능하면
				if (CheckMove(d, ix, iy)) {
					d[ix][iy] = 1;
					st.push(px);
					count++;
					ix++;
				} else { // 체크해서 가능하지 않으면
					iy++; // 다음 열을 검사한다.
				}

				// 만약 ix가 범위를 벗어나게 되면
				if (iy >= d[0].length) {
					px = st.pop(); // 스택에서 이전 위치를 팝하고

					ix = px.getX();
					iy = px.getY(); // 좌표를 돌려놓고,
					d[ix][iy] = 0; // 이전 위치 데이터 삭제
					iy++; // 다음 위치를 검사
					break;

				}
				if (ix == d.length) {
					px = st.pop();
					ix = px.getX();
					iy = px.getY();
					d[ix][iy] = 0;
					iy++; // 행의 끝까지 가버리면 다음 열로 가라
				}
				System.out.println("무한 루프 00");
			}
			System.out.println("무한 루프1");
		}

		System.out.println("무한루프 2222222");
		System.out.println("카운트 = " + count);
	}

	// row를 검사함. 왼쪽, 오른쪽을 검사
	public static boolean checkRow(int[][] d, int crow) {

		for (int i = 0; i < d.length; i++) {
			if (d[crow][i] == 1) {
				return false;
			}
		}

		return true;
	}

	// col을 검사. 위, 아래를 검사
	public static boolean checkCol(int[][] d, int ccol) {

		for (int i = 0; i < d[0].length; i++) {
			if (d[i][ccol] == 1) {
				return false;
			}
		}
		return true;
	}

	// 왼쪽 위쪽 대각선을 검사
	public static boolean checkDiagSW(int[][] d, int cx, int cy) { // x++, y-- or x--, y++ where 0<= x,y <= 7

		while (cx >= 0 && cx < d.length && cy >= 0 && cy < d[0].length) {

			if (d[cx][cy] == 1) {
				return false;
			}
			cx--;
			cy--;
		}

		return true;
	}

	// 오른쪽 위쪽 대각선을 검사
	public static boolean checkDiagSE(int[][] d, int cx, int cy) {// x++, y++ or x--, y--

		while (cx >= 0 && cx <= d.length && cy >= 0 && cy <= d[0].length) {

			if (d[cx][cy] == 1) {
				return false;
			}
			cx--;
			cy++;
		}

		return true;
	}

	// 양옆, 위아래, 대각선에 1이 없으면 True를 반환한다
	public static boolean CheckMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check
		if (checkRow(d, x) && checkCol(d, y) && checkDiagSW(d, x, y) && checkDiagSE(d, x, y))
			return true;

		return false;

	}

	public static void main(String[] args) {
		int row = 4, col = 4;
		int[][] data = new int[4][4];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;

		SolveQueen(data);

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}
