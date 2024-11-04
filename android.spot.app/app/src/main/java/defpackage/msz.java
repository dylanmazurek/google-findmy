package defpackage;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public class msz {
    public msz() {
    }

    public static /* synthetic */ String A(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        int i6;
        String str3;
        if ((i3 & 2) != 0) {
            i4 = str.length();
        } else {
            i4 = i2;
        }
        boolean z8 = false;
        boolean z9 = true;
        if (1 == (i3 & 1)) {
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i3 & 8) != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        boolean z10 = z5 & z;
        if ((i3 & 16) != 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        boolean z11 = z6 & z2;
        if ((i3 & 32) != 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        boolean z12 = z7 & z3;
        if ((i3 & 64) == 0) {
            z8 = true;
        }
        boolean z13 = z8 & z4;
        str.getClass();
        int i7 = i5;
        while (i7 < i4) {
            int codePointAt = str.codePointAt(i7);
            int i8 = 43;
            int i9 = 127;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z13) && !moz.s(str2, (char) codePointAt) && (codePointAt != 37 || (z10 && (!z11 || J(str, i7, i4)))))) {
                if (codePointAt == 43 && z12) {
                    z12 = true;
                } else {
                    i7 += Character.charCount(codePointAt);
                }
            }
            nkp nkpVar = new nkp();
            nkpVar.H(str, i5, i7);
            nkp nkpVar2 = null;
            while (i7 < i4) {
                int codePointAt2 = str.codePointAt(i7);
                if (z10) {
                    if (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12) {
                        if (codePointAt2 == 13) {
                            codePointAt2 = 13;
                        }
                    }
                    i7 += Character.charCount(codePointAt2);
                    z9 = true;
                    i8 = 43;
                    i9 = 127;
                }
                if (codePointAt2 == i8 && z12) {
                    if (z9 != z10) {
                        str3 = "%2B";
                    } else {
                        str3 = "+";
                    }
                    nkpVar.K(str3);
                    i7 += Character.charCount(codePointAt2);
                    z9 = true;
                    i8 = 43;
                    i9 = 127;
                } else {
                    if (codePointAt2 >= 32 && codePointAt2 != i9) {
                        if ((codePointAt2 < 128 || z13) && !moz.s(str2, (char) codePointAt2)) {
                            if (codePointAt2 == 37) {
                                if (z10 && (!z11 || J(str, i7, i4))) {
                                    i6 = 37;
                                }
                            } else {
                                i6 = codePointAt2;
                            }
                            nkpVar.I(codePointAt2);
                            codePointAt2 = i6;
                            i7 += Character.charCount(codePointAt2);
                            z9 = true;
                            i8 = 43;
                            i9 = 127;
                        }
                    }
                    if (nkpVar2 == null) {
                        nkpVar2 = new nkp();
                    }
                    nkpVar2.I(codePointAt2);
                    while (!nkpVar2.v()) {
                        byte d = nkpVar2.d();
                        nkpVar.D(37);
                        nkpVar.D(ngd.a[(d & 255) >> 4]);
                        nkpVar.D(ngd.a[d & 15]);
                    }
                    i7 += Character.charCount(codePointAt2);
                    z9 = true;
                    i8 = 43;
                    i9 = 127;
                }
            }
            return nkpVar.i();
        }
        String substring = str.substring(i5, i4);
        substring.getClass();
        return substring;
    }

    public static void B(String str) {
        if (str.length() > 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt < '!' || charAt >= 127) {
                    throw new IllegalArgumentException(ngt.j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    public static void C(String str, String str2) {
        String concat;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (charAt < ' ' || charAt >= 127)) {
                String j = ngt.j("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2);
                if (ngt.u(str2)) {
                    concat = "";
                } else {
                    concat = ": ".concat(String.valueOf(str));
                }
                throw new IllegalArgumentException(j.concat(concat));
            }
        }
    }

    public static nga D(SSLSession sSLSession) {
        List list;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (!amr.i(cipherSuite, "TLS_NULL_WITH_NULL_NULL") && !amr.i(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                nfo F = nfo.x.F(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!amr.i("NONE", protocol)) {
                        ngr ngrVar = ngr.a;
                        ngr be = mkm.be(protocol);
                        try {
                            list = K(sSLSession.getPeerCertificates());
                        } catch (SSLPeerUnverifiedException unused) {
                            list = mlx.a;
                        }
                        return new nga(be, F, K(sSLSession.getLocalCertificates()), new nfy(list));
                    }
                    throw new IOException("tlsVersion == NONE");
                }
                throw new IllegalStateException("tlsVersion == null");
            }
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[LOOP:0: B:1:0x0000->B:10:0x003b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int E(java.lang.String r4, int r5, int r6, boolean r7) {
        /*
        L0:
            if (r5 >= r6) goto L3e
            char r0 = r4.charAt(r5)
            r1 = 32
            r2 = 1
            if (r0 >= r1) goto L11
            r1 = 9
            if (r0 != r1) goto L35
            r0 = 9
        L11:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 >= r1) goto L35
            r1 = 48
            r3 = 58
            if (r0 < r1) goto L1e
            if (r0 >= r3) goto L1e
            goto L35
        L1e:
            r1 = 97
            if (r0 < r1) goto L27
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 >= r1) goto L27
            goto L35
        L27:
            r1 = 65
            if (r0 < r1) goto L30
            r1 = 91
            if (r0 >= r1) goto L30
            goto L35
        L30:
            if (r0 != r3) goto L33
            goto L35
        L33:
            r0 = 0
            goto L36
        L35:
            r0 = 1
        L36:
            r1 = r7 ^ 1
            if (r0 != r1) goto L3b
            return r5
        L3b:
            int r5 = r5 + 1
            goto L0
        L3e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msz.E(java.lang.String, int, int, boolean):int");
    }

    public static nfo G(String str) {
        nfo nfoVar = new nfo(str);
        nfo.b.put(str, nfoVar);
        return nfoVar;
    }

    public static String H(Certificate certificate) {
        int length;
        int i;
        nks nksVar = nks.a;
        byte[] encoded = ((X509Certificate) certificate).getPublicKey().getEncoded();
        encoded.getClass();
        int length2 = encoded.length;
        long j = length2;
        mkm.aM(j, 0L, j);
        nks nksVar2 = new nks(mkm.t(encoded, length2));
        byte[] bArr = nksVar2.b;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        int i2 = 0;
        messageDigest.update(bArr, 0, nksVar2.b());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        byte[] bArr2 = new nks(digest).b;
        byte[] bArr3 = nkk.a;
        bArr2.getClass();
        bArr3.getClass();
        byte[] bArr4 = new byte[((bArr2.length + 2) / 3) * 4];
        int i3 = 0;
        while (true) {
            length = bArr2.length;
            i = length - (length % 3);
            if (i2 >= i) {
                break;
            }
            int i4 = i3 + 3;
            byte b = bArr2[i2];
            int i5 = i2 + 2;
            byte b2 = bArr2[i2 + 1];
            i2 += 3;
            byte b3 = bArr2[i5];
            bArr4[i3] = bArr3[(b & 255) >> 2];
            bArr4[i3 + 1] = bArr3[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr4[i3 + 2] = bArr3[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 += 4;
            bArr4[i4] = bArr3[b3 & 63];
        }
        int i6 = length - i;
        if (i6 != 1) {
            if (i6 == 2) {
                int i7 = i2 + 1;
                byte b4 = bArr2[i2];
                byte b5 = bArr2[i7];
                bArr4[i3] = bArr3[(b4 & 255) >> 2];
                bArr4[i3 + 1] = bArr3[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
                bArr4[i3 + 2] = bArr3[(b5 & 15) << 2];
                bArr4[i3 + 3] = 61;
            }
        } else {
            byte b6 = bArr2[i2];
            bArr4[i3] = bArr3[(b6 & 255) >> 2];
            bArr4[i3 + 1] = bArr3[(b6 & 3) << 4];
            bArr4[i3 + 2] = 61;
            bArr4[i3 + 3] = 61;
        }
        return "sha256/".concat(moz.aK(bArr4));
    }

    public static msz I(byte[] bArr, ngf ngfVar, int i) {
        ngt.y(bArr.length, i);
        return new ngl(ngfVar, i, bArr);
    }

    private static boolean J(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 < i2 && str.charAt(i) == '%' && ngt.f(str.charAt(i + 1)) != -1 && ngt.f(str.charAt(i3)) != -1) {
            return true;
        }
        return false;
    }

    private static List K(Certificate[] certificateArr) {
        if (certificateArr != null) {
            return ngt.m(Arrays.copyOf(certificateArr, certificateArr.length));
        }
        return mlx.a;
    }

    public static String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static String c(mmx mmxVar) {
        Object n;
        if (mmxVar instanceof nan) {
            return mmxVar.toString();
        }
        try {
            n = mmxVar + "@" + b(mmxVar);
        } catch (Throwable th) {
            n = mjo.n(th);
        }
        if (mky.a(n) != null) {
            n = mmxVar.getClass().getName() + "@" + b(mmxVar);
        }
        return (String) n;
    }

    public static void d(int i, mol molVar, Object obj, mmx mmxVar) {
        Object a;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 == 3) {
                    try {
                        mnb o = mmxVar.o();
                        Object b = nbl.b(o, null);
                        try {
                            if (!(molVar instanceof mnj)) {
                                a = mjo.u(molVar, obj, mmxVar);
                            } else {
                                mpp.g(molVar, 2);
                                a = molVar.a(obj, mmxVar);
                            }
                            if (a != mne.a) {
                                mmxVar.p(a);
                                return;
                            }
                            return;
                        } finally {
                            nbl.c(o, b);
                        }
                    } catch (Throwable th) {
                        mmxVar.p(mjo.n(th));
                        return;
                    }
                }
                return;
            }
            molVar.getClass();
            mjo.w(mjo.v(molVar, obj, mmxVar)).p(mlh.a);
            return;
        }
        mpp.w(molVar, obj, mmxVar);
    }

    public static boolean e(int i) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public static void f(mth mthVar, mmx mmxVar, boolean z) {
        Object l;
        mvh mvhVar;
        Object m = mthVar.m();
        Throwable r = mthVar.r(m);
        if (r != null) {
            l = mjo.n(r);
        } else {
            l = mthVar.l(m);
        }
        if (z) {
            nan nanVar = (nan) mmxVar;
            mmx mmxVar2 = nanVar.b;
            Object obj = nanVar.d;
            mnb o = mmxVar2.o();
            Object b = nbl.b(o, obj);
            if (b != nbl.a) {
                mvhVar = mss.c(mmxVar2, o, b);
            } else {
                mvhVar = null;
            }
            try {
                nanVar.b.p(l);
                if (mvhVar != null && !mvhVar.T()) {
                    return;
                }
                nbl.c(o, b);
                return;
            } catch (Throwable th) {
                if (mvhVar == null || mvhVar.T()) {
                    nbl.c(o, b);
                }
                throw th;
            }
        }
        mmxVar.p(l);
    }

    public static boolean g(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object h(defpackage.mmx r4) {
        /*
            boolean r0 = r4 instanceof defpackage.mte
            if (r0 == 0) goto L13
            r0 = r4
            mte r0 = (defpackage.mte) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mte r0 = new mte
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            defpackage.mjo.o(r4)
            goto L47
        L2f:
            defpackage.mjo.o(r4)
            r0.b = r3
            mse r4 = new mse
            mmx r0 = defpackage.mjo.w(r0)
            r4.<init>(r0, r3)
            r4.z()
            java.lang.Object r4 = r4.j()
            if (r4 != r1) goto L47
            return r1
        L47:
            mks r4 = new mks
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msz.h(mmx):java.lang.Object");
    }

    public static Object i(long j, mmx mmxVar) {
        if (j > 0) {
            mse mseVar = new mse(mjo.w(mmxVar), 1);
            mseVar.z();
            if (j < Long.MAX_VALUE) {
                k(mseVar.b).c(j, mseVar);
            }
            Object j2 = mseVar.j();
            if (j2 == mne.a) {
                return j2;
            }
        }
        return mlh.a;
    }

    public static Object j(long j, mmx mmxVar) {
        long j2 = mrl.a;
        long j3 = 0;
        if (j > 0) {
            long m = mpd.m(999999L, mrn.a);
            if (mrl.g(j)) {
                if (!mrl.d(m) && (m ^ j) < 0) {
                    throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
                }
            } else if (mrl.g(m)) {
                j = m;
            } else if ((((int) j) & 1) == (((int) m) & 1)) {
                long b = mrl.b(j) + mrl.b(m);
                if (mrl.f(j)) {
                    j = mpd.i(b);
                } else if (new mqj(-4611686018426L, 4611686018426L).d(b)) {
                    long j4 = mpd.j(b);
                    int i = mrm.a;
                    j = j4 + j4;
                } else {
                    j = mpd.h(moz.ai(b, -4611686018427387903L, 4611686018427387903L));
                }
            } else if (mrl.e(j)) {
                j = mrl.i(mrl.b(j), mrl.b(m));
            } else {
                j = mrl.i(mrl.b(m), mrl.b(j));
            }
            j3 = mrl.a(j);
        }
        Object i2 = i(j3, mmxVar);
        if (i2 == mne.a) {
            return i2;
        }
        return mlh.a;
    }

    public static mtd k(mnb mnbVar) {
        mtd mtdVar;
        mmz mmzVar = mnbVar.get(mmy.k);
        if (mmzVar instanceof mtd) {
            mtdVar = (mtd) mmzVar;
        } else {
            mtdVar = null;
        }
        if (mtdVar == null) {
            return mtb.a;
        }
        return mtdVar;
    }

    public static Object l(mol molVar, mmx mmxVar) {
        nbg nbgVar = new nbg(mmxVar.o(), mmxVar);
        return mpp.u(nbgVar, nbgVar, molVar);
    }

    public static msw m(mnb mnbVar) {
        if (mnbVar.get(muf.c) == null) {
            mnbVar = mnbVar.plus(new mui(null));
        }
        return new naj(mnbVar);
    }

    public static msw n(msw mswVar, mnb mnbVar) {
        return new naj(((naj) mswVar).a.plus(mnbVar));
    }

    public static void o(msw mswVar, CancellationException cancellationException) {
        muf mufVar = (muf) ((naj) mswVar).a.get(muf.c);
        if (mufVar != null) {
            mufVar.s(cancellationException);
        } else {
            Objects.toString(mswVar);
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(mswVar.toString()));
        }
    }

    public static boolean p(msw mswVar) {
        muf mufVar = (muf) mswVar.b().get(muf.c);
        if (mufVar != null) {
            return mufVar.t();
        }
        return true;
    }

    public static Throwable q(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        mjo.l(runtimeException, th);
        return runtimeException;
    }

    public static void r(mnb mnbVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) mnbVar.get(CoroutineExceptionHandler.a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(mnbVar, th);
            } else {
                mpd.o(mnbVar, th);
            }
        } catch (Throwable th2) {
            mpd.o(mnbVar, q(th, th2));
        }
    }

    public static Object s(Object obj, mmx mmxVar) {
        if (obj instanceof msm) {
            Throwable th = ((msm) obj).b;
            if (msy.b && (mmxVar instanceof mnm)) {
                th = nbi.a(th, (mnm) mmxVar);
            }
            return mjo.n(th);
        }
        return obj;
    }

    public static Object t(Object obj) {
        Throwable a = mky.a(obj);
        if (a == null) {
            return obj;
        }
        return new msm(a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:            if (r0 == null) goto L61;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0030, code lost:            r5 = defpackage.msy.a;        r5 = r0.d.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:            if ((r5 instanceof defpackage.msl) == false) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:            r5 = ((defpackage.msl) r5).d;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003e, code lost:            r0.c.b = 536870911;        r0.d.c(defpackage.mru.a);     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:            return new defpackage.mse(r5, 2);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.mse u(defpackage.mmx r5) {
        /*
            boolean r0 = r5 instanceof defpackage.nan
            if (r0 != 0) goto Lb
            mse r0 = new mse
            r1 = 1
            r0.<init>(r5, r1)
            return r0
        Lb:
            r0 = r5
            nan r0 = (defpackage.nan) r0
            mrr r1 = r0.f
        L10:
            java.lang.Object r2 = r1.a
            if (r2 != 0) goto L1d
            mrr r0 = r0.f
            nbj r1 = defpackage.nao.b
            r0.c(r1)
            r0 = 0
            goto L2e
        L1d:
            boolean r3 = r2 instanceof defpackage.mse
            if (r3 == 0) goto L54
            mrr r3 = r0.f
            nbj r4 = defpackage.nao.b
            boolean r3 = r3.d(r2, r4)
            if (r3 == 0) goto L10
            r0 = r2
            mse r0 = (defpackage.mse) r0
        L2e:
            if (r0 == 0) goto L4d
            boolean r5 = defpackage.msy.a
            mrr r5 = r0.d
            java.lang.Object r5 = r5.a
            boolean r1 = r5 instanceof defpackage.msl
            if (r1 == 0) goto L3e
            msl r5 = (defpackage.msl) r5
            java.lang.Object r5 = r5.d
        L3e:
            mrp r5 = r0.c
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r5.b = r1
            mrr r5 = r0.d
            mru r1 = defpackage.mru.a
            r5.c(r1)
            return r0
        L4d:
            mse r0 = new mse
            r1 = 2
            r0.<init>(r5, r1)
            return r0
        L54:
            nbj r3 = defpackage.nao.b
            if (r2 == r3) goto L10
            boolean r3 = r2 instanceof java.lang.Throwable
            if (r3 == 0) goto L5d
            goto L10
        L5d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.util.Objects.toString(r2)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "Inconsistent state "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msz.u(mmx):mse");
    }

    public static void v(msd msdVar, mtl mtlVar) {
        ((mse) msdVar).A(new msb(mtlVar, 2));
    }

    public static int x(String str) {
        if (amr.i(str, "http")) {
            return 80;
        }
        if (!amr.i(str, "https")) {
            return -1;
        }
        return 443;
    }

    public static /* synthetic */ String y(String str, int i, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z2 = false;
        boolean z3 = true;
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 4) == 0) {
            z2 = true;
        }
        boolean z4 = z & z2;
        str.getClass();
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt != '%') {
                if (charAt != '+' || !z4) {
                    i4++;
                }
            } else {
                z3 = z4;
            }
            nkp nkpVar = new nkp();
            nkpVar.H(str, i, i4);
            while (i4 < i2) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt == 37) {
                    int i5 = i4 + 2;
                    if (i5 < i2) {
                        int f = ngt.f(str.charAt(i4 + 1));
                        int f2 = ngt.f(str.charAt(i5));
                        if (f != -1 && f2 != -1) {
                            nkpVar.D((f << 4) + f2);
                            i4 = Character.charCount(37) + i5;
                        } else {
                            codePointAt = 37;
                            nkpVar.I(codePointAt);
                            i4 += Character.charCount(codePointAt);
                        }
                    } else {
                        codePointAt = 37;
                    }
                }
                if (codePointAt == 43 && z3) {
                    nkpVar.D(32);
                    i4++;
                }
                nkpVar.I(codePointAt);
                i4 += Character.charCount(codePointAt);
            }
            return nkpVar.i();
        }
        String substring = str.substring(i, i2);
        substring.getClass();
        return substring;
    }

    public static List z(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int x = moz.x(str, '&', i, 4);
            if (x == -1) {
                x = str.length();
            }
            int x2 = moz.x(str, '=', i, 4);
            if (x2 != -1 && x2 <= x) {
                String substring = str.substring(i, x2);
                substring.getClass();
                arrayList.add(substring);
                String substring2 = str.substring(x2 + 1, x);
                substring2.getClass();
                arrayList.add(substring2);
            } else {
                String substring3 = str.substring(i, x);
                substring3.getClass();
                arrayList.add(substring3);
                arrayList.add(null);
            }
            i = x + 1;
        }
        return arrayList;
    }

    public final synchronized nfo F(String str) {
        nfo nfoVar;
        String str2;
        str.getClass();
        nfoVar = (nfo) nfo.b.get(str);
        if (nfoVar == null) {
            Map map = nfo.b;
            if (moz.I(str, "TLS_")) {
                String substring = str.substring(4);
                substring.getClass();
                str2 = "SSL_".concat(substring);
            } else if (moz.I(str, "SSL_")) {
                String substring2 = str.substring(4);
                substring2.getClass();
                str2 = "TLS_".concat(substring2);
            } else {
                str2 = str;
            }
            nfoVar = (nfo) map.get(str2);
            if (nfoVar == null) {
                nfoVar = new nfo(str);
            }
            nfo.b.put(str, nfoVar);
        }
        return nfoVar;
    }

    public long w() {
        throw null;
    }

    public msz(byte[] bArr) {
    }
}
