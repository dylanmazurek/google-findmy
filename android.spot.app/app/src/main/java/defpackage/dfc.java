package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dfc {
    private final cyb a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public PointF m;
    public PointF n;
    private float o;
    private float p;

    public dfc(cyb cybVar, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = cybVar;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = null;
        this.f = null;
        this.g = f;
        this.h = f2;
    }

    public final float b() {
        if (this.a == null) {
            return 1.0f;
        }
        float f = this.p;
        if (f == Float.MIN_VALUE) {
            if (this.h == null) {
                this.p = 1.0f;
                return 1.0f;
            }
            float floatValue = ((this.h.floatValue() - this.g) / this.a.b()) + c();
            this.p = floatValue;
            return floatValue;
        }
        return f;
    }

    public final float c() {
        cyb cybVar = this.a;
        if (cybVar == null) {
            return 0.0f;
        }
        float f = this.o;
        if (f == Float.MIN_VALUE) {
            float b = (this.g - cybVar.i) / cybVar.b();
            this.o = b;
            return b;
        }
        return f;
    }

    public final boolean d(float f) {
        if (f >= c() && f < b()) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.d == null && this.e == null && this.f == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        Interpolator interpolator = this.d;
        return "Keyframe{startValue=" + valueOf + ", endValue=" + valueOf2 + ", startFrame=" + this.g + ", endFrame=" + this.h + ", interpolator=" + String.valueOf(interpolator) + "}";
    }

    public dfc(cyb cybVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = cybVar;
        this.b = obj;
        this.c = obj2;
        this.d = null;
        this.e = interpolator;
        this.f = interpolator2;
        this.g = f;
        this.h = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dfc(cyb cybVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = cybVar;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = interpolator2;
        this.f = interpolator3;
        this.g = f;
        this.h = f2;
    }

    public dfc(Object obj) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = null;
        this.b = obj;
        this.c = obj;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }

    public dfc(Object obj, Object obj2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = null;
        this.b = obj;
        this.c = obj2;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }
}
