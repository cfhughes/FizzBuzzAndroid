package edu.cnm.deepdive.fizzbuzzandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class FizzBuzzActivity extends AppCompatActivity {

  TextView text;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fizz_buzz);
    ScrollView scroll_view = (ScrollView) findViewById(R.id.scroll_view);

    text = new TextView(this);
    text.setText(FizzBuzz.count(20));

    scroll_view.addView(text);

    final EditText limit = (EditText) findViewById(R.id.limit);
    Button button = (Button) findViewById(R.id.button);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        int limitInt = 0;
        try {
          limitInt = Integer.parseInt(limit.getText().toString());
        } catch (NumberFormatException e) {
          e.printStackTrace();
        }
        text.setText(FizzBuzz.count(limitInt));
      }
    });
  }
}
