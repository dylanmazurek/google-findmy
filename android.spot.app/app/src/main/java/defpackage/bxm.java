package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxm extends bxn {
    private final WindowInsetsAnimation a;

    public bxm(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.a = windowInsetsAnimation;
    }

    @Override // defpackage.bxn
    public final float g() {
        float interpolatedFraction;
        interpolatedFraction = this.a.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // defpackage.bxn
    public final int h() {
        int typeMask;
        typeMask = this.a.getTypeMask();
        return typeMask;
    }

    @Override // defpackage.bxn
    public final long i() {
        long durationMillis;
        durationMillis = this.a.getDurationMillis();
        return durationMillis;
    }

    @Override // defpackage.bxn
    public final void j(float f) {
        this.a.setFraction(f);
    }
}
