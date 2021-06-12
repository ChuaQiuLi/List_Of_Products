package sg.edu.rp.c346.id20007649.listofproducts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ItemListActivity extends AppCompatActivity {

    EditText etProduct;
    ListView listViewTask;
    Button btnAdd;
    Button btnUpdate;
    Button btnDelete;
    Spinner spinnerItems;
    Spinner spinnerFunction;
    EditText etExpiryDate;


    ArrayList<String> listedTask = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);


        etProduct = findViewById(R.id.etProduct);
        listViewTask = findViewById(R.id.listViewProduct);
        btnAdd = findViewById(R.id.btnAdd);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);
        spinnerItems = findViewById(R.id.spinnerFilter);
        spinnerFunction = findViewById(R.id.spinnerFunction);
        etExpiryDate = findViewById(R.id.etExpiryDate);



        listedTask.add("Expires 2021-11-18 Samsung Galaxy Buds ");
        listedTask.add("Expires 2021-11-27 Samsung Galaxy A70 ");
        listedTask.add("Expires 2022-7-31  Samsung Galaxy Flip Z ");
        listedTask.add("Expires 2021-11-2  Google Pixel 4a ");
        listedTask.add("Expires 2022-5-6   IPhone 12 series ");
        listedTask.add("Expires 2022-5-23  Apple Airpods Gen 2 ");




        ArrayAdapter task = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listedTask);

        listViewTask.setAdapter(task);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    if (etProduct != null) {

                        String product = "";
                        product += etProduct.getText().toString();
                        listedTask.add(product);
                        task.notifyDataSetChanged();
                        etProduct.setText(null);
                        Toast.makeText(ItemListActivity.this,"Product is being added successfully! ", Toast.LENGTH_LONG).show();

                    }
                }


        });


        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    if (etProduct == null || etExpiryDate == null) {
                        Toast.makeText(ItemListActivity.this,"Please make sure that you have fill up the details before you can update them. ", Toast.LENGTH_LONG).show();



                    }


                    else {
                        int position = Integer.parseInt(etProduct.getText().toString());
                        if (position >= listedTask.size()) {
                            Toast.makeText(ItemListActivity.this,"Wrong index number ", Toast.LENGTH_LONG).show();


                        }

                        else{
                            String product = "";

                            product += etExpiryDate.getText().toString();
                            listedTask.set(position, product);
                            task.notifyDataSetChanged();
                            etProduct.setText(null);
                            etExpiryDate.setText(null);
                            Toast.makeText(ItemListActivity.this, "Product is being updated successfully", Toast.LENGTH_LONG).show();




                        }

                    }


                }


        });


        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String product = "";




                if (listedTask.isEmpty() == true) {
                    Toast.makeText(ItemListActivity.this,"You don't have any product to remove", Toast.LENGTH_LONG).show();
                }

                else {
                    int position = Integer.parseInt(etProduct.getText().toString());

                    if (position >= listedTask.size()) {
                        Toast.makeText(ItemListActivity.this,"Wrong index number", Toast.LENGTH_LONG).show();

                    }

                    else {
                        listedTask.remove(position);
                        task.notifyDataSetChanged();
                        etProduct.setText(null);
                        Toast.makeText(ItemListActivity.this,"Product is being deleted Successfully", Toast.LENGTH_LONG).show();


                    }


                }

            }
        });


        spinnerFunction.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                switch (position) {

                    case 0 :

                        etProduct.setHint("Enter data in this format: Expires <YYYY-M-D> Product Name> ");
                        etExpiryDate.setEnabled(false);
                        btnDelete.setEnabled(false);
                        btnUpdate.setEnabled(false);
                        btnAdd.setEnabled(true);
                        break;


                    case 1 :

                        etProduct.setHint("Type in the index number  of the product to be updated ");
                        etExpiryDate.setHint("Write in the following format : Expires <YYYY-M-D> Product Name >");
                        etExpiryDate.setEnabled(true);
                        btnAdd.setEnabled(false);
                        btnUpdate.setEnabled(true);
                        btnDelete.setEnabled(false);
                        break;


                    case 2 :

                        etProduct.setHint("Type in the index number of the product to be removed");
                        etExpiryDate.setEnabled(false);
                        btnAdd.setEnabled(false);
                        btnUpdate.setEnabled(false);
                        btnDelete.setEnabled(true);
                        break;


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}