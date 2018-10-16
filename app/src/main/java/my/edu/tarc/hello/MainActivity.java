package my.edu.tarc.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main() function
        super.onCreate(savedInstanceState);

        //This method creates the UI
        //R = resource class
        //layout = design of UI (a folder)
        setContentView(R.layout.activity_main);

    }

    //a function that click on the button will show the message
    public void showMessage(View view){ //Button use View to function
        //link UI to the program
        TextView textViewMessage;  //TextView is a class; textViewMessage is instance
        textViewMessage = findViewById(R.id.textViewMessage);
        textViewMessage.setText("Hello, <your name here>");

    }
}
