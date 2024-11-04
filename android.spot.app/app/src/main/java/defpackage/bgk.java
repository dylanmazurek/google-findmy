package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgk {
    public final bgj a;
    public final bfw b;
    public final long c;
    public final float d;
    public final float e;
    private final List f;

    public bgk(bgj bgjVar, bfw bfwVar, long j) {
        float a;
        this.a = bgjVar;
        this.b = bfwVar;
        this.c = j;
        float f = 0.0f;
        if (bfwVar.g.isEmpty()) {
            a = 0.0f;
        } else {
            a = ((bfy) bfwVar.g.get(0)).g.a();
        }
        this.d = a;
        if (!bfwVar.g.isEmpty()) {
            bfy bfyVar = (bfy) mkm.Z(bfwVar.g);
            f = bfyVar.a(bfyVar.g.c());
        }
        this.e = f;
        this.f = bfwVar.f;
    }

    public static /* synthetic */ int g(bgk bgkVar, int i) {
        bfw bfwVar = bgkVar.b;
        bfwVar.b(i);
        List list = bfwVar.g;
        bfy bfyVar = (bfy) list.get(rh.f(list, i));
        bfp bfpVar = bfyVar.g;
        return bfyVar.b(bfpVar.b.f(bfyVar.e(i)));
    }

    public final float a(int i) {
        bfw bfwVar = this.b;
        bfwVar.b(i);
        List list = bfwVar.g;
        bfy bfyVar = (bfy) list.get(rh.f(list, i));
        bfp bfpVar = bfyVar.g;
        return bfyVar.a(bfpVar.b.b(bfyVar.e(i)));
    }

    public final int b() {
        return this.b.e;
    }

    public final int c(int i) {
        int e;
        bfw bfwVar = this.b;
        if (i >= bfwVar.a().a()) {
            e = mkm.O(bfwVar.g);
        } else if (i < 0) {
            e = 0;
        } else {
            e = rh.e(bfwVar.g, i);
        }
        bfy bfyVar = (bfy) bfwVar.g.get(e);
        bfp bfpVar = bfyVar.g;
        return bfyVar.c(bfpVar.b.g(bfyVar.d(i)));
    }

    public final int d(float f) {
        int i = 0;
        bfw bfwVar = this.b;
        if (f > 0.0f) {
            List list = bfwVar.g;
            if (f >= ((bfy) mkm.Z(list)).f) {
                i = mkm.O(list);
            } else {
                int size = list.size() - 1;
                int i2 = 0;
                while (true) {
                    char c = 1;
                    if (i2 <= size) {
                        int i3 = (i2 + size) >>> 1;
                        bfy bfyVar = (bfy) list.get(i3);
                        if (bfyVar.e <= f) {
                            if (bfyVar.f <= f) {
                                c = 65535;
                            } else {
                                c = 0;
                            }
                        }
                        if (c < 0) {
                            i2 = i3 + 1;
                        } else if (c > 0) {
                            size = i3 - 1;
                        } else {
                            i = i3;
                            break;
                        }
                    } else {
                        i = -(i2 + 1);
                        break;
                    }
                }
            }
        }
        bfy bfyVar2 = (bfy) bfwVar.g.get(i);
        if (bfyVar2.b - bfyVar2.a == 0) {
            return bfyVar2.c;
        }
        bfp bfpVar = bfyVar2.g;
        float f2 = f - bfyVar2.e;
        bhl bhlVar = bfpVar.b;
        return bfyVar2.c(bhlVar.b.getLineForVertical(((int) f2) - bhlVar.d));
    }

    public final int e(int i) {
        bfw bfwVar = this.b;
        bfwVar.b(i);
        List list = bfwVar.g;
        bfy bfyVar = (bfy) list.get(rh.f(list, i));
        bfp bfpVar = bfyVar.g;
        return bfyVar.b(bfpVar.b.b.getLineStart(bfyVar.e(i)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgk)) {
            return false;
        }
        bgk bgkVar = (bgk) obj;
        if (amr.i(this.a, bgkVar.a) && amr.i(this.b, bgkVar.b) && a.n(this.c, bgkVar.c) && this.d == bgkVar.d && this.e == bgkVar.e && amr.i(this.f, bgkVar.f)) {
            return true;
        }
        return false;
    }

    public final int f(int i) {
        int e;
        bfw bfwVar = this.b;
        if (i >= 0 && i <= bfwVar.a().a.length()) {
            if (i == bfwVar.a().a()) {
                e = mkm.O(bfwVar.g);
            } else {
                e = rh.e(bfwVar.g, i);
            }
            bfy bfyVar = (bfy) bfwVar.g.get(e);
            bfp bfpVar = bfyVar.g;
            int d = bfyVar.d(i);
            bhl bhlVar = bfpVar.b;
            if (bhlVar.h(bhlVar.g(d)) == 1) {
                return 1;
            }
            return 2;
        }
        throw new IllegalArgumentException("offset(" + i + ") is out of bounds [0, " + bfwVar.a().a() + ']');
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.l(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) blm.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
