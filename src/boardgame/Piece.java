package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece() {
		super();
	}

	public Piece(Board board) { // pra criar uma peça temos que informar o Board(tabuleiro).
		this.board = board;
		position = null; // posicao da peca recem criada tem que ser null.
	}

	protected Board getBoard() { // O tabuleiro associado a uma peca so pode ser acessado pelo pacote boardgame e pela subclasses de pecas.
		return board;
	}
}
