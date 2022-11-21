package com.example.mensajeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PerfilAdmin extends AppCompatActivity {

    Button btnCrearUsuarioAdm,btnCrearPedidoAdm,btnVerPedidosAdm,btnCerrarSesionAdm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_admin);

        btnCrearUsuarioAdm = findViewById(R.id.btnCrearUsuarioAdm);
        btnCrearPedidoAdm = findViewById(R.id.btnCrearPedidoAdm);
        btnVerPedidosAdm = findViewById(R.id.btnVerPedidosAdm);
        btnCerrarSesionAdm = findViewById(R.id.btnCerrarSesionAdm);

        btnCrearUsuarioAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(), CrearUsuario.class);
                startActivity(i);
            }
        });

        btnCrearPedidoAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(), CrearPedido.class);
                startActivity(i);
            }
        });

        btnVerPedidosAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(), Pedidos.class);
                startActivity(i);
            }
        });

        btnCerrarSesionAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}