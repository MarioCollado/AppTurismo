package google.login.turismo.appturismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class activity_gastronomia extends AppCompatActivity {

    ListView listaGastro;
    ArrayList<datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastronomia);

        listaGastro = (ListView) findViewById(R.id.lstDatosGastro);

        Lista = new ArrayList<datos>();

            Lista.add(new datos("Peñamea","Guyame N 43, 33425 Llanera"
                    ,R.drawable.penamea,1));
            Lista.add(new datos("El Roxu","Av. Prudencio González, 83, 33424"
                    ,R.drawable.roxu,2));
            Lista.add(new datos("La Corriquera","Av. Oviedo, 19, 33424 Posada"
                    ,R.drawable.corriquera,3));
            Lista.add(new datos("Sidreria La Sierra","Av. Prudencio González, 11, 33424 Posada"
                    ,R.drawable.sierra,4));

        Adaptador miadaptador = new Adaptador(getApplicationContext(), Lista);

        listaGastro.setAdapter(miadaptador);

        listaGastro.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
