package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hs implements gf {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gf
    public final void F(gh ghVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (!((Toolbar) this.a).a.m()) {
                    ((Toolbar) this.a).B.k(ghVar);
                }
                gf gfVar = ((Toolbar) this.a).z;
                if (gfVar != null) {
                    gfVar.F(ghVar);
                    return;
                }
                return;
            }
            if (((du) this.a).c.l()) {
                ((du) this.a).a.onPanelClosed(108, ghVar);
                return;
            } else {
                if (((du) this.a).a.onPreparePanel(0, null, ghVar)) {
                    ((du) this.a).a.onMenuOpened(108, ghVar);
                    return;
                }
                return;
            }
        }
        gf gfVar2 = ((ActionMenuView) this.a).d;
        if (gfVar2 != null) {
            gfVar2.F(ghVar);
        }
    }

    @Override // defpackage.gf
    public final boolean J(gh ghVar, MenuItem menuItem) {
        njz njzVar;
        if (this.b != 0 || (njzVar = ((ActionMenuView) this.a).e) == null) {
            return false;
        }
        if (((Toolbar) njzVar.a).B.m(menuItem)) {
            return true;
        }
        njz njzVar2 = ((Toolbar) njzVar.a).C;
        if (njzVar2 == null || !((du) njzVar2.a).a.onMenuItemSelected(0, menuItem)) {
            return false;
        }
        return true;
    }
}
