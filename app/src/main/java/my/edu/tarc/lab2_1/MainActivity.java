package my.edu.tarc.lab2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextMessage = (EditText)findViewById(R.id.editTextMessage);
    }
    public void SendMessage(View view){
        String msg = editTextMessage.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("MSG", msg);
        startActivity(intent);
    //test
    }
}
