public class Player {
    private String name;
    private String team;

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getTeam(){
        return team;
    }

    public void setTeam(String t){
        this.team = t;
    }

    public boolean isSameTeam(Player p) {
        if (p != null && p.team != null && this.team != null) {
            return p.team.equals(this.team);
        }
        return false;
    }
}
