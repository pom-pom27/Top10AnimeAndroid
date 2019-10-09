package com.example.myrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class AboutApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("About");
        }
    }


    public void onClickWhatsApp(View view) {

        String phoneNumberWithCountryCode = "+62895372466151";
        String message = "Anjay";

        startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(
                        String.format("https://api.whatsapp.com/send?phone=%s&text=%s",
                                phoneNumberWithCountryCode, message))));
    }

    public void toGmail(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "seljarante@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Halo");
        emailIntent.putExtra(Intent.EXTRA_TEXT,  "Anjay");
        startActivity(Intent.createChooser(emailIntent, null));
    }

    public void toInstagram(View view) {
        Uri uri = Uri.parse("http://instagram.com/_u/eja.js");
        Intent insta = new Intent(Intent.ACTION_VIEW, uri);
        insta.setPackage("com.instagram.android");

        if (isIntentAvailable(getApplicationContext(), insta)){
            startActivity(insta);
        } else{
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/eja.js")));
        }
    }


    private boolean isIntentAvailable(Context ctx, Intent intent) {
        final PackageManager packageManager = ctx.getPackageManager();
        List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
        return list.size() > 0;
    }
}
