package com.google.android.apps.adm.guestmode;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.apps.adm.R;
import defpackage.ch;
import defpackage.cs;
import defpackage.duo;
import defpackage.hwx;
import defpackage.iqb;
import defpackage.jdl;
import defpackage.jer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GuestModeActivity extends cs {
    private jer p = jdl.a;

    public static void q(Context context) {
        context.startActivity(new Intent(context, (Class<?>) GuestModeActivity.class));
    }

    @Override // defpackage.oc, android.app.Activity
    public final void onBackPressed() {
        hwx.U(this.p.g());
        if (((WebView) this.p.c()).canGoBack()) {
            ((WebView) this.p.c()).goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aj, defpackage.oc, defpackage.cd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        iqb.b(this);
        h().p(5);
        setContentView(R.layout.activity_guest_mode);
        i((Toolbar) findViewById(R.id.toolbar));
        ch g = g();
        g.getClass();
        g.g(true);
        g.s();
        jer i = jer.i((WebView) findViewById(R.id.guest_mode_web_view));
        this.p = i;
        hwx.U(i.g());
        ((WebView) this.p.c()).setWebViewClient(new WebViewClient());
        WebSettings settings = ((WebView) this.p.c()).getSettings();
        settings.setUseWideViewPort(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(false);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setNeedInitialFocus(false);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
        ((WebView) this.p.c()).setFocusable(true);
        ((WebView) this.p.c()).setFocusableInTouchMode(true);
        if (bundle != null && bundle.getBoolean("WEBVIEW_STATE_SAVED_KEY", false)) {
            return;
        }
        ((WebView) this.p.c()).loadUrl(duo.a());
    }

    @Override // defpackage.cs, defpackage.aj, android.app.Activity
    public final void onDestroy() {
        hwx.U(this.p.g());
        ((WebView) this.p.c()).destroy();
        this.p = jdl.a;
        super.onDestroy();
    }

    @Override // defpackage.aj, android.app.Activity
    public final void onPause() {
        hwx.U(this.p.g());
        ((WebView) this.p.c()).onPause();
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        hwx.U(this.p.g());
        ((WebView) this.p.c()).restoreState(bundle);
    }

    @Override // defpackage.aj, android.app.Activity
    public final void onResume() {
        super.onResume();
        hwx.U(this.p.g());
        ((WebView) this.p.c()).onResume();
    }

    @Override // defpackage.oc, defpackage.cd, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        hwx.U(this.p.g());
        if (((WebView) this.p.c()).canGoBack()) {
            ((WebView) this.p.c()).saveState(bundle);
            bundle.putBoolean("WEBVIEW_STATE_SAVED_KEY", true);
        } else {
            bundle.putBoolean("WEBVIEW_STATE_SAVED_KEY", false);
        }
    }
}
