package com.google.android.libraries.onegoogle.accountmanagement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import defpackage.hbb;
import defpackage.jer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AddAccountActivity extends Activity {
    private boolean a;

    public static void a(View view) {
        Context context = view.getContext();
        context.startActivity(new Intent(context, (Class<?>) AddAccountActivity.class));
    }

    private final void b(Bundle bundle) {
        this.a = bundle.getBoolean("isAddActivityStarted");
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9) {
            hbb hbbVar = hbb.a;
            if (hbbVar.b) {
                hbbVar.b = false;
                hbbVar.c = jer.i(Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hbb.a.b = true;
        if (bundle != null) {
            b(bundle);
        }
        if (!this.a) {
            Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
            intent.putExtra("account_types", new String[]{"com.google"});
            startActivityForResult(intent, 9);
            this.a = true;
        }
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        b(bundle);
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isAddActivityStarted", this.a);
    }
}
