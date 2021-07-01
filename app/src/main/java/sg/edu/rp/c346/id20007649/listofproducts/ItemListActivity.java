package sg.edu.rp.c346.id20007649.listofproducts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class ItemListActivity extends AppCompatActivity {

    EditText etProduct;
    EditText etProductDetails;
    ListView listViewTask;
    Button btnAdd;
    Button btnUpdate;
    Button btnDelete;

    Spinner spinnerItems;
    Spinner spinnerFunction;

    DatePicker dp;

    ArrayList <String> listedTaskProduct = new ArrayList<String>();
    ArrayList <String> products = new ArrayList<String>();
    ArrayList <String> expiryDate = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);


        etProduct = findViewById(R.id.etProduct);
        etProductDetails = findViewById(R.id.etProductDetails);
        listViewTask = findViewById(R.id.listViewProduct);
        btnAdd = findViewById(R.id.btnAdd);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);
        dp = findViewById(R.id.datepicker);

        spinnerItems = findViewById(R.id.spinnerFilter);
        spinnerFunction = findViewById(R.id.spinnerFunction);


        products.add("Samsung Galaxy Buds");
        products.add("Samsung Galaxy A70");
        products.add("Samsung Galaxy Flip Z");
        products.add("Google Pixel 4a");
        products.add("IPhone 12 series");
        products.add("Apple Airpods Gen 2");

        expiryDate.add("2021-11-18");
        expiryDate.add("2021-11-27");
        expiryDate.add("2022-7-31");
        expiryDate.add("2021-11-2");
        expiryDate.add("2022-5-6");
        expiryDate.add("2022-5-23");


        for (int i =0; i < products.size(); i++) {
            listedTaskProduct.add("Expires " + expiryDate.get(i) + " " + products.get(i));

        }



        ArrayAdapter task = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listedTaskProduct);


        listViewTask.setAdapter(task);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (etProduct != null) {


                    String item = etProduct.getText().toString();


                    int date = dp.getDayOfMonth();
                    int month = dp.getMonth() + 1 ;
                    int year = dp.getYear();

                    String expiry = year + "-" + month + "-" + date;


                    products.add(item);
                    expiryDate.add(expiry);

                    listedTaskProduct.clear();


                    for (int i =0; i < products.size(); i++) {
                        Collections.sort(products);
                        listedTaskProduct.add("Expires " + expiryDate.get(i) + " " + products.get(i));

                    }

                    task.notifyDataSetChanged();

                    etProduct.setText(null);

                    Toast.makeText(ItemListActivity.this, "Product is being added successfully! ", Toast.LENGTH_LONG).show();

                }
            }


        });


        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int position = Integer.parseInt(etProduct.getText().toString());

                if (position > listedTaskProduct.size()) {
                    Toast.makeText(ItemListActivity.this, "Wrong index number ", Toast.LENGTH_LONG).show();

                }



                else if (position <= listedTaskProduct.size() ) {


                    String item = etProductDetails.getText().toString();


                    int date = dp.getDayOfMonth();
                    int month = dp.getMonth() + 1 ;
                    int year = dp.getYear();

                    String expiry = year + "-" + month + "-" + date;


                    products.set(position, item);
                    expiryDate.set(position, expiry);

                    listedTaskProduct.clear();


                    for (int i =0; i < products.size(); i++) {
                        listedTaskProduct.add("Expires " + expiryDate.get(i) + " " + products.get(i));

                    }


                    task.notifyDataSetChanged();
                    etProduct.setText(null);
                    etProductDetails.setText(null);
                    Toast.makeText(ItemListActivity.this, "Product is being updated successfully", Toast.LENGTH_LONG).show();


                }


            }

        });


        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int position = Integer.parseInt(etProduct.getText().toString());

                if (position > listedTaskProduct.size()) {
                    Toast.makeText(ItemListActivity.this, "Wrong index number", Toast.LENGTH_LONG).show();

                }

                else if (position <= listedTaskProduct.size()) {
                    listedTaskProduct.remove(position);
                    task.notifyDataSetChanged();
                    etProduct.setText(null);
                    Toast.makeText(ItemListActivity.this, "Product Deleted Successfully", Toast.LENGTH_LONG).show();


                }
            }

        });




        spinnerFunction.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                switch (position) {

                    case 0:

                        etProduct.setHint("Enter the name of the product : ");
                        etProduct.setEnabled(true);
                        etProductDetails.setEnabled(false);
                        etProductDetails.setHint(null);
                        btnUpdate.setEnabled(false);
                        btnAdd.setEnabled(true);
                        btnDelete.setEnabled(false);
                        dp.setEnabled(true);
                        break;


                    case 1:

                        etProduct.setHint(" Enter index number of the product to be updated : ");
                        etProductDetails.setHint("Enter the name of the product : ");
                        etProduct.setEnabled(true);
                        etProductDetails.setEnabled(true);
                        btnAdd.setEnabled(false);
                        btnUpdate.setEnabled(true);
                        btnDelete.setEnabled(false);
                        dp.setEnabled(true);
                        break;


                    case 2 :
                        etProduct.setHint("Enter index number of the product to be deleted : ");
                        etProduct.setEnabled(true);
                        etProductDetails.setEnabled(false);
                        etProductDetails.setHint(null);
                        btnAdd.setEnabled(false);
                        btnUpdate.setEnabled(false);
                        btnDelete.setEnabled(true);
                        dp.setEnabled(false);
                        break;



                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }

}









