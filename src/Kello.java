public class Kello implements Cloneable{

    private Tuntiviisari tuntiviisari;
    private Minuuttiviisari minuuttiviisari;

    public Kello(int tunti, int minuutti) {
        tuntiviisari = new Tuntiviisari(tunti);
        minuuttiviisari = new Minuuttiviisari(minuutti);

    }

    public void setTuntiviisari(int tunti) {
        tuntiviisari = new Tuntiviisari(tunti);
    }

    public void setMinuuttiviisari(int minuutti) {
        minuuttiviisari = new Minuuttiviisari(minuutti);
    }

    public String getAika() {
        return "Kello on : " + tuntiviisari + ":" + minuuttiviisari;
    }


    @Override
    /*
    public Object clone() throws CloneNotSupportedException{
    //syväkopio:
        Kello s = null;
        try {
            s = (Kello)super.clone();
            s.minuuttiviisari = (Minuuttiviisari) minuuttiviisari.clone();
            s.tuntiviisari = (Tuntiviisari) tuntiviisari.clone();
        } catch (CloneNotSupportedException e) {}
        return s;

    }

     */


    public Object clone() {
    //matalakopio:
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }



}
