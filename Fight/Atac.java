package enums;

import java.util.Random;

public enum Atac {

    PUMN(50),
    PICIOR(100),
    ARMA(250);

    int damage;

    Atac(int damage) {
        this.damage = damage;
    }

    public int damage(){
        return this.damage = AtacFactory.atacGenerat().damage;
    }

}
