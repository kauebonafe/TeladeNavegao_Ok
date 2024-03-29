package br.kaue.usjt.teladenavegacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //constante static para identificar a mensagem
    public final static String EXTRA_MESSAGE =
            "br.usjt.meuprimeiroapp.MESSAGE";

    //será chamado quando o usuário clicar em Enviar
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivit.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}