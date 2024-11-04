package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ins extends bop {
    private int a;
    private lir b;

    public ins() {
        this.a = 0;
    }

    public final int G() {
        lir lirVar = this.b;
        if (lirVar != null) {
            return lirVar.a;
        }
        return 0;
    }

    public final boolean H(int i) {
        lir lirVar = this.b;
        if (lirVar != null) {
            return lirVar.S(i);
        }
        this.a = i;
        return false;
    }

    protected void cV(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.j(view, i);
    }

    @Override // defpackage.bop
    public boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        cV(coordinatorLayout, view, i);
        if (this.b == null) {
            this.b = new lir(view);
        }
        this.b.R();
        this.b.Q();
        int i2 = this.a;
        if (i2 != 0) {
            this.b.S(i2);
            this.a = 0;
            return true;
        }
        return true;
    }

    public ins(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
