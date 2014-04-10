package patientmanagementsystem.demodocbook;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
 
public class appoint extends Activity {
    // Initializing variables
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appoint);
 
        Button AddPatient = (Button) findViewById(R.id.button2);
        //Listening to button event
        AddPatient.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                //Starting a new Intent
                Intent i4 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i4);
 
            }
        });
       
    }
}
