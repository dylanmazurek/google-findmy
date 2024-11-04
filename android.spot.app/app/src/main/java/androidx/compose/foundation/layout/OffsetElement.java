package androidx.compose.foundation.layout;

import defpackage.aow;
import defpackage.azf;
import defpackage.blh;
import defpackage.ye;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OffsetElement extends azf {
    private final float a;
    private final float b;

    public OffsetElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new ye(this.a, this.b);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        ye yeVar = (ye) aowVar;
        yeVar.a = this.a;
        yeVar.b = this.b;
        yeVar.c = true;
    }

    public final boolean equals(Object obj) {
        OffsetElement offsetElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetElement) {
            offsetElement = (OffsetElement) obj;
        } else {
            offsetElement = null;
        }
        if (offsetElement != null && blh.b(this.a, offsetElement.a) && blh.b(this.b, offsetElement.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + 1231;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) blh.a(this.a)) + ", y=" + ((Object) blh.a(this.b)) + ", rtlAware=true)";
    }
}
