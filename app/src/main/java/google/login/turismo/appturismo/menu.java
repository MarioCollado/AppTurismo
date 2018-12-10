package google.login.turismo.appturismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    private Button btninteres,btnocio,btngastro,btnser,btntrans,btnaloj,btnexit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btninteres =(Button)findViewById(R.id.btn_interes);

        btninteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten =new Intent(menu.this,activity_interes.class);
                startActivity(inten);
            }
        }); //Redirecciono al usuario a la pantalla de sitios de interes al pulsar este boton

        btnaloj =(Button)findViewById(R.id.btn_aloj);

        btnaloj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten1 =new Intent(menu.this,activity_alojamiento.class);
                startActivity(inten1);
            }
        }); //Redirecciono al usuario a la pantalla de alojamientos al pulsar este boton

        btnocio =(Button)findViewById(R.id.btn_ocio);

        btnocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten2 =new Intent(menu.this,activity_ocio.class);
                startActivity(inten2);
            }
        }); //Redirecciono al usuario a la pantalla de ocio y cultura al pulsar este boton

        btngastro =(Button)findViewById(R.id.btn_gast);

        btngastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten3 =new Intent(menu.this,activity_gastronomia.class);
                startActivity(inten3);
            }
        }); //Redirecciono al usuario a la pantalla de gastronomia al pulsar este boton

        btntrans =(Button)findViewById(R.id.btn_tran);

        btntrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten4 =new Intent(menu.this,activity_transporte.class);
                startActivity(inten4);
            }
        }); //Redirecciono al usuario a la pantalla de transportes al pulsar este boton

        btnser =(Button)findViewById(R.id.btn_serv);

        btnser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten5 =new Intent(menu.this,activity_servicios.class);
                startActivity(inten5);
            }
        }); //Redirecciono al usuario a la pantalla de servicios al pulsar este boton

        btnexit =(Button)findViewById(R.id.btn_exit);

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent inten6 = new Intent(Intent.ACTION_MAIN);
            inten6.addCategory(Intent.CATEGORY_HOME);
            inten6.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(inten6);
            System.exit(0);
            }
        }); //Cierro la aplicacion.


    }
}