package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daf extends dad {
    private final PointF e;
    private final float[] f;
    private final PathMeasure g;
    private dae h;

    public daf(List list) {
        super(list);
        this.e = new PointF();
        this.f = new float[2];
        this.g = new PathMeasure();
    }

    @Override // defpackage.czw
    public final /* bridge */ /* synthetic */ Object f(dfc dfcVar, float f) {
        PointF pointF;
        dae daeVar = (dae) dfcVar;
        Path path = daeVar.a;
        if (path == null) {
            return (PointF) dfcVar.b;
        }
        dfe dfeVar = this.d;
        if (dfeVar == null || (pointF = (PointF) dfeVar.b(daeVar.g, daeVar.h.floatValue(), (PointF) daeVar.b, (PointF) daeVar.c, c(), f, this.c)) == null) {
            if (this.h != daeVar) {
                this.g.setPath(path, false);
                this.h = daeVar;
            }
            PathMeasure pathMeasure = this.g;
            pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f, null);
            PointF pointF2 = this.e;
            float[] fArr = this.f;
            pointF2.set(fArr[0], fArr[1]);
            return this.e;
        }
        return pointF;
    }
}
