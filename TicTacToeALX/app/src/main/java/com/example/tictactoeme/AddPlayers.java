package com.example.tictactoeme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);


        // Click listener when user press Start Game Button
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Get Values of players from EditText to a String Variables
                final String playerOneName = playerOne.getText().toString();
                final String playerTwoName = playerTwo.getText().toString();

                // Check if user not entered Player Names
                if (playerOneName.isEmpty() || playerTwoName.isEmpty()) {
                    Toast.makeText(AddPlayers.this, "Please enter Player Names", Toast.LENGTH_SHORT).show();
                } else {

                    // Create Object of Intent class to Open GameView Screen (MainActivity.java)
                    Intent intent = new Intent(AddPlayers.this, MainActivity.class);

                    // put both players names along with intent
                    intent.putExtra("playerOne", playerOneName);
                    intent.putExtra("playerTwo", playerTwoName);

                    // open MainActivity.java Activity
                    startActivity(intent);
                }
            }
        });
    }
}