package com.example.easyassist;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class singup extends AppCompatActivity {
    private Button signup;
    private TextView signuparrow;

    private EditText fullnameEditText;
    private EditText addressEditText;
    private EditText contactEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText confirmPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_singup);

        // Initialize views
        signup = findViewById(R.id.signButton);
        signuparrow = findViewById(R.id.arrow);
        fullnameEditText = findViewById(R.id.Fullname);
        addressEditText = findViewById(R.id.Address);
        contactEditText = findViewById(R.id.Contact);
        emailEditText = findViewById(R.id.Email);
        passwordEditText = findViewById(R.id.Password);
        confirmPasswordEditText = findViewById(R.id.ConfirmPassword);

        // Set click listener for the signup button
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve input values
                String fullname = fullnameEditText.getText().toString().trim();
                String address = addressEditText.getText().toString().trim();
                String contact = contactEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();
                String confirmPassword = confirmPasswordEditText.getText().toString().trim();

                // Validate inputs
                if (TextUtils.isEmpty(fullname)) {
                    fullnameEditText.setError("Full name is required");
                    fullnameEditText.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(address)) {
                    addressEditText.setError("Address is required");
                    addressEditText.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(contact)) {
                    contactEditText.setError("Contact number is required");
                    contactEditText.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(email)) {
                    emailEditText.setError("Email is required");
                    emailEditText.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    passwordEditText.setError("Password is required");
                    passwordEditText.requestFocus();
                    return;
                }
                if (!password.equals(confirmPassword)) {
                    confirmPasswordEditText.setError("Passwords do not match");
                    confirmPasswordEditText.requestFocus();
                    return;
                }

                // TODO: Implement sign-up logic (e.g., send data to server, save in database)

                // For now, show a success message
                Toast.makeText(singup.this, "Sign-up successful", Toast.LENGTH_SHORT).show();
            }
        });

        // Set click listener for the back arrow
        signuparrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singup.this, login.class);
                startActivity(intent);
            }
        });
    }
}
