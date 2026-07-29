package com.emptyart.paletasgol;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;
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
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class PopsicleCategroryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popsicle_categrory);
        ArrayAdapter<Popsicle> listAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                Popsicle.popsicles);
        ListView listPopsicles =(ListView) findViewById(R.id.list_popsicles);
        listPopsicles.setAdapter(listAdapter);
        //create the listener
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listPopsicles, View itemView, int position, long id) {
                //Pass the drink the user clicks
                Intent intent = new Intent(PopsicleCategroryActivity.this,Popsicle.class);
                intent.putExtra(PopsicleActivity.EXTRA_POPSICLEID,(int) id);
                startActivity(intent);
            }
        };
        //Assign the listener to the list view
        listPopsicles.setOnItemClickListener(itemClickListener);
    }
}