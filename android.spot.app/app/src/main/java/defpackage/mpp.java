package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mpp {
    public mpp() {
    }

    public static /* synthetic */ int A(String str, int i, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 4) != 0) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        int i6 = i2 | (i5 ^ 1);
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return x(str, i, i6, i3);
    }

    public static long C(long j, long j2) {
        return j & (~j2);
    }

    public static long D(long j, int i) {
        return C(j, 1073741823L) | i;
    }

    private static void E(mmx mmxVar, Throwable th) {
        mmxVar.p(mjo.n(th));
        throw th;
    }

    public static ClassCastException a(ClassCastException classCastException) {
        mpd.c(classCastException, mpp.class.getName());
        throw classCastException;
    }

    public static List b(Object obj) {
        if ((obj instanceof mpq) && !(obj instanceof mpr)) {
            c(obj, "kotlin.collections.MutableList");
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw a(e);
        }
    }

    public static void c(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        throw a(new ClassCastException(a.an(str, name, " cannot be cast to ")));
    }

    public static boolean d(Object obj, int i) {
        int i2;
        if (obj instanceof mkq) {
            if (obj instanceof mpb) {
                i2 = ((mpb) obj).bQ();
            } else if (obj instanceof mnw) {
                i2 = 0;
            } else if (obj instanceof moh) {
                i2 = 1;
            } else if (obj instanceof mol) {
                i2 = 2;
            } else if (obj instanceof mom) {
                i2 = 3;
            } else if (obj instanceof mon) {
                i2 = 4;
            } else if (obj instanceof moo) {
                i2 = 5;
            } else if (obj instanceof mop) {
                i2 = 6;
            } else if (obj instanceof moq) {
                i2 = 7;
            } else if (obj instanceof mor) {
                i2 = 8;
            } else if (obj instanceof mos) {
                i2 = 9;
            } else if (obj instanceof mnx) {
                i2 = 10;
            } else if (obj instanceof mny) {
                i2 = 11;
            } else if (obj instanceof mnz) {
                i2 = 12;
            } else if (obj instanceof moa) {
                i2 = 13;
            } else if (obj instanceof mob) {
                i2 = 14;
            } else if (obj instanceof moc) {
                i2 = 15;
            } else if (obj instanceof mod) {
                i2 = 16;
            } else if (obj instanceof moe) {
                i2 = 17;
            } else if (obj instanceof mof) {
                i2 = 18;
            } else if (obj instanceof mog) {
                i2 = 19;
            } else if (obj instanceof moi) {
                i2 = 20;
            } else if (obj instanceof moj) {
                i2 = 21;
            } else if (obj instanceof mok) {
                i2 = 22;
            } else {
                i2 = -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        if ((obj instanceof mpq) && !(obj instanceof mpr)) {
            return false;
        }
        return true;
    }

    public static boolean f(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        if ((obj instanceof mpq) && !(obj instanceof mpt)) {
            return false;
        }
        return true;
    }

    public static void g(Object obj, int i) {
        if (obj != null && !d(obj, i)) {
            c(obj, a.ae(i, "kotlin.jvm.functions.Function"));
        }
    }

    public static void h(Object obj) {
        if ((obj instanceof mpq) && !(obj instanceof mps)) {
            c(obj, "kotlin.collections.MutableMap");
        }
    }

    public static int i(long j) {
        if (j < 0) {
            return -1;
        }
        if (j <= 0) {
            return 0;
        }
        return 1;
    }

    public static int j(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static Object l(mnb mnbVar, mol molVar, mmx mmxVar) {
        mnb a;
        mnb o = mmxVar.o();
        if (!mss.d(mnbVar)) {
            a = o.plus(mnbVar);
        } else {
            a = mss.a(o, mnbVar, false);
        }
        mkm.aB(a);
        if (a == o) {
            nbg nbgVar = new nbg(a, mmxVar);
            return u(nbgVar, nbgVar, molVar);
        }
        if (amr.i(a.get(mmy.k), o.get(mmy.k))) {
            mvh mvhVar = new mvh(a, mmxVar);
            mnb mnbVar2 = ((mrt) mvhVar).a;
            Object b = nbl.b(mnbVar2, null);
            try {
                return u(mvhVar, mvhVar, molVar);
            } finally {
                nbl.c(mnbVar2, b);
            }
        }
        mtg mtgVar = new mtg(a, mmxVar);
        w(molVar, mtgVar, mtgVar);
        mrp mrpVar = mtgVar.b;
        do {
            int i = mrpVar.b;
            if (i != 0) {
                if (i == 2) {
                    Object b2 = muo.b(mtgVar.B());
                    if (b2 instanceof msm) {
                        throw ((msm) b2).b;
                    }
                    return b2;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!mtgVar.b.c(0, 1));
        return mne.a;
    }

    public static muf m(msw mswVar, mnb mnbVar, int i, mol molVar) {
        mrt muyVar;
        boolean e = msz.e(i);
        mnb b = mss.b(mswVar, mnbVar);
        if (e) {
            muyVar = new muq(b, molVar);
        } else {
            muyVar = new muy(b, true);
        }
        msz.d(i, molVar, muyVar, muyVar);
        return muyVar;
    }

    public static Object n(mnb mnbVar, mol molVar) {
        mto mtoVar;
        mnb b;
        long j;
        msm msmVar;
        Thread currentThread = Thread.currentThread();
        mmy mmyVar = (mmy) mnbVar.get(mmy.k);
        if (mmyVar == null) {
            ThreadLocal threadLocal = mvc.a;
            mtoVar = mvc.a();
            b = mss.b(mtx.a, mnbVar.plus(mtoVar));
        } else {
            if (mmyVar instanceof mto) {
            }
            ThreadLocal threadLocal2 = mvc.a;
            mtoVar = (mto) mvc.a.get();
            b = mss.b(mtx.a, mnbVar);
        }
        mrz mrzVar = new mrz(b, currentThread, mtoVar);
        msz.d(1, molVar, mrzVar, mrzVar);
        mto mtoVar2 = mrzVar.b;
        if (mtoVar2 != null) {
            mtoVar2.n(false);
        }
        while (!Thread.interrupted()) {
            try {
                mto mtoVar3 = mrzVar.b;
                if (mtoVar3 != null) {
                    j = mtoVar3.k();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!mrzVar.O()) {
                    LockSupport.parkNanos(mrzVar, j);
                } else {
                    mto mtoVar4 = mrzVar.b;
                    if (mtoVar4 != null) {
                        mtoVar4.l(false);
                    }
                    Object b2 = muo.b(mrzVar.B());
                    if (b2 instanceof msm) {
                        msmVar = (msm) b2;
                    } else {
                        msmVar = null;
                    }
                    if (msmVar == null) {
                        return b2;
                    }
                    throw msmVar.b;
                }
            } catch (Throwable th) {
                mto mtoVar5 = mrzVar.b;
                if (mtoVar5 != null) {
                    mtoVar5.l(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        mrzVar.L(interruptedException);
        throw interruptedException;
    }

    public static /* synthetic */ mtc o(msw mswVar, mol molVar) {
        mrt mrtVar;
        mnb b = mss.b(mswVar, mnc.a);
        if (msz.e(1)) {
            mrtVar = new mup(b, molVar);
        } else {
            mrtVar = new mrt(b, true);
        }
        msz.d(1, molVar, mrtVar, mrtVar);
        return mrtVar;
    }

    public static /* synthetic */ muf q(msw mswVar, mnb mnbVar, int i, mol molVar, int i2) {
        if ((i2 & 1) != 0) {
            mnbVar = mnc.a;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return m(mswVar, mnbVar, i, molVar);
    }

    public static int r(String str, String str2, int i) {
        int length = str.length();
        while (i < length) {
            if (moz.s(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static int s(int i) {
        switch (i) {
            case -1:
                return 1;
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            default:
                return 0;
        }
    }

    public static int t(int i) {
        if (i != 99) {
            switch (i) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case 8:
                    return 9;
                case 9:
                    return 10;
                case 10:
                    return 11;
                case 11:
                    return 12;
                case 12:
                    return 13;
                case 13:
                    return 14;
                case 14:
                    return 15;
                default:
                    return 0;
            }
        }
        return 100;
    }

    public static Object u(nbg nbgVar, Object obj, mol molVar) {
        Object msmVar;
        try {
            if (!(molVar instanceof mnj)) {
                msmVar = mjo.u(molVar, obj, nbgVar);
            } else {
                g(molVar, 2);
                msmVar = molVar.a(obj, nbgVar);
            }
        } catch (Throwable th) {
            msmVar = new msm(th);
        }
        mne mneVar = mne.a;
        if (msmVar != mneVar) {
            Object C = nbgVar.C(msmVar);
            if (C == muo.b) {
                return mne.a;
            }
            if (C instanceof msm) {
                Throwable th2 = ((msm) C).b;
                mmx mmxVar = nbgVar.e;
                if (msy.b && (mmxVar instanceof mnm)) {
                    throw nbi.a(th2, (mnm) mmxVar);
                }
                throw th2;
            }
            return muo.b(C);
        }
        return mneVar;
    }

    public static void v(mmx mmxVar, mmx mmxVar2) {
        try {
            nao.a(mjo.w(mmxVar), mlh.a);
        } catch (Throwable th) {
            E(mmxVar2, th);
        }
    }

    public static /* synthetic */ void w(mol molVar, Object obj, mmx mmxVar) {
        try {
            nao.a(mjo.w(mjo.v(molVar, obj, mmxVar)), mlh.a);
        } catch (Throwable th) {
            E(mmxVar, th);
        }
    }

    public static int x(String str, int i, int i2, int i3) {
        return (int) y(str, i, i2, i3);
    }

    public static long y(String str, long j, long j2, long j3) {
        String a = nbk.a(str);
        if (a == null) {
            return j;
        }
        Long f = moz.f(a);
        if (f != null) {
            long longValue = f.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            throw new IllegalStateException("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + "'");
        }
        throw new IllegalStateException("System property '" + str + "' has unrecognized value '" + a + "'");
    }

    public static boolean z(String str, boolean z) {
        String a = nbk.a(str);
        if (a != null) {
            return Boolean.parseBoolean(a);
        }
        return z;
    }

    public mpp(byte[] bArr) {
    }
}
