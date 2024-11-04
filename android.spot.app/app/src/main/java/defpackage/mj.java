package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mj extends buk {
    final RecyclerView a;
    public final mi b;

    public mj(RecyclerView recyclerView) {
        this.a = recyclerView;
        mi miVar = this.b;
        if (miVar != null) {
            this.b = miVar;
        } else {
            this.b = new mi(this);
        }
    }

    @Override // defpackage.buk
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        lr lrVar;
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !j() && (lrVar = ((RecyclerView) view).m) != null) {
            lrVar.S(accessibilityEvent);
        }
    }

    @Override // defpackage.buk
    public final void c(View view, byn bynVar) {
        lr lrVar;
        super.c(view, bynVar);
        if (!j() && (lrVar = this.a.m) != null) {
            RecyclerView recyclerView = lrVar.s;
            lrVar.cI(recyclerView.e, recyclerView.M, bynVar);
        }
    }

    @Override // defpackage.buk
    public final boolean i(View view, int i, Bundle bundle) {
        lr lrVar;
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (!j() && (lrVar = this.a.m) != null) {
            return lrVar.cL(i, bundle);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        return this.a.af();
    }
}
