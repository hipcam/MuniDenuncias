package com.alvarado.pe.labcalificado3.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.alvarado.pe.labcalificado3.R;

public class LoginActivity extends AppCompatActivity {
    private EditText userInput;
    private EditText passInput;
    private static final int REGISTER_FORM_REQUEST = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       userInput = findViewById(R.id.userInput);
       passInput = findViewById(R.id.passInput);

    }
    public void callRegisterUser(View view){
        startActivityForResult(new Intent(this, RegisterUserActivity.class), REGISTER_FORM_REQUEST);
    }
    public void callMain(View view){
        String email = userInput.getText().toString();
        String password = passInput.getText().toString();
        if(email.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Debe completar todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

    }
}
/*    User user = UserRepository.login(email, password);
        if(user == null) {
        Toast.makeText(this, "Correo o contraseña inválidos", Toast.LENGTH_SHORT).show();
        return;
        }else {
        Toast.makeText(this, "Bienvenid@ " + user.getFullname(), Toast.LENGTH_SHORT).show();

        SharedPreferences.Editor editor = sharedPreferences.edit();
        boolean success = editor
        .putString("email", user.getEmail())
        .putBoolean("está logueado", true)
        .commit();
        startActivity(new Intent(this, MainActivity.class));
        finish();
        }*/
