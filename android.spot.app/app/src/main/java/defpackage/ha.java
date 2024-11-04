package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ha extends gh implements SubMenu {
    public final gh l;
    public final gj m;

    public ha(Context context, gh ghVar, gj gjVar) {
        super(context);
        this.l = ghVar;
        this.m = gjVar;
    }

    @Override // defpackage.gh
    public final gh a() {
        return this.l.a();
    }

    @Override // defpackage.gh
    public final String d() {
        int i = this.m.a;
        if (i == 0) {
            return null;
        }
        return a.ae(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.m;
    }

    @Override // defpackage.gh
    public final void p(gf gfVar) {
        this.l.p(gfVar);
    }

    @Override // defpackage.gh, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.l.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.m.setIcon(i);
        return this;
    }

    @Override // defpackage.gh, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.l.setQwertyMode(z);
    }

    @Override // defpackage.gh
    public final boolean t(gj gjVar) {
        return this.l.t(gjVar);
    }

    @Override // defpackage.gh
    public final boolean u(gh ghVar, MenuItem menuItem) {
        if (!super.u(ghVar, menuItem) && !this.l.u(ghVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.gh
    public final boolean v(gj gjVar) {
        return this.l.v(gjVar);
    }

    @Override // defpackage.gh
    public final boolean w() {
        return this.l.w();
    }

    @Override // defpackage.gh
    public final boolean x() {
        return this.l.x();
    }

    @Override // defpackage.gh
    public final boolean y() {
        return this.l.y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.m.setIcon(drawable);
        return this;
    }
}
