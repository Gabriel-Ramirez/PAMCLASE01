package sv.edu.uesocc2020.clase001a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText txtNombre;
    private EditText txtApellido;
    private EditText txtEdad;
    private EditText txtCorreo;
    private Button btnRegistrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtNombre = (EditText)findViewById(R.id.txtNombre);
        txtApellido = (EditText)findViewById(R.id.txtApellido);
        txtEdad = (EditText)findViewById(R.id.txtEdad);
        txtCorreo = (EditText)findViewById(R.id.txtCorreo);
        btnRegistrar = (Button) findViewById(R.id.btnEnviar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirRegistro = new Intent(MainActivity.this,Registrar.class);
                Bundle datos = new Bundle();
                datos.putString("NOMBRE",txtNombre.getText().toString());
                datos.putString("APELLIDO",txtApellido.getText().toString());
                datos.putString("EDAD", txtEdad.getText().toString());
                datos.putString("CORREO", txtCorreo.getText().toString());
                abrirRegistro.putExtras(datos);
                startActivity(abrirRegistro);
            }
        });


    }
}
