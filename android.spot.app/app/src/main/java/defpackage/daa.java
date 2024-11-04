package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daa extends dad {
    public daa(List list) {
        super(list);
    }

    @Override // defpackage.czw
    public final /* bridge */ /* synthetic */ Object f(dfc dfcVar, float f) {
        return Float.valueOf(m(dfcVar, f));
    }

    public final float l() {
        return m(d(), b());
    }

    final float m(dfc dfcVar, float f) {
        Float f2;
        if (dfcVar.b != null && dfcVar.c != null) {
            dfe dfeVar = this.d;
            if (dfeVar != null && (f2 = (Float) dfeVar.b(dfcVar.g, dfcVar.h.floatValue(), (Float) dfcVar.b, (Float) dfcVar.c, f, c(), this.c)) != null) {
                return f2.floatValue();
            }
            float f3 = dfcVar.i;
            if (f3 == -3987645.8f) {
                f3 = ((Float) dfcVar.b).floatValue();
                dfcVar.i = f3;
            }
            float f4 = dfcVar.j;
            if (f4 == -3987645.8f) {
                f4 = ((Float) dfcVar.c).floatValue();
                dfcVar.j = f4;
            }
            PointF pointF = dew.a;
            return f3 + (f * (f4 - f3));
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
