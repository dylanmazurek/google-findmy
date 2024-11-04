package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgb {
    public final int a;
    public final int b;
    public final long c;
    public final bla d;
    public final bge e;
    public final bkt f;
    public final int g;
    public final int h;
    public final blb i;

    public bgb(int i, int i2, long j, bla blaVar, bge bgeVar, bkt bktVar, int i3, int i4, blb blbVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = blaVar;
        this.e = bgeVar;
        this.f = bktVar;
        this.g = i3;
        this.h = i4;
        this.i = blbVar;
        if (!a.n(j, blp.a) && blp.a(j) < 0.0f) {
            throw new IllegalStateException("lineHeight can't be negative (" + blp.a(j) + ')');
        }
    }

    public final bgb a(bgb bgbVar) {
        return bgc.a(this, bgbVar.a, bgbVar.b, bgbVar.c, bgbVar.d, bgbVar.e, bgbVar.f, bgbVar.g, bgbVar.h, bgbVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgb)) {
            return false;
        }
        bgb bgbVar = (bgb) obj;
        if (a.m(this.a, bgbVar.a) && a.m(this.b, bgbVar.b) && a.n(this.c, bgbVar.c) && amr.i(this.d, bgbVar.d) && amr.i(this.e, bgbVar.e) && amr.i(this.f, bgbVar.f) && a.m(this.g, bgbVar.g) && a.m(this.h, bgbVar.h) && amr.i(this.i, bgbVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        long j = blp.a;
        bla blaVar = this.d;
        int i4 = 0;
        if (blaVar != null) {
            i = blaVar.hashCode();
        } else {
            i = 0;
        }
        int i5 = this.a;
        int i6 = this.b;
        long j2 = this.c;
        if (this.e != null) {
            i2 = 38347;
        } else {
            i2 = 0;
        }
        int l = (((((i5 * 31) + i6) * 31) + a.l(j2)) * 31) + i;
        bkt bktVar = this.f;
        if (bktVar != null) {
            i3 = bktVar.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = ((((((((l * 31) + i2) * 31) + i3) * 31) + this.g) * 31) + this.h) * 31;
        blb blbVar = this.i;
        if (blbVar != null) {
            i4 = blbVar.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) bku.a(this.a)) + ", textDirection=" + ((Object) bkw.a(this.b)) + ", lineHeight=" + ((Object) blp.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) bkr.a(this.g)) + ", hyphens=" + ((Object) bkq.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
