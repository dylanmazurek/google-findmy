package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auo {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final List i;
    public final long j;
    public final long k;

    public auo(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = list;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auo)) {
            return false;
        }
        auo auoVar = (auo) obj;
        if (a.n(this.a, auoVar.a) && this.b == auoVar.b && a.n(this.c, auoVar.c) && a.n(this.d, auoVar.d) && this.e == auoVar.e && Float.compare(this.f, auoVar.f) == 0 && a.m(this.g, auoVar.g) && this.h == auoVar.h && amr.i(this.i, auoVar.i) && a.n(this.j, auoVar.j) && a.n(this.k, auoVar.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int l = a.l(this.a) * 31;
        float f = this.f;
        boolean z = this.e;
        long j = this.d;
        int l2 = ((((((((l + a.l(this.b)) * 31) + a.l(this.c)) * 31) + a.l(j)) * 31) + a.i(z)) * 31) + Float.floatToIntBits(f);
        List list = this.i;
        return (((((((((l2 * 31) + this.g) * 31) + a.i(this.h)) * 31) + list.hashCode()) * 31) + a.l(this.j)) * 31) + a.l(this.k);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) aul.a(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) aqk.g(this.c)) + ", position=" + ((Object) aqk.g(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) aut.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) aqk.g(this.j)) + ", originalEventPosition=" + ((Object) aqk.g(this.k)) + ')';
    }
}
