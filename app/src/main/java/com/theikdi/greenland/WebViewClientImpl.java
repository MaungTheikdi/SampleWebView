package com.theikdi.greenland;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewClientImpl extends WebViewClient {
    private Activity activity = null;

    public WebViewClientImpl(Activity activity) {
        this.activity = activity;
    }
    /*public void onPageS (WebView view, String url, Bitmap bitmap){
        super.onPageStarted(view,url,bitmap);
        Toast.makeText(activity.getApplicationContext(),"Loading",Toast.LENGTH_LONG);
    }
    public void onPageF (WebView view, String url){
        super.onPageFinished(view,url);
        Toast.makeText(activity.getApplicationContext(),"Connected",Toast.LENGTH_SHORT);
    } */

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        if(url.indexOf("greenland.theikdimaung.com") > -1 ) return false;

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);
        return true;
    }


}
