package google.login.turismo.appturismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class activity_ocio extends AppCompatActivity {

    ListView listaOcio;
    ArrayList<datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocio);

        listaOcio = (ListView) findViewById(R.id.lstDatosOcio);

        Lista = new ArrayList<datos>();

        Lista.add(new datos("Escuela de musica","Calle Alejandro Mon, 9, 33424 Posada, Asturias"
                ,R.drawable.escuelamusica,1));
        Lista.add(new datos("Escuela de ceramica"," C / Alejandro Mon (posterior)"
                ,R.drawable.cermica202,2));
        Lista.add(new datos("Biblioteca","Avda. Prudencio González, 10"
                ,R.drawable.biblioteca20posada,3));
        Lista.add(new datos("Casa de la cultura","Avda. Prudencio Glez, 10. "
                ,R.drawable.cculturaposada,4));
        Lista.add(new datos("Polideportivo","Avda. Prudencio González, 85"
                ,R.drawable.polideportivo,5));

        Adaptador miadaptador = new Adaptador(getApplicationContext(), Lista);

        listaOcio.setAdapter(miadaptador);

        listaOcio.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
