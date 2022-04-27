package id.ryo.dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button login;
    private TextView register;
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.login) {
                    String namaa = username.getText().toString();
                    String pass = password.getText().toString();
                    boolean isEmptyFields = false;

                    if (TextUtils.isEmpty(namaa)) {
                        isEmptyFields = true;
                        username.setError("Field ini tidak boleh kosong!");
                    }
                    if (TextUtils.isEmpty(pass)) {
                        isEmptyFields = true;
                        password.setError("Field ini tidak boleh kosong!");
                    }
                    if (!isEmptyFields){
                        Intent dasboard = new Intent(LoginActivity.this,MainActivity.class);
                        Toast.makeText(LoginActivity.this, "Selamat Datang " + namaa, Toast.LENGTH_SHORT).show();
                        startActivity(dasboard);
                    }
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.register) {
                    Intent register = new Intent(LoginActivity.this,RegisterActivity.class );
                    startActivity(register);
                }

            }
        });
    }
}