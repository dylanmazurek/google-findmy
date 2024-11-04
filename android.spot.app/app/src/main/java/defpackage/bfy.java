package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfy {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final bfp g;

    public bfy(bfp bfpVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.g = bfpVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = f2;
    }

    public final float a(float f) {
        return f + this.e;
    }

    public final int b(int i) {
        return i + this.a;
    }

    public final int c(int i) {
        return i + this.c;
    }

    public final int d(int i) {
        int i2 = this.a;
        return moz.ae(i, i2, this.b) - i2;
    }

    public final int e(int i) {
        return i - this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfy)) {
            return false;
        }
        bfy bfyVar = (bfy) obj;
        if (amr.i(this.g, bfyVar.g) && this.a == bfyVar.a && this.b == bfyVar.b && this.c == bfyVar.c && this.d == bfyVar.d && Float.compare(this.e, bfyVar.e) == 0 && Float.compare(this.f, bfyVar.f) == 0) {
            return true;
        }
        return false;
    }

    public final aql f(aql aqlVar) {
        return aqlVar.e(a.k(0.0f, this.e));
    }

    public final int hashCode() {
        return (((((((((((this.g.hashCode() * 31) + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.g + ", startIndex=" + this.a + ", endIndex=" + this.b + ", startLineIndex=" + this.c + ", endLineIndex=" + this.d + ", top=" + this.e + ", bottom=" + this.f + ')';
    }
}
