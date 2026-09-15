package be.technifutur.libs;

public class Liste {
    private int value;
    private Liste suivant;

    public int getValue() {
        return this.value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setSuivant(Liste list) {
        this.suivant = list;
    }
    public Liste getSuivant() {
        return this.suivant;
    }
}