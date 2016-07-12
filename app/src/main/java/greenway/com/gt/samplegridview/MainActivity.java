package greenway.com.gt.samplegridview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.gridView = (GridView) findViewById(R.id.grid);
        this.gridView.setOnItemClickListener(this);
        this.Adaptador(this.getItems());
    }

    public void Adaptador(ArrayList<Item> data){
            this.gridView.setAdapter(new Adapter(this, R.layout.item_grid, data) {
                @Override
                public void onEntrada(Object entrada, View view) {
                    if (entrada!=null){

                        Item tmp = (Item) entrada;

                        ImageView imageView = (ImageView) view.findViewById(R.id.iconItemGrid);
                        TextView  textView  = (TextView)  view.findViewById(R.id.titleItemGrid);

                        //Aqui debemos implementar la descarga con picasso
                        //tomando la url que viene en tmp.getIcon();
                        //imageView.setImageBitmap = ***PICASSO***
                        textView.setText(tmp.getTitle());

                    }
                }
            });
    }

    //este metodo devuelve un ArrayList de los datos que deberian ser descargados de internet
    //desde parse
    private ArrayList<Item> getItems(){
        ArrayList<Item> tmp = new ArrayList<Item>();

        //cada elemento contiene un titulo y una url de la imagen ;)
        tmp.add(new Item("nombre1","url1"));
        tmp.add(new Item("nombre2","url1"));
        tmp.add(new Item("nombre3","url1"));
        tmp.add(new Item("nombre4","url1"));
        tmp.add(new Item("nombre5","url1"));
        tmp.add(new Item("nombre6","url1"));
        tmp.add(new Item("nombre7","url1"));
        tmp.add(new Item("nombre8","url1"));
        tmp.add(new Item("nombre9","url1"));
        tmp.add(new Item("nombre10","url1"));
        tmp.add(new Item("nombre11","url1"));
        tmp.add(new Item("nombre12","url1"));
        tmp.add(new Item("nombre13","url1"));
        tmp.add(new Item("nombre14","url1"));
        tmp.add(new Item("nombre15","url1"));

        return tmp;

    }

    //Si el usuario presiona click en algun elemento de la galeria
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Item tmp = (Item) parent.getItemAtPosition(position);
        Toast.makeText(MainActivity.this, tmp.getTitle(), Toast.LENGTH_SHORT).show();
    }



}
