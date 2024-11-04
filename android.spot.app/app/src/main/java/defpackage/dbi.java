package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbi {
    public final PointF a;
    public final PointF b;
    public final PointF c;

    public dbi(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }

    public final void a(float f, float f2) {
        this.a.set(f, f2);
    }

    public final void b(float f, float f2) {
        this.b.set(f, f2);
    }

    public final void c(float f, float f2) {
        this.c.set(f, f2);
    }

    public final String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.c.x), Float.valueOf(this.c.y), Float.valueOf(this.a.x), Float.valueOf(this.a.y), Float.valueOf(this.b.x), Float.valueOf(this.b.y));
    }

    public dbi() {
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }
}
