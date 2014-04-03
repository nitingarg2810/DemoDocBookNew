package patientmanagementsystem.demodocbook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

public class MedicalHistory extends Activity {

	EditText E1, E2, E3, E4, E5, E6, E7, E8;
	Spinner Sp1, Sp2, Sp3;
	
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.medical_history);
		
		addListenerOnSpinnerItemSelection();
		addListenerOnSpinnerItemSelection1();
		addListenerOnSpinnerItemSelection2();
		
		E1 = (EditText) findViewById(R.id.editallergy);
		E2 = (EditText) findViewById(R.id.editsection);
		E3 = (EditText) findViewById(R.id.editwhen);
		E4 = (EditText) findViewById(R.id.editduartion);
		E5 = (EditText) findViewById(R.id.editcauses);
		E6 = (EditText) findViewById(R.id.editfreequency);
		E7 = (EditText) findViewById(R.id.edithospital);
		E8 = (EditText) findViewById(R.id.editreason);
	}
	private void addListenerOnSpinnerItemSelection(){
		Sp1 = (Spinner) findViewById(R.id.spinner1);
	}
	
	private void addListenerOnSpinnerItemSelection1(){
		Sp2 = (Spinner) findViewById(R.id.spinner2);
	}
	
	private void addListenerOnSpinnerItemSelection2(){
		Sp3 = (Spinner) findViewById(R.id.spinner3);
	}
}
