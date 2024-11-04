package com.google.android.apps.adm.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.google.android.apps.adm.R;
import defpackage.bsh;
import defpackage.cgq;
import defpackage.col;
import defpackage.ddh;
import defpackage.duz;
import defpackage.dvc;
import defpackage.dve;
import defpackage.dvh;
import defpackage.dvi;
import defpackage.iqb;
import defpackage.iuu;
import defpackage.iv;
import defpackage.jbn;
import defpackage.jbx;
import defpackage.jck;
import defpackage.jer;
import defpackage.jxv;
import defpackage.lzl;
import defpackage.oe;
import defpackage.of;
import defpackage.og;
import defpackage.oh;
import defpackage.oi;
import defpackage.oj;
import defpackage.ok;
import defpackage.oz;
import defpackage.qk;
import defpackage.ts;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MainActivity extends dvc {
    public boolean q;
    public final HashMap r = new HashMap();
    private duz s;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v2, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [moh, java.lang.Object] */
    @Override // defpackage.dvc, defpackage.aj, defpackage.oc, defpackage.cd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ts tsVar = ts.b;
        int i = 0;
        oz ozVar = new oz(0, 0, tsVar);
        oz ozVar2 = new oz(oe.a, oe.b, tsVar);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ?? r0 = ozVar.c;
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) r0.a(resources)).booleanValue();
        ?? r02 = ozVar2.c;
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean booleanValue2 = ((Boolean) r02.a(resources2)).booleanValue();
        iv ivVar = oe.c;
        if (ivVar == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                ivVar = new ok();
            } else if (Build.VERSION.SDK_INT >= 29) {
                ivVar = new oj();
            } else if (Build.VERSION.SDK_INT >= 28) {
                ivVar = new oi();
            } else if (Build.VERSION.SDK_INT >= 26) {
                ivVar = new oh();
            } else if (Build.VERSION.SDK_INT >= 23) {
                ivVar = new og();
            } else {
                ivVar = new of();
                oe.c = ivVar;
            }
        }
        Window window = getWindow();
        window.getClass();
        ivVar.c(ozVar, ozVar2, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        window2.getClass();
        ivVar.b(window2);
        super.onCreate(bundle);
        dvi dviVar = (dvi) new ddh((cgq) this).q(dvi.class);
        if (!dviVar.e.g()) {
            jck E = iuu.E(iuu.l(new col(dviVar, 15, null), dviVar.c), jbx.d(dviVar.f.h()).h(dvi.b.getSeconds(), TimeUnit.SECONDS, dviVar.c).a(TimeoutException.class, new dvh(i), jxv.a));
            col colVar = new col(dviVar, 16, null);
            dviVar.e = jer.i(((lzl) E.a).c(jbn.f(colVar), jxv.a));
        }
        dviVar.d.g(this, new qk(this, 8));
        iqb.b(this);
        setContentView(R.layout.activity_main);
        View findViewById = findViewById(android.R.id.content);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new dve(this, findViewById));
        duz duzVar = (duz) new ddh((cgq) this).q(duz.class);
        this.s = duzVar;
        Intent intent = getIntent();
        if (!duzVar.b) {
            duzVar.a.l(jer.i(intent));
            duzVar.b = true;
        }
        getWindow().setSoftInputMode(32);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oc, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.s.a.l(jer.i(intent));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.aj, defpackage.oc, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        HashMap hashMap = this.r;
        Integer valueOf = Integer.valueOf(i);
        if (((bsh) hashMap.get(valueOf)) != null) {
            this.r.remove(valueOf);
        }
    }
}
