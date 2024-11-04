package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fw extends kf {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.kf
    public final gx a() {
        hj hjVar;
        njz njzVar = this.a.c;
        if (njzVar != null && (hjVar = ((ho) njzVar.a).k) != null) {
            return hjVar.a();
        }
        return null;
    }

    @Override // defpackage.kf
    public final boolean b() {
        gx a;
        ActionMenuItemView actionMenuItemView = this.a;
        gg ggVar = actionMenuItemView.b;
        if (ggVar == null || !ggVar.b(actionMenuItemView.a) || (a = a()) == null || !a.x()) {
            return false;
        }
        return true;
    }
}
