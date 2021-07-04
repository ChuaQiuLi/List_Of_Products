package sg.edu.rp.c346.id20007649.listofproducts;

//I, Chua Qiu Li (20007649), declare that:
//        •	This submission is my original work – all sources have been properly referenced and acknowledged.
//        •	I have not copied the words or graphics or ideas or codes from another person/source and submitted it as my own.
//        •	I neither received nor rendered any assistance (either paid or unpaid) on work that requires individual effort.
//        •	I have not communicated, discussed, shared or made available my work with other students, in part or in whole, formally or informally. By doing so, I am also guilty of plagiarism and cheating.
//
//        If found guilty of committing any act of academic dishonesty, I understand that I will be liable:
//        •	for disciplinary action by the School
//        •	to the full extent of penalties, including immediate failure for this assessment and other disciplinary actions such as dismissal


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSamsung;
    Button btnApple;
    Button btnGoogle;
    Button btnListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSamsung = findViewById(R.id.btnSamsung);
        btnGoogle = findViewById(R.id.btnGoogle);
        btnApple = findViewById(R.id.btnIphone);
        btnListView = findViewById(R.id.btnListView);




        btnSamsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.samsung.com/sg/"));

                Toast.makeText(MainActivity.this,"Going to Samsung A70 official webpage... ", Toast.LENGTH_LONG).show();

                startActivity(intents);


            }
        });




        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.google.com/sg/?hl=en-GB"));
                Toast.makeText(MainActivity.this,"Going to Google Pixel 4a webpage... ", Toast.LENGTH_LONG).show();

                startActivity(intents);



            }
        });


        btnApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com/sg/"));

                Toast.makeText(MainActivity.this,"Going to Apple Airpods Gen 2 webpage... ", Toast.LENGTH_LONG).show();


                startActivity(intents);


            }
        });


        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,ItemListActivity.class);

                Toast.makeText(MainActivity.this,"Going to listview of the products that are on warranty...", Toast.LENGTH_SHORT).show();

                startActivity(intent);

            }
        });





    }
}