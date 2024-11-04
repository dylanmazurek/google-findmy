package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oc extends cd implements cfc, cgq, ces, cjz, oy, pl, pe, bqy, bqz, bv, bw, buz {
    private final mkt a;
    private final CopyOnWriteArrayList b;
    private boolean c;
    private boolean d;
    private final mkt e;
    public final pk h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;
    public final CopyOnWriteArrayList k;
    public final CopyOnWriteArrayList l;
    public final CopyOnWriteArrayList m;
    public final nz n;
    private final mkt p;
    private final drz q;
    private ddh r;
    public final pa g = new pa();
    public final apc o = new apc(new nl(this, 3));

    public oc() {
        int i = 3;
        drz drzVar = new drz((cjz) this);
        this.q = drzVar;
        this.n = new nz(this);
        int i2 = 0;
        this.a = new mla(new ob(this, 0));
        new AtomicInteger();
        this.h = new pk(this);
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.b = new CopyOnWriteArrayList();
        cex cexVar = this.f;
        if (cexVar != null) {
            cexVar.a(new nw(this, 1));
            this.f.a(new nw(this, i2));
            this.f.a(new nx(this, 0));
            drzVar.d();
            cge.c(this);
            if (Build.VERSION.SDK_INT <= 23) {
                this.f.a(new oo(this));
            }
            R().b("android:support:activity-result", new ap(this, i));
            m(new cr(this, 2));
            this.e = new mla(new ob(this, 1));
            this.p = new mla(new ob(this, 2));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Override // defpackage.pe
    public final pf L(pn pnVar, pd pdVar) {
        throw null;
    }

    public cgn P() {
        return (cgn) this.e.a();
    }

    @Override // defpackage.ces
    public final cgu Q() {
        Bundle bundle = null;
        cgv cgvVar = new cgv((byte[]) null);
        if (getApplication() != null) {
            cgt cgtVar = cgm.b;
            Application application = getApplication();
            application.getClass();
            cgvVar.b(cgtVar, application);
        }
        cgvVar.b(cge.a, this);
        cgvVar.b(cge.b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        }
        if (bundle != null) {
            cgvVar.b(cge.c, bundle);
        }
        return cgvVar;
    }

    @Override // defpackage.cjz
    public final cjy R() {
        return (cjy) this.q.b;
    }

    @Override // defpackage.cgq
    public final ddh aE() {
        if (getApplication() != null) {
            n();
            ddh ddhVar = this.r;
            ddhVar.getClass();
            return ddhVar;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.n.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.oy
    public final ox c() {
        return (ox) this.p.a();
    }

    @Override // defpackage.pl
    public final pk d() {
        throw null;
    }

    public final void k(ox oxVar) {
        this.f.a(new bva(oxVar, this, 1));
    }

    public final void l(buc bucVar) {
        bucVar.getClass();
        this.i.add(bucVar);
    }

    public final void m(pb pbVar) {
        pa paVar = this.g;
        if (paVar.b != null) {
            pbVar.a();
        }
        paVar.a.add(pbVar);
    }

    public final void n() {
        if (this.r == null) {
            lrs lrsVar = (lrs) getLastNonConfigurationInstance();
            if (lrsVar != null) {
                this.r = (ddh) lrsVar.a;
            }
            if (this.r == null) {
                this.r = new ddh((byte[]) null, (char[]) null);
            }
        }
    }

    public final void o() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        bty.e(decorView, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        buu.g(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        bza.d(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        ix.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    @mkp
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.h.e(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    @mkp
    public void onBackPressed() {
        c().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((buc) it.next()).a(configuration);
        }
    }

    @Override // defpackage.cd, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.q.e(bundle);
        pa paVar = this.g;
        paVar.b = this;
        Iterator it = paVar.a.iterator();
        while (it.hasNext()) {
            ((pb) it.next()).a();
        }
        super.onCreate(bundle);
        int i = cfw.a;
        bte.f(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onCreatePanelMenu(0, menu);
            this.o.j(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.o.m(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @mkp
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.c) {
            return;
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((buc) it.next()).a(new hwh(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((buc) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.o.c).iterator();
        while (it.hasNext()) {
            ((bvd) it.next()).b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @mkp
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.d) {
            return;
        }
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((buc) it.next()).a(new hwh(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onPreparePanel(0, view, menu);
            this.o.k(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @mkp
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (!this.h.e(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        lrs lrsVar;
        Object obj = this.r;
        if (obj == null && (lrsVar = (lrs) getLastNonConfigurationInstance()) != null) {
            obj = lrsVar.a;
        }
        if (obj == null) {
            return null;
        }
        lrs lrsVar2 = new lrs();
        lrsVar2.a = obj;
        return lrsVar2;
    }

    @Override // defpackage.cd, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        cex cexVar = this.f;
        if (cexVar instanceof cex) {
            cexVar.getClass();
            cexVar.d(cew.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.q.f(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((buc) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final drz p() {
        return (drz) this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Iterable] */
    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (bzo.f()) {
                bzo.e("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            drz p = p();
            synchronized (p.c) {
                p.a = true;
                Iterator it = p.b.iterator();
                while (it.hasNext()) {
                    ((mnw) it.next()).a();
                }
                p.b.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        o();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.n.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @mkp
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @mkp
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.c = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.c = false;
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                ((buc) it.next()).a(new hwh(z));
            }
        } catch (Throwable th) {
            this.c = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.d = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.d = false;
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((buc) it.next()).a(new hwh(z));
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @mkp
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @mkp
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        o();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.n.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.n.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
