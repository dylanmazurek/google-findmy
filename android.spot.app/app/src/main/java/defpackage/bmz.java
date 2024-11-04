package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmz extends bnd {
    public bmw[] aH;
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public int as = -1;
    public int at = -1;
    public float au = 0.5f;
    public float av = 0.5f;
    public float aw = 0.5f;
    public float ax = 0.5f;
    public float ay = 0.5f;
    public float az = 0.5f;
    public int aA = 0;
    public int aB = 0;
    public int aC = 2;
    public int aD = 2;
    public int aE = 0;
    public int aF = -1;
    public int aG = 0;
    private final ArrayList aW = new ArrayList();
    private bmw[] aX = null;
    private bmw[] aY = null;
    private int[] aZ = null;
    public int aI = 0;

    /* JADX WARN: Removed duplicated region for block: B:227:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0709  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:253:0x0457 -> B:197:0x039f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:254:0x0459 -> B:197:0x039f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:256:0x045f -> B:197:0x039f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:257:0x0461 -> B:197:0x039f). Please report as a decompilation issue!!! */
    @Override // defpackage.bnd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(int r36, int r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmz.W(int, int, int, int):void");
    }

    public final int a(bmw bmwVar, int i) {
        if (bmwVar == null) {
            return 0;
        }
        if (bmwVar.P() == 3) {
            int i2 = bmwVar.u;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (bmwVar.B * i);
                if (i3 != bmwVar.h()) {
                    bmwVar.k = true;
                    aa(bmwVar, bmwVar.O(), bmwVar.j(), 1, i3);
                }
                return i3;
            }
            if (i2 != 1 && i2 == 3) {
                return (int) ((bmwVar.j() * bmwVar.Y) + 0.5f);
            }
        }
        return bmwVar.h();
    }

    @Override // defpackage.bmw
    public final void b(bmo bmoVar, boolean z) {
        boolean z2;
        boolean z3;
        bmw bmwVar;
        float f;
        int i;
        boolean z4;
        super.b(bmoVar, z);
        bmw bmwVar2 = this.V;
        if (bmwVar2 != null && ((bmx) bmwVar2).c) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.aE;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int size = this.aW.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            bmy bmyVar = (bmy) this.aW.get(i3);
                            if (i3 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            bmyVar.d(z2, i3, z4);
                        }
                    }
                } else if (this.aZ != null && this.aY != null && this.aX != null) {
                    for (int i4 = 0; i4 < this.aI; i4++) {
                        this.aH[i4].u();
                    }
                    int[] iArr = this.aZ;
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    float f2 = this.au;
                    bmw bmwVar3 = null;
                    int i7 = 0;
                    while (i7 < i5) {
                        if (z2) {
                            i = (i5 - i7) - 1;
                            f = 1.0f - this.au;
                        } else {
                            f = f2;
                            i = i7;
                        }
                        bmw bmwVar4 = this.aY[i];
                        if (bmwVar4 != null && bmwVar4.ai != 8) {
                            if (i7 == 0) {
                                bmwVar4.q(bmwVar4.K, this.K, this.aP);
                                bmwVar4.ak = this.a;
                                bmwVar4.af = f;
                                i7 = 0;
                            }
                            if (i7 == i5 - 1) {
                                bmwVar4.q(bmwVar4.M, this.M, this.aQ);
                            }
                            if (i7 > 0 && bmwVar3 != null) {
                                bmwVar4.q(bmwVar4.K, bmwVar3.M, this.aA);
                                bmwVar3.q(bmwVar3.M, bmwVar4.K, 0);
                            }
                            bmwVar3 = bmwVar4;
                        }
                        i7++;
                        f2 = f;
                    }
                    int i8 = 0;
                    while (i8 < i6) {
                        bmw bmwVar5 = this.aX[i8];
                        if (bmwVar5 != null && bmwVar5.ai != 8) {
                            if (i8 == 0) {
                                bmwVar5.q(bmwVar5.L, this.L, this.aL);
                                bmwVar5.al = this.b;
                                bmwVar5.ag = this.av;
                                i8 = 0;
                            }
                            if (i8 == i6 - 1) {
                                bmwVar5.q(bmwVar5.N, this.N, this.aM);
                            }
                            if (i8 > 0 && bmwVar3 != null) {
                                bmwVar5.q(bmwVar5.L, bmwVar3.N, this.aB);
                                bmwVar3.q(bmwVar3.N, bmwVar5.L, 0);
                            }
                            bmwVar3 = bmwVar5;
                        }
                        i8++;
                    }
                    for (int i9 = 0; i9 < i5; i9++) {
                        for (int i10 = 0; i10 < i6; i10++) {
                            int i11 = (i10 * i5) + i9;
                            if (this.aG == 1) {
                                i11 = (i9 * i6) + i10;
                            }
                            bmw[] bmwVarArr = this.aH;
                            if (i11 < bmwVarArr.length && (bmwVar = bmwVarArr[i11]) != null && bmwVar.ai != 8) {
                                bmw bmwVar6 = this.aY[i9];
                                bmw bmwVar7 = this.aX[i10];
                                if (bmwVar != bmwVar6) {
                                    bmwVar.q(bmwVar.K, bmwVar6.K, 0);
                                    bmwVar.q(bmwVar.M, bmwVar6.M, 0);
                                }
                                if (bmwVar != bmwVar7) {
                                    bmwVar.q(bmwVar.L, bmwVar7.L, 0);
                                    bmwVar.q(bmwVar.N, bmwVar7.N, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = this.aW.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    bmy bmyVar2 = (bmy) this.aW.get(i12);
                    if (i12 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bmyVar2.d(z2, i12, z3);
                }
            }
        } else if (this.aW.size() > 0) {
            ((bmy) this.aW.get(0)).d(z2, 0, true);
        }
        this.aR = false;
    }

    public final int c(bmw bmwVar, int i) {
        if (bmwVar == null) {
            return 0;
        }
        if (bmwVar.O() == 3) {
            int i2 = bmwVar.t;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (bmwVar.y * i);
                if (i3 != bmwVar.j()) {
                    bmwVar.k = true;
                    aa(bmwVar, 1, i3, bmwVar.P(), bmwVar.h());
                }
                return i3;
            }
            if (i2 != 1 && i2 == 3) {
                return (int) ((bmwVar.h() * bmwVar.Y) + 0.5f);
            }
        }
        return bmwVar.j();
    }
}
