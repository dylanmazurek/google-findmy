package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dac extends dad {
    public dac(List list) {
        super(list);
    }

    @Override // defpackage.czw
    public final /* bridge */ /* synthetic */ Object f(dfc dfcVar, float f) {
        return Integer.valueOf(l(dfcVar, f));
    }

    public final int l(dfc dfcVar, float f) {
        Integer num;
        if (dfcVar.b != null && dfcVar.c != null) {
            dfe dfeVar = this.d;
            if (dfeVar != null && (num = (Integer) dfeVar.b(dfcVar.g, dfcVar.h.floatValue(), (Integer) dfcVar.b, (Integer) dfcVar.c, f, c(), this.c)) != null) {
                return num.intValue();
            }
            int i = dfcVar.k;
            if (i == 784923401) {
                i = ((Integer) dfcVar.b).intValue();
                dfcVar.k = i;
            }
            int i2 = dfcVar.l;
            if (i2 == 784923401) {
                i2 = ((Integer) dfcVar.c).intValue();
                dfcVar.l = i2;
            }
            PointF pointF = dew.a;
            return (int) (i + (f * (i2 - i)));
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
