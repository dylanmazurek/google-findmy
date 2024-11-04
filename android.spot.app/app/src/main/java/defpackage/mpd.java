package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mpd {
    private mpd() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object A(defpackage.mww r4, defpackage.mom r5, java.lang.Throwable r6, defpackage.mmx r7) {
        /*
            boolean r0 = r7 instanceof defpackage.mxd
            if (r0 == 0) goto L13
            r0 = r7
            mxd r0 = (defpackage.mxd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mxd r0 = new mxd
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.a
            defpackage.mjo.o(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.mjo.o(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.a(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            mlh r4 = defpackage.mlh.a
            return r4
        L44:
            if (r6 == 0) goto L4d
            if (r6 == r4) goto L4d
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            defpackage.mjo.l(r4, r6)
        L4d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpd.A(mww, mom, java.lang.Throwable, mmx):java.lang.Object");
    }

    public static void B(mww mwwVar) {
        if (!(mwwVar instanceof myy)) {
        } else {
            throw ((myy) mwwVar).a;
        }
    }

    private static boolean C(Throwable th, Throwable th2) {
        if (th2 != null) {
            if (msy.b) {
                th2 = nbi.c(th2);
            }
            if (msy.b) {
                th = nbi.c(th);
            }
            if (amr.i(th2, th)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i != i2) {
            return 1;
        }
        return 0;
    }

    public static void b(String str) {
        mlg mlgVar = new mlg(a.ag(str, "lateinit property ", " has not been initialized"));
        c(mlgVar, mpd.class.getName());
        throw mlgVar;
    }

    public static void c(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static String d(mpb mpbVar) {
        String obj = mpbVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object e(java.util.Collection r4, defpackage.mmx r5) {
        /*
            boolean r0 = r5 instanceof defpackage.mry
            if (r0 == 0) goto L13
            r0 = r5
            mry r0 = (defpackage.mry) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mry r0 = new mry
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r4 = r0.a
            defpackage.mjo.o(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.mjo.o(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            muf r5 = (defpackage.muf) r5
            r0.a = r4
            r0.c = r3
            java.lang.Object r5 = r5.m(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            mlh r4 = defpackage.mlh.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpd.e(java.util.Collection, mmx):java.lang.Object");
    }

    public static long f(long j, mrn mrnVar, mrn mrnVar2) {
        mrnVar.getClass();
        mrnVar2.getClass();
        return mrnVar2.h.convert(j, mrnVar.h);
    }

    public static long g(long j, mrn mrnVar, mrn mrnVar2) {
        mrnVar.getClass();
        mrnVar2.getClass();
        return mrnVar2.h.convert(j, mrnVar.h);
    }

    public static long h(long j) {
        long j2 = mrl.a;
        int i = mrm.a;
        return j + j + 1;
    }

    public static long i(long j) {
        if (new mqj(-4611686018426999999L, 4611686018426999999L).d(j)) {
            long j2 = mrl.a;
            int i = mrm.a;
            return j + j;
        }
        return h(k(j));
    }

    public static long j(long j) {
        return j * 1000000;
    }

    public static long k(long j) {
        return j / 1000000;
    }

    public static long l(int i, mrn mrnVar) {
        mrnVar.getClass();
        long j = i;
        if (mrnVar.compareTo(mrn.d) <= 0) {
            long g = g(j, mrnVar, mrn.a);
            long j2 = mrl.a;
            int i2 = mrm.a;
            return g + g;
        }
        return m(j, mrnVar);
    }

    public static long m(long j, mrn mrnVar) {
        mrnVar.getClass();
        long g = g(4611686018426999999L, mrn.a, mrnVar);
        if (new mqj(-g, g).d(j)) {
            long g2 = g(j, mrnVar, mrn.a);
            long j2 = mrl.a;
            int i = mrm.a;
            return g2 + g2;
        }
        return h(moz.ai(f(j, mrnVar, mrn.c), -4611686018427387903L, 4611686018427387903L));
    }

    public static void n(int i) {
        if (i > 0) {
        } else {
            throw new IllegalArgumentException(a.ae(i, "Expected positive parallelism level, but got "));
        }
    }

    public static void o(mnb mnbVar, Throwable th) {
        Iterator it = nak.a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(mnbVar, th);
            } catch (nap unused) {
                return;
            } catch (Throwable th2) {
                nak.a(msz.q(th, th2));
            }
        }
        try {
            mjo.l(th, new nam(mnbVar));
        } catch (Throwable unused2) {
        }
        nak.a(th);
    }

    public static Object p(jyz jyzVar, mmx mmxVar) {
        try {
            if (jyzVar.isDone()) {
                return amr.f(jyzVar);
            }
            mse mseVar = new mse(mjo.w(mmxVar), 1);
            mseVar.z();
            jyzVar.c(new cri(jyzVar, mseVar, 6), jxv.a);
            mseVar.d(new eeo(jyzVar, 18));
            return mseVar.j();
        } catch (ExecutionException e) {
            throw q(e);
        }
    }

    public static Throwable q(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static /* synthetic */ jyz r(msw mswVar, mol molVar) {
        boolean e = msz.e(1);
        mnc mncVar = mnc.a;
        if (!e) {
            nac nacVar = new nac(mss.b(mswVar, mncVar));
            msz.d(1, molVar, nacVar, nacVar);
            return nacVar.b;
        }
        "DEFAULT".toString();
        throw new IllegalArgumentException("DEFAULT start is not supported");
    }

    public static void s(myz myzVar, Object obj) {
        if (myzVar.a == obj) {
        } else {
            throw myzVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:            if (r7 == 0) goto L58;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.myi t(defpackage.mwv r7, int r8) {
        /*
            boolean r0 = defpackage.msy.a
            int r0 = defpackage.mvy.e
            int r0 = defpackage.mvx.a
            int r0 = defpackage.moz.ac(r8, r0)
            boolean r1 = r7 instanceof defpackage.mzd
            int r0 = r0 - r8
            r2 = 1
            if (r1 == 0) goto L39
            r1 = r7
            mzd r1 = (defpackage.mzd) r1
            mwv r3 = r1.f()
            if (r3 == 0) goto L39
            int r7 = r1.b
            myi r4 = new myi
            r5 = -2
            if (r7 == r5) goto L24
            if (r7 == 0) goto L24
            r0 = r7
            goto L31
        L24:
            int r5 = r1.c
            r6 = 0
            if (r5 != r2) goto L2c
            if (r7 != 0) goto L31
            goto L30
        L2c:
            if (r8 != 0) goto L30
            r0 = 1
            goto L31
        L30:
            r0 = 0
        L31:
            int r7 = r1.c
            mnb r8 = r1.a
            r4.<init>(r3, r0, r7, r8)
            return r4
        L39:
            myi r8 = new myi
            mnc r1 = defpackage.mnc.a
            r8.<init>(r7, r0, r2, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpd.t(mwv, int):myi");
    }

    public static mys u(mwv mwvVar, msw mswVar, myk mykVar, Object obj) {
        myi t = t(mwvVar, 1);
        mnb mnbVar = t.c;
        mwv mwvVar2 = t.a;
        myu a = myv.a(obj);
        v(mswVar, mnbVar, mwvVar2, a, mykVar, obj);
        return new mya(a);
    }

    public static void v(msw mswVar, mnb mnbVar, mwv mwvVar, mxy mxyVar, myk mykVar, Object obj) {
        boolean i = amr.i(mykVar, myj.a);
        mxw mxwVar = new mxw(mykVar, mwvVar, mxyVar, obj, (mmx) null, 0);
        int i2 = 1;
        if (true != i) {
            i2 = 4;
        }
        mpp.m(mswVar, mnbVar, i2, mxwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object w(defpackage.mwv r4, defpackage.mmx r5) {
        /*
            boolean r0 = r5 instanceof defpackage.mxq
            if (r0 == 0) goto L13
            r0 = r5
            mxq r0 = (defpackage.mxq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mxq r0 = new mxq
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            mxs r4 = r0.d
            mpn r0 = r0.c
            defpackage.mjo.o(r5)     // Catch: defpackage.myz -> L2b
            goto L5c
        L2b:
            r5 = move-exception
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.mjo.o(r5)
            mpn r5 = new mpn
            r5.<init>()
            nbj r2 = defpackage.mzu.a
            r5.a = r2
            mxs r2 = new mxs
            r2.<init>(r5, r3)
            r0.c = r5     // Catch: defpackage.myz -> L55
            r0.d = r2     // Catch: defpackage.myz -> L55
            r0.b = r3     // Catch: defpackage.myz -> L55
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: defpackage.myz -> L55
            if (r4 == r1) goto L54
            r0 = r5
            goto L5c
        L54:
            return r1
        L55:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L59:
            s(r5, r4)
        L5c:
            java.lang.Object r4 = r0.a
            nbj r5 = defpackage.mzu.a
            if (r4 == r5) goto L63
            return r4
        L63:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpd.w(mwv, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object x(defpackage.mwv r5, defpackage.mol r6, defpackage.mmx r7) {
        /*
            boolean r0 = r7 instanceof defpackage.mxr
            if (r0 == 0) goto L13
            r0 = r7
            mxr r0 = (defpackage.mxr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mxr r0 = new mxr
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            mxi r5 = r0.e
            mpn r6 = r0.d
            java.lang.Object r0 = r0.a
            defpackage.mjo.o(r7)     // Catch: defpackage.myz -> L2d
            goto L63
        L2d:
            r7 = move-exception
            goto L60
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.mjo.o(r7)
            mpn r7 = new mpn
            r7.<init>()
            nbj r2 = defpackage.mzu.a
            r7.a = r2
            mxi r2 = new mxi
            r4 = 3
            r2.<init>(r6, r7, r4)
            r0.a = r6     // Catch: defpackage.myz -> L5b
            r0.d = r7     // Catch: defpackage.myz -> L5b
            r0.e = r2     // Catch: defpackage.myz -> L5b
            r0.c = r3     // Catch: defpackage.myz -> L5b
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: defpackage.myz -> L5b
            if (r5 == r1) goto L5a
            r0 = r6
            r6 = r7
            goto L63
        L5a:
            return r1
        L5b:
            r5 = move-exception
            r0 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L60:
            s(r7, r5)
        L63:
            java.lang.Object r5 = r6.a
            nbj r6 = defpackage.mzu.a
            if (r5 == r6) goto L6a
            return r5
        L6a:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.util.Objects.toString(r0)
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.String r7 = "Expected at least one element matching the predicate "
            java.lang.String r6 = r7.concat(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpd.x(mwv, mol, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object y(defpackage.mwv r5, defpackage.mmx r6) {
        /*
            boolean r0 = r6 instanceof defpackage.mxt
            if (r0 == 0) goto L13
            r0 = r6
            mxt r0 = (defpackage.mxt) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mxt r0 = new mxt
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            mxs r5 = r0.d
            mpn r0 = r0.c
            defpackage.mjo.o(r6)     // Catch: defpackage.myz -> L2b
            goto L59
        L2b:
            r6 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.mjo.o(r6)
            mpn r6 = new mpn
            r6.<init>()
            mxs r2 = new mxs
            r4 = 0
            r2.<init>(r6, r4)
            r0.c = r6     // Catch: defpackage.myz -> L52
            r0.d = r2     // Catch: defpackage.myz -> L52
            r0.b = r3     // Catch: defpackage.myz -> L52
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: defpackage.myz -> L52
            if (r5 == r1) goto L51
            r0 = r6
            goto L59
        L51:
            return r1
        L52:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L56:
            s(r6, r5)
        L59:
            java.lang.Object r5 = r0.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpd.y(mwv, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object z(defpackage.mwv r5, defpackage.mww r6, defpackage.mmx r7) {
        /*
            boolean r0 = r7 instanceof defpackage.mxg
            if (r0 == 0) goto L13
            r0 = r7
            mxg r0 = (defpackage.mxg) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mxg r0 = new mxg
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            mpn r5 = r0.c
            defpackage.mjo.o(r7)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r6 = move-exception
            goto L51
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.mjo.o(r7)
            mpn r7 = new mpn
            r7.<init>()
            mxi r2 = new mxi     // Catch: java.lang.Throwable -> L4e
            r4 = 0
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L4e
            r0.c = r7     // Catch: java.lang.Throwable -> L4e
            r0.b = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = 0
            return r5
        L4e:
            r5 = move-exception
            r6 = r5
            r5 = r7
        L51:
            java.lang.Object r5 = r5.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r7 = C(r6, r5)
            if (r7 != 0) goto L89
            mnb r7 = r0.o()
            bcr r0 = defpackage.muf.c
            mmz r7 = r7.get(r0)
            muf r7 = (defpackage.muf) r7
            if (r7 == 0) goto L7a
            boolean r0 = r7.dq()
            if (r0 != 0) goto L70
            goto L7a
        L70:
            java.util.concurrent.CancellationException r7 = r7.n()
            boolean r7 = C(r6, r7)
            if (r7 != 0) goto L89
        L7a:
            if (r5 != 0) goto L7d
            return r6
        L7d:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L85
            defpackage.mjo.l(r5, r6)
            throw r5
        L85:
            defpackage.mjo.l(r6, r5)
            throw r6
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpd.z(mwv, mww, mmx):java.lang.Object");
    }

    public mpd(char[] cArr) {
    }
}
