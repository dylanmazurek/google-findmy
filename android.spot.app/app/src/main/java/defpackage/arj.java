package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arj {
    @mkp
    public static final Rect a(aql aqlVar) {
        float f = aqlVar.e;
        float f2 = aqlVar.d;
        return new Rect((int) aqlVar.b, (int) aqlVar.c, (int) f2, (int) f);
    }

    public static final Rect b(bll bllVar) {
        return new Rect(bllVar.b, bllVar.c, bllVar.d, bllVar.e);
    }

    public static final aql c(Rect rect) {
        return new aql(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final bky d(long j) {
        if (j != 16) {
            return new bkp(j);
        }
        return bkx.a;
    }

    public static bky e(bky bkyVar, bky bkyVar2) {
        boolean z = bkyVar2 instanceof bko;
        if (z && (bkyVar instanceof bko)) {
            throw null;
        }
        if (z && !(bkyVar instanceof bko)) {
            return bkyVar2;
        }
        if (!z && (bkyVar instanceof bko)) {
            return bkyVar;
        }
        return bkyVar2.d(new azp(bkyVar, 11));
    }

    public static bky f(bky bkyVar, mnw mnwVar) {
        if (!amr.i(bkyVar, bkx.a)) {
            return bkyVar;
        }
        return (bky) mnwVar.a();
    }
}
