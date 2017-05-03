package iit3.dap.abrahamxsaboter.practica_conexioninternet;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextInputEditText mBookInput;
    TextView autor;
    TextView titulo;

    private String libroName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bundle bundle = getIntent().getExtras();

        //libroName = bundle.getString("nombreLibro");
        mBookInput = (TextInputEditText) findViewById(R.id.editLibro);
        //mBookInput.setText(libroName);

    }

    public void BuscarLibro(View view){
        String queryString = mBookInput.getText().toString();
    }

}
