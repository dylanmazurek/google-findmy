package defpackage;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxe {
    public final brq a;
    public final brq b;

    public bxe(brq brqVar, brq brqVar2) {
        this.a = brqVar;
        this.b = brqVar2;
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public bxe(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        lowerBound = bounds.getLowerBound();
        this.a = brq.e(lowerBound);
        upperBound = bounds.getUpperBound();
        this.b = brq.e(upperBound);
    }
}
