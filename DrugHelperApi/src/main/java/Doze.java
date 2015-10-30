/**
 * Created by Ariel Isaac Machado on 30/10/15.
 */
public class Doze {
    private double minDoze;
    private double maxDoze=0.0;


    public void setMaxDoze(double maxDoze) {
        this.maxDoze = maxDoze;
    }

    public void setMinDoze(double minDoze) {
        this.minDoze = minDoze;
    }

    public String sendDoze(String type){
        if (maxDoze != 0.0){
            return "La dosis recomendada es de "+ minDoze + " "+ type +" y de "+ maxDoze+" "+ type;
        }
        return "La dosis recomendada es de "+ maxDoze+" "+ type;

    }


}
