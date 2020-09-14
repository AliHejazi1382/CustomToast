package com.example.classing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toast toast;
    CustomToast customToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.customToast = new CustomToast(this, 10);
    }

    public void btnsListeners(View view) {

        switch ((String)view.getTag()){
            case "simple":
                Toast.makeText(this, "this is a simple toast", Toast.LENGTH_SHORT).show();
                break;
            case "red":
                this.toast = Toast.makeText(this, "this is a red toast", Toast.LENGTH_SHORT);
                this.customToast.makeRedToast(this.toast).show();
                break;
            case "green":
                this.toast = Toast.makeText(this, "this is a green toast", Toast.LENGTH_SHORT);
                this.customToast.makeGreenToast(this.toast).show();
                break;
            case "blue":
                this.toast = Toast.makeText(this, "this is a blue toast", Toast.LENGTH_SHORT);
                this.customToast.makeBlueToast(this.toast).show();
                break;
            case "orange":
                this.toast = Toast.makeText(this, "this is an orange toast", Toast.LENGTH_SHORT);
                this.customToast.makeOrangeToast(this.toast).show();
                break;
            case "yellow":
                this.toast = Toast.makeText(this, "this is a yellow toast", Toast.LENGTH_SHORT);
                this.customToast.makeYellowToast(this.toast).show();
                break;
            case "error":
                this.customToast.makeErrorToast("this is an error toast").show();
                break;
            case "warning":
                this.customToast.makeWaringToast("this is a warning toast").show();
                break;
            case "successful":
                this.customToast.makeSuccessfulToast("this is a successful toast").show();
                break;
            case "info":
                this.customToast.makeInfoToast("this is a info toast").show();
                break;
        }
    }
}