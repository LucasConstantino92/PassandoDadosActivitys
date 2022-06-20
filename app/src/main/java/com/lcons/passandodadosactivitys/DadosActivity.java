package com.lcons.passandodadosactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DadosActivity extends AppCompatActivity {

    private TextView txtNome, txtIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        txtNome = findViewById(R.id.txt_nome);
        txtIdade = findViewById(R.id.txt_idade);

        //Recuperar Dados
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");
        Usuario usuario = (Usuario) dados.getSerializable("objeto");

        //Configurar Valores Recuperados
        txtNome.setText(usuario.getNome());
        txtIdade.setText(usuario.getEmail());
    }
}