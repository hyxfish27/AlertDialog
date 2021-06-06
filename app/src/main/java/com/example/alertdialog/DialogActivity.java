package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {

    Button btnWin, btnLose;
    Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWin = findViewById(R.id.btnWin);
        btnLose = findViewById(R.id.btnLose);
        dialog = new Dialog(this);

        btnWin.setOnClickListener(v -> {
            openWinDialog();

        });

        btnLose.setOnClickListener(v -> {
            openLoseDialog();

        });
    }

    private void openWinDialog() {
        dialog.setContentView(R.layout.activity_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose = dialog.findViewById(R.id.imageViewClose);
        Button btnLike = dialog.findViewById(R.id.btnLike);

        imageViewClose.setOnClickListener(v -> {
            dialog.dismiss();
            Toast.makeText(DialogActivity.this, "Close Page", Toast.LENGTH_SHORT).show();
        });
        dialog.show();
    }

    private void openLoseDialog() {
        dialog.setContentView(R.layout.type_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose = dialog.findViewById(R.id.imageViewClose);
        Button btnLike = dialog.findViewById(R.id.btnLike);

        imageViewClose.setOnClickListener(v -> {
            dialog.dismiss();
            Toast.makeText(DialogActivity.this, "Close Page", Toast.LENGTH_SHORT).show();
        });
        dialog.show();

    }
}