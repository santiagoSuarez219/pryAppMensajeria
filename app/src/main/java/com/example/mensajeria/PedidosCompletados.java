package com.example.mensajeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PedidosCompletados extends AppCompatActivity {

    Button btnVerPedidosCompletados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos_completados);

        btnVerPedidosCompletados =findViewById(R.id.btnVerPedidosCompletados);

        btnVerPedidosCompletados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}