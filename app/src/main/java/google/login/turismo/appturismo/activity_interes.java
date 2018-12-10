package google.login.turismo.appturismo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class activity_interes extends AppCompatActivity {

    ListView listaInteres;
    ArrayList<datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interes);

        listaInteres = (ListView) findViewById(R.id.lstDatosInt);

        Lista = new ArrayList<datos>();

            Lista.add(new datos("La Morgal","Lugar La Morgal, s/n, 33690 Llanera",
                    R.drawable.morgal,1));
            Lista.add(new datos("Picu Cogolla","33785, Asturias.",
                    R.drawable.montecogolla,2));
            Lista.add(new datos("Campo de futbol Pepe Quimarán","33424, Av. Prudencio González, 91, 33424",
                    R.drawable.pepequimaran,3));


        Adaptador miadaptador = new Adaptador(getApplicationContext(), Lista);

        listaInteres.setAdapter(miadaptador);

        listaInteres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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