package co.edu.udea.compumovil.gr03_20171.funcionalidadboton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAceptar = (Button) findViewById(R.id.btn_Aceptar);

       /* btnAceptar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),
                        "Has pulsado Aceptar!",
                        Toast.LENGTH_SHORT).show();
            }

        });*/
        Button btn1=(Button)findViewById(R.id.btn_Cancelar);
        Button btn2=(Button)findViewById(R.id.btn_Opciones);
        Button btn3=(Button)findViewById(R.id.btn_Guardar);

        /*btnAceptar.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);*/

    }

//    @Override
    /*public void onClick(View view) {
        String nombreBoton=new String();
        switch(view.getId()){
            case R.id.btn_Aceptar: nombreBoton="Aceptar";break;
            case R.id.btn_Cancelar: nombreBoton="Cancelar";break;
            case R.id.btn_Opciones: nombreBoton="Opciones";break;
            case R.id.btn_Guardar: nombreBoton="Guardar";break;

        }
        Toast.makeText(getBaseContext(),"Has pulsado: "+nombreBoton, Toast.LENGTH_LONG).show();

    }*/

    public void clickAceptar(View v){
        Toast.makeText(getBaseContext(), "pulsaste Aceptar", Toast.LENGTH_LONG).show();

    }
    public void clickCancelar(View v){
        Toast.makeText(getBaseContext(), "pulsaste Cancelar", Toast.LENGTH_LONG).show();

    }
    public void clickOpciones(View v){
        Toast.makeText(getBaseContext(), "pulsaste Opciones", Toast.LENGTH_LONG).show();

    }
    public void clickGuardar(View v){
        Toast.makeText(getBaseContext(), "pulsaste Guardar", Toast.LENGTH_LONG).show();

    }
}
