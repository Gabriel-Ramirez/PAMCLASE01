package sv.edu.uesocc2020.clase001a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Registrar extends AppCompatActivity {

    private TextView txtRegistro;
    private TextView txtEdad;
    private TextView txtCorreo;
    private EditText edtNombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        txtRegistro = (TextView)findViewById(R.id.lblRegistroUsuario);

        Bundle datosPersona = this.getIntent().getExtras();

        txtRegistro.setText("Nombre: " + datosPersona.getString("NOMBRE")
                + " " + datosPersona.getString("APELLIDO"));

        txtEdad = (TextView)findViewById(R.id.lblEdad);

        txtEdad.setText("Edad: "+datosPersona.getString("EDAD"));

        txtCorreo = (TextView)findViewById(R.id.lblCorreo);

        txtCorreo.setText("Correo: "+ datosPersona.getString("CORREO"));

        edtNombre = (EditText)findViewById(R.id.etxNombre);

        edtNombre.setText(datosPersona.getString("NOMBRE")+" "+datosPersona.getString("APELLIDO"));


    }
}
