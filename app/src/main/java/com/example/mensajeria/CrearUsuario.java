package com.example.mensajeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CrearUsuario extends AppCompatActivity {

    TextView edtxNombreUsuario,edtxPasswordUsuario;
    RadioGroup rbGroup;
    RadioButton rbAdministrador, rbRepartidor;
    Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_usuario);

        edtxNombreUsuario = findViewById(R.id.edtxNombreUsuario);
        edtxPasswordUsuario = findViewById(R.id.edtxPasswordUsuario);
        rbAdministrador = findViewById(R.id.rbAdministrador);
        rbAdministrador = findViewById(R.id.rbRepartidor);
        btnCrear = findViewById(R.id.btnCrear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtxNombreUsuario.getText().toString().isEmpty()) {
                    edtxNombreUsuario.setError("campo obligatorio");
                }
                if (edtxPasswordUsuario.getText().toString().isEmpty()) {
                    edtxPasswordUsuario.setError("campo obligatorio");
                }

                if (!edtxNombreUsuario.getText().toString().isEmpty()) {
                    if (!edtxPasswordUsuario.getText().toString().isEmpty()) {

                        String usuario_String = edtxNombreUsuario.getText().toString();
                        int passwor_Int = Integer.parseInt(edtxPasswordUsuario.getText().toString());

                        if (rbAdministrador.isChecked()){
                            int tipo_Usuario = 1;
                        }else if (rbRepartidor.isChecked()){
                            int tipo_Usuario = 2;
                        }

                    }
                }



            }
        });

    }
}