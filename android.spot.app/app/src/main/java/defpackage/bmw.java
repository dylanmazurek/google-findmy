package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bmw {
    public int A;
    public float B;
    int C;
    float D;
    public final int[] E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final bmv K;
    public final bmv L;
    public final bmv M;
    public final bmv N;
    public final bmv O;
    final bmv P;
    final bmv Q;
    public final bmv R;
    public final bmv[] S;
    protected final ArrayList T;
    public final boolean[] U;
    public bmw V;
    int W;
    public int X;
    public float Y;
    public int Z;
    private boolean a;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public float af;
    public float ag;
    public Object ah;
    public int ai;
    public String aj;
    public int ak;
    public int al;
    public final float[] am;
    public final bmw[] an;
    public final bmw[] ao;
    public int ap;
    public int aq;
    public final int[] ar;
    public bng f;
    public bng g;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final int[] v;
    public int w;
    public int x;
    public float y;
    public int z;
    public boolean e = false;
    public bno h = null;
    public bnq i = null;
    public final boolean[] j = {true, true};
    public boolean k = true;
    public int l = -1;
    public int m = -1;

    public bmw() {
        new HashMap();
        this.a = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = new int[2];
        this.w = 0;
        this.x = 0;
        this.y = 1.0f;
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = -1;
        this.D = 1.0f;
        this.E = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.F = Float.NaN;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        bmv bmvVar = new bmv(this, 2);
        this.K = bmvVar;
        bmv bmvVar2 = new bmv(this, 3);
        this.L = bmvVar2;
        bmv bmvVar3 = new bmv(this, 4);
        this.M = bmvVar3;
        bmv bmvVar4 = new bmv(this, 5);
        this.N = bmvVar4;
        bmv bmvVar5 = new bmv(this, 6);
        this.O = bmvVar5;
        bmv bmvVar6 = new bmv(this, 8);
        this.P = bmvVar6;
        bmv bmvVar7 = new bmv(this, 9);
        this.Q = bmvVar7;
        bmv bmvVar8 = new bmv(this, 7);
        this.R = bmvVar8;
        this.S = new bmv[]{bmvVar, bmvVar3, bmvVar2, bmvVar4, bmvVar5, bmvVar8};
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        this.U = new boolean[2];
        this.ar = new int[]{1, 1};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.af = 0.5f;
        this.ag = 0.5f;
        this.ai = 0;
        this.aj = null;
        this.ak = 0;
        this.al = 0;
        this.am = new float[]{-1.0f, -1.0f};
        this.an = new bmw[]{null, null};
        this.ao = new bmw[]{null, null};
        this.ap = -1;
        this.aq = -1;
        arrayList.add(bmvVar);
        arrayList.add(bmvVar2);
        arrayList.add(bmvVar3);
        arrayList.add(bmvVar4);
        arrayList.add(bmvVar6);
        arrayList.add(bmvVar7);
        arrayList.add(bmvVar8);
        arrayList.add(bmvVar5);
    }

    private final boolean a(int i) {
        bmv bmvVar;
        bmv bmvVar2;
        bmv[] bmvVarArr = this.S;
        int i2 = i + i;
        bmv bmvVar3 = bmvVarArr[i2];
        bmv bmvVar4 = bmvVar3.e;
        if (bmvVar4 != null && bmvVar4.e != bmvVar3 && (bmvVar2 = (bmvVar = bmvVarArr[i2 + 1]).e) != null && bmvVar2.e == bmvVar) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(defpackage.bmo r30, boolean r31, boolean r32, boolean r33, boolean r34, defpackage.bmr r35, defpackage.bmr r36, int r37, boolean r38, defpackage.bmv r39, defpackage.bmv r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmw.c(bmo, boolean, boolean, boolean, boolean, bmr, bmr, int, boolean, bmv, bmv, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(int i, boolean z) {
        this.U[i] = z;
    }

    public final void B(int i, int i2) {
        this.I = i;
        this.J = i2;
        this.k = false;
    }

    public final void C(int i) {
        if (i < 0) {
            this.ae = 0;
        } else {
            this.ae = i;
        }
    }

    public final void D(int i) {
        if (i < 0) {
            this.ad = 0;
        } else {
            this.ad = i;
        }
    }

    public final void E(int i) {
        this.W = i;
        int i2 = this.ad;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void F(boolean z, boolean z2) {
        int i;
        int i2;
        bno bnoVar = this.h;
        boolean z3 = z & bnoVar.h;
        bnq bnqVar = this.i;
        boolean z4 = z2 & bnqVar.h;
        int i3 = bnoVar.i.f;
        int i4 = bnqVar.i.f;
        int i5 = bnoVar.j.f;
        int i6 = bnqVar.j.f;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (z3) {
            this.aa = i3;
        }
        if (z4) {
            this.ab = i4;
        }
        if (this.ai == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (z3) {
            int i8 = i5 - i3;
            if (this.ar[0] == 1 && i8 < (i2 = this.W)) {
                i8 = i2;
            }
            this.W = i8;
            int i9 = this.ad;
            if (i8 < i9) {
                this.W = i9;
            }
        }
        if (z4) {
            int i10 = i6 - i4;
            if (this.ar[1] == 1 && i10 < (i = this.X)) {
                i10 = i;
            }
            this.X = i10;
            int i11 = this.ae;
            if (i10 < i11) {
                this.X = i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean G() {
        if (!(this instanceof bnd) && !(this instanceof bna)) {
            return false;
        }
        return true;
    }

    public final boolean H(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.K.e != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.M.e != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 < 2) {
                return true;
            }
            return false;
        }
        if (this.L.e != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.N.e != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (this.O.e != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i2 + i3 + i4 < 2) {
            return true;
        }
        return false;
    }

    public final boolean I(int i, int i2) {
        bmv bmvVar;
        bmv bmvVar2;
        bmv bmvVar3;
        bmv bmvVar4;
        if (i == 0) {
            bmv bmvVar5 = this.K.e;
            if (bmvVar5 != null && bmvVar5.c && (bmvVar4 = (bmvVar3 = this.M).e) != null && bmvVar4.c && (bmvVar4.a() - bmvVar3.b()) - (this.K.e.a() + this.K.b()) >= i2) {
                return true;
            }
            return false;
        }
        bmv bmvVar6 = this.L.e;
        if (bmvVar6 != null && bmvVar6.c && (bmvVar2 = (bmvVar = this.N).e) != null && bmvVar2.c && (bmvVar2.a() - bmvVar.b()) - (this.L.e.a() + this.L.b()) >= i2) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        bmv bmvVar = this.K;
        bmv bmvVar2 = bmvVar.e;
        if (bmvVar2 == null || bmvVar2.e != bmvVar) {
            bmv bmvVar3 = this.M;
            bmv bmvVar4 = bmvVar3.e;
            if (bmvVar4 != null && bmvVar4.e == bmvVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean K() {
        bmv bmvVar = this.L;
        bmv bmvVar2 = bmvVar.e;
        if (bmvVar2 == null || bmvVar2.e != bmvVar) {
            bmv bmvVar3 = this.N;
            bmv bmvVar4 = bmvVar3.e;
            if (bmvVar4 != null && bmvVar4.e == bmvVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean L() {
        if (this.k && this.ai != 8) {
            return true;
        }
        return false;
    }

    public bmv M(int i) {
        switch (i - 1) {
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            default:
                return this.Q;
        }
    }

    public final int N(int i) {
        if (i == 0) {
            return O();
        }
        return P();
    }

    public final int O() {
        return this.ar[0];
    }

    public final int P() {
        return this.ar[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0172, code lost:            if (r11 == 4) goto L91;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(int r11, defpackage.bmw r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmw.Q(int, bmw, int, int):void");
    }

    public final void R(int i, bmw bmwVar, int i2, int i3, int i4) {
        M(i).n(bmwVar.M(i2), i3, i4, true);
    }

    public final void S(int i) {
        this.ar[0] = i;
    }

    public final void T(int i) {
        this.ar[1] = i;
    }

    public void U(boolean z) {
        int i;
        bnq bnqVar;
        bno bnoVar;
        int o = bmo.o(this.K);
        int o2 = bmo.o(this.L);
        int o3 = bmo.o(this.M);
        int o4 = bmo.o(this.N);
        if (z && (bnoVar = this.h) != null) {
            bnj bnjVar = bnoVar.i;
            if (bnjVar.i) {
                bnj bnjVar2 = bnoVar.j;
                if (bnjVar2.i) {
                    o = bnjVar.f;
                    o3 = bnjVar2.f;
                }
            }
        }
        if (z && (bnqVar = this.i) != null) {
            bnj bnjVar3 = bnqVar.i;
            if (bnjVar3.i) {
                bnj bnjVar4 = bnqVar.j;
                if (bnjVar4.i) {
                    o2 = bnjVar3.f;
                    o4 = bnjVar4.f;
                }
            }
        }
        if (o3 - o < 0 || o4 - o2 < 0 || o == Integer.MIN_VALUE || o == Integer.MAX_VALUE || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE) {
            o = 0;
            o2 = 0;
            o3 = 0;
            o4 = 0;
        }
        this.aa = o;
        this.ab = o2;
        if (this.ai == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        int i2 = o3 - o;
        int[] iArr = this.ar;
        int i3 = iArr[0];
        if (i3 == 1) {
            int i4 = this.W;
            if (i2 < i4) {
                i2 = i4;
            }
            i3 = 1;
        }
        int i5 = o4 - o2;
        if (iArr[1] == 1 && i5 < (i = this.X)) {
            i5 = i;
        }
        this.W = i2;
        this.X = i5;
        int i6 = this.ae;
        if (i5 < i6) {
            this.X = i6;
        }
        int i7 = this.ad;
        if (i2 < i7) {
            this.W = i7;
        } else {
            i7 = i2;
        }
        int i8 = this.x;
        if (i8 > 0 && i3 == 3) {
            this.W = Math.min(i7, i8);
        }
        int i9 = this.A;
        if (i9 > 0 && this.ar[1] == 3) {
            this.X = Math.min(this.X, i9);
        }
        int i10 = this.W;
        if (i2 != i10) {
            this.l = i10;
        }
        int i11 = this.X;
        if (i5 != i11) {
            this.m = i11;
        }
    }

    public void V(ksr ksrVar) {
        this.K.m();
        this.L.m();
        this.M.m();
        this.N.m();
        this.O.m();
        this.R.m();
        this.P.m();
        this.Q.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x040a, code lost:            if (r6 == (-1)) goto L262;     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x02da, code lost:            if (r6 == 0) goto L186;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:            if (r50.n != false) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0159, code lost:            if (r50.n != false) goto L83;     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0416 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(defpackage.bmo r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmw.b(bmo, boolean):void");
    }

    public boolean d() {
        if (this.ai != 8) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.a) {
            return true;
        }
        if (this.K.c && this.M.c) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if (this.n) {
            return true;
        }
        if (this.L.c && this.N.c) {
            return true;
        }
        return false;
    }

    public final int g() {
        return l() + this.X;
    }

    public final int h() {
        if (this.ai == 8) {
            return 0;
        }
        return this.X;
    }

    public final int i() {
        return k() + this.W;
    }

    public final int j() {
        if (this.ai == 8) {
            return 0;
        }
        return this.W;
    }

    public final int k() {
        bmw bmwVar = this.V;
        if (bmwVar != null) {
            return ((bmx) bmwVar).as + this.aa;
        }
        return this.aa;
    }

    public final int l() {
        bmw bmwVar = this.V;
        if (bmwVar != null) {
            return ((bmx) bmwVar).at + this.ab;
        }
        return this.ab;
    }

    public final bmw m(int i) {
        bmv bmvVar;
        bmv bmvVar2;
        if (i == 0) {
            bmv bmvVar3 = this.M;
            bmvVar2 = bmvVar3.e;
            if (bmvVar2 == null || bmvVar2.e != bmvVar3) {
                return null;
            }
        } else if (i != 1 || (bmvVar2 = (bmvVar = this.N).e) == null || bmvVar2.e != bmvVar) {
            return null;
        }
        return bmvVar2.d;
    }

    public final bmw n(int i) {
        bmv bmvVar;
        bmv bmvVar2;
        if (i == 0) {
            bmv bmvVar3 = this.K;
            bmvVar2 = bmvVar3.e;
            if (bmvVar2 == null || bmvVar2.e != bmvVar3) {
                return null;
            }
        } else if (i != 1 || (bmvVar2 = (bmvVar = this.L).e) == null || bmvVar2.e != bmvVar) {
            return null;
        }
        return bmvVar2.d;
    }

    public final bns o(int i) {
        if (i == 0) {
            return this.h;
        }
        if (i == 1) {
            return this.i;
        }
        return null;
    }

    public final void p(bmx bmxVar, bmo bmoVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                bnc.a(bmxVar, bmoVar, this);
                hashSet.remove(this);
                b(bmoVar, bmxVar.Z(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet hashSet2 = this.K.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((bmv) it.next()).d.p(bmxVar, bmoVar, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.M.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((bmv) it2.next()).d.p(bmxVar, bmoVar, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.L.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((bmv) it3.next()).d.p(bmxVar, bmoVar, hashSet, 1, true);
            }
        }
        HashSet hashSet5 = this.N.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((bmv) it4.next()).d.p(bmxVar, bmoVar, hashSet, 1, true);
            }
        }
        HashSet hashSet6 = this.O.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((bmv) it5.next()).d.p(bmxVar, bmoVar, hashSet, 1, true);
            }
        }
    }

    public final void q(bmv bmvVar, bmv bmvVar2, int i) {
        if (bmvVar.d == this) {
            Q(bmvVar.i, bmvVar2.d, bmvVar2.i, i);
        }
    }

    public final void r(bmo bmoVar) {
        bmoVar.b(this.K);
        bmoVar.b(this.L);
        bmoVar.b(this.M);
        bmoVar.b(this.N);
        if (this.ac > 0) {
            bmoVar.b(this.O);
        }
    }

    public final void s() {
        if (this.h == null) {
            this.h = new bno(this);
        }
        if (this.i == null) {
            this.i = new bnq(this);
        }
    }

    public void t() {
        this.K.e();
        this.L.e();
        this.M.e();
        this.N.e();
        this.O.e();
        this.P.e();
        this.Q.e();
        this.R.e();
        this.V = null;
        this.F = Float.NaN;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0;
        this.af = 0.5f;
        this.ag = 0.5f;
        int[] iArr = this.ar;
        iArr[0] = 1;
        iArr[1] = 1;
        this.ah = null;
        this.ai = 0;
        this.ak = 0;
        this.al = 0;
        float[] fArr = this.am;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.q = -1;
        this.r = -1;
        int[] iArr2 = this.E;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.t = 0;
        this.u = 0;
        this.y = 1.0f;
        this.B = 1.0f;
        this.x = Integer.MAX_VALUE;
        this.A = Integer.MAX_VALUE;
        this.w = 0;
        this.z = 0;
        this.C = -1;
        this.D = 1.0f;
        boolean[] zArr = this.j;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.k = true;
        int[] iArr3 = this.v;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.l = -1;
        this.m = -1;
    }

    public String toString() {
        String str = "";
        StringBuilder sb = new StringBuilder("");
        if (this.aj != null) {
            str = "id: " + this.aj + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.aa);
        sb.append(", ");
        sb.append(this.ab);
        sb.append(") - (");
        sb.append(this.W);
        sb.append(" x ");
        sb.append(this.X);
        sb.append(")");
        return sb.toString();
    }

    public final void u() {
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            ((bmv) this.T.get(i)).e();
        }
    }

    public final void v() {
        this.a = false;
        this.n = false;
        this.o = false;
        this.p = false;
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            bmv bmvVar = (bmv) this.T.get(i);
            bmvVar.c = false;
            bmvVar.b = 0;
        }
    }

    public final void w(int i) {
        boolean z;
        this.ac = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.G = z;
    }

    public final void x(int i, int i2) {
        if (this.a) {
            return;
        }
        this.K.f(i);
        this.M.f(i2);
        this.aa = i;
        this.W = i2 - i;
        this.a = true;
    }

    public final void y(int i, int i2) {
        if (this.n) {
            return;
        }
        this.L.f(i);
        this.N.f(i2);
        this.ab = i;
        this.X = i2 - i;
        if (this.G) {
            this.O.f(i + this.ac);
        }
        this.n = true;
    }

    public final void z(int i) {
        this.X = i;
        int i2 = this.ae;
        if (i < i2) {
            this.X = i2;
        }
    }
}
