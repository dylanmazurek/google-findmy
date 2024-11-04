package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cs extends aj {
    private cw p;

    public cs() {
        R().b("androidx:appcompat", new ap(this, 2));
        m(new cr(this, 0));
    }

    private final void q() {
        bty.e(getWindow().getDecorView(), this);
        buu.g(getWindow().getDecorView(), this);
        bza.d(getWindow().getDecorView(), this);
        ix.b(getWindow().getDecorView(), this);
    }

    @Override // defpackage.oc, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        h().d(view, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:            if (r4 != null) goto L208;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:            r4.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:            if (r4 == null) goto L46;     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void attachBaseContext(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ch g = g();
        if (getWindow().hasFeature(0)) {
            if (g == null || !g.l()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.cd, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ch g = g();
        if (keyCode == 82 && g != null && g.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return h().c(i);
    }

    public final ch g() {
        return h().b();
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        dn dnVar = (dn) h();
        if (dnVar.o == null) {
            dnVar.E();
            ch chVar = dnVar.n;
            if (chVar != null) {
                context = chVar.b();
            } else {
                context = dnVar.k;
            }
            dnVar.o = new fo(context);
        }
        return dnVar.o;
    }

    public final cw h() {
        if (this.p == null) {
            int i = cw.b;
            this.p = new dn(this, null, this);
        }
        return this.p;
    }

    public final void i(Toolbar toolbar) {
        dn dnVar = (dn) h();
        if (!(dnVar.j instanceof Activity)) {
            return;
        }
        ch b = dnVar.b();
        if (!(b instanceof ea)) {
            dnVar.o = null;
            if (b != null) {
                b.e();
            }
            dnVar.n = null;
            if (toolbar != null) {
                du duVar = new du(toolbar, dnVar.x(), dnVar.m);
                dnVar.n = duVar;
                dnVar.m.d = duVar.d;
                if (!toolbar.A) {
                    toolbar.A = true;
                    toolbar.u();
                }
            } else {
                dnVar.m.d = null;
            }
            dnVar.f();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        h().f();
    }

    @Override // defpackage.oc, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ch b;
        super.onConfigurationChanged(configuration);
        dn dnVar = (dn) h();
        if (dnVar.y && dnVar.v && (b = dnVar.b()) != null) {
            b.r();
        }
        ib.d().e(dnVar.k);
        dnVar.G = new Configuration(dnVar.k.getResources().getConfiguration());
        dnVar.S(false, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        h().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.aj, defpackage.oc, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent d;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ch g = g();
        if (menuItem.getItemId() == 16908332 && g != null && (g.a() & 4) != 0 && (d = box.d(this)) != null) {
            if (shouldUpRecreateTask(d)) {
                bqp bqpVar = new bqp(this);
                Intent d2 = box.d(this);
                if (d2 == null) {
                    d2 = box.d(this);
                }
                if (d2 != null) {
                    ComponentName component = d2.getComponent();
                    if (component == null) {
                        component = d2.resolveActivity(bqpVar.b.getPackageManager());
                    }
                    int size = bqpVar.a.size();
                    try {
                        for (Intent e = box.e(bqpVar.b, component); e != null; e = box.e(bqpVar.b, e.getComponent())) {
                            bqpVar.a.add(size, e);
                        }
                        bqpVar.a.add(d2);
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e2);
                    }
                }
                if (!bqpVar.a.isEmpty()) {
                    Intent[] intentArr = (Intent[]) bqpVar.a.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    bqpVar.b.startActivities(intentArr, null);
                    try {
                        finishAffinity();
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            navigateUpTo(d);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((dn) h()).D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aj, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        ch b = ((dn) h()).b();
        if (b != null) {
            b.h(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aj, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((dn) h()).S(true, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aj, android.app.Activity
    public final void onStop() {
        super.onStop();
        h().h();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        h().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ch g = g();
        if (getWindow().hasFeature(0)) {
            if (g == null || !g.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.oc, android.app.Activity
    public final void setContentView(int i) {
        q();
        h().j(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((dn) h()).H = i;
    }

    @Override // defpackage.oc, android.app.Activity
    public final void setContentView(View view) {
        q();
        h().k(view);
    }

    @Override // defpackage.oc, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        h().l(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
