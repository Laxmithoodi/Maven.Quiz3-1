package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {

        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[board.length];
        for (int row = 0; row < board.length; row++) {
            column[row] = board[row][value];
            
        }

        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);

        return allValuesTheSame(row);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        return allValuesTheSame(column);
    }

    private Boolean allValuesTheSame(String[] row) {
        for (int i = 1; i < row.length; i++) {
            if (!row[i].equals(row[0])) {
                return false;
            }
        }

        return true;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
