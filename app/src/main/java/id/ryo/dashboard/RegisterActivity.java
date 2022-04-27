package id.ryo.dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private EditText email, user, pass;
    private Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email = findViewById(R.id.email);
        user = findViewById(R.id.username);
        pass = findViewById(R.id.pass);
        signup = findViewById(R.id.button);
        TextView login1 = (TextView) findViewById(R.id.textView4);

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.textView4) {
                    finish();
            }
        }
    });
}
}