package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnq extends bns {
    public final bnj a;
    bnk b;

    public bnq(bmw bmwVar) {
        super(bmwVar);
        bnj bnjVar = new bnj(this);
        this.a = bnjVar;
        this.b = null;
        this.i.l = 6;
        this.j.l = 7;
        bnjVar.l = 8;
        this.g = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0411  */
    @Override // defpackage.bns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnq.b():void");
    }

    @Override // defpackage.bns
    public final void c() {
        bnj bnjVar = this.i;
        if (bnjVar.i) {
            this.d.ab = bnjVar.f;
        }
    }

    @Override // defpackage.bns
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.a.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.bns
    public final boolean e() {
        if (this.k != 3 || this.d.u == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bns, defpackage.bnh
    public final void f() {
        float f;
        float f2;
        float f3;
        int i = this.l;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 3) {
                bnk bnkVar = this.f;
                if (bnkVar.c && !bnkVar.i && this.k == 3) {
                    bmw bmwVar = this.d;
                    int i3 = bmwVar.u;
                    if (i3 != 2) {
                        if (i3 == 3) {
                            bnk bnkVar2 = bmwVar.h.f;
                            if (bnkVar2.i) {
                                int i4 = bmwVar.Z;
                                if (i4 != -1) {
                                    if (i4 != 0) {
                                        f = bnkVar2.f;
                                        f2 = bmwVar.Y;
                                    } else {
                                        f3 = bnkVar2.f * bmwVar.Y;
                                        bnkVar.c((int) (f3 + 0.5f));
                                    }
                                } else {
                                    f = bnkVar2.f;
                                    f2 = bmwVar.Y;
                                }
                                f3 = f / f2;
                                bnkVar.c((int) (f3 + 0.5f));
                            }
                        }
                    } else {
                        bmw bmwVar2 = bmwVar.V;
                        if (bmwVar2 != null) {
                            if (bmwVar2.i.f.i) {
                                bnkVar.c((int) ((r5.f * bmwVar.B) + 0.5f));
                            }
                        }
                    }
                }
                bnj bnjVar = this.i;
                if (bnjVar.c) {
                    bnj bnjVar2 = this.j;
                    if (bnjVar2.c) {
                        if (!bnjVar.i || !bnjVar2.i || !this.f.i) {
                            if (!this.f.i && this.k == 3) {
                                bmw bmwVar3 = this.d;
                                if (bmwVar3.t == 0 && !bmwVar3.K()) {
                                    bnj bnjVar3 = (bnj) this.i.k.get(0);
                                    bnj bnjVar4 = (bnj) this.j.k.get(0);
                                    int i5 = bnjVar3.f;
                                    bnj bnjVar5 = this.i;
                                    int i6 = i5 + bnjVar5.e;
                                    int i7 = bnjVar4.f + this.j.e;
                                    bnjVar5.c(i6);
                                    this.j.c(i7);
                                    this.f.c(i7 - i6);
                                    return;
                                }
                            }
                            if (!this.f.i && this.k == 3 && this.c == 1 && this.i.k.size() > 0 && this.j.k.size() > 0) {
                                bnj bnjVar6 = (bnj) this.i.k.get(0);
                                bnj bnjVar7 = (bnj) this.j.k.get(0);
                                int i8 = bnjVar6.f + this.i.e;
                                int i9 = bnjVar7.f + this.j.e;
                                bnk bnkVar3 = this.f;
                                int i10 = i9 - i8;
                                int i11 = bnkVar3.m;
                                if (i10 < i11) {
                                    bnkVar3.c(i10);
                                } else {
                                    bnkVar3.c(i11);
                                }
                            }
                            if (this.f.i && this.i.k.size() > 0 && this.j.k.size() > 0) {
                                bnj bnjVar8 = (bnj) this.i.k.get(0);
                                bnj bnjVar9 = (bnj) this.j.k.get(0);
                                int i12 = bnjVar8.f;
                                bnj bnjVar10 = this.i;
                                int i13 = bnjVar10.e + i12;
                                int i14 = bnjVar9.f;
                                int i15 = this.j.e + i14;
                                float f4 = this.d.ag;
                                if (bnjVar8 == bnjVar9) {
                                    f4 = 0.5f;
                                }
                                if (bnjVar8 != bnjVar9) {
                                    i14 = i15;
                                }
                                if (bnjVar8 != bnjVar9) {
                                    i12 = i13;
                                }
                                bnjVar10.c((int) (i12 + 0.5f + (((i14 - i12) - this.f.f) * f4)));
                                this.j.c(this.i.f + this.f.f);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            bmw bmwVar4 = this.d;
            m(bmwVar4.L, bmwVar4.N, 1);
            return;
        }
        throw null;
    }

    public final void g() {
        this.h = false;
        this.i.b();
        this.i.i = false;
        this.j.b();
        this.j.i = false;
        this.a.b();
        this.a.i = false;
        this.f.i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.aj));
    }
}
