package edu.cnm.deepdive.fizzbuzzandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FizzBuzzActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fizz_buzz);
    final TextView text = (TextView) findViewById(R.id.text_view);
    text.setText(FizzBuzz.count(20));

    final EditText limit = (EditText) findViewById(R.id.limit);
    Button button = (Button) findViewById(R.id.button);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        text.setText(FizzBuzz.count(Integer.parseInt(limit.getText().toString())));
      }
    });
  }
}
