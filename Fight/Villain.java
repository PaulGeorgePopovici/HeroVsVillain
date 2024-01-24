package enums;

public class Villain {

    String nume;
    int health;
    StringBuilder history;

    public Villain(String nume, int health) {
        this.nume = nume;
        this.health = health;
        this.history = new StringBuilder();
    }

    public void atac(Erou erou) {
        while (erou.health > 0) {
            Atac atac = AtacFactory.atacGenerat();
            erou.health -= atac.damage;
            System.out.println("Villain-ul " + this.nume + " a atacat eroul " + erou.nume + " cu " + atac.name() + " si i-a dat "
                    + atac.damage + " damage,lasandu-l cu " + erou.health + " viata.");
            history.append(modAtac() + " ");
        }
    }

    public Atac modAtac() {
        return Atac.valueOf(AtacFactory.atacGenerat().name());
    }

    @Override
    public String toString() {
        return "Villain{" +
                "nume='" + nume + '\'' +
                ", health=" + health +
                ", history=" + history +
                '}';
    }
}
