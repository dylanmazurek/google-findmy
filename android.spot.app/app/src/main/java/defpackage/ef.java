package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ef extends eh {
    private final ObjectAnimator a;
    private final boolean b;

    public ef(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int i;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        if (z) {
            i = numberOfFrames - 1;
        } else {
            i = 0;
        }
        int i2 = z ? 0 : numberOfFrames - 1;
        eg egVar = new eg(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(egVar.a);
        ofInt.setInterpolator(egVar);
        this.b = z2;
        this.a = ofInt;
    }

    @Override // defpackage.eh
    public final void a() {
        this.a.start();
    }

    @Override // defpackage.eh
    public final void b() {
        this.a.cancel();
    }

    @Override // defpackage.eh
    public final void c() {
        this.a.reverse();
    }

    @Override // defpackage.eh
    public final boolean d() {
        return this.b;
    }
}
