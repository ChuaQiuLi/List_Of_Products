package sg.edu.rp.c346.id20007649.listofproducts;

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

                Toast.makeText(MainActivity.this,"Going to listview of the products that are on sales...", Toast.LENGTH_SHORT).show();

                startActivity(intent);

            }
        });





    }
}