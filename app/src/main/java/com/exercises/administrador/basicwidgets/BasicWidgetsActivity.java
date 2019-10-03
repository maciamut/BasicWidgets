package com.exercises.administrador.basicwidgets;

//import android.support.v7.app.ActionBarActivity;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Date;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.*;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class BasicWidgetsActivity extends Activity {

    private static final String TAG = "BasicWidget";
    CheckBox cb;

    private ProgressBar pbarProgreso;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        Log.i(TAG, "In OnCreate() callback method");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_widgets);

        EditText fld=(EditText)findViewById(R.id.editText1);
            fld.setText("Hello!!!");
            fld=(EditText)findViewById(R.id.editText2);
            fld.setText("Goodbye!!!");

            cb = (CheckBox)findViewById(R.id.checkBox1);

            cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView,
                                             boolean isChecked) {
                    if (isChecked){
                        cb.setText("This checkbox is: checked");
                    }
                    else{
                        cb.setText("This checkbox is: unchecked");
                    }

                }

            });

            Log.i(TAG, "Out OnCreate() callback method");
        }

        public void timeColor(View btn) {
            Button theButton;
            theButton = (Button) btn;

            btn.setBackgroundColor(0xFF00FF00);
            btn.setBackgroundColor(Color.GREEN);
            theButton.setText(new Date().toString());
            Log.i(TAG, "Out timeColor() callback method");

        }


        public void makeSound(View ibtn) {

            ibtn.playSoundEffect(SoundEffectConstants.CLICK);

            EditText fld1=(EditText)findViewById(R.id.editText1);
            EditText fld2=(EditText)findViewById(R.id.editText2);

            fld2.setText(fld1.getText());

            Log.i(TAG, "Out makeSound() callback method");

        }


        public void onRadioButtonClicked(View v){

            RadioButton rd = (RadioButton) v;
            TextView tW = (TextView) findViewById(R.id.textView1);

            String s = (String) rd.getText();

            if (s.equals("Blue")){
                tW.setBackgroundColor(Color.BLUE);
            }
            else{
                if(s.equals("Red")){
                    tW.setBackgroundColor(Color.RED);
                }
                else{
                    tW.setBackgroundColor(Color.GREEN);
                }
            }


        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_basic_widgets, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
}
