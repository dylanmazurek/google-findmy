package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dah extends dad {
    private final dff e;

    public dah(List list) {
        super(list);
        this.e = new dff();
    }

    @Override // defpackage.czw
    public final /* bridge */ /* synthetic */ Object f(dfc dfcVar, float f) {
        Object obj;
        dff dffVar;
        Object obj2 = dfcVar.b;
        if (obj2 != null && (obj = dfcVar.c) != null) {
            dff dffVar2 = (dff) obj2;
            dff dffVar3 = (dff) obj;
            dfe dfeVar = this.d;
            if (dfeVar != null && (dffVar = (dff) dfeVar.b(dfcVar.g, dfcVar.h.floatValue(), dffVar2, dffVar3, f, c(), this.c)) != null) {
                return dffVar;
            }
            dff dffVar4 = this.e;
            float f2 = dffVar2.a;
            float f3 = dffVar3.a;
            PointF pointF = dew.a;
            float f4 = dffVar2.b;
            float f5 = f4 + (f * (dffVar3.b - f4));
            dffVar4.a = f2 + ((f3 - f2) * f);
            dffVar4.b = f5;
            return this.e;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
