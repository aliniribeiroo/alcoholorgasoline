package learningandroid.aliniribeiro.com.alcoholorgasoline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import learningandroid.aliniribeiro.com.gasolinaoualcool.R;

public class MainActivity extends AppCompatActivity {

    private EditText alcohol;
    private EditText gasoline;
    private Button verify;
    private static final String KEY_TEXT_VALUE = "textValue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alcohol = (EditText) findViewById(R.id.alcoholId);
        gasoline = (EditText) findViewById(R.id.GasolineId);
        verify = (Button) findViewById(R.id.verifyId);


        alcohol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Preço do Álcool", Toast.LENGTH_SHORT).show();
            }
        });

        gasoline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Preço da Gasolina", Toast.LENGTH_SHORT).show();
            }
        });

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the data from the editTexts
                CalculateBestPrice bestPrice = new CalculateBestPrice();
                String bestPriceresponse = bestPrice.bestPrice(alcohol.getText().toString(), gasoline.getText().toString());
                if (bestPriceresponse != null){
                    Toast.makeText(getApplicationContext(), "A melhor escolha é abastecer com " + bestPriceresponse+".", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Você deve informar os valores para serem calculados.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
