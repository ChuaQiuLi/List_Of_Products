package sg.edu.rp.c346.id20007649.listofproducts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSamsungA70;
    Button btnSamsungBuds;
    Button btnAppleAirpods;
    Button btnIphone12;
    Button btnGooglePixel;
    Button btnSamsungFlip;
    Button btnListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSamsungA70 = findViewById(R.id.btnSamsungA70);
        btnSamsungFlip = findViewById(R.id.btnFlipZ);
        btnSamsungBuds = findViewById(R.id.btnGalaxyBuds);
        btnGooglePixel = findViewById(R.id.btnPixel4a);
        btnAppleAirpods = findViewById(R.id.btnAirpods);
        btnIphone12 = findViewById(R.id.btnIphone12);
        btnListView = findViewById(R.id.btnListView);


        btnSamsungA70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.samsung.com/sg/smartphones/galaxy-a/galaxy-a70-blue-128gb-sm-a705mzbwxsp/"));

                Toast.makeText(MainActivity.this,"Going to Samsung A70 official webpage... ", Toast.LENGTH_LONG).show();

                startActivity(intents);


            }
        });

        btnSamsungFlip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.samsung.com/in/smartphones/galaxy-z-flip/"));

                Toast.makeText(MainActivity.this,"Going to Samsung Galaxy Flip Z official webpage... ", Toast.LENGTH_LONG).show();

                startActivity(intents);


            }
        });


        btnSamsungBuds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.samsung.com/us/mobile/audio/galaxy-buds/"));

                Toast.makeText(MainActivity.this,"Going to Samsung Galaxy Buds official webpage... ", Toast.LENGTH_LONG).show();

                startActivity(intents);


            }
        });


        btnGooglePixel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.google.com/sg/product/pixel_4a?utm_source=google&utm_medium=cpc&utm_campaign=japac-SG-en-dr-bkws-all-all-buy-b-dr-1008675&utm_content=text-ad-none-none-DEV_c-CRE_461503521588-ADGP_Hybrid+%7C+BKWS+-+BMM+%7C+Txt+~+Pixel+4a+~+%5BM:1%5D+~+SG+~+en+~+Pixel4a-KWID_43700062296544173-kwd-332343298278-userloc_9062509&utm_term=KW_%2Bpixel+%2B4-ST_%2Bpixel+%2B4&gclid=CjwKCAjwtpGGBhBJEiwAyRZX2hFSziiLw3fOlbG0_NDRbYiQ0HNDEB3xjs-nH1wKf9snCZKha9-CXBoCctgQAvD_BwE&gclsrc=aw.ds&hl=en-GB"));

                Toast.makeText(MainActivity.this,"Going to Google Pixel 4a webpage... ", Toast.LENGTH_LONG).show();

                startActivity(intents);



            }
        });

        btnIphone12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com/sg/iphone-12/?afid=p238%7CsFYUL1Wbu-dc_mtid_20925brv44930_pcrid_517981284702_pgrid_112153639435_&cid=wwa-sg-kwgo-iphone-slid----Avail-"));

                Toast.makeText(MainActivity.this,"Going to IPhone 12 series webpage... ", Toast.LENGTH_LONG).show();


                startActivity(intents);


            }
        });


        btnAppleAirpods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com/sg/airpods-2nd-generation/"));

                Toast.makeText(MainActivity.this,"Going to Apple Airpods Gen 2 webpage... ", Toast.LENGTH_LONG).show();


                startActivity(intents);


            }
        });


        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,ItemListActivity.class);

                Toast.makeText(MainActivity.this,"Going to listview of the products that are on sales...", Toast.LENGTH_LONG).show();

                startActivity(intent);

            }
        });






    }
}