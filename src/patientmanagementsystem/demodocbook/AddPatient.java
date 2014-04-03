package patientmanagementsystem.demodocbook;

import android.app.Activity; 
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.graphics.Bitmap;

public class AddPatient extends Activity {

	static final int CAMERA_PIC_REQUEST = 1;
	EditText name;
	EditText age, caste, birthplace, nativelanguage;
	Spinner S1, S2, S3, S4;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
        setContentView(R.layout.add_patient);
        
       
        
        addListenerOnSpinnerItemSelection();
        addListenerOnSpinnerItemSelection1();
        addListenerOnSpinnerItemSelection2();
        addListenerOnSpinnerItemSelection3();
        
        name = (EditText) findViewById(R.id.editName);
        age = (EditText) findViewById(R.id.editAge);
        caste = (EditText) findViewById(R.id.editCaste);
        birthplace = (EditText) findViewById(R.id.editBirth);
        nativelanguage = (EditText) findViewById(R.id.editNative);
        
        Button b = (Button) findViewById(R.id.buttonPhoto);
        b.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                 Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                 if(cameraIntent.resolveActivity(getPackageManager()) != null){
                 startActivityForResult(cameraIntent, CAMERA_PIC_REQUEST);
                 }
            }
        });
        
        Button b1 = (Button) findViewById(R.id.buttonNext);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i1 = new Intent(getApplicationContext(),FamilyInfo.class);
				startActivity(i1);
			}
		});
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_PIC_REQUEST && resultCode == RESULT_OK) {
              Bitmap image = (Bitmap) data.getExtras().get("data");
              ImageView imageview = (ImageView) findViewById(R.id.ImageView01);
              imageview.setImageBitmap(image);
        }
    }

	
	public void addListenerOnSpinnerItemSelection(){
		S1 = (Spinner) findViewById(R.id.spinnerSex);
	}
	
	public void addListenerOnSpinnerItemSelection1(){
		S2 = (Spinner) findViewById(R.id.spinnerEducation);
	}
	
	public void addListenerOnSpinnerItemSelection2(){
		S3 = (Spinner) findViewById(R.id.spinnerOccupation);
	}
	
	public void addListenerOnSpinnerItemSelection3(){
		S4 = (Spinner) findViewById(R.id.spinnerMS);
	}
}
