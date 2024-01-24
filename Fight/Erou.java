package enums;

public class Erou {

    String nume;
    int health;
    StringBuilder history;

    public Erou(String nume, int health) {
        this.nume = nume;
        this.health = health;
        this.history = new StringBuilder();
    }

    public void atac(Villain villain){
        while (villain.health > 0) {
            Atac atac = AtacFactory.atacGenerat();
            villain.health -= atac.damage;
            System.out.println("Eroul " + this.nume + " a atacat villain-ul " + villain.nume + " cu " + atac.name() + " si i-a dat "
                    + atac.damage + " damage,lasandu-l cu " + villain.health + " viata.");
            history.append(modAtac() + " ");

        }
    }

    public Atac modAtac(){
        return Atac.valueOf(AtacFactory.atacGenerat().name());
    }

    @Override
    public String toString() {
        return "Erou{" +
                "nume='" + nume + '\'' +
                ", health=" + health +
                ", history=" + history +
                '}';
    }
}
