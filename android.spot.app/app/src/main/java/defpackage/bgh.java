package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgh {
    public final bky a;
    public final long b;
    public final biz c;
    public final biv d;
    public final biw e;
    public final bip f;
    public final String g;
    public final long h;
    public final bkn i;
    public final bkz j;
    public final bjy k;
    public final long l;
    public final bkv m;
    public final arl n;
    public final bgf o;
    public final kv p;

    public bgh(bky bkyVar, long j, biz bizVar, biv bivVar, biw biwVar, bip bipVar, String str, long j2, bkn bknVar, bkz bkzVar, bjy bjyVar, long j3, bkv bkvVar, arl arlVar, kv kvVar) {
        this.a = bkyVar;
        this.b = j;
        this.c = bizVar;
        this.d = bivVar;
        this.e = biwVar;
        this.f = bipVar;
        this.g = str;
        this.h = j2;
        this.i = bknVar;
        this.j = bkzVar;
        this.k = bjyVar;
        this.l = j3;
        this.m = bkvVar;
        this.n = arlVar;
        this.o = null;
        this.p = kvVar;
    }

    public final float a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final bgh c(bgh bghVar) {
        bky bkyVar = bghVar.a;
        long b = bkyVar.b();
        bkyVar.e();
        bkyVar.a();
        return bgi.a(this, b, bghVar.b, bghVar.c, bghVar.d, bghVar.e, bghVar.f, bghVar.g, bghVar.h, bghVar.i, bghVar.j, bghVar.k, bghVar.l, bghVar.m, bghVar.n, bghVar.p);
    }

    public final boolean d(bgh bghVar) {
        if (this == bghVar) {
            return true;
        }
        if (!a.n(this.b, bghVar.b) || !amr.i(this.c, bghVar.c) || !amr.i(this.d, bghVar.d) || !amr.i(this.e, bghVar.e) || !amr.i(this.f, bghVar.f) || !amr.i(this.g, bghVar.g) || !a.n(this.h, bghVar.h) || !amr.i(this.i, bghVar.i) || !amr.i(this.j, bghVar.j) || !amr.i(this.k, bghVar.k) || !a.n(this.l, bghVar.l)) {
            return false;
        }
        bgf bgfVar = bghVar.o;
        if (amr.i(null, null)) {
            return true;
        }
        return false;
    }

    public final boolean e(bgh bghVar) {
        if (!amr.i(this.a, bghVar.a) || !amr.i(this.m, bghVar.m) || !amr.i(this.n, bghVar.n) || !amr.i(this.p, bghVar.p)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgh)) {
            return false;
        }
        bgh bghVar = (bgh) obj;
        if (d(bghVar) && e(bghVar)) {
            return true;
        }
        return false;
    }

    public final void f() {
        this.a.e();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int l = a.l(b());
        f();
        int floatToIntBits = (l * 961) + Float.floatToIntBits(a());
        biz bizVar = this.c;
        int i10 = 0;
        if (bizVar != null) {
            i = bizVar.g;
        } else {
            i = 0;
        }
        int l2 = ((((floatToIntBits * 31) + a.l(this.b)) * 31) + i) * 961;
        if (this.e != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i11 = (l2 + i2) * 31;
        bip bipVar = this.f;
        if (bipVar != null) {
            i3 = bipVar.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        String str = this.g;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int l3 = (((i12 + i4) * 31) + a.l(this.h)) * 31;
        if (this.i != null) {
            i5 = Float.floatToIntBits(0.0f);
        } else {
            i5 = 0;
        }
        int i13 = (l3 + i5) * 31;
        bkz bkzVar = this.j;
        if (bkzVar != null) {
            i6 = bkzVar.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        bjy bjyVar = this.k;
        if (bjyVar != null) {
            i7 = bjyVar.hashCode();
        } else {
            i7 = 0;
        }
        int l4 = (((i14 + i7) * 31) + a.l(this.l)) * 31;
        bkv bkvVar = this.m;
        if (bkvVar != null) {
            i8 = bkvVar.d;
        } else {
            i8 = 0;
        }
        int i15 = (l4 + i8) * 31;
        arl arlVar = this.n;
        if (arlVar != null) {
            i9 = arlVar.hashCode();
        } else {
            i9 = 0;
        }
        int i16 = (i15 + i9) * 961;
        kv kvVar = this.p;
        if (kvVar != null) {
            i10 = kvVar.hashCode();
        }
        return i16 + i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append((Object) aqx.g(b()));
        sb.append(", brush=null, alpha=");
        f();
        sb.append(a());
        sb.append(", fontSize=");
        sb.append((Object) blp.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) blp.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append((Object) aqx.g(this.l));
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ bgh(biz bizVar, biv bivVar, biw biwVar, bip bipVar, long j, bkn bknVar, long j2, int i) {
        this((i & 1) != 0 ? aqx.e : 0L, (i & 2) != 0 ? blp.a : 0L, (i & 4) != 0 ? null : bizVar, (i & 8) != 0 ? null : bivVar, (i & 16) != 0 ? null : biwVar, (i & 32) != 0 ? null : bipVar, (i & 128) != 0 ? blp.a : j, (i & 256) != 0 ? null : bknVar, (i & 2048) != 0 ? aqx.e : j2);
    }

    public /* synthetic */ bgh(long j, long j2, biz bizVar, biv bivVar, biw biwVar, bip bipVar, long j3, bkn bknVar, long j4) {
        this(arj.d(j), j2, bizVar, bivVar, biwVar, bipVar, null, j3, bknVar, null, null, j4, null, null, null);
    }
}
