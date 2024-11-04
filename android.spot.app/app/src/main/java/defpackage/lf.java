package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lf extends lg {
    public lf(lr lrVar) {
        super(lrVar);
    }

    @Override // defpackage.lg
    public final int a(View view) {
        return lr.bo(view) + ((ls) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.lg
    public final int b(View view) {
        ls lsVar = (ls) view.getLayoutParams();
        return lr.bb(view) + lsVar.topMargin + lsVar.bottomMargin;
    }

    @Override // defpackage.lg
    public final int c(View view) {
        ls lsVar = (ls) view.getLayoutParams();
        return lr.bc(view) + lsVar.leftMargin + lsVar.rightMargin;
    }

    @Override // defpackage.lg
    public final int d(View view) {
        return lr.br(view) - ((ls) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.lg
    public final int e() {
        return this.a.D;
    }

    @Override // defpackage.lg
    public final int f() {
        lr lrVar = this.a;
        return lrVar.D - lrVar.getPaddingBottom();
    }

    @Override // defpackage.lg
    public final int g() {
        return this.a.getPaddingBottom();
    }

    @Override // defpackage.lg
    public final int h() {
        return this.a.B;
    }

    @Override // defpackage.lg
    public final int i() {
        return this.a.A;
    }

    @Override // defpackage.lg
    public final int j() {
        return this.a.getPaddingTop();
    }

    @Override // defpackage.lg
    public final int k() {
        lr lrVar = this.a;
        return (lrVar.D - lrVar.getPaddingTop()) - this.a.getPaddingBottom();
    }

    @Override // defpackage.lg
    public final int l(View view) {
        this.a.bh(view, this.c);
        return this.c.bottom;
    }

    @Override // defpackage.lg
    public final int m(View view) {
        this.a.bh(view, this.c);
        return this.c.top;
    }

    @Override // defpackage.lg
    public final void n(int i) {
        this.a.aG(i);
    }
}
