package com.example.mensajeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PerfilUsuario extends AppCompatActivity {

    Button btnPedidos,btnMisPedidos,btnPedidosCompletados,btnCerrarSesion;
    TextView txtUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);
        btnPedidos = findViewById(R.id.btnPedidos);
        btnMisPedidos = findViewById(R.id.btnMisPedidos);
        btnPedidosCompletados = findViewById(R.id.btnPedidosCompletados);
        btnCerrarSesion = findViewById(R.id.btnCerrarSesion);

        btnPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Pedidos.class);
                startActivity(i);
            }
        });

        btnMisPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MisPedidos.class);
                startActivity(i);
            }
        });

        btnPedidosCompletados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),PedidosCompletados.class);
                startActivity(i);
            }
        });


        btnCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}