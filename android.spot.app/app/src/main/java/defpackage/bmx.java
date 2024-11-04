package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmx extends bne {
    public int as;
    public int at;
    public int b;
    public final bso aI = new bso(this);
    public final bni a = new bni(this);
    public bny aH = null;
    public boolean c = false;
    public final bmo d = new bmo();
    public int au = 0;
    public int av = 0;
    public bmu[] aw = new bmu[4];
    public bmu[] ax = new bmu[4];
    public int ay = 257;
    public boolean az = false;
    public boolean aA = false;
    public WeakReference aB = null;
    public WeakReference aC = null;
    public WeakReference aD = null;
    public WeakReference aE = null;
    final HashSet aF = new HashSet();
    public final bnf aG = new bnf();

    public static void aa(bmw bmwVar, bny bnyVar, bnf bnfVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        if (bnyVar == null) {
            return;
        }
        if (bmwVar.ai != 8 && !(bmwVar instanceof bna) && !(bmwVar instanceof bmt)) {
            bnfVar.i = bmwVar.O();
            bnfVar.j = bmwVar.P();
            bnfVar.a = bmwVar.j();
            bnfVar.b = bmwVar.h();
            bnfVar.g = false;
            bnfVar.h = 0;
            if (bnfVar.i == 3) {
                z = true;
            } else {
                z = false;
            }
            if (bnfVar.j == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && bmwVar.Y > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && bmwVar.Y > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && bmwVar.H(0) && bmwVar.t == 0 && !z3) {
                bnfVar.i = 2;
                if (z2 && bmwVar.u == 0) {
                    bnfVar.i = 1;
                }
                z = false;
            }
            if (z2 && bmwVar.H(1) && bmwVar.u == 0 && !z4) {
                bnfVar.j = 2;
                if (z && bmwVar.t == 0) {
                    bnfVar.j = 1;
                }
                z2 = false;
            }
            if (bmwVar.e()) {
                bnfVar.i = 1;
                z = false;
            }
            if (bmwVar.f()) {
                bnfVar.j = 1;
                z2 = false;
            }
            if (z3) {
                if (bmwVar.v[0] == 4) {
                    bnfVar.i = 1;
                } else if (!z2) {
                    if (bnfVar.j == 1) {
                        i2 = bnfVar.b;
                    } else {
                        bnfVar.i = 2;
                        bnyVar.a(bmwVar, bnfVar);
                        i2 = bnfVar.d;
                    }
                    bnfVar.i = 1;
                    bnfVar.a = (int) (bmwVar.Y * i2);
                }
            }
            if (z4) {
                if (bmwVar.v[1] == 4) {
                    bnfVar.j = 1;
                } else if (!z) {
                    if (bnfVar.i == 1) {
                        i = bnfVar.a;
                    } else {
                        bnfVar.j = 2;
                        bnyVar.a(bmwVar, bnfVar);
                        i = bnfVar.c;
                    }
                    bnfVar.j = 1;
                    float f = i;
                    if (bmwVar.Z == -1) {
                        bnfVar.b = (int) (f / bmwVar.Y);
                    } else {
                        bnfVar.b = (int) (bmwVar.Y * f);
                    }
                }
            }
            bnyVar.a(bmwVar, bnfVar);
            bmwVar.E(bnfVar.c);
            bmwVar.z(bnfVar.d);
            bmwVar.G = bnfVar.f;
            bmwVar.w(bnfVar.e);
            bnfVar.h = 0;
            boolean z5 = bnfVar.g;
            return;
        }
        bnfVar.c = 0;
        bnfVar.d = 0;
    }

    private final void ac(bmv bmvVar, bmr bmrVar) {
        bmo bmoVar = this.d;
        bmoVar.g(bmrVar, bmoVar.b(bmvVar), 0, 5);
    }

    private final void ad(bmv bmvVar, bmr bmrVar) {
        bmo bmoVar = this.d;
        bmoVar.g(bmoVar.b(bmvVar), bmrVar, 0, 5);
    }

    private final void ae() {
        this.au = 0;
        this.av = 0;
    }

    @Override // defpackage.bmw
    public final void F(boolean z, boolean z2) {
        super.F(z, z2);
        int size = this.aJ.size();
        for (int i = 0; i < size; i++) {
            ((bmw) this.aJ.get(i)).F(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0623 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x095a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0968 A[LOOP:14: B:248:0x0966->B:249:0x0968, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x05ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:702:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x05d0  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12 */
    @Override // defpackage.bne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W() {
        /*
            Method dump skipped, instructions count: 2654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmx.W():void");
    }

    public final void X(int i) {
        this.ay = i;
        bmo.a = Z(512);
    }

    public final boolean Y(boolean z, int i) {
        boolean z2;
        boolean z3;
        bni bniVar = this.a;
        boolean z4 = false;
        int N = bniVar.a.N(0);
        int N2 = bniVar.a.N(1);
        bmx bmxVar = bniVar.a;
        int k = bmxVar.k();
        int l = bmxVar.l();
        if (z) {
            if (N != 2) {
                if (N2 == 2) {
                    N2 = 2;
                }
            }
            ArrayList arrayList = bniVar.e;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    bns bnsVar = (bns) arrayList.get(i2);
                    if (bnsVar.g == i && !bnsVar.e()) {
                        z3 = false;
                        break;
                    }
                    i2++;
                } else {
                    z3 = true;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && N == 2) {
                    bniVar.a.S(1);
                    bmx bmxVar2 = bniVar.a;
                    bmxVar2.E(bniVar.a(bmxVar2, 0));
                    bmx bmxVar3 = bniVar.a;
                    bmxVar3.h.f.c(bmxVar3.j());
                }
            } else if (z3 && N2 == 2) {
                bniVar.a.T(1);
                bmx bmxVar4 = bniVar.a;
                bmxVar4.z(bniVar.a(bmxVar4, 1));
                bmx bmxVar5 = bniVar.a;
                bmxVar5.i.f.c(bmxVar5.h());
            }
        }
        if (i == 0) {
            bmx bmxVar6 = bniVar.a;
            int i3 = bmxVar6.ar[0];
            if (i3 == 1 || i3 == 4) {
                int j = bmxVar6.j() + k;
                bmxVar6.h.j.c(j);
                bniVar.a.h.f.c(j - k);
                z2 = true;
            }
            z2 = false;
        } else {
            bmx bmxVar7 = bniVar.a;
            int i4 = bmxVar7.ar[1];
            if (i4 == 1 || i4 == 4) {
                int h = bmxVar7.h() + l;
                bmxVar7.i.j.c(h);
                bniVar.a.i.f.c(h - l);
                z2 = true;
            }
            z2 = false;
        }
        bniVar.c();
        ArrayList arrayList2 = bniVar.e;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            bns bnsVar2 = (bns) arrayList2.get(i5);
            if (bnsVar2.g == i && (bnsVar2.d != bniVar.a || bnsVar2.h)) {
                bnsVar2.c();
            }
        }
        ArrayList arrayList3 = bniVar.e;
        int size3 = arrayList3.size();
        int i6 = 0;
        while (true) {
            if (i6 < size3) {
                bns bnsVar3 = (bns) arrayList3.get(i6);
                if (bnsVar3.g == i && ((z2 || bnsVar3.d != bniVar.a) && (!bnsVar3.i.i || !bnsVar3.j.i || (!(bnsVar3 instanceof bng) && !bnsVar3.f.i)))) {
                    break;
                }
                i6++;
            } else {
                z4 = true;
                break;
            }
        }
        bniVar.a.S(N);
        bniVar.a.T(N2);
        return z4;
    }

    public final boolean Z(int i) {
        if ((this.ay & i) == i) {
            return true;
        }
        return false;
    }

    public final void a(bmw bmwVar, int i) {
        if (i == 0) {
            int i2 = this.au + 1;
            bmu[] bmuVarArr = this.ax;
            int length = bmuVarArr.length;
            if (i2 >= length) {
                this.ax = (bmu[]) Arrays.copyOf(bmuVarArr, length + length);
            }
            bmu[] bmuVarArr2 = this.ax;
            int i3 = this.au;
            bmuVarArr2[i3] = new bmu(bmwVar, 0, this.c);
            this.au = i3 + 1;
            return;
        }
        int i4 = this.av + 1;
        bmu[] bmuVarArr3 = this.aw;
        int length2 = bmuVarArr3.length;
        if (i4 >= length2) {
            this.aw = (bmu[]) Arrays.copyOf(bmuVarArr3, length2 + length2);
        }
        bmu[] bmuVarArr4 = this.aw;
        int i5 = this.av;
        bmuVarArr4[i5] = new bmu(bmwVar, 1, this.c);
        this.av = i5 + 1;
    }

    public final void c() {
        this.a.b = true;
    }

    @Override // defpackage.bne, defpackage.bmw
    public final void t() {
        this.d.k();
        this.as = 0;
        this.at = 0;
        super.t();
    }
}
