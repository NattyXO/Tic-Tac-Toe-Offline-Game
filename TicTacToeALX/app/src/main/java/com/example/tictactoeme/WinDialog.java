// Name: Natnael Bizuneh
// Biniyam Asefa
// Birra Haile
//
// Import necessary libraries
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;

// Define WinDialog class which extends Dialog class
public class WinDialog extends Dialog {


// Declare private variables to hold message and MainActivity object
private final String message;
private final MainActivity mainActivity;

// Define constructor with Context and message parameters
public WinDialog(@NonNull Context context, String message) {
    super(context);
    this.message = message;
    this.mainActivity = (MainActivity) context;
}

// Override onCreate method
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    
    // Set the content view of the dialog to win_dialog_layout.xml
    setContentView(R.layout.win_dialog_layout);

    // Get the message TextView and start again button
    final TextView msgTextView = findViewById(R.id.msgTextView);
    final AppCompatButton startAgainBtn = findViewById(R.id.startAgainBtn);

    // Set the message text to the message passed into the constructor
    msgTextView.setText(message);

    // Set an onClickListener for the start again button
    startAgainBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Call the startMatchAgain method in the MainActivity object and dismiss the dialog
            mainActivity.startMatchAgain();
            dismiss();
        }
    });
}
}