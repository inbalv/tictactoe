package app.inbalv.com.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    int counter = 0;
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, set1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        set1 = (Button) findViewById(R.id.set1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void XYclick(View view) {

        Button bt = (Button) view;
        counter = counter + 1;
        if (bt.getText().toString().isEmpty()) {
            if (counter % 2 == 0) {
                bt.setText("O");
            } else {
                bt.setText("X");
            }

        }
        if (counter <= 9) {
            if (bt1.getText() == bt2.getText() && bt2.getText() == bt3.getText()) {
                if (bt1.getText().toString() == "X") {
                    Toast.makeText(getApplicationContext(), "X is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                } else if (bt1.getText().toString() == "O") {
                    Toast.makeText(getApplicationContext(), "O is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                }
            }
            if (bt4.getText() == bt5.getText() && bt5.getText() == bt6.getText()) {
                if (bt4.getText().toString().toString() == "X") {
                    Toast.makeText(getApplicationContext(), "X is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                } else if (bt4.getText().toString() == "O") {
                    Toast.makeText(getApplicationContext(), "O is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                }
            }
            if (bt7.getText() == bt8.getText() && bt9.getText() == bt8.getText()) {
                if (bt7.getText().toString() == "X") {
                    Toast.makeText(getApplicationContext(), "X is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                } else if (bt7.getText().toString()== "O") {
                    Toast.makeText(getApplicationContext(), "O is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                }
            }
            if (bt1.getText() == bt4.getText() && bt7.getText() == bt4.getText()) {
                if (bt1.getText().toString() == "X") {
                    Toast.makeText(getApplicationContext(), "X is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                } else if (bt1.getText().toString()== "O") {
                    Toast.makeText(getApplicationContext(), "O is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                }
            }
            if (bt2.getText() == bt5.getText() && bt8.getText() == bt5.getText()) {
                if (bt2.getText().toString() == "X") {
                    Toast.makeText(getApplicationContext(), "X is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                } else if (bt2.getText().toString() == "O") {
                    Toast.makeText(getApplicationContext(), "O is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                }
            }
            if (bt3.getText() == bt6.getText() && bt9.getText() == bt6.getText()) {
                if (bt3.getText().toString() == "X") {
                    Toast.makeText(getApplicationContext(), "X is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                } else if (bt3.getText().toString()== "O") {
                    Toast.makeText(getApplicationContext(), "O is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                }
            }
            if (bt1.getText() == bt5.getText() && bt9.getText() == bt5.getText()) {
                if (bt1.getText().toString() == "X") {
                    Toast.makeText(getApplicationContext(), "X is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                } else if (bt1.getText().toString()== "O") {
                    Toast.makeText(getApplicationContext(), "O is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                }
            }
            if (bt3.getText() == bt7.getText() && bt5.getText() == bt7.getText()) {
                if (bt3.getText().toString() == "X") {
                    Toast.makeText(getApplicationContext(), "X is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                } else if (bt3.getText().toString()=="O") {
                    Toast.makeText(getApplicationContext(), "O is the Winner!", Toast.LENGTH_LONG).show();
                    setnewgame();
                }
            }
        } else {
            Toast.makeText(getApplicationContext(), "You snooze You lose", Toast.LENGTH_LONG).show();
            setnewgame();
        }
    }
    public void setgame(View view) {

        Button bt = (Button) view;
        Toast.makeText(getApplicationContext(), "You snooze You lose", Toast.LENGTH_LONG).show();
        setnewgame();
    }

    public void setnewgame() {

        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        counter = 0;
    }
}


