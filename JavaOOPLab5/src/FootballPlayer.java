public class FootballPlayer extends Player {
    private int playerNumber;
    private String position;

    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPlayerNumber(int n) {
        this.playerNumber = n;
    }

    public void setPosition(String p) {
        this.position = p;
    }

    public boolean isSamePosition(FootballPlayer p){
            if (p != null && p.position != null && this.position != null) {
                return p.position.equals(this.position);
            }
            return false;
        }
}
