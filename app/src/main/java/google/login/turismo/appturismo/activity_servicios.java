package google.login.turismo.appturismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class activity_servicios extends AppCompatActivity {

    ListView listaServicios;
    ArrayList<datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

        listaServicios = (ListView) findViewById(R.id.lstDatosServ);

        Lista = new ArrayList<datos>();

            Lista.add(new datos("Centro de Salud","Lugar Severies, s/n, 33424 Severies"
                    ,R.drawable.ambu,1));
            Lista.add(new datos("Ayuntamiento","Av. Prudencio González, 2, 33424 Posada"
                    ,R.drawable.ayto,2));
            Lista.add(new datos("IES Llanera","Calle Carrión, 21, 33424 Posada, Asturias"
                    ,R.drawable.ies,3));

            Adaptador miadaptador = new Adaptador(getApplicationContext(), Lista);

        listaServicios.setAdapter(miadaptador);

        listaServicios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
