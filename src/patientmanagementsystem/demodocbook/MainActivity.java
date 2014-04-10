package patientmanagementsystem.demodocbook;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
 
public class MainActivity extends Activity {
    // Initializing variables
    EditText inputName;
    EditText inputEmail;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
 
        inputName = (EditText) findViewById(R.id.username);
        inputEmail = (EditText) findViewById(R.id.password);
        Button enter = (Button) findViewById(R.id.enter);
 
        //Listening to button event
        enter.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), appoint.class);
 
                startActivity(nextScreen);
 
            }
        });
    }
}
