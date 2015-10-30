/**
 * Created by Ariel Isaac Machado on 30/10/15.
 */
public class Drug {

    private int [] lapse;
    private String doze;
    private int [] dozeQuantity;
    private double presentation;

    public double getPresentation() {
        return presentation;
    }


    public Drug (int [] lapse, String doze, int [] dozeQuantity, double presentation){
        this.lapse = lapse;
        this.doze = doze;
        this.dozeQuantity = dozeQuantity;
        this.presentation = presentation;
    }

    public String getDoze() {
        return doze;
    }

    public int[] getLapse() {
        return lapse;
    }

    public int[] getDozeQuantity() {
        return dozeQuantity;
    }

}
