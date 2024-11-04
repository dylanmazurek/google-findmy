package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czx extends dad {
    public czx(List list) {
        super(list);
    }

    @Override // defpackage.czw
    public final /* bridge */ /* synthetic */ Object f(dfc dfcVar, float f) {
        return Integer.valueOf(m(dfcVar, f));
    }

    public final int l() {
        return m(d(), b());
    }

    public final int m(dfc dfcVar, float f) {
        Integer num;
        if (dfcVar.b != null && dfcVar.c != null) {
            dfe dfeVar = this.d;
            if (dfeVar != null && (num = (Integer) dfeVar.b(dfcVar.g, dfcVar.h.floatValue(), (Integer) dfcVar.b, (Integer) dfcVar.c, f, c(), this.c)) != null) {
                return num.intValue();
            }
            return bpv.f(dew.a(f, 0.0f, 1.0f), ((Integer) dfcVar.b).intValue(), ((Integer) dfcVar.c).intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
