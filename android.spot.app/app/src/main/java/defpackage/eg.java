package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eg implements TimeInterpolator {
    public int a;
    private int[] b;
    private int c;

    public eg(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.c = numberOfFrames;
        int[] iArr = this.b;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.b = new int[numberOfFrames];
        }
        int[] iArr2 = this.b;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr2[i2] = duration;
            i += duration;
        }
        this.a = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        int i = this.c;
        int[] iArr = this.b;
        int i2 = (int) ((f * this.a) + 0.5f);
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                break;
            }
            i2 -= i4;
            i3++;
        }
        if (i3 < i) {
            f2 = i2 / this.a;
        } else {
            f2 = 0.0f;
        }
        return (i3 / i) + f2;
    }
}
