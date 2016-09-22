package com.packetpub.webview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Mesa extends AppCompatActivity {


    private WebView webViewMesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa);

        webViewMesa = (WebView) findViewById(R.id.webViewMesa);
        webViewMesa.setWebViewClient(new WebViewClient());
        webViewMesa.loadUrl("http://www.sdmesa.edu");
    }
}
