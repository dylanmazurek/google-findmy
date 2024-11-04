package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bno extends bns {
    private static final int[] a = new int[2];

    public bno(bmw bmwVar) {
        super(bmwVar);
        this.i.l = 4;
        this.j.l = 5;
        this.g = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i4 - i3;
        int i7 = i2 - i;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            } else {
                iArr[0] = (int) ((i6 * f) + 0.5f);
                iArr[1] = i6;
                return;
            }
        }
        float f2 = (i7 / f) + 0.5f;
        int i8 = (int) ((i6 * f) + 0.5f);
        if (i8 <= i7) {
            iArr[0] = i8;
            iArr[1] = i6;
            return;
        }
        int i9 = (int) f2;
        if (i9 <= i6) {
            iArr[0] = i7;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.bns
    public final void b() {
        bmw bmwVar;
        bmw bmwVar2;
        bmw bmwVar3;
        bmw bmwVar4 = this.d;
        if (bmwVar4.e) {
            this.f.c(bmwVar4.j());
        }
        if (!this.f.i) {
            int O = this.d.O();
            this.k = O;
            if (O != 3) {
                if (this.k == 4 && (bmwVar3 = this.d.V) != null && (bmwVar3.O() == 1 || bmwVar3.O() == 4)) {
                    int j = (bmwVar3.j() - this.d.K.b()) - this.d.M.b();
                    j(this.i, bmwVar3.h.i, this.d.K.b());
                    j(this.j, bmwVar3.h.j, -this.d.M.b());
                    this.f.c(j);
                    return;
                }
                if (this.k == 1) {
                    this.f.c(this.d.j());
                }
            }
        } else if (this.k == 4 && (bmwVar = this.d.V) != null && (bmwVar.O() == 1 || bmwVar.O() == 4)) {
            j(this.i, bmwVar.h.i, this.d.K.b());
            j(this.j, bmwVar.h.j, -this.d.M.b());
            return;
        }
        bnk bnkVar = this.f;
        if (bnkVar.i) {
            bmw bmwVar5 = this.d;
            if (bmwVar5.e) {
                bmv[] bmvVarArr = bmwVar5.S;
                bmv bmvVar = bmvVarArr[0];
                bmv bmvVar2 = bmvVar.e;
                if (bmvVar2 != null && bmvVarArr[1].e != null) {
                    if (bmwVar5.J()) {
                        this.i.e = this.d.S[0].b();
                        this.j.e = -this.d.S[1].b();
                        return;
                    }
                    bnj k = k(this.d.S[0]);
                    if (k != null) {
                        j(this.i, k, this.d.S[0].b());
                    }
                    bnj k2 = k(this.d.S[1]);
                    if (k2 != null) {
                        j(this.j, k2, -this.d.S[1].b());
                    }
                    this.i.b = true;
                    this.j.b = true;
                    return;
                }
                if (bmvVar2 != null) {
                    bnj k3 = k(bmvVar);
                    if (k3 != null) {
                        j(this.i, k3, this.d.S[0].b());
                        j(this.j, this.i, this.f.f);
                        return;
                    }
                    return;
                }
                bmv bmvVar3 = bmvVarArr[1];
                if (bmvVar3.e != null) {
                    bnj k4 = k(bmvVar3);
                    if (k4 != null) {
                        j(this.j, k4, -this.d.S[1].b());
                        j(this.i, this.j, -this.f.f);
                        return;
                    }
                    return;
                }
                if (!(bmwVar5 instanceof bnb) && bmwVar5.V != null && bmwVar5.M(7).e == null) {
                    bmw bmwVar6 = this.d;
                    j(this.i, bmwVar6.V.h.i, bmwVar6.k());
                    j(this.j, this.i, this.f.f);
                    return;
                }
                return;
            }
        }
        if (this.k == 3) {
            bmw bmwVar7 = this.d;
            int i = bmwVar7.t;
            if (i != 2) {
                if (i == 3) {
                    if (bmwVar7.u == 3) {
                        this.i.a = this;
                        this.j.a = this;
                        bnq bnqVar = bmwVar7.i;
                        bnqVar.i.a = this;
                        bnqVar.j.a = this;
                        bnkVar.a = this;
                        if (bmwVar7.K()) {
                            this.f.k.add(this.d.i.f);
                            this.d.i.f.j.add(this.f);
                            bnq bnqVar2 = this.d.i;
                            bnqVar2.f.a = this;
                            this.f.k.add(bnqVar2.i);
                            this.f.k.add(this.d.i.j);
                            this.d.i.i.j.add(this.f);
                            this.d.i.j.j.add(this.f);
                        } else if (this.d.J()) {
                            this.d.i.f.k.add(this.f);
                            this.f.j.add(this.d.i.f);
                        } else {
                            this.d.i.f.k.add(this.f);
                        }
                    } else {
                        bnk bnkVar2 = bmwVar7.i.f;
                        bnkVar.k.add(bnkVar2);
                        bnkVar2.j.add(this.f);
                        this.d.i.i.j.add(this.f);
                        this.d.i.j.j.add(this.f);
                        bnk bnkVar3 = this.f;
                        bnkVar3.b = true;
                        bnkVar3.j.add(this.i);
                        this.f.j.add(this.j);
                        this.i.k.add(this.f);
                        this.j.k.add(this.f);
                    }
                }
            } else {
                bmw bmwVar8 = bmwVar7.V;
                if (bmwVar8 != null) {
                    bnk bnkVar4 = bmwVar8.i.f;
                    bnkVar.k.add(bnkVar4);
                    bnkVar4.j.add(this.f);
                    bnk bnkVar5 = this.f;
                    bnkVar5.b = true;
                    bnkVar5.j.add(this.i);
                    this.f.j.add(this.j);
                }
            }
        }
        bmw bmwVar9 = this.d;
        bmv[] bmvVarArr2 = bmwVar9.S;
        bmv bmvVar4 = bmvVarArr2[0];
        bmv bmvVar5 = bmvVar4.e;
        if (bmvVar5 != null && bmvVarArr2[1].e != null) {
            if (bmwVar9.J()) {
                this.i.e = this.d.S[0].b();
                this.j.e = -this.d.S[1].b();
                return;
            }
            bnj k5 = k(this.d.S[0]);
            bnj k6 = k(this.d.S[1]);
            if (k5 != null) {
                k5.a(this);
            }
            if (k6 != null) {
                k6.a(this);
            }
            this.l = 4;
            return;
        }
        if (bmvVar5 != null) {
            bnj k7 = k(bmvVar4);
            if (k7 != null) {
                j(this.i, k7, this.d.S[0].b());
                i(this.j, this.i, 1, this.f);
                return;
            }
            return;
        }
        bmv bmvVar6 = bmvVarArr2[1];
        if (bmvVar6.e != null) {
            bnj k8 = k(bmvVar6);
            if (k8 != null) {
                j(this.j, k8, -this.d.S[1].b());
                i(this.i, this.j, -1, this.f);
                return;
            }
            return;
        }
        if (!(bmwVar9 instanceof bnb) && (bmwVar2 = bmwVar9.V) != null) {
            j(this.i, bmwVar2.h.i, bmwVar9.k());
            i(this.j, this.i, 1, this.f);
        }
    }

    @Override // defpackage.bns
    public final void c() {
        bnj bnjVar = this.i;
        if (bnjVar.i) {
            this.d.aa = bnjVar.f;
        }
    }

    @Override // defpackage.bns
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.bns
    public final boolean e() {
        if (this.k != 3 || this.d.t == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bns, defpackage.bnh
    public final void f() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        float f3;
        int i = this.l;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 3) {
                bnk bnkVar = this.f;
                if (!bnkVar.i && this.k == 3) {
                    bmw bmwVar = this.d;
                    int i3 = bmwVar.t;
                    if (i3 != 2) {
                        if (i3 == 3) {
                            int i4 = bmwVar.u;
                            if (i4 != 0 && i4 != 3) {
                                int i5 = bmwVar.Z;
                                if (i5 != -1) {
                                    if (i5 != 0) {
                                        f = bmwVar.i.f.f;
                                        f2 = bmwVar.Y;
                                    } else {
                                        f3 = bmwVar.i.f.f / bmwVar.Y;
                                        bnkVar.c((int) (f3 + 0.5f));
                                    }
                                } else {
                                    f = bmwVar.i.f.f;
                                    f2 = bmwVar.Y;
                                }
                                f3 = f * f2;
                                bnkVar.c((int) (f3 + 0.5f));
                            } else {
                                bnq bnqVar = bmwVar.i;
                                bnj bnjVar = bnqVar.i;
                                bnj bnjVar2 = bnqVar.j;
                                if (bmwVar.K.e != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (bmwVar.L.e != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (bmwVar.M.e != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (bmwVar.N.e != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                int i6 = bmwVar.Z;
                                if (z && z2 && z3 && z4) {
                                    float f4 = bmwVar.Y;
                                    if (bnjVar.i && bnjVar2.i) {
                                        bnj bnjVar3 = this.i;
                                        if (bnjVar3.c && this.j.c) {
                                            int i7 = ((bnj) bnjVar3.k.get(0)).f + this.i.e;
                                            int i8 = ((bnj) this.j.k.get(0)).f - this.j.e;
                                            int i9 = bnjVar.f + bnjVar.e;
                                            int i10 = bnjVar2.f - bnjVar2.e;
                                            int[] iArr = a;
                                            n(iArr, i7, i8, i9, i10, f4, i6);
                                            this.f.c(iArr[0]);
                                            this.d.i.f.c(iArr[1]);
                                            return;
                                        }
                                        return;
                                    }
                                    bnj bnjVar4 = this.i;
                                    if (bnjVar4.i) {
                                        bnj bnjVar5 = this.j;
                                        if (bnjVar5.i) {
                                            if (bnjVar.c && bnjVar2.c) {
                                                int i11 = bnjVar4.f + bnjVar4.e;
                                                int i12 = bnjVar5.f - bnjVar5.e;
                                                int i13 = ((bnj) bnjVar.k.get(0)).f + bnjVar.e;
                                                int i14 = ((bnj) bnjVar2.k.get(0)).f - bnjVar2.e;
                                                int[] iArr2 = a;
                                                n(iArr2, i11, i12, i13, i14, f4, i6);
                                                this.f.c(iArr2[0]);
                                                this.d.i.f.c(iArr2[1]);
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                    bnj bnjVar6 = this.i;
                                    if (bnjVar6.c && this.j.c && bnjVar.c && bnjVar2.c) {
                                        int i15 = ((bnj) bnjVar6.k.get(0)).f + this.i.e;
                                        int i16 = ((bnj) this.j.k.get(0)).f - this.j.e;
                                        int i17 = ((bnj) bnjVar.k.get(0)).f + bnjVar.e;
                                        int i18 = ((bnj) bnjVar2.k.get(0)).f - bnjVar2.e;
                                        int[] iArr3 = a;
                                        n(iArr3, i15, i16, i17, i18, f4, i6);
                                        this.f.c(iArr3[0]);
                                        this.d.i.f.c(iArr3[1]);
                                    } else {
                                        return;
                                    }
                                } else if (z && z3) {
                                    bnj bnjVar7 = this.i;
                                    if (bnjVar7.c && this.j.c) {
                                        float f5 = bmwVar.Y;
                                        int i19 = (((bnj) this.j.k.get(0)).f - this.j.e) - (((bnj) bnjVar7.k.get(0)).f + this.i.e);
                                        if (i6 != -1 && i6 != 0) {
                                            int h = h(i19, 0);
                                            int i20 = (int) ((h / f5) + 0.5f);
                                            int h2 = h(i20, 1);
                                            if (i20 != h2) {
                                                h = (int) ((h2 * f5) + 0.5f);
                                            }
                                            this.f.c(h);
                                            this.d.i.f.c(h2);
                                        } else {
                                            int h3 = h(i19, 0);
                                            int i21 = (int) ((h3 * f5) + 0.5f);
                                            int h4 = h(i21, 1);
                                            if (i21 != h4) {
                                                h3 = (int) ((h4 / f5) + 0.5f);
                                            }
                                            this.f.c(h3);
                                            this.d.i.f.c(h4);
                                        }
                                    } else {
                                        return;
                                    }
                                } else if (z2 && z4) {
                                    if (bnjVar.c && bnjVar2.c) {
                                        float f6 = bmwVar.Y;
                                        int i22 = (((bnj) bnjVar2.k.get(0)).f - bnjVar2.e) - (((bnj) bnjVar.k.get(0)).f + bnjVar.e);
                                        if (i6 != 0) {
                                            int h5 = h(i22, 1);
                                            int i23 = (int) ((h5 / f6) + 0.5f);
                                            int h6 = h(i23, 0);
                                            if (i23 != h6) {
                                                h5 = (int) ((h6 * f6) + 0.5f);
                                            }
                                            this.f.c(h6);
                                            this.d.i.f.c(h5);
                                        } else {
                                            int h7 = h(i22, 1);
                                            int i24 = (int) ((h7 * f6) + 0.5f);
                                            int h8 = h(i24, 0);
                                            if (i24 != h8) {
                                                h7 = (int) ((h8 / f6) + 0.5f);
                                            }
                                            this.f.c(h8);
                                            this.d.i.f.c(h7);
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        bmw bmwVar2 = bmwVar.V;
                        if (bmwVar2 != null) {
                            if (bmwVar2.h.f.i) {
                                bnkVar.c((int) ((r7.f * bmwVar.y) + 0.5f));
                            }
                        }
                    }
                }
                bnj bnjVar8 = this.i;
                if (bnjVar8.c) {
                    bnj bnjVar9 = this.j;
                    if (bnjVar9.c) {
                        if (!bnjVar8.i || !bnjVar9.i || !this.f.i) {
                            if (!this.f.i && this.k == 3) {
                                bmw bmwVar3 = this.d;
                                if (bmwVar3.t == 0 && !bmwVar3.J()) {
                                    bnj bnjVar10 = (bnj) this.i.k.get(0);
                                    bnj bnjVar11 = (bnj) this.j.k.get(0);
                                    int i25 = bnjVar10.f;
                                    bnj bnjVar12 = this.i;
                                    int i26 = i25 + bnjVar12.e;
                                    int i27 = bnjVar11.f + this.j.e;
                                    bnjVar12.c(i26);
                                    this.j.c(i27);
                                    this.f.c(i27 - i26);
                                    return;
                                }
                            }
                            if (!this.f.i && this.k == 3 && this.c == 1 && this.i.k.size() > 0 && this.j.k.size() > 0) {
                                bnj bnjVar13 = (bnj) this.i.k.get(0);
                                bnj bnjVar14 = (bnj) this.j.k.get(0);
                                int min = Math.min((bnjVar14.f + this.j.e) - (bnjVar13.f + this.i.e), this.f.m);
                                bmw bmwVar4 = this.d;
                                int i28 = bmwVar4.x;
                                int max = Math.max(bmwVar4.w, min);
                                if (i28 > 0) {
                                    max = Math.min(i28, max);
                                }
                                this.f.c(max);
                            }
                            if (this.f.i) {
                                bnj bnjVar15 = (bnj) this.i.k.get(0);
                                bnj bnjVar16 = (bnj) this.j.k.get(0);
                                int i29 = bnjVar15.f;
                                bnj bnjVar17 = this.i;
                                int i30 = bnjVar17.e + i29;
                                int i31 = bnjVar16.f;
                                int i32 = this.j.e + i31;
                                float f7 = this.d.af;
                                if (bnjVar15 == bnjVar16) {
                                    f7 = 0.5f;
                                }
                                if (bnjVar15 != bnjVar16) {
                                    i31 = i32;
                                }
                                if (bnjVar15 != bnjVar16) {
                                    i29 = i30;
                                }
                                bnjVar17.c((int) (i29 + 0.5f + (((i31 - i29) - this.f.f) * f7)));
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
            bmw bmwVar5 = this.d;
            m(bmwVar5.K, bmwVar5.M, 0);
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
        this.f.i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.aj));
    }
}
