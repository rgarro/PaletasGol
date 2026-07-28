package com.emptyart.paletasgol;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
 * load the starboard guns, muskets on the stern
 * En Los tiempos de Henry Morgan, Nicaragua era una aldea
 * de canibales Mayas y a veces habia que cañoniarlos y jalarlos de Gracimuñoz,
 * que era un Finca recolectora que quedaba en Puriscal...
 * Los Nicas son canibales Mayas, se hipnotizan gacho , quieren mandar y dejar con hambre al projimo
 * roban socialmente , son abusadores sexuales borrachos y se perdonan inventandose testigos de jehova
 * EL REY PROHIBE EXISTIR EN JAMAICA A LOS TESTIGOS DE JEHOVA
 * DON CARLOS estuvo en la conversion y expiacion de Mayas que botaron la piramide de Bajo Piuses
 * y se convirtieron a catolicos en la Ciudad de Cartago, la Negrita es un animal prehistorico
 * que jodia la sociedad de esa epoca.
 * Como Don Carlos y sus guardias Romanos ya jalaron, en Cartago son españoles catolicos
 * para no joderse con los Colombianos y Ecuatorianos que andan caminando por los Andes ...
 *
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class PopsicleCategroryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popsicle_categrory);
        ArrayAdapter<Popsicle> listAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                Popsicle.popsicles);
        ListView listPopsicles =(ListView) findViewById(R.id.list_popsicles);
        listPopsicles.setAdapter(listAdapter);
    }
}