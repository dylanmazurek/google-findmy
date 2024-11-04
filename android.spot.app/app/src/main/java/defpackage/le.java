package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class le extends lg {
    public le(lr lrVar) {
        super(lrVar);
    }

    @Override // defpackage.lg
    public final int a(View view) {
        return lr.bq(view) + ((ls) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.lg
    public final int b(View view) {
        ls lsVar = (ls) view.getLayoutParams();
        return lr.bc(view) + lsVar.leftMargin + lsVar.rightMargin;
    }

    @Override // defpackage.lg
    public final int c(View view) {
        ls lsVar = (ls) view.getLayoutParams();
        return lr.bb(view) + lsVar.topMargin + lsVar.bottomMargin;
    }

    @Override // defpackage.lg
    public final int d(View view) {
        return lr.bp(view) - ((ls) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.lg
    public final int e() {
        return this.a.C;
    }

    @Override // defpackage.lg
    public final int f() {
        lr lrVar = this.a;
        return lrVar.C - lrVar.getPaddingRight();
    }

    @Override // defpackage.lg
    public final int g() {
        return this.a.getPaddingRight();
    }

    @Override // defpackage.lg
    public final int h() {
        return this.a.A;
    }

    @Override // defpackage.lg
    public final int i() {
        return this.a.B;
    }

    @Override // defpackage.lg
    public final int j() {
        return this.a.getPaddingLeft();
    }

    @Override // defpackage.lg
    public final int k() {
        lr lrVar = this.a;
        return (lrVar.C - lrVar.getPaddingLeft()) - this.a.getPaddingRight();
    }

    @Override // defpackage.lg
    public final int l(View view) {
        this.a.bh(view, this.c);
        return this.c.right;
    }

    @Override // defpackage.lg
    public final int m(View view) {
        this.a.bh(view, this.c);
        return this.c.left;
    }

    @Override // defpackage.lg
    public final void n(int i) {
        this.a.aF(i);
    }
}
