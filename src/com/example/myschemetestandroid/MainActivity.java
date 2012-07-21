package com.example.myschemetestandroid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String action = intent.getAction();
        if (Intent.ACTION_VIEW.equals(action)) {
        	Uri uri = intent.getData();
        	if (uri!=null) {
        		String name = uri.getQueryParameter("name");
        		TextView nameTextView = (TextView) findViewById(R.id.nameTextView);
        		nameTextView.setText(name);
        		String url = uri.getQueryParameter("url");
        		TextView urlTextView = (TextView) findViewById(R.id.urlTextView);
        		urlTextView.setText(url);
        	}
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
