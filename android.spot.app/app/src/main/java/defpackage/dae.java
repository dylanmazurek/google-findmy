package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dae extends dfc {
    public Path a;
    private final dfc o;

    public dae(cyb cybVar, dfc dfcVar) {
        super(cybVar, (PointF) dfcVar.b, (PointF) dfcVar.c, dfcVar.d, dfcVar.e, dfcVar.f, dfcVar.g, dfcVar.h);
        this.o = dfcVar;
        a();
    }

    public final void a() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        boolean z = false;
        if (obj3 != null && (obj2 = this.b) != null && ((PointF) obj2).equals(((PointF) obj3).x, ((PointF) this.c).y)) {
            z = true;
        }
        Object obj4 = this.b;
        if (obj4 != null && (obj = this.c) != null && !z) {
            dfc dfcVar = this.o;
            PointF pointF = (PointF) obj4;
            PointF pointF2 = (PointF) obj;
            PointF pointF3 = dfcVar.m;
            PointF pointF4 = dfcVar.n;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
                path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
            } else {
                path.lineTo(pointF2.x, pointF2.y);
            }
            this.a = path;
        }
    }
}
