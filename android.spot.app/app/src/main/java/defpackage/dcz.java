package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcz extends dcu {
    private final cza j;
    private final dcv k;

    public dcz(cym cymVar, dcx dcxVar, dcv dcvVar, cyb cybVar) {
        super(cymVar, dcxVar);
        this.k = dcvVar;
        cza czaVar = new cza(cymVar, this, new dcp("__container", dcxVar.a, false), cybVar);
        this.j = czaVar;
        czaVar.f(Collections.emptyList(), Collections.emptyList());
    }

    @Override // defpackage.dcu, defpackage.czb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.j.c(rectF, this.a, z);
    }

    @Override // defpackage.dcu
    public final void j(Canvas canvas, Matrix matrix, int i) {
        this.j.b(canvas, matrix, i);
    }

    @Override // defpackage.dcu
    public final void l(dbm dbmVar, int i, List list, dbm dbmVar2) {
        this.j.e(dbmVar, i, list, dbmVar2);
    }

    @Override // defpackage.dcu
    public final ddg q() {
        ddg q = super.q();
        if (q != null) {
            return q;
        }
        return this.k.q();
    }

    @Override // defpackage.dcu
    public final nca r() {
        nca r = super.r();
        if (r != null) {
            return r;
        }
        return this.k.r();
    }
}
