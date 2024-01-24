package enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class AtacFactory {

    static Random generator = new Random();
    static ArrayList<Atac> listaAtac = new ArrayList<>(Arrays.asList(Atac.PUMN,Atac.PICIOR,Atac.ARMA));

    public static Atac atacGenerat(){
        return Atac.valueOf(String.valueOf(listaAtac.get(generator.nextInt(listaAtac.size()))));
    }
}
