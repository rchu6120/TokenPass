public class TokenPass {
    private int[] board;
    private int currentPlayer;
    private int playerCount;
    public TokenPass(int playerCount) {
        this.board = new int[playerCount];
        for (int i = 0; i < playerCount; i++) {
            this.board[i] = (int)(Math.random() * 10) + 1;
        }
        this.currentPlayer = (int)(Math.random() * playerCount);
        this.playerCount = playerCount;
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
    public void nextPlayer() {
        currentPlayer++;
        currentPlayer = currentPlayer % playerCount;
    }
    public void printBoard() {
        for (int i = 0; i < playerCount; i++) {
            System.out.print("Player " + i + ": " + board[i] + " " );
        }
        System.out.println("\n" + "Current Player: " + currentPlayer);
    }
    public int gameOver() {
        int result = -1;
        for (int i = 0; i < board.length; i++) {
            if (board[i] == 0) {
                result = i;
            }
        }
        return result;
    }
}
