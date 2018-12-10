package google.login.turismo.appturismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class activity_alojamiento extends AppCompatActivity {

    ListView listaAlojamientos;
    ArrayList<datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alojamiento);

        listaAlojamientos = (ListView) findViewById(R.id.lstDatosAloj);

        Lista = new ArrayList<datos>();

        Lista.add(new datos("Hotel Royal","La Miranda, 46, 33480"
                ,R.drawable.hotel_royal,1));

        Adaptador miadaptador = new Adaptador(getApplicationContext(), Lista);

        listaAlojamientos.setAdapter(miadaptador);

        listaAlojamientos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                datos obj = (datos) parent.getItemAtPosition(position);

                Intent paso =new Intent(getApplicationContext(), Detalles.class);
                paso.putExtra("Objeto", (Serializable) obj);
                startActivity(paso);
            }
        });
    }
}
