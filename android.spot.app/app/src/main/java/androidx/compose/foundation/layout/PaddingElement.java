package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.aow;
import defpackage.azf;
import defpackage.blh;
import defpackage.yf;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PaddingElement extends azf {
    private final float a;
    private final float b;
    private final float c;

    public /* synthetic */ PaddingElement(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        if ((f < 0.0f && !blh.b(f, Float.NaN)) || ((f2 < 0.0f && !blh.b(f2, Float.NaN)) || (f3 < 0.0f && !blh.b(f3, Float.NaN)))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new yf(this.a, this.b, this.c);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        yf yfVar = (yf) aowVar;
        yfVar.a = this.a;
        yfVar.b = this.b;
        yfVar.c = this.c;
        yfVar.d = true;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !blh.b(this.a, paddingElement.a) || !blh.b(this.b, paddingElement.b) || !blh.b(this.c, paddingElement.c) || !blh.b(0.0f, 0.0f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(0.0f)) * 31) + a.i(true);
    }
}
