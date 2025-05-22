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
		// validate grid - fix grid logic
		for (int i = 0; i < board.length; i += 3) {
			List<Character> gridVal = new ArrayList<>();
			for (int row = i; row <= i + 2; row++) {

				for (int col = i; col <= i + 2; col++) {
					if (gridVal.contains(board[col][row])) {
						return false;
					}
					if (board[col][row] != '.') {
						gridVal.add(board[col][row]);
					}
				}
			}
			System.out.println("grid = " + gridVal.toString());

		}
		return true;
	}
}
