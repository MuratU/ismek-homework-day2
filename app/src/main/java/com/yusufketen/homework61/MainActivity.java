package com.yusufketen.homework61;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    EditText etSurname;
    TextView twName;
    EditText etName;
    TextView twOrta;
    Switch swAlt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        etSurname = (EditText) findViewById(R.id.etSurname);
        twName = (TextView) findViewById(R.id.twName);
        etName = (EditText) findViewById(R.id.etName);
        twOrta = (TextView) findViewById(R.id.twOrta);
        swAlt=(Switch)findViewById(R.id.swAlt);

        String nickname = etName.getText().toString();
        nickname = nickname.trim();
        nickname=nickname.toLowerCase();
        String surname = etSurname.getText().toString();
        surname = surname.trim();
        String a[] = nickname.split(" ");
        Arrays.sort(a);

        twName.setText("");
        twOrta.setText("");

if (swAlt.isChecked()) {
    for (int b = 0; b < a.length - 1; ++b) // Sadece son ismi kısaltır.
    {
        if (twOrta.getText()=="") {
            twOrta.setText(twOrta.getText() + a[b].substring(0, 1).toUpperCase() + a[b].substring(1, a[b].length()).toLowerCase() + " ");
        }
        else {
            twOrta.setText(twOrta.getText()+"\n" + a[b].substring(0, 1).toUpperCase() + a[b].substring(1, a[b].length()).toLowerCase() + " ");
        }
            String son = a[a.length - 1].substring(0, 1).toUpperCase() + ".";
            twName.setText(twOrta.getText() + "\n" + son + "\n" + surname.toUpperCase());
        }
}
        else {
    for (int b=0;b<a.length-1;++b) { // Sadece son ismi kısaltır.
        twOrta.setText(twOrta.getText()+a[b].substring(0,1).toUpperCase()+a[b].substring(1,a[b].length()).toLowerCase()+" ");
        String son=a[a.length-1].substring(0,1).toUpperCase()+".";
        twName.setText(twOrta.getText()+" "+son+" "+surname.toUpperCase());

    }

}
        }
        /*for (int b = 1; b < a.length; ++b)  // İlk isim hariç tüm isimleri kısaltır.
        {
            String ilkisim = a[0].substring(0, 1).toUpperCase() + a[0].substring(1, a[0].length()) + " ";
            twOrta.setText(twOrta.getText() + a[b].substring(0, 1).toUpperCase() + "." + " ");
            twName.setText(ilkisim + twOrta.getText() + surname.toUpperCase());
        } */
    }


