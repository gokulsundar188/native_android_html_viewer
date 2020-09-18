package com.example.htmlviewer;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button filePicker;
    EditText filePath;
    Intent myFileIntent;
    WebView wview;

    private static final int PERMISSION_REQUEST_STORAGE = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
//            requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, PERMISSION_REQUEST_STORAGE);
//        }

//        filePicker = (Button) findViewById(R.id.filePick);
//        filePath = (EditText) findViewById(R.id.txtView);
//        filePath.setMovementMethod(new ScrollingMovementMethod());
        wview = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = wview.getSettings();
        webSettings.setAllowFileAccess(true);
//        wview.loadUrl("file:///android_asset/empty_path.html");
        wview.loadUrl("https://473b92f7efc437ed05ea1669d5c69acd.532c28d5412dd75bf975fb951c740a30.productions/live48");

//        filePicker.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                myFileIntent = new Intent(Intent.ACTION_GET_CONTENT);
//                myFileIntent.setType("*/*");
//                startActivityForResult(myFileIntent, 10);

//            }
//        });
    }

//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if (requestCode == PERMISSION_REQUEST_STORAGE) {
//            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
//            } else {
//                Toast.makeText(this, "Permission Not Granted", Toast.LENGTH_SHORT).show();
//                finish();
//            }
//        }
//    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        switch (requestCode) {
//            case 10:
//                if (resultCode == RESULT_OK) {
//                    String path = data.getData().getPath().toString();
//                    path = "file:///" + path.replaceFirst("document/raw:/", "");
//                    filePath.setText(path);
//                    wview.setWebViewClient(new WebViewClient());
//                    wview.loadUrl(path);
//                }
//                break;
//        }
//    }

}