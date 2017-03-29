package mx.rook.practicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private Button btnCompartir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //activar flecha ir atras
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        //forzar y cargar icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_rook);

        textView = (TextView) findViewById(R.id.textViewMain);
        btnCompartir = (Button) findViewById(R.id.buttonCompartir);

        //tomar datos del indent
        Bundle bundle = getIntent().getExtras();
        if(bundle != null && bundle.getString("gretter")!= null){
            String gretter = bundle.getString("gretter");
            Toast.makeText(SecondActivity.this, gretter, Toast.LENGTH_LONG).show();
            textView.setText(gretter);
        }else{
            Toast.makeText(SecondActivity.this, "Esta vacio!", Toast.LENGTH_LONG).show();
        }

        btnCompartir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
