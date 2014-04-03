package patientmanagementsystem.demodocbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class ObstetricHistory extends Activity {
	
	EditText e1, e2, e3, e4, e5, e6, e7;
	Spinner s1, s2, s3, s4, s5;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.obstretic_history);
		
		addListenerOnSpinnerItemSelection();
		addListenerOnSpinnerItemSelection1();
		addListenerOnSpinnerItemSelection2();
		addListenerOnSpinnerItemSelection3();
		addListenerOnSpinnerItemSelection4();
		
		e1 = (EditText) findViewById(R.id.editContra);
		e2 = (EditText) findViewById(R.id.editbirth);
		e3 = (EditText) findViewById(R.id.editlivingchild);
		e4 = (EditText) findViewById(R.id.editdeadchild);
		e5 = (EditText) findViewById(R.id.editpregnancy);
		e6 = (EditText) findViewById(R.id.editmaternal);
		e7 = (EditText) findViewById(R.id.editdelivery);
		
		Button b3 = (Button) findViewById(R.id.buttonMed);
        b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i3 = new Intent(getApplicationContext(),MedicalHistory.class);
				startActivity(i3);
			}
		});
	}
	
	private void addListenerOnSpinnerItemSelection() {
		s1 = (Spinner) findViewById(R.id.spinner1);	
	}

	private void addListenerOnSpinnerItemSelection1() {
		s2 = (Spinner) findViewById(R.id.spinner2);	
	}

	private void addListenerOnSpinnerItemSelection2() {
		s3 = (Spinner) findViewById(R.id.spinner3);	
	}

	private void addListenerOnSpinnerItemSelection3() {
		s4 = (Spinner) findViewById(R.id.spinner4);	
	}

	private void addListenerOnSpinnerItemSelection4() {
		s5 = (Spinner) findViewById(R.id.spinner5);	
	}

	
}
