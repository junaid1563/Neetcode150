package dsa.array;

import java.util.ArrayList;
import java.util.List;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		// validate rows
		for (int row = 0; row < board.length; row++) {
			List<Character> rowVal = new ArrayList<>();
			List<Character> colVal = new ArrayList<>();
			for (int col = 0; col < board[row].length; col++) {
				if (rowVal.contains(board[row][col])) {
					return false;
				}
				if (board[row][col] != '.') {

					rowVal.add(board[row][col]);
				}
				if (colVal.contains(board[col][row])) {
					return false;
				}
				if (board[col][row] != '.') {
					colVal.add(board[col][row]);
				}
			}
		}
		// validate grid
		for (int i = 0; i < board.length; i += 3) {
			List<Character> gridVal = new ArrayList<>();
			for (int j = 0; j < board[i].length; j += 3) {
				for (int row = i; row <= i + 2; row++) {
					for (int col = j; col <= j + 2; col++) {
						if (gridVal.contains(board[row][col])) {
							return false;
						}
						if (board[row][col] != '.') {
							gridVal.add(board[row][col]);
						}
					}

				}
				// System.out.println("grid = " + gridVal.toString());
				gridVal = new ArrayList<>();

			}

		}
		return true;
	}
}
