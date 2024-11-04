package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lp implements no {
    final /* synthetic */ lr a;
    private final /* synthetic */ int b;

    public lp(lr lrVar, int i) {
        this.b = i;
        this.a = lrVar;
    }

    @Override // defpackage.no
    public final int a(View view) {
        int bo;
        int i;
        if (this.b != 0) {
            ls lsVar = (ls) view.getLayoutParams();
            bo = lr.bq(view);
            i = lsVar.rightMargin;
        } else {
            ls lsVar2 = (ls) view.getLayoutParams();
            bo = lr.bo(view);
            i = lsVar2.bottomMargin;
        }
        return bo + i;
    }

    @Override // defpackage.no
    public final int b(View view) {
        int br;
        int i;
        if (this.b != 0) {
            ls lsVar = (ls) view.getLayoutParams();
            br = lr.bp(view);
            i = lsVar.leftMargin;
        } else {
            ls lsVar2 = (ls) view.getLayoutParams();
            br = lr.br(view);
            i = lsVar2.topMargin;
        }
        return br - i;
    }

    @Override // defpackage.no
    public final int c() {
        int i;
        int paddingBottom;
        if (this.b != 0) {
            lr lrVar = this.a;
            i = lrVar.C;
            paddingBottom = lrVar.getPaddingRight();
        } else {
            lr lrVar2 = this.a;
            i = lrVar2.D;
            paddingBottom = lrVar2.getPaddingBottom();
        }
        return i - paddingBottom;
    }

    @Override // defpackage.no
    public final int d() {
        if (this.b != 0) {
            return this.a.getPaddingLeft();
        }
        return this.a.getPaddingTop();
    }

    @Override // defpackage.no
    public final View e(int i) {
        if (this.b != 0) {
            return this.a.av(i);
        }
        return this.a.av(i);
    }
}
