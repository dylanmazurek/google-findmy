package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bna extends bmw {
    private boolean at;
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public bmv d = this.L;
    public int as = 0;

    public bna() {
        this.T.clear();
        this.T.add(this.d);
        int length = this.S.length;
        for (int i = 0; i < 6; i++) {
            this.S[i] = this.d;
        }
    }

    @Override // defpackage.bmw
    public final bmv M(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.as != 0) {
                return null;
            }
            return this.d;
        }
        if (this.as != 1) {
            return null;
        }
        return this.d;
    }

    @Override // defpackage.bmw
    public final void U(boolean z) {
        if (this.V == null) {
            return;
        }
        int o = bmo.o(this.d);
        if (this.as == 1) {
            this.aa = o;
            this.ab = 0;
            z(this.V.h());
            E(0);
            return;
        }
        this.aa = 0;
        this.ab = o;
        E(this.V.j());
        z(0);
    }

    public final void a(int i) {
        this.d.f(i);
        this.at = true;
    }

    @Override // defpackage.bmw
    public final void b(bmo bmoVar, boolean z) {
        boolean z2;
        bmw bmwVar = this.V;
        if (bmwVar != null) {
            Object M = bmwVar.M(2);
            Object M2 = bmwVar.M(4);
            bmw bmwVar2 = this.V;
            boolean z3 = true;
            if (bmwVar2 != null && bmwVar2.ar[0] == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.as == 0) {
                M = bmwVar.M(3);
                M2 = bmwVar.M(5);
                if (bmwVar2 == null || bmwVar2.ar[1] != 2) {
                    z3 = false;
                }
                z2 = z3;
            }
            if (this.at) {
                bmv bmvVar = this.d;
                if (bmvVar.c) {
                    bmr b = bmoVar.b(bmvVar);
                    bmoVar.f(b, this.d.a());
                    if (this.b != -1) {
                        if (z2) {
                            bmoVar.g(bmoVar.b(M2), b, 0, 5);
                        }
                    } else if (this.c != -1 && z2) {
                        bmr b2 = bmoVar.b(M2);
                        bmoVar.g(b, bmoVar.b(M), 0, 5);
                        bmoVar.g(b2, b, 0, 5);
                    }
                    this.at = false;
                    return;
                }
            }
            if (this.b != -1) {
                bmr b3 = bmoVar.b(this.d);
                bmoVar.m(b3, bmoVar.b(M), this.b, 8);
                if (z2) {
                    bmoVar.g(bmoVar.b(M2), b3, 0, 5);
                    return;
                }
                return;
            }
            if (this.c != -1) {
                bmr b4 = bmoVar.b(this.d);
                bmr b5 = bmoVar.b(M2);
                bmoVar.m(b4, b5, -this.c, 8);
                if (z2) {
                    bmoVar.g(b4, bmoVar.b(M), 0, 5);
                    bmoVar.g(b5, b4, 0, 5);
                    return;
                }
                return;
            }
            if (this.a != -1.0f) {
                bmr b6 = bmoVar.b(this.d);
                bmr b7 = bmoVar.b(M2);
                float f = this.a;
                bmn a = bmoVar.a();
                a.e.g(b6, -1.0f);
                a.e.g(b7, f);
                bmoVar.e(a);
            }
        }
    }

    public final void c(int i) {
        if (this.as != i) {
            this.as = i;
            this.T.clear();
            if (this.as == 1) {
                this.d = this.K;
            } else {
                this.d = this.L;
            }
            this.T.add(this.d);
            int length = this.S.length;
            for (int i2 = 0; i2 < 6; i2++) {
                this.S[i2] = this.d;
            }
        }
    }

    @Override // defpackage.bmw
    public final boolean d() {
        return true;
    }

    @Override // defpackage.bmw
    public final boolean e() {
        return this.at;
    }

    @Override // defpackage.bmw
    public final boolean f() {
        return this.at;
    }
}
