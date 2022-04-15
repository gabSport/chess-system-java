package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board; // uma partida de xadrez tem que ter um tabuleiro(board).
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j); // DOWNCASTING para ChessPiece para ele interpretar que � uma pe�a de xadrez.
			}
		}
		return mat;
	}
}
