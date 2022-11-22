public class Tuntiviisari {

    private int tunti;

    public Tuntiviisari(int tunti) {
        this.tunti = tunti;
    }

    public Object clone() {
        //matalakopio:
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }


    @Override
    public String toString() {
        return "" + tunti;
    }

}
