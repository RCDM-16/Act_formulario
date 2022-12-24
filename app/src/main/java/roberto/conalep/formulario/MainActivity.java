package roberto.conalep.formulario;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioButton;
        import android.widget.TextView;
        import android.widget.Toast;

        import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    RadioButton rdOpc1, rdOpc2, rdOpc3;
    TextView txtNpregunta, txtPregunta;
    Button btnSiguiente;
    int nota = 0; int Npregunta = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se le asigna a cada objeto el id de lo que va a usar
        rdOpc1 = (RadioButton)findViewById(R.id.rdBtnOpc1);
        rdOpc2 = (RadioButton)findViewById(R.id.rdBtnOpc2);
        rdOpc3 = (RadioButton)findViewById(R.id.rdBtnOpc3);

        txtNpregunta = (TextView)findViewById(R.id.txtNpregunta);
        txtPregunta = (TextView)findViewById(R.id.txtPregunta);

        btnSiguiente = (Button)findViewById(R.id.btnSiguiente);
    }

    public void siguiente (View v){
        //if por si no se marca ninguna opcion
        if(rdOpc1.isChecked() == false && rdOpc2.isChecked() == false && rdOpc3.isChecked()==false){
            Toast.makeText(this, "Elija una opción", Toast.LENGTH_SHORT).show();
        }else if(Npregunta == 1){
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if(rdOpc2.isChecked()){
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 2/5");
            txtPregunta.setText("Las palabras acentuadas en la ultima vocal se llaman...");
            rdOpc1.setText("Llanas");
            rdOpc2.setText("Agudas");
            rdOpc3.setText("Esdrújulas");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 2) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc2.isChecked()) {
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 3/5");
            txtPregunta.setText("¿Qué tipo de acento tiene la palabra 'sí'?");
            rdOpc1.setText("Gramátical");
            rdOpc2.setText("Diacrítico");
            rdOpc3.setText("Ortográfico");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 3) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc2.isChecked()) {
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 4/5");
            txtPregunta.setText("¿Qué palabra NO esta escrita correctamente?");
            rdOpc1.setText("Analisís");
            rdOpc2.setText("Camarón");
            rdOpc3.setText("Accidente");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 4) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc1.isChecked()) {
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 5/5");
            txtPregunta.setText("Nombre que recibe el tipo de acento que hace cambiar el significado de una palabra");
            rdOpc1.setText("Cambiante");
            rdOpc2.setText("Ortográfico");
            rdOpc3.setText("Diacrítico");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 5) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc3.isChecked()) {
                nota = nota + 2;
            }
            //Se setean los textos para el resultado de la nota
            txtNpregunta.setText("Calificacion: "+nota);
            //IF para verificar si se ha aprobado o reprobado
            if(nota <= 5){
                txtPregunta.setText("Leer más no hace daño :D");
            }else if(nota == 6){
                txtPregunta.setText("REPROBADO");
            }else if(nota == 7){
                txtPregunta.setText("¡Puedes mejorar! :D");
            }else if(nota == 8){
                txtPregunta.setText("Bien");
            }else if(nota > 8){
                txtPregunta.setText("APROBADO");
            }
            //Se ocultan las opciones que no se van a usar para ver la nota y resultado
            rdOpc1.setVisibility(View.GONE);
            rdOpc2.setVisibility(View.GONE);
            rdOpc3.setVisibility(View.GONE);
            btnSiguiente.setVisibility(View.GONE);
        }
    }
}