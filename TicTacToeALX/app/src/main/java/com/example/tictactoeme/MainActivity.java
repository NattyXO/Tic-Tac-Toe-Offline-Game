package com.example.tictactoeme;

// Build your portfolio project (Week 1): Making Progress
// Project Title:- Tic Tac Toe Game

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Initialize combinations to check user win
    private final List<int[]> combinationsList = new ArrayList<>();

    // every box position will be acquired by either Player One or Player Two
    private int[] boxPositions = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    // playerTurn = 1 means Player One is turn and playerTurn = 2 means Player Two is turn
    private int playerTurn = 1;

    // total selected boxes either by Player One or Player Two
    private int totalSelectedBoxes = 1;

    private LinearLayout player1Layout, player2Layout;
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9;
    private TextView player1Name, player2Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize widgets from activity_main.xml file
        player1Layout = findViewById(R.id.player1Layout);
        player2Layout = findViewById(R.id.player2Layout);
        player1Name = findViewById(R.id.player1TV);
        player2Name = findViewById(R.id.player2TV);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);

        // add all possible winning combinations to List
        combinationsList.add(new int[]{0, 1, 2});
        combinationsList.add(new int[]{3, 4, 5});
        combinationsList.add(new int[]{6, 7, 8});
        combinationsList.add(new int[]{0, 3, 6});
        combinationsList.add(new int[]{1, 4, 7});
        combinationsList.add(new int[]{2, 5, 8});
        combinationsList.add(new int[]{2, 4, 6});
        combinationsList.add(new int[]{0, 4, 8});

        // Get Player Names from AddPlayers.java activity via intent
        final String playerOneName = getIntent().getStringExtra("playerOne");
        final String playerTwoName = getIntent().getStringExtra("playerTwo");

        // Set Player Names to TextViews
        player1Name.setText(playerOneName);
        player2Name.setText(playerTwoName);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(0)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 0);
                }
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(1)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 1);
                }
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(2)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 2);
                }
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(3)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 3);
                }
            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(4)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 4);
                }
            }
        });
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(5)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 5);
                }
            }
        });
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(6)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 6);
                }
            }
        });
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(7)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 7);
                }
            }
        });
        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(8)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 8);
                }
            }
        });
    }

    /**
     * @param imageView           image box on which we are going to set cross or zero image according to player turn
     * @param selectedBoxPosition user selected box position to make this box non selectable again
     */
  

    }
	
