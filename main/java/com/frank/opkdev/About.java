package com.frank.opkdev;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        setContentView(R.layout.about);

        // Make ActionBar back button clickable
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }


    // Respond to ActionBar back button clicks
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //do what you want
                Intent intent = new Intent( About.this, MainActivity.class );
                startActivity( intent );
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected( item );
        }
    }
}
