package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dag extends dad {
    private final PointF e;

    public dag(List list) {
        super(list);
        this.e = new PointF();
    }

    @Override // defpackage.czw
    public final /* synthetic */ Object f(dfc dfcVar, float f) {
        return g(dfcVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czw
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final PointF g(dfc dfcVar, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = dfcVar.b;
        if (obj2 != null && (obj = dfcVar.c) != null) {
            PointF pointF2 = (PointF) obj2;
            PointF pointF3 = (PointF) obj;
            dfe dfeVar = this.d;
            if (dfeVar != null && (pointF = (PointF) dfeVar.b(dfcVar.g, dfcVar.h.floatValue(), pointF2, pointF3, f, c(), this.c)) != null) {
                return pointF;
            }
            this.e.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
            return this.e;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
