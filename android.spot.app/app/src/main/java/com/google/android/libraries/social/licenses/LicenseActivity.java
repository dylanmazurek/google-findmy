package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import defpackage.cs;
import defpackage.hwx;
import defpackage.hzx;
import defpackage.oa;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LicenseActivity extends cs {
    @Override // defpackage.aj, defpackage.oc, defpackage.cd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        hzx hzxVar = (hzx) getIntent().getParcelableExtra("license");
        if (g() != null) {
            g().j(hzxVar.a);
            g().s();
            g().g(true);
            g().u();
        }
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        long j = hzxVar.b;
        int i = hzxVar.c;
        String str2 = hzxVar.d;
        if (str2.isEmpty()) {
            str = hwx.e(this, "third_party_licenses", j, i);
        } else {
            try {
                String d = hwx.d(new BufferedInputStream(new FileInputStream(str2)), j, i);
                if (d != null) {
                    if (!d.isEmpty()) {
                        str = d;
                    }
                }
            } catch (FileNotFoundException unused) {
            }
            throw new RuntimeException(String.valueOf(str2).concat(" does not contain res/raw/third_party_licenses"));
        }
        if (str == null) {
            finish();
        } else {
            textView.setText(str);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new oa(this, i, scrollView, 8));
        }
    }

    @Override // defpackage.oc, defpackage.cd, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
