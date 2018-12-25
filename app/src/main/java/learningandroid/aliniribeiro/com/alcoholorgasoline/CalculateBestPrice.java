package learningandroid.aliniribeiro.com.alcoholorgasoline;

/**
 * Created by Alini on 25/03/2017.
 */

public class CalculateBestPrice {

    public String bestPrice(String alcoholPrice, String gasolinePrice) {

        if (!alcoholPrice.isEmpty() && !gasolinePrice.isEmpty()) {

            Double alcoholPriceD = Double.parseDouble(alcoholPrice);
            Double gasolinePriceD = Double.parseDouble(gasolinePrice);
            Double betterPrice = alcoholPriceD / gasolinePriceD;

            if (betterPrice >= 0.7) {
                return "gasolina";
            } else {
                return "álcool";
            }
        }
        return null;
    }
}
