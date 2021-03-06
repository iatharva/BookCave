package com.example.bookcave.extras;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bookcave.R;

public class PreviewBook extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_book);
        webView=findViewById(R.id.webview);
        Intent intent=getIntent();

        String link =intent.getStringExtra("book_preview");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(link);

        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        super.onBackPressed();
    }
}
