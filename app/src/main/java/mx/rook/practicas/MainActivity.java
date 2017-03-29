package mx.rook.practicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private final String GRETTER = "Hola desde el otro lado!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activar flecha ir atras
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        //forzar y cargar icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_rook);

        btn = (Button) findViewById(R.id.buttonMain);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_LONG).show();
                //Acceder al segundo activity y mandarle un string

                Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("gretter", GRETTER);
                startActivity(intent);
            }
        });
    }
}
