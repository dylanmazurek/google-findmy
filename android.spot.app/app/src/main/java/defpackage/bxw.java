package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bxw extends bxv {
    private brq c;
    private brq f;
    private brq g;

    public bxw(bya byaVar, WindowInsets windowInsets) {
        super(byaVar, windowInsets);
        this.c = null;
        this.f = null;
        this.g = null;
    }

    @Override // defpackage.bxt, defpackage.bxy
    public bya d(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.a.inset(i, i2, i3, i4);
        return bya.m(inset);
    }

    @Override // defpackage.bxy
    public brq q() {
        Insets mandatorySystemGestureInsets;
        if (this.f == null) {
            mandatorySystemGestureInsets = this.a.getMandatorySystemGestureInsets();
            this.f = brq.e(mandatorySystemGestureInsets);
        }
        return this.f;
    }

    @Override // defpackage.bxy
    public brq r() {
        Insets systemGestureInsets;
        if (this.c == null) {
            systemGestureInsets = this.a.getSystemGestureInsets();
            this.c = brq.e(systemGestureInsets);
        }
        return this.c;
    }

    @Override // defpackage.bxy
    public brq s() {
        Insets tappableElementInsets;
        if (this.g == null) {
            tappableElementInsets = this.a.getTappableElementInsets();
            this.g = brq.e(tappableElementInsets);
        }
        return this.g;
    }

    @Override // defpackage.bxu, defpackage.bxy
    public void m(brq brqVar) {
    }
}
