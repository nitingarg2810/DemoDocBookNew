package patientmanagementsystem.demodocbook;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity2 extends Activity {
	/** Called when the activity is first created. */
	private Spinner spinner1, spinner2, spinner3;
	Button enter;
	String text;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen2);

		addItemsOnSpinner2();
		addListenerOnSpinnerItemSelection();
		addListenerOnSpinnerItemSelection1();
		Button Submit = (Button) findViewById(R.id.Submit);

		Submit.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				String k= spinner3.getSelectedItem().toString();
				Intent i;
				if(k.equals("Add Patient")){
				i= new Intent(getApplicationContext(),AddPatient.class);
				startActivity(i);}
				
			
			}
		});
	}

	// add items into spinner dynamically
	public void addItemsOnSpinner2() {

		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list = new ArrayList<String>();
		list.add("list 1");
		list.add("list 2");
		list.add("list 3");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list);
		dataAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter);
	}

	public void addListenerOnSpinnerItemSelection() {
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	}

	public void addListenerOnSpinnerItemSelection1() {
		spinner3 = (Spinner) findViewById(R.id.spinner3);
		spinner3.setOnItemSelectedListener(new Custom1OnItemSelectedListener());
		text = spinner3.getSelectedItem().toString();
	}

}
