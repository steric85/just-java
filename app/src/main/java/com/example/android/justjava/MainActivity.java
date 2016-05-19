package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    int quantity=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox a= (CheckBox)findViewById(R.id.notify_me_checkbox1);
        CheckBox b= (CheckBox)findViewById(R.id.notify_me_checkbox2);
        EditText t=(EditText)findViewById(R.id.name);
        String priceMessage="Name: "+t.getText().toString()+"\nAdd Whipped Cream? "+a.isChecked()+"\nAdd Chocolate? "+b.isChecked()+"\nQuantity: "+quantity+"\nTotal: $"+ quantity * 5 +"\nThankyou! :D" ;
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */



    public void increment(View view){

        display(++quantity);
    }

    public void decrement(View view){

        display(--quantity);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView osTextView = (TextView) findViewById(R.id.order_summary_text_view);
        osTextView.setText(message);
    }

}