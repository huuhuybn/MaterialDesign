package vn.e.materialdesign;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button btnShowSnackBar;

    private TextInputLayout tilUsername;

    private EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowSnackBar = findViewById(R.id.btnShowSnackBar);

        btnShowSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Snackbar.make(v, "Hello", Snackbar.LENGTH_SHORT).show();

                tilUsername.setError("Nhap sai username roi do!!!!!");

                Intent intent = new Intent(MainActivity.this, FloatButtonActivity.class);
                startActivity(intent);

            }
        });


        edtPassword = findViewById(R.id.edtPassword);
        edtUsername = findViewById(R.id.edtUsername);


        tilUsername = findViewById(R.id.tilUsername);


    }
}
