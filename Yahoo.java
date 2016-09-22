package com.packetpub.webview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Yahoo extends AppCompatActivity {

    private WebView webViewYahoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahoo);
        webViewYahoo = (WebView) findViewById(R.id.webViewYahoo);
        webViewYahoo.setWebViewClient(new WebViewClient());
        webViewYahoo.loadUrl("https://www.Yahoo.com");
    }
}
