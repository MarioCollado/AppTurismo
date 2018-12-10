package google.login.turismo.appturismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class activity_transporte extends AppCompatActivity {

    ListView listaTrans;
    ArrayList<datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte);

        listaTrans = (ListView) findViewById(R.id.lstDatosTrans);

        Lista = new ArrayList<datos>();

        Lista.add(new datos("Autobus","Existen tres paradas de ALSA a lo largo de la carretera principal del pueblo."
                ,R.drawable.autobus,1));
        Lista.add(new datos("Taxi","Av. Prudencio González, 2, 33424 Posada"
                ,R.drawable.taxi,2));

        Adaptador miadaptador = new Adaptador(getApplicationContext(), Lista);

        listaTrans.setAdapter(miadaptador);

        listaTrans.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
