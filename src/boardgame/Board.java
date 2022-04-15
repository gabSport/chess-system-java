package boardgame;

public class Board {
	
	private Integer rows;
	private Integer columns;
	private Piece[][] pieces; // matriz de pecas

	public Board() {
		super();
	}

	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; //a matriz de pecas vai ser instanciada com piece na qtd de linhas e colunas informadas.
	}
	
	
}
