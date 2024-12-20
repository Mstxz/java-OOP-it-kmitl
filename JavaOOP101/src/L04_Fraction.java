public class L04_Fraction {
    public int btmN;
    public int topN;

    public void addFraction(L04_Fraction F) {
        this.topN = this.topN * F.btmN + F.topN * this.btmN;
        this.btmN = this.btmN * F.btmN;
    }

    public String toFloat() {
        return String.valueOf((double) topN / btmN);
    }

    public String toFraction() {
        return topN + "/" + btmN;
    }
}
