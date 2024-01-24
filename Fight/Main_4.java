package enums;

public class Main_4 {

    public static void main(String[] args) {

        Erou erou = new Erou("Superman",500);
        Villain villain = new Villain("Brainiac",500);

        erou.atac(villain);
        villain.atac(erou);

        System.out.println(erou.history);
        System.out.println(villain.history);

    }
}
