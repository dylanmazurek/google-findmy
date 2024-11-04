package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hky extends hku {
    public static final jei a = new hky();

    @Override // defpackage.hku
    public final void b(fkd fkdVar, hjv hjvVar) {
        if (fkdVar.h() && !"null".equals(fkdVar.f())) {
            hjvVar.c = fkdVar.f();
        }
    }

    @Override // defpackage.hku
    public final void c(fkd fkdVar, hjv hjvVar) {
        if (fkdVar.i() && !"null".equals(fkdVar.g())) {
            hjvVar.b = fkdVar.g();
        }
    }

    @Override // defpackage.hku
    public final void d(fkd fkdVar, hjv hjvVar) {
        DataHolder dataHolder = fkdVar.a;
        int i = fkdVar.b;
        int i2 = fkdVar.c;
        dataHolder.a("is_dasher", i);
        int i3 = dataHolder.d[i2].getInt(i, dataHolder.c.getInt("is_dasher"));
        int i4 = 1;
        if (i3 != 1) {
            if (i3 == 2) {
                i4 = 2;
            }
        } else {
            i4 = 3;
        }
        hjvVar.e(i4);
    }
}
