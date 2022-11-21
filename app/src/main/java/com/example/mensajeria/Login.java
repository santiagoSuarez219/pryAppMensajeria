package com.example.mensajeria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

    Button btnLogin;
    EditText edtxUsuario, edtxPaswoord;
    TextView txvBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        edtxUsuario = findViewById(R.id.edtxUsuario);
        edtxPaswoord = findViewById(R.id.edtxPassword);

        txvBase = findViewById(R.id.txvBase);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edtxUsuario.getText().toString().isEmpty()==true) {
                    edtxUsuario.setError("campo obligatorio");
                }
                if (edtxPaswoord.getText().toString().isEmpty() == true) {
                    edtxPaswoord.setError("campo obligatorio");
                }


                if (edtxUsuario.getText().toString().isEmpty()==false) {
                    if (edtxPaswoord.getText().toString().isEmpty() == false) {
                        String usuario = edtxUsuario.getText().toString();
                        int password = Integer.parseInt(edtxPaswoord.getText().toString());

                        if ("admin".equalsIgnoreCase(usuario))  {
                            if (password == 1234) {
                                Intent i =new Intent(getApplicationContext(), PerfilAdmin.class);
                                startActivity(i);
                            } else {
                                Toast.makeText(getApplicationContext(), "Contraseña incorrecta", Toast.LENGTH_LONG).show();
                            }
                        } else if ("repartidor".equalsIgnoreCase(usuario)){
                            if (password == 1234) {
                                Intent i =new Intent(getApplicationContext(), PerfilUsuario.class);
                                startActivity(i);
                            } else {
                                Toast.makeText(getApplicationContext(), "Contraseña incorrecta", Toast.LENGTH_LONG).show();
                            }
                        }
                        else{
                            Toast.makeText(getApplicationContext(), "Usuario no existe", Toast.LENGTH_LONG).show();
                        }
                        edtxUsuario.setText("");
                        edtxPaswoord.setText("");
                        Toast.makeText(getApplicationContext(), "Usuario: " + usuario + " Contraseña: " + password, Toast.LENGTH_LONG).show();

                    }
                }
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("mensaje");

        myRef.setValue("Hola Login desde Firebase");

         myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String value = snapshot.getValue(String.class);
                txvBase.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }
}