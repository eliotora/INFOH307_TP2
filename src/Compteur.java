public class Compteur {
    private int value;

    public int getValue(){
        return value;
    }

    public void setValue(int n) {
        value = n;
    }

    Compteur() {
        this.value = 0;
    }


    public int count() {
        return ++this.value;
    }
}
