package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bxn {
    private final int a;
    private float b;
    private final Interpolator c;
    private final long d;

    public bxn(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = j;
    }

    public float g() {
        Interpolator interpolator = this.c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.b);
        }
        return this.b;
    }

    public int h() {
        return this.a;
    }

    public long i() {
        return this.d;
    }

    public void j(float f) {
        this.b = f;
    }
}
