package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class du extends ch {
    public final Window.Callback a;
    boolean b;
    public final nj c;
    final njz d;
    private boolean e;
    private boolean f;
    private final ArrayList g = new ArrayList();
    private final Runnable h = new w(this, 7, null);
    private final njz i;

    public du(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        njz njzVar = new njz(this, null);
        this.i = njzVar;
        nj njVar = new nj(toolbar, false);
        this.c = njVar;
        bqd.n(callback);
        this.a = callback;
        njVar.d = callback;
        toolbar.C = njzVar;
        njVar.i(charSequence);
        this.d = new njz(this, null);
    }

    @Override // defpackage.ch
    public final int a() {
        return this.c.b;
    }

    @Override // defpackage.ch
    public final Context b() {
        return this.c.a();
    }

    @Override // defpackage.ch
    public final void d(boolean z) {
        if (z != this.f) {
            this.f = z;
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                ((cg) this.g.get(i)).a();
            }
        }
    }

    @Override // defpackage.ch
    public final void e() {
        this.c.a.removeCallbacks(this.h);
    }

    @Override // defpackage.ch
    public final void g(boolean z) {
        w(4, 4);
    }

    @Override // defpackage.ch
    public final void i(int i) {
        this.c.g(this.c.a().getText(i));
    }

    @Override // defpackage.ch
    public final void j(CharSequence charSequence) {
        this.c.g(charSequence);
    }

    @Override // defpackage.ch
    public final void k(CharSequence charSequence) {
        this.c.i(charSequence);
    }

    @Override // defpackage.ch
    public final boolean l() {
        return this.c.k();
    }

    @Override // defpackage.ch
    public final boolean m() {
        if (this.c.j()) {
            this.c.b();
            return true;
        }
        return false;
    }

    @Override // defpackage.ch
    public final boolean n() {
        this.c.a.removeCallbacks(this.h);
        Toolbar toolbar = this.c.a;
        int[] iArr = bwn.a;
        toolbar.postOnAnimation(this.h);
        return true;
    }

    @Override // defpackage.ch
    public final boolean o(int i, KeyEvent keyEvent) {
        int i2;
        Menu v = v();
        if (v == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        v.setQwertyMode(z);
        return v.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.ch
    public final boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // defpackage.ch
    public final boolean q() {
        return this.c.m();
    }

    @Override // defpackage.ch
    public final void s() {
        w(2, 2);
    }

    @Override // defpackage.ch
    public final void t() {
        w(0, 8);
    }

    @Override // defpackage.ch
    public final void u() {
        this.c.e(null);
    }

    public final Menu v() {
        if (!this.e) {
            nj njVar = this.c;
            dt dtVar = new dt(this);
            hs hsVar = new hs(this, 1);
            Toolbar toolbar = njVar.a;
            toolbar.y = dtVar;
            toolbar.z = hsVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.i(dtVar, hsVar);
            }
            this.e = true;
        }
        return this.c.a.f();
    }

    public final void w(int i, int i2) {
        nj njVar = this.c;
        njVar.d((i & i2) | (njVar.b & (~i2)));
    }

    @Override // defpackage.ch
    public final void r() {
    }

    @Override // defpackage.ch
    public final void f(boolean z) {
    }

    @Override // defpackage.ch
    public final void h(boolean z) {
    }
}
