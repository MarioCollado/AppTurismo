package google.login.turismo.appturismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {

    ImageView foto;
    TextView titulo,detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        foto = (ImageView) findViewById(R.id.imgFoto);
        titulo = (TextView) findViewById(R.id.txt_tituloDetalle);
        detalle = (TextView) findViewById(R.id.txt_descripcionDetalle);

        datos obj = (datos) getIntent().getExtras().getSerializable("Objeto");
        titulo.setText(obj.getTitulo());
        detalle.setText(obj.getDescripcion());
        foto.setImageResource(obj.getImgSitio());

    }
}
