package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.aow;
import defpackage.azf;
import defpackage.yc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FillElement extends azf {
    private final float a;
    private final int b;

    public FillElement(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new yc(this.b, this.a);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        yc ycVar = (yc) aowVar;
        ycVar.b = this.b;
        ycVar.a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.b == fillElement.b && this.a == fillElement.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.N(i);
        return (i * 31) + Float.floatToIntBits(this.a);
    }
}
