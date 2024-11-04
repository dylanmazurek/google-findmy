package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmy {
    public bmw a = null;
    int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    final /* synthetic */ bmz h;
    private int i;
    private bmv j;
    private bmv k;
    private bmv l;
    private bmv m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    public bmy(bmz bmzVar, int i, bmv bmvVar, bmv bmvVar2, bmv bmvVar3, bmv bmvVar4, int i2) {
        this.h = bmzVar;
        this.o = 0;
        this.q = 0;
        this.i = i;
        this.j = bmvVar;
        this.k = bmvVar2;
        this.l = bmvVar3;
        this.m = bmvVar4;
        this.n = bmzVar.aP;
        this.o = bmzVar.aL;
        this.p = bmzVar.aQ;
        this.q = bmzVar.aM;
        this.r = i2;
    }

    public final int a() {
        if (this.i == 1) {
            return this.d - this.h.aB;
        }
        return this.d;
    }

    public final int b() {
        if (this.i == 0) {
            return this.c - this.h.aA;
        }
        return this.c;
    }

    public final void c(bmw bmwVar) {
        int i = 0;
        if (this.i == 0) {
            int c = this.h.c(bmwVar, this.r);
            if (bmwVar.O() == 3) {
                this.g++;
                c = 0;
            }
            bmz bmzVar = this.h;
            int i2 = bmzVar.aA;
            if (bmwVar.ai != 8) {
                i = i2;
            }
            this.c += c + i;
            int a = bmzVar.a(bmwVar, this.r);
            if (this.a == null || this.b < a) {
                this.a = bmwVar;
                this.b = a;
                this.d = a;
            }
        } else {
            int c2 = this.h.c(bmwVar, this.r);
            int a2 = this.h.a(bmwVar, this.r);
            if (bmwVar.P() == 3) {
                this.g++;
                a2 = 0;
            }
            int i3 = this.h.aB;
            if (bmwVar.ai != 8) {
                i = i3;
            }
            this.d += a2 + i;
            if (this.a == null || this.b < c2) {
                this.a = bmwVar;
                this.b = c2;
                this.c = c2;
            }
        }
        this.f++;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmy.d(boolean, int, boolean):void");
    }

    public final void e(int i) {
        int i2 = this.g;
        if (i2 != 0) {
            int i3 = this.f;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = this.e + i5;
                bmz bmzVar = this.h;
                if (i6 >= bmzVar.aI) {
                    break;
                }
                bmw bmwVar = bmzVar.aH[i6];
                if (this.i == 0) {
                    if (bmwVar != null && bmwVar.O() == 3 && bmwVar.t == 0) {
                        this.h.aa(bmwVar, 1, i4, bmwVar.P(), bmwVar.h());
                    }
                } else if (bmwVar != null && bmwVar.P() == 3 && bmwVar.u == 0) {
                    this.h.aa(bmwVar, bmwVar.O(), bmwVar.j(), 1, i4);
                }
            }
            this.c = 0;
            this.d = 0;
            this.a = null;
            this.b = 0;
            int i7 = this.f;
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = this.e + i8;
                bmz bmzVar2 = this.h;
                if (i9 < bmzVar2.aI) {
                    bmw bmwVar2 = bmzVar2.aH[i9];
                    if (this.i == 0) {
                        int j = bmwVar2.j();
                        bmz bmzVar3 = this.h;
                        int i10 = bmzVar3.aA;
                        if (bmwVar2.ai == 8) {
                            i10 = 0;
                        }
                        this.c += j + i10;
                        int a = bmzVar3.a(bmwVar2, this.r);
                        if (this.a == null || this.b < a) {
                            this.a = bmwVar2;
                            this.b = a;
                            this.d = a;
                        }
                    } else {
                        int c = bmzVar2.c(bmwVar2, this.r);
                        int a2 = this.h.a(bmwVar2, this.r);
                        int i11 = this.h.aB;
                        if (bmwVar2.ai == 8) {
                            i11 = 0;
                        }
                        this.d += a2 + i11;
                        if (this.a == null || this.b < c) {
                            this.a = bmwVar2;
                            this.b = c;
                            this.c = c;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i, bmv bmvVar, bmv bmvVar2, bmv bmvVar3, bmv bmvVar4, int i2, int i3, int i4, int i5, int i6) {
        this.i = i;
        this.j = bmvVar;
        this.k = bmvVar2;
        this.l = bmvVar3;
        this.m = bmvVar4;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.q = i5;
        this.r = i6;
    }
}
