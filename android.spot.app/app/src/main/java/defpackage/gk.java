package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gk extends bqj implements ActionProvider.VisibilityListener {
    public static final /* synthetic */ int b = 0;
    public final ActionProvider a;
    private njz c;

    public gk(ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    @Override // defpackage.bqj
    public final View a(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    @Override // defpackage.bqj
    public final void b(SubMenu subMenu) {
        this.a.onPrepareSubMenu(subMenu);
    }

    @Override // defpackage.bqj
    public final boolean c() {
        return this.a.hasSubMenu();
    }

    @Override // defpackage.bqj
    public final boolean d() {
        return this.a.isVisible();
    }

    @Override // defpackage.bqj
    public final boolean e() {
        return this.a.onPerformDefaultAction();
    }

    @Override // defpackage.bqj
    public final boolean f() {
        return this.a.overridesItemVisibility();
    }

    @Override // defpackage.bqj
    public final void g(njz njzVar) {
        this.c = njzVar;
        this.a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        njz njzVar = this.c;
        if (njzVar != null) {
            ((gj) njzVar.a).j.C();
        }
    }
}
