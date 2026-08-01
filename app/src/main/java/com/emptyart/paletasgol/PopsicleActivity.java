package com.emptyart.paletasgol;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.app.Activity;
/**
 *            |    |    |
 *           )_)  )_)  )_)
 *          )___))___))___)\
 *         )____)____)_____)\\
 *      _____|____|____|____\\\__
 * -------\                   /---------
 *     ^^^^^ ^^^^^^^^^^^^^^^^^^^^^
 *     ^^^^      ^^^^     ^^^    ^^
 *           ^^^^      ^^^
 * Sir Henry Morgan is de Lord of Talamanca
 *
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class PopsicleActivity extends Activity {

    public static final String EXTRA_POPSICLEID ="popsicleId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popsicle);
        final Button button = findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Pagaron La Paleta y La Hagarraron ,como operador del android luego haga click en este boton
                //Mientras Pagan les logea en Helado en el Posgre Connect que es de logo de elefante comiendo helado
                Log.d("123 probando","123 probando");
                //La Paleta aumento la caja y fue probada el sabor y la satisfaccion quedan en la mente
                // casi sacado del Manual de PNL de la Policia de Videla!! Falklands are British y a mi videla no me hipnotiza
                // ocupo hecharle esta hablada a unos financiados del INCAE a ver si me gano algo y me voy a California
                //En california me hago un Swift haciendo tally pasando swift creek por donde un pino se cayo
            }
        });
        //get the popsicle from the intent
        int popsicleId = (Integer) getIntent().getExtras().get(EXTRA_POPSICLEID);
        Popsicle popsicle = Popsicle.popsicles[popsicleId];
        //populate the popsicle name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(popsicle.getName());
        //populate popsicle description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(popsicle.getDescription());
        //populate the popsicle image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(popsicle.getImageResourceId());
        photo.setContentDescription(popsicle.getName());
    }
}