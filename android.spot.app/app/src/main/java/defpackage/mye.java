package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mye extends mza implements mxy, mwv, mzr {
    public Object[] a;
    public long b;
    public long c;
    private final int f;
    private final int g;
    private int h;
    private int i;
    private final int j;

    public mye(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.j = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, mww] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object f(defpackage.mye r19, defpackage.mww r20, defpackage.mmx r21) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mye.f(mye, mww, mmx):java.lang.Object");
    }

    private final int n() {
        return (int) ((e() + this.h) - this.b);
    }

    private final int o() {
        return this.h + this.i;
    }

    private final long p() {
        return e() + this.h;
    }

    private final long q() {
        return e() + this.h + this.i;
    }

    private final long r(myg mygVar) {
        long j = mygVar.a;
        if (j < p()) {
            return j;
        }
        if (this.g > 0 || j > e() || this.i == 0) {
            return -1L;
        }
        return j;
    }

    private final void s() {
        mzc[] mzcVarArr;
        Object[] objArr = this.a;
        objArr.getClass();
        myf.b(objArr, e(), null);
        this.h--;
        long e = e() + 1;
        if (this.b < e) {
            this.b = e;
        }
        if (this.c < e) {
            if (this.e != 0 && (mzcVarArr = this.d) != null) {
                for (mzc mzcVar : mzcVarArr) {
                    if (mzcVar != null) {
                        myg mygVar = (myg) mzcVar;
                        long j = mygVar.a;
                        if (j >= 0 && j < e) {
                            mygVar.a = e;
                        }
                    }
                }
            }
            this.c = e;
        }
        boolean z = msy.a;
    }

    private final void t(Object obj) {
        int o = o();
        Object[] objArr = this.a;
        if (objArr == null) {
            objArr = w(null, 0, 2);
        } else {
            int length = objArr.length;
            if (o >= length) {
                objArr = w(objArr, o, length + length);
            }
        }
        myf.b(objArr, e() + o, obj);
    }

    private final void u(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        boolean z = msy.a;
        for (long e = e(); e < min; e++) {
            Object[] objArr = this.a;
            objArr.getClass();
            myf.b(objArr, e, null);
        }
        this.b = j;
        this.c = j2;
        this.h = (int) (j3 - min);
        this.i = (int) (j4 - j3);
    }

    private final boolean v(Object obj) {
        if (this.e == 0) {
            boolean z = msy.a;
            if (this.f != 0) {
                t(obj);
                int i = this.h + 1;
                this.h = i;
                if (i > this.f) {
                    s();
                }
                this.c = e() + this.h;
            }
            return true;
        }
        if (this.h >= this.g && this.c <= this.b && this.j - 1 == 0) {
            return false;
        }
        t(obj);
        int i2 = this.h + 1;
        this.h = i2;
        if (i2 > this.g) {
            s();
        }
        if (n() > this.f) {
            u(this.b + 1, this.c, p(), q());
        }
        return true;
    }

    private final Object[] w(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.a = objArr2;
            if (objArr != null) {
                long e = e();
                for (int i3 = 0; i3 < i; i3++) {
                    long j = i3 + e;
                    myf.b(objArr2, j, myf.a(objArr, j));
                }
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    private final mmx[] x(mmx[] mmxVarArr) {
        mzc[] mzcVarArr;
        myg mygVar;
        mmx mmxVar;
        if (this.e != 0 && (mzcVarArr = this.d) != null) {
            int length = mmxVarArr.length;
            int i = 0;
            mmxVarArr = mmxVarArr;
            while (i < mzcVarArr.length) {
                mzc mzcVar = mzcVarArr[i];
                if (mzcVar != null && (mmxVar = (mygVar = (myg) mzcVar).b) != null && r(mygVar) >= 0) {
                    int length2 = mmxVarArr.length;
                    mmxVarArr = mmxVarArr;
                    if (length >= length2) {
                        ?? copyOf = Arrays.copyOf(mmxVarArr, Math.max(2, length2 + length2));
                        copyOf.getClass();
                        mmxVarArr = copyOf;
                    }
                    mmxVarArr[length] = mmxVar;
                    mygVar.b = null;
                    length++;
                }
                i++;
                mmxVarArr = mmxVarArr;
            }
        }
        return mmxVarArr;
    }

    @Override // defpackage.myb, defpackage.mwv
    public final Object a(mww mwwVar, mmx mmxVar) {
        return f(this, mwwVar, mmxVar);
    }

    @Override // defpackage.mxy
    public final boolean d(Object obj) {
        int i;
        boolean z;
        mmx[] mmxVarArr = mzb.a;
        synchronized (this) {
            if (v(obj)) {
                mmxVarArr = x(mmxVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (mmx mmxVar : mmxVarArr) {
            if (mmxVar != null) {
                mmxVar.p(mlh.a);
            }
        }
        return z;
    }

    @Override // defpackage.mzr
    public final mwv ds(mnb mnbVar, int i) {
        return myf.c(this, mnbVar, i);
    }

    @Override // defpackage.mww
    public final Object dt(Object obj, mmx mmxVar) {
        mmx[] mmxVarArr;
        myc mycVar;
        if (d(obj)) {
            return mlh.a;
        }
        mse mseVar = new mse(mjo.w(mmxVar), 1);
        mseVar.z();
        mmx[] mmxVarArr2 = mzb.a;
        synchronized (this) {
            if (v(obj)) {
                mseVar.p(mlh.a);
                mmxVarArr = x(mmxVarArr2);
                mycVar = null;
            } else {
                myc mycVar2 = new myc(this, o() + e(), obj, mseVar);
                t(mycVar2);
                this.i++;
                if (this.g == 0) {
                    mmxVarArr2 = x(mmxVarArr2);
                }
                mmxVarArr = mmxVarArr2;
                mycVar = mycVar2;
            }
        }
        if (mycVar != null) {
            msz.v(mseVar, mycVar);
        }
        for (mmx mmxVar2 : mmxVarArr) {
            if (mmxVar2 != null) {
                mmxVar2.p(mlh.a);
            }
        }
        Object j = mseVar.j();
        mne mneVar = mne.a;
        if (j != mneVar) {
            j = mlh.a;
        }
        if (j != mneVar) {
            return mlh.a;
        }
        return j;
    }

    @Override // defpackage.mxy
    public final void du() {
        synchronized (this) {
            u(p(), this.c, p(), q());
        }
    }

    public final long e() {
        return Math.min(this.c, this.b);
    }

    public final Object g() {
        Object[] objArr = this.a;
        objArr.getClass();
        return myf.a(objArr, (this.b + n()) - 1);
    }

    @Override // defpackage.mza
    public final /* synthetic */ mzc h() {
        return new myg();
    }

    public final void i() {
        if (this.g != 0 || this.i > 1) {
            Object[] objArr = this.a;
            objArr.getClass();
            while (this.i > 0 && myf.a(objArr, (e() + o()) - 1) == myf.a) {
                this.i--;
                myf.b(objArr, e() + o(), null);
            }
        }
    }

    public final mmx[] j(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        mzc[] mzcVarArr;
        boolean z = msy.a;
        if (j <= this.c) {
            long e = e();
            long j7 = this.h + e;
            if (this.g == 0 && this.i > 0) {
                j7++;
            }
            int i2 = 0;
            if (this.e != 0 && (mzcVarArr = this.d) != null) {
                for (mzc mzcVar : mzcVarArr) {
                    if (mzcVar != null) {
                        long j8 = ((myg) mzcVar).a;
                        if (j8 >= 0 && j8 < j7) {
                            j7 = j8;
                        }
                    }
                }
            }
            if (j7 > this.c) {
                long p = p();
                if (this.e > 0) {
                    i = Math.min(this.i, this.g - ((int) (p - j7)));
                } else {
                    i = this.i;
                }
                mmx[] mmxVarArr = mzb.a;
                long j9 = this.i + p;
                if (i > 0) {
                    mmxVarArr = new mmx[i];
                    Object[] objArr = this.a;
                    objArr.getClass();
                    j4 = p;
                    while (true) {
                        if (p < j9) {
                            Object a = myf.a(objArr, p);
                            j2 = j7;
                            nbj nbjVar = myf.a;
                            if (a != nbjVar) {
                                a.getClass();
                                int i3 = i2 + 1;
                                myc mycVar = (myc) a;
                                j3 = j9;
                                mmxVarArr[i2] = mycVar.d;
                                myf.b(objArr, p, nbjVar);
                                myf.b(objArr, j4, mycVar.c);
                                j6 = 1;
                                j4++;
                                if (i3 >= i) {
                                    break;
                                }
                                i2 = i3;
                            } else {
                                j3 = j9;
                                j6 = 1;
                            }
                            p += j6;
                            j7 = j2;
                            j9 = j3;
                        } else {
                            j2 = j7;
                            j3 = j9;
                            break;
                        }
                    }
                } else {
                    j2 = j7;
                    j3 = j9;
                    j4 = p;
                }
                mmx[] mmxVarArr2 = mmxVarArr;
                long j10 = j4 - e;
                if (this.e == 0) {
                    j5 = j4;
                } else {
                    j5 = j2;
                }
                long max = Math.max(this.b, j4 - Math.min(this.f, (int) j10));
                if (this.g == 0 && max < j3) {
                    Object[] objArr2 = this.a;
                    objArr2.getClass();
                    if (amr.i(myf.a(objArr2, max), myf.a)) {
                        j4++;
                        max++;
                    }
                }
                u(max, j5, j4, j3);
                i();
                if (mmxVarArr2.length == 0) {
                    return mmxVarArr2;
                }
                return x(mmxVarArr2);
            }
        }
        return mzb.a;
    }

    @Override // defpackage.mza
    public final /* bridge */ /* synthetic */ mzc[] k() {
        return new myg[2];
    }
}
