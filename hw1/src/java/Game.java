package java;

public class Game {

    private Player[] field = {
            null, null, null, null, null,
            null, null, null, null, null,
            null, null, null, null, null,
            null, null, null, null, null,
            null, null, null, null, null
    };

    public Player currentPlayer;

    public boolean hasWinner() {

        return
                (field[0] == currentPlayer && field[1] == currentPlayer && field[2] == currentPlayer)
                        || (field[1] == currentPlayer && field[2] == currentPlayer && field[3] == currentPlayer)
                        || (field[2] == currentPlayer && field[3] == currentPlayer && field[4] == currentPlayer)

                        || (field[5] == currentPlayer && field[6] == currentPlayer && field[7] == currentPlayer)
                        || (field[6] == currentPlayer && field[7] == currentPlayer && field[8] == currentPlayer)
                        || (field[7] == currentPlayer && field[8] == currentPlayer && field[9] == currentPlayer)

                        || (field[10] == currentPlayer && field[11] == currentPlayer && field[12] == currentPlayer)
                        || (field[11] == currentPlayer && field[12] == currentPlayer && field[13] == currentPlayer)
                        || (field[12] == currentPlayer && field[13] == currentPlayer && field[14] == currentPlayer)

                        || (field[15] == currentPlayer && field[16] == currentPlayer && field[17] == currentPlayer)
                        || (field[16] == currentPlayer && field[17] == currentPlayer && field[18] == currentPlayer)
                        || (field[17] == currentPlayer && field[18] == currentPlayer && field[19] == currentPlayer)

                        || (field[20] == currentPlayer && field[21] == currentPlayer && field[22] == currentPlayer)
                        || (field[21] == currentPlayer && field[22] == currentPlayer && field[23] == currentPlayer)
                        || (field[22] == currentPlayer && field[23] == currentPlayer && field[24] == currentPlayer)


                        || (field[0] == currentPlayer && field[5] == currentPlayer && field[10] == currentPlayer)
                        || (field[5] == currentPlayer && field[10] == currentPlayer && field[15] == currentPlayer)
                        || (field[10] == currentPlayer && field[15] == currentPlayer && field[20] == currentPlayer)

                        || (field[1] == currentPlayer && field[6] == currentPlayer && field[11] == currentPlayer)
                        || (field[6] == currentPlayer && field[11] == currentPlayer && field[16] == currentPlayer)
                        || (field[11] == currentPlayer && field[16] == currentPlayer && field[21] == currentPlayer)

                        || (field[2] == currentPlayer && field[7] == currentPlayer && field[12] == currentPlayer)
                        || (field[7] == currentPlayer && field[12] == currentPlayer && field[17] == currentPlayer)
                        || (field[12] == currentPlayer && field[17] == currentPlayer && field[22] == currentPlayer)

                        || (field[3] == currentPlayer && field[8] == currentPlayer && field[13] == currentPlayer)
                        || (field[8] == currentPlayer && field[13] == currentPlayer && field[18] == currentPlayer)
                        || (field[13] == currentPlayer && field[18] == currentPlayer && field[23] == currentPlayer)

                        || (field[4] == currentPlayer && field[9] == currentPlayer && field[14] == currentPlayer)
                        || (field[9] == currentPlayer && field[14] == currentPlayer && field[19] == currentPlayer)
                        || (field[14] == currentPlayer && field[19] == currentPlayer && field[24] == currentPlayer)

                        || (field[0] == currentPlayer && field[6] == currentPlayer && field[12] == currentPlayer)
                        || (field[1] == currentPlayer && field[7] == currentPlayer && field[13] == currentPlayer)
                        || (field[2] == currentPlayer && field[8] == currentPlayer && field[14] == currentPlayer)

                        || (field[5] == currentPlayer && field[11] == currentPlayer && field[17] == currentPlayer)
                        || (field[6] == currentPlayer && field[12] == currentPlayer && field[18] == currentPlayer)
                        || (field[7] == currentPlayer && field[13] == currentPlayer && field[19] == currentPlayer)

                        || (field[10] == currentPlayer && field[16] == currentPlayer && field[22] == currentPlayer)
                        || (field[11] == currentPlayer && field[17] == currentPlayer && field[23] == currentPlayer)
                        || (field[12] == currentPlayer && field[18] == currentPlayer && field[24] == currentPlayer)

                        || (field[4] == currentPlayer && field[8] == currentPlayer && field[12] == currentPlayer)
                        || (field[3] == currentPlayer && field[7] == currentPlayer && field[11] == currentPlayer)
                        || (field[2] == currentPlayer && field[6] == currentPlayer && field[10] == currentPlayer)

                        || (field[9] == currentPlayer && field[13] == currentPlayer && field[17] == currentPlayer)
                        || (field[8] == currentPlayer && field[12] == currentPlayer && field[16] == currentPlayer)
                        || (field[7] == currentPlayer && field[11] == currentPlayer && field[15] == currentPlayer)

                        || (field[14] == currentPlayer && field[18] == currentPlayer && field[22] == currentPlayer)
                        || (field[13] == currentPlayer && field[17] == currentPlayer && field[21] == currentPlayer)
                        || (field[12] == currentPlayer && field[16] == currentPlayer && field[20] == currentPlayer)

                ||(field[0] == currentPlayer.opponent && field[1] == currentPlayer.opponent && field[2] == currentPlayer.opponent)
                || (field[1] == currentPlayer.opponent && field[2] == currentPlayer.opponent && field[3] == currentPlayer.opponent)
                || (field[2] == currentPlayer.opponent && field[3] == currentPlayer.opponent && field[4] == currentPlayer.opponent)

                || (field[5] == currentPlayer.opponent && field[6] == currentPlayer.opponent && field[7] == currentPlayer.opponent)
                || (field[6] == currentPlayer.opponent && field[7] == currentPlayer.opponent && field[8] == currentPlayer.opponent)
                || (field[7] == currentPlayer.opponent && field[8] == currentPlayer.opponent && field[9] == currentPlayer.opponent)

                || (field[10] == currentPlayer.opponent && field[11] == currentPlayer.opponent && field[12] == currentPlayer.opponent)
                || (field[11] == currentPlayer.opponent && field[12] == currentPlayer.opponent && field[13] == currentPlayer.opponent)
                || (field[12] == currentPlayer.opponent && field[13] == currentPlayer.opponent && field[14] == currentPlayer.opponent)

                || (field[15] == currentPlayer.opponent && field[16] == currentPlayer.opponent && field[17] == currentPlayer.opponent)
                || (field[16] == currentPlayer.opponent && field[17] == currentPlayer.opponent && field[18] == currentPlayer.opponent)
                || (field[17] == currentPlayer.opponent && field[18] == currentPlayer.opponent && field[19] == currentPlayer.opponent)

                || (field[20] == currentPlayer.opponent && field[21] == currentPlayer.opponent && field[22] == currentPlayer.opponent)
                || (field[21] == currentPlayer.opponent && field[22] == currentPlayer.opponent && field[23] == currentPlayer.opponent)
                || (field[22] == currentPlayer.opponent && field[23] == currentPlayer.opponent && field[24] == currentPlayer.opponent)


                || (field[0] == currentPlayer.opponent && field[5] == currentPlayer.opponent && field[10] == currentPlayer.opponent)
                || (field[5] == currentPlayer.opponent && field[10] == currentPlayer.opponent && field[15] == currentPlayer.opponent)
                || (field[10] == currentPlayer.opponent && field[15] == currentPlayer.opponent && field[20] == currentPlayer.opponent)

                || (field[1] == currentPlayer.opponent && field[6] == currentPlayer.opponent && field[11] == currentPlayer.opponent)
                || (field[6] == currentPlayer.opponent && field[11] == currentPlayer.opponent && field[16] == currentPlayer.opponent)
                || (field[11] == currentPlayer.opponent && field[16] == currentPlayer.opponent && field[21] == currentPlayer.opponent)

                || (field[2] == currentPlayer.opponent && field[7] == currentPlayer.opponent && field[12] == currentPlayer.opponent)
                || (field[7] == currentPlayer.opponent && field[12] == currentPlayer.opponent && field[17] == currentPlayer.opponent)
                || (field[12] == currentPlayer.opponent && field[17] == currentPlayer.opponent && field[22] == currentPlayer.opponent)

                || (field[3] == currentPlayer.opponent && field[8] == currentPlayer.opponent && field[13] == currentPlayer.opponent)
                || (field[8] == currentPlayer.opponent && field[13] == currentPlayer.opponent && field[18] == currentPlayer.opponent)
                || (field[13] == currentPlayer.opponent && field[18] == currentPlayer.opponent && field[23] == currentPlayer.opponent)

                || (field[4] == currentPlayer.opponent && field[9] == currentPlayer.opponent && field[14] == currentPlayer.opponent)
                || (field[9] == currentPlayer.opponent && field[14] == currentPlayer.opponent && field[19] == currentPlayer.opponent)
                || (field[14] == currentPlayer.opponent && field[19] == currentPlayer.opponent && field[24] == currentPlayer.opponent)

                || (field[0] == currentPlayer.opponent && field[6] == currentPlayer.opponent && field[12] == currentPlayer.opponent)
                || (field[1] == currentPlayer.opponent && field[7] == currentPlayer.opponent && field[13] == currentPlayer.opponent)
                || (field[2] == currentPlayer.opponent && field[8] == currentPlayer.opponent && field[14] == currentPlayer.opponent)

                || (field[5] == currentPlayer.opponent && field[11] == currentPlayer.opponent && field[17] == currentPlayer.opponent)
                || (field[6] == currentPlayer.opponent && field[12] == currentPlayer.opponent && field[18] == currentPlayer.opponent)
                || (field[7] == currentPlayer.opponent && field[13] == currentPlayer.opponent && field[19] == currentPlayer.opponent)

                || (field[10] == currentPlayer.opponent && field[16] == currentPlayer.opponent && field[22] == currentPlayer.opponent)
                || (field[11] == currentPlayer.opponent && field[17] == currentPlayer.opponent && field[23] == currentPlayer.opponent)
                || (field[12] == currentPlayer.opponent && field[18] == currentPlayer.opponent && field[24] == currentPlayer.opponent)

                || (field[4] == currentPlayer.opponent && field[8] == currentPlayer.opponent && field[12] == currentPlayer.opponent)
                || (field[3] == currentPlayer.opponent && field[7] == currentPlayer.opponent && field[11] == currentPlayer.opponent)
                || (field[2] == currentPlayer.opponent && field[6] == currentPlayer.opponent && field[10] == currentPlayer.opponent)

                || (field[9] == currentPlayer.opponent && field[13] == currentPlayer.opponent && field[17] == currentPlayer.opponent)
                || (field[8] == currentPlayer.opponent && field[12] == currentPlayer.opponent && field[16] == currentPlayer.opponent)
                || (field[7] == currentPlayer.opponent && field[11] == currentPlayer.opponent && field[15] == currentPlayer.opponent)

                || (field[14] == currentPlayer.opponent && field[18] == currentPlayer.opponent && field[22] == currentPlayer.opponent)
                || (field[13] == currentPlayer.opponent && field[17] == currentPlayer.opponent && field[21] == currentPlayer.opponent)
                || (field[12] == currentPlayer.opponent && field[16] == currentPlayer.opponent && field[20] == currentPlayer.opponent);


    }

    public boolean boardFilledUp() {
        for (int i = 0; i < field.length; i++) {
            if (field[i] == null) {
                return false;
            }
        }
        return true;
    }

    public synchronized boolean legalMove(int location, Player player) {
        if (player == currentPlayer && field[location] == null) {
            if ((location >= 20) || ((location + 5 <= 24) && (field[location + 5] != null))) {
                field[location] = currentPlayer;
                currentPlayer = currentPlayer.opponent;
                currentPlayer.otherPlayerMoved(location);
                return true;
            }
        }
        return false;
    }

}
