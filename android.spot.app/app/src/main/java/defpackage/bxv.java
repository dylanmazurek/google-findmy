package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bxv extends bxu {
    public bxv(bya byaVar, WindowInsets windowInsets) {
        super(byaVar, windowInsets);
    }

    @Override // defpackage.bxt, defpackage.bxy
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxv)) {
            return false;
        }
        bxv bxvVar = (bxv) obj;
        if (Objects.equals(this.a, bxvVar.a) && Objects.equals(this.b, bxvVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bxy
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.bxy
    public buv o() {
        DisplayCutout displayCutout;
        displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new buv(displayCutout);
    }

    @Override // defpackage.bxy
    public bya p() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.a.consumeDisplayCutout();
        return bya.m(consumeDisplayCutout);
    }
}
