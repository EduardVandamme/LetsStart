package be.vives.ti;

public class StringProccesor {
    /**
     * Voegt de suffix toe aan het einde van str als str nog niet eindigt met de suffix
     * */
    public String appendIfMissing(String str, String suffix){
        if(str.endsWith(suffix)){
            return str;
        }
        else {

            int i = 0;
            return str+suffix;



        }
    }
}

