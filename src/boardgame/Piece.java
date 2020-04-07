package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // Peça ainda não posta no tabuleiro
	}

	protected Board getBoard() {
		return board;
	}

}
