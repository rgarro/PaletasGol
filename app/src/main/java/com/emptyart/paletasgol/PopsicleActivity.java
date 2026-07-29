package com.emptyart.paletasgol;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
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
public class PopsicleActivity extends AppCompatActivity {

    public static final String EXTRA_POPSICLEID ="popsicleId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popsicle);
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