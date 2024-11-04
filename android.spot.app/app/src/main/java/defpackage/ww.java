package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ww {
    public final va a;
    public final vg b;
    public final int c = 0;

    public ww(va vaVar, vg vgVar) {
        this.a = vaVar;
        this.b = vgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww)) {
            return false;
        }
        ww wwVar = (ww) obj;
        if (!amr.i(this.a, wwVar.a) || !amr.i(this.b, wwVar.b)) {
            return false;
        }
        int i = wwVar.c;
        if (a.m(0, 0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
