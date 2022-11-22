public class Minuuttiviisari {
    private int minuutti;

    public Minuuttiviisari(int minuutti) {
        this.minuutti = minuutti;
    }

    public Object clone() {
        //matalakopio:
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String toString() {
        return "" + minuutti;
    }
}
