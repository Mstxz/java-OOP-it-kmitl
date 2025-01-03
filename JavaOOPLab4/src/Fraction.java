public class Fraction {
    public int btmN;
    public int topN;

    public void addFraction(Fraction f) {
        this.topN = this.topN * f.btmN + f.topN * this.btmN;
        this.btmN = this.btmN * f.btmN;
    }

    public String toFloat() {
        return String.valueOf((double) topN / btmN);
    }

    public String toFraction() {
        return topN + "/" + btmN;
    }
}
