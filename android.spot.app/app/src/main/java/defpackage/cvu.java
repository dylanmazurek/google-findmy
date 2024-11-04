package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvu {
    public static final String a = cqc.a("WorkSpec");
    public final String b;
    public String c;
    public String d;
    public cpn e;
    public cpn f;
    public long g;
    public long h;
    public long i;
    public cpl j;
    public int k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public int q;
    public final int r;
    public long s;
    public int t;
    public final int u;
    public String v;
    public int w;
    public int x;
    public int y;

    public cvu(String str, int i, String str2, String str3, cpn cpnVar, cpn cpnVar2, long j, long j2, long j3, cpl cplVar, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, int i6, long j8, int i7, int i8, String str4) {
        str.getClass();
        if (i != 0) {
            str2.getClass();
            str3.getClass();
            cpnVar.getClass();
            cpnVar2.getClass();
            cplVar.getClass();
            if (i3 != 0 && i4 != 0) {
                this.b = str;
                this.w = i;
                this.c = str2;
                this.d = str3;
                this.e = cpnVar;
                this.f = cpnVar2;
                this.g = j;
                this.h = j2;
                this.i = j3;
                this.j = cplVar;
                this.k = i2;
                this.x = i3;
                this.l = j4;
                this.m = j5;
                this.n = j6;
                this.o = j7;
                this.p = z;
                this.y = i4;
                this.q = i5;
                this.r = i6;
                this.s = j8;
                this.t = i7;
                this.u = i8;
                this.v = str4;
                return;
            }
        }
        throw null;
    }

    public static /* synthetic */ cvu e(cvu cvuVar, String str, int i, String str2, cpn cpnVar, int i2, long j, int i3, int i4, long j2, int i5, int i6) {
        long j3;
        long j4;
        String str3 = (i6 & 1) != 0 ? cvuVar.b : str;
        int i7 = (i6 & 2) != 0 ? cvuVar.w : i;
        String str4 = (i6 & 4) != 0 ? cvuVar.c : str2;
        String str5 = (i6 & 8) != 0 ? cvuVar.d : null;
        cpn cpnVar2 = (i6 & 16) != 0 ? cvuVar.e : cpnVar;
        cpn cpnVar3 = (i6 & 32) != 0 ? cvuVar.f : null;
        long j5 = (i6 & 64) != 0 ? cvuVar.g : 0L;
        long j6 = (i6 & 128) != 0 ? cvuVar.h : 0L;
        long j7 = (i6 & 256) != 0 ? cvuVar.i : 0L;
        cpl cplVar = (i6 & 512) != 0 ? cvuVar.j : null;
        int i8 = (i6 & 1024) != 0 ? cvuVar.k : i2;
        int i9 = (i6 & 2048) != 0 ? cvuVar.x : 0;
        if ((i6 & 4096) != 0) {
            j3 = j5;
            j4 = cvuVar.l;
        } else {
            j3 = j5;
            j4 = 0;
        }
        long j8 = (i6 & 8192) != 0 ? cvuVar.m : j;
        long j9 = (i6 & 16384) != 0 ? cvuVar.n : 0L;
        long j10 = (32768 & i6) != 0 ? cvuVar.o : 0L;
        boolean z = (65536 & i6) != 0 ? cvuVar.p : false;
        int i10 = (131072 & i6) != 0 ? cvuVar.y : 0;
        int i11 = (262144 & i6) != 0 ? cvuVar.q : i3;
        int i12 = (524288 & i6) != 0 ? cvuVar.r : i4;
        long j11 = (1048576 & i6) != 0 ? cvuVar.s : j2;
        int i13 = (i6 & 2097152) != 0 ? cvuVar.t : i5;
        int i14 = cvuVar.u;
        String str6 = cvuVar.v;
        str3.getClass();
        if (i7 == 0) {
            throw null;
        }
        str4.getClass();
        str5.getClass();
        cpnVar2.getClass();
        cpnVar3.getClass();
        cplVar.getClass();
        if (i9 == 0) {
            throw null;
        }
        if (i10 != 0) {
            return new cvu(str3, i7, str4, str5, cpnVar2, cpnVar3, j3, j6, j7, cplVar, i8, i9, j4, j8, j9, j10, z, i10, i11, i12, j11, i13, i14, str6);
        }
        throw null;
    }

    public final long a() {
        long j;
        long scalb;
        boolean c = c();
        int i = this.k;
        int i2 = this.x;
        long j2 = this.l;
        long j3 = this.m;
        int i3 = this.q;
        boolean d = d();
        long j4 = this.g;
        long j5 = this.i;
        long j6 = this.h;
        long j7 = this.s;
        if (i2 != 0) {
            if (j7 != Long.MAX_VALUE && d) {
                if (i3 != 0) {
                    return moz.af(j7, j3 + 900000);
                }
                return j7;
            }
            if (c) {
                if (i2 == 2) {
                    scalb = j2 * i;
                } else {
                    scalb = Math.scalb((float) j2, i - 1);
                }
                j = j3 + moz.ag(scalb, 18000000L);
            } else if (d) {
                if (i3 == 0) {
                    j = j3 + j4;
                    i3 = 0;
                } else {
                    j = j3 + j6;
                }
                if (j5 != j6 && i3 == 0) {
                    j += j6 - j5;
                }
            } else {
                if (j3 == -1) {
                    return Long.MAX_VALUE;
                }
                return j3 + j4;
            }
            return j;
        }
        throw null;
    }

    public final boolean b() {
        if (!amr.i(cpl.a, this.j)) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.w == 1 && this.k > 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvu)) {
            return false;
        }
        cvu cvuVar = (cvu) obj;
        if (amr.i(this.b, cvuVar.b) && this.w == cvuVar.w && amr.i(this.c, cvuVar.c) && amr.i(this.d, cvuVar.d) && amr.i(this.e, cvuVar.e) && amr.i(this.f, cvuVar.f) && this.g == cvuVar.g && this.h == cvuVar.h && this.i == cvuVar.i && amr.i(this.j, cvuVar.j) && this.k == cvuVar.k && this.x == cvuVar.x && this.l == cvuVar.l && this.m == cvuVar.m && this.n == cvuVar.n && this.o == cvuVar.o && this.p == cvuVar.p && this.y == cvuVar.y && this.q == cvuVar.q && this.r == cvuVar.r && this.s == cvuVar.s && this.t == cvuVar.t && this.u == cvuVar.u && amr.i(this.v, cvuVar.v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() * 31;
        int i = this.w;
        a.N(i);
        int hashCode3 = ((((((((hashCode2 + i) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        int l = a.l(this.g);
        int l2 = a.l(this.h);
        int l3 = (((((((((hashCode3 * 31) + l) * 31) + l2) * 31) + a.l(this.i)) * 31) + this.j.hashCode()) * 31) + this.k;
        int i2 = this.x;
        a.N(i2);
        int l4 = a.l(this.l);
        int l5 = a.l(this.m);
        int l6 = a.l(this.n);
        int l7 = a.l(this.o);
        int i3 = a.i(this.p);
        int i4 = this.y;
        a.N(i4);
        int i5 = (((((((((((((((l3 * 31) + i2) * 31) + l4) * 31) + l5) * 31) + l6) * 31) + l7) * 31) + i3) * 31) + i4) * 31) + this.q;
        int l8 = (((((i5 * 31) + this.r) * 31) + a.l(this.s)) * 31) + this.t;
        String str = this.v;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((l8 * 31) + this.u) * 31) + hashCode;
    }

    public final String toString() {
        return "{WorkSpec: " + this.b + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ cvu(java.lang.String r38, int r39, java.lang.String r40, java.lang.String r41, defpackage.cpn r42, defpackage.cpn r43, long r44, long r46, long r48, defpackage.cpl r50, int r51, int r52, long r53, long r55, long r57, long r59, boolean r61, int r62, int r63, long r64, int r66, int r67, java.lang.String r68, int r69) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvu.<init>(java.lang.String, int, java.lang.String, java.lang.String, cpn, cpn, long, long, long, cpl, int, int, long, long, long, long, boolean, int, int, long, int, int, java.lang.String, int):void");
    }
}
