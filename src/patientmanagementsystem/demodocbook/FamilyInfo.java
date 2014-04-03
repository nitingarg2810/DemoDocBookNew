package patientmanagementsystem.demodocbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class FamilyInfo extends Activity {
	
	EditText name, people, earning, literate, age;
	Spinner s1, s2, s3;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.family_info);
		
		addListenerOnSpinnerItemSelection();
		addListenerOnSpinnerItemSelection1();
		addListenerOnSpinnerItemSelection2();
		
		name = (EditText) findViewById(R.id.editHusName);
		people = (EditText) findViewById(R.id.editNOpeople);
		earning = (EditText) findViewById(R.id.editNOearningPeople);
		literate = (EditText) findViewById(R.id.editNOliteratePeople);
		age = (EditText) findViewById(R.id.editchildage);
 		
		 Button b1 = (Button) findViewById(R.id.button2);
	        b1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent i2 = new Intent(getApplicationContext(),ObstetricHistory.class);
					startActivity(i2);
				}
			});
		
	}

	private void addListenerOnSpinnerItemSelection() {
		s1 = (Spinner) findViewById(R.id.spinnerHubbyOccu);	
	}

	private void addListenerOnSpinnerItemSelection1() {
		s2 = (Spinner) findViewById(R.id.spinneredufirstchild);
	}

	private void addListenerOnSpinnerItemSelection2() {
		s3 = (Spinner) findViewById(R.id.spinnerPVehicle);
	}

}
