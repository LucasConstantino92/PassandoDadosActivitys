package com.lcons.passandodadosactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private Button btn_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_enviar = findViewById(R.id.passarDados);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DadosActivity.class);

                //Instanciar Objeto
                Usuario usuario = new Usuario("Lucas", "lucas@gmail.com");

                //passar dados
                intent.putExtra("nome", "Lucas Constantino");
                intent.putExtra("idade", 30);
                intent.putExtra("objeto", usuario);

                startActivity(intent);
            }
        });
    }
}