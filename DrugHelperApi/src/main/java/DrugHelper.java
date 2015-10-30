import java.util.HashMap;

import static spark.Spark.get;

/**
 * Created by Ariel Isaac Machado on 30/10/15.
 */
public class DrugHelper {
    public static void main(String[] args) {
        get("/helper/*/*/", (req, res) ->
                getDoze(req.splat()[0], Integer.parseInt(req.splat()[1]))
        );
    }

    public static String getDoze(String drugName, int weight){
        HashMap<String, Drug> drugs = getDrugs();
        Drug drug = drugs.get(drugName);
        Doze doze = new Doze();

        if (drug.getDozeQuantity().length>1){
            doze.setMaxDoze(calculateDoze(drug.getDozeQuantity()[1], weight, drug.getLapse()[0], drug.getPresentation()));
        }
        doze.setMinDoze(calculateDoze(drug.getDozeQuantity()[0], weight, drug.getLapse()[0], drug.getPresentation()));


        return doze.sendDoze(drug.getDoze());
    }
    public static double calculateDoze(int quantity, int  weight, int lapse, double presentation){
        return (quantity*weight/(24/lapse)*presentation);
    }

    public static HashMap<String, Drug> getDrugs(){
        HashMap<String, Drug> drugs = new HashMap<>();
        drugs.put("Cefalexina", new Drug(new int[]{6}, "ml", new int[]{25, 50},(double) 5/250));
        drugs.put("Ranitidina", new Drug(new int[]{12}, "ml", new int[]{3, 5},(double) 5/75));
        return drugs;
    }
}
