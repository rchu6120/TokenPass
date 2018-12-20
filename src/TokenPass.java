public class TokenPass {
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount) {
        this.board = new int[playerCount];
        for (int i = 0; i < board.length; i++) {
            this.board[i] = (int)(Math.random() * 10) + 1;
        }
        this.currentPlayer = (int)(Math.random() * playerCount);
    }
    public void distributeCurrentPlayerTokens() {
        int nextPlayer = currentPlayer;
        int numToDistribute = board[currentPlayer];
        board[currentPlayer] = 0;
        while (numToDistribute > 0) {
            nextPlayer = (nextPlayer + 1) % board.length;
            board[nextPlayer]++;
            numToDistribute--;
        }
    }
    public int gameOver() {

    }
    public String printBoard() {
        while ()
    }
    public void nextPlayer() {
        currentPlayer++;
    }
}
