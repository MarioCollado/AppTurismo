package google.login.turismo.appturismo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {

    Context contexto;
    List<datos>ListaObjetos;

    public Adaptador(Context contexto, List<datos> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        return ListaObjetos.size();//cantidad de elementos de listaObjetos
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId();//devuelve el id
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vista = convertView;

        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista = inflate.inflate(R.layout.elemento_lista,null);

        ImageView imagen = (ImageView) vista.findViewById(R.id.imagen);
        TextView titulo = (TextView) vista.findViewById(R.id.txt_titulo);
        TextView descripcion = (TextView) vista.findViewById(R.id.txt_des);

        titulo.setText(ListaObjetos.get(position).getTitulo().toString());
        descripcion.setText(ListaObjetos.get(position).getDescripcion().toString());
        imagen.setImageResource(ListaObjetos.get(position).getImgSitio());

        return vista;


    }
}
