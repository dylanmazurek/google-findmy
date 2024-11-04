package androidx.compose.foundation.layout;

import defpackage.aow;
import defpackage.azf;
import defpackage.blh;
import defpackage.yi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SizeElement extends azf {
    private final float a;
    private final float b;
    private final float c;
    private final float e;
    private final boolean f = true;

    public SizeElement(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.e = f4;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new yi(this.a, this.b, this.c, this.e);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        yi yiVar = (yi) aowVar;
        yiVar.a = this.a;
        yiVar.b = this.b;
        yiVar.c = this.c;
        yiVar.d = this.e;
        yiVar.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        if (!blh.b(this.a, sizeElement.a) || !blh.b(this.b, sizeElement.b) || !blh.b(this.c, sizeElement.c) || !blh.b(this.e, sizeElement.e)) {
            return false;
        }
        boolean z = sizeElement.f;
        return true;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.e)) * 31) + 1231;
    }
}
