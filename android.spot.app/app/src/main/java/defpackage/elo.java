package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Choreographer;
import android.widget.EditText;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.apps.adm.R;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elo {
    public final Object a;
    public final Object b;

    public elo(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[Catch: IOException -> 0x006c, TryCatch #0 {IOException -> 0x006c, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x003a, B:14:0x003d, B:16:0x0042, B:27:0x0047, B:29:0x004a, B:32:0x0059), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.elo J(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6c
            nks[] r0 = new defpackage.nks[r0]     // Catch: java.io.IOException -> L6c
            nkp r1 = new nkp     // Catch: java.io.IOException -> L6c
            r1.<init>()     // Catch: java.io.IOException -> L6c
            r2 = 0
            r3 = 0
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6c
            if (r3 >= r4) goto L59
            r4 = r12[r3]     // Catch: java.io.IOException -> L6c
            java.lang.String[] r5 = defpackage.dep.a     // Catch: java.io.IOException -> L6c
            r6 = 34
            r1.D(r6)     // Catch: java.io.IOException -> L6c
            int r7 = r4.length()     // Catch: java.io.IOException -> L6c
            r8 = 0
            r9 = 0
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6c
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6c
            if (r10 == 0) goto L42
            goto L38
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.H(r4, r9, r8)     // Catch: java.io.IOException -> L6c
        L3d:
            r1.K(r10)     // Catch: java.io.IOException -> L6c
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.H(r4, r9, r7)     // Catch: java.io.IOException -> L6c
        L4a:
            r1.D(r6)     // Catch: java.io.IOException -> L6c
            r1.d()     // Catch: java.io.IOException -> L6c
            nks r4 = r1.m()     // Catch: java.io.IOException -> L6c
            r0[r3] = r4     // Catch: java.io.IOException -> L6c
            int r3 = r3 + 1
            goto La
        L59:
            elo r1 = new elo     // Catch: java.io.IOException -> L6c
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6c
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6c
            moz r2 = defpackage.nla.c     // Catch: java.io.IOException -> L6c
            nla r0 = r2.aM(r0)     // Catch: java.io.IOException -> L6c
            r2 = 0
            r1.<init>(r12, r0, r2)     // Catch: java.io.IOException -> L6c
            return r1
        L6c:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elo.J(java.lang.String[]):elo");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    private final synchronized List L(String str) {
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        List list = (List) this.b.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.b.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    public static final String e(kzb kzbVar, Context context, boolean z) {
        kym kymVar;
        lln llnVar = kzbVar.c;
        if (llnVar == null) {
            llnVar = lln.c;
        }
        long b = lmi.b(llnVar);
        kym kymVar2 = kzbVar.b;
        if (kymVar2 == null) {
            kymVar2 = kym.f;
        }
        kzp kzpVar = kymVar2.d;
        if (kzpVar == null) {
            kzpVar = kzp.b;
        }
        String str = kzpVar.a;
        if (TextUtils.isEmpty(str)) {
            if (!z) {
                kym kymVar3 = kzbVar.b;
                if (kymVar3 == null) {
                    kymVar = kym.f;
                } else {
                    kymVar = kymVar3;
                }
                int I = a.I(kymVar.e);
                if (I == 0 || I != 4) {
                    if (kymVar3 == null) {
                        kymVar3 = kym.f;
                    }
                    int I2 = a.I(kymVar3.e);
                    if (I2 == 0 || I2 != 5) {
                        return fma.bO(context, b, R.string.device_status_located_now, R.string.device_status_located_today, R.string.device_status_located_yesterday, R.string.device_status_located_lately, new String[0]);
                    }
                }
                return fma.bO(context, b, R.string.device_status_located_now, R.string.spot_device_status_located_today_approximate_time, R.string.spot_device_status_located_yesterday_approximate_time, R.string.spot_device_status_located_lately_approximate_time, new String[0]);
            }
            return "";
        }
        return fma.bO(context, b, R.string.spot_device_status_located_now_with_semantic_location, R.string.spot_device_status_located_today_with_semantic_location, R.string.spot_device_status_located_yesterday_with_semantic_location, R.string.spot_device_status_located_lately_with_semantic_location, str);
    }

    public static final dlf q(ImageDecoder.Source source, int i, int i2, div divVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new doi(i, i2, divVar));
        if (he$$ExternalSyntheticApiModelOutline0.m144m((Object) decodeDrawable)) {
            return new dqg(he$$ExternalSyntheticApiModelOutline0.m124m((Object) decodeDrawable), 2);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: ".concat(String.valueOf(String.valueOf(decodeDrawable))));
    }

    public static final boolean r(ImageHeaderParser$ImageType imageHeaderParser$ImageType) {
        if (imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_WEBP) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_AVIF) {
            return true;
        }
        return false;
    }

    public final void A() {
        synchronized (this) {
            ((mrp) this.a).a();
            if (((mrp) this.a).b < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final boolean B() {
        synchronized (this) {
            if (((mro) this.b).b()) {
                return false;
            }
            ((mrp) this.a).b();
            return true;
        }
    }

    public final void C(final Runnable runnable) {
        ((Choreographer) this.a).postFrameCallback(new Choreographer.FrameCallback() { // from class: ccl
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void D(kvw kvwVar) {
        int i = kvwVar.a;
        if (i == 0) {
            Object obj = kvwVar.b;
            this.a.execute(new bx((bpy) this.b, (Typeface) obj, 14));
        } else {
            this.a.execute(new bth((bpy) this.b, i, 0));
        }
    }

    public final /* synthetic */ void E(bet betVar) {
        I(betVar, null);
    }

    public final void F(bet betVar, int i) {
        ((eld) this.b).e(new cxe((crd) this.a, betVar, false, i));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final bet G(cvk cvkVar) {
        bet betVar;
        synchronized (this.a) {
            betVar = (bet) this.b.remove(cvkVar);
        }
        return betVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final bet H(cvk cvkVar) {
        bet betVar;
        synchronized (this.a) {
            ?? r1 = this.b;
            Object obj = r1.get(cvkVar);
            if (obj == null) {
                obj = new bet(cvkVar);
                r1.put(cvkVar, obj);
            }
            betVar = (bet) obj;
        }
        return betVar;
    }

    public final void I(bet betVar, bph bphVar) {
        ((eld) this.b).e(new ci(this, betVar, bphVar, 6));
    }

    public final elo K(float[] fArr) {
        int f;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f2 = fArr[i];
            int binarySearch = Arrays.binarySearch((float[]) this.a, f2);
            if (binarySearch >= 0) {
                f = ((int[]) this.b)[binarySearch];
            } else {
                int i2 = -(binarySearch + 1);
                if (i2 == 0) {
                    f = ((int[]) this.b)[0];
                } else {
                    int[] iArr2 = (int[]) this.b;
                    int length = iArr2.length - 1;
                    if (i2 == length) {
                        f = iArr2[length];
                    } else {
                        int i3 = i2 - 1;
                        float[] fArr2 = (float[]) this.a;
                        float f3 = fArr2[i3];
                        f = bpv.f((f2 - f3) / (fArr2[i2] - f3), iArr2[i3], iArr2[i2]);
                    }
                }
            }
            iArr[i] = f;
        }
        return new elo(fArr, iArr);
    }

    public final void a(lqd lqdVar, kyh kyhVar, ebf ebfVar) {
        lqdVar.getClass();
        kyhVar.getClass();
        ebfVar.getClass();
        if (!ltu.e() && !ltu.g()) {
            if (ebfVar.q()) {
                ecw d = ecw.d(lqdVar);
                eku.h(kyhVar, d.m);
                ebfVar.l(d);
            }
        } else {
            ((evo) this.a).e(ebfVar.a, new evh(R.string.ring_requested));
        }
        ((elm) this.b).a(lqdVar, kyhVar, true, null);
    }

    public final void b(lqd lqdVar, kyf kyfVar, List list) {
        c(lqdVar, jer.i(kyfVar), jer.i(list));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ewg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ele] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, ele] */
    /* JADX WARN: Type inference failed for: r13v5, types: [ewg, java.lang.Object] */
    public final void c(lqd lqdVar, jer jerVar, jer jerVar2) {
        ljh ljhVar;
        kyl kylVar;
        kyk kykVar;
        kyk kykVar2;
        char charAt;
        int i;
        char charAt2;
        char charAt3;
        lim limVar;
        jer b = eyf.b(this.a.c(), lqdVar);
        if (!b.g()) {
            return;
        }
        lqc lqcVar = (lqc) b.c();
        lpz a = this.b.a(lqcVar);
        if (jerVar.g()) {
            ljh k = lpz.e.k();
            Object c = jerVar.c();
            if (!k.b.y()) {
                k.t();
            }
            lpz lpzVar = (lpz) k.b;
            lpzVar.b = (kyf) c;
            lpzVar.a |= 1;
            ljhVar = bsh.f(a, (lpz) k.q());
        } else {
            ljhVar = (ljh) a.z(5);
            ljhVar.w(a);
        }
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        lpz lpzVar2 = (lpz) ljhVar.b;
        lpz lpzVar3 = lpz.e;
        lpzVar2.c = lla.a;
        ?? r13 = ((jeu) jerVar2).a;
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        lpz lpzVar4 = (lpz) ljhVar.b;
        ljv ljvVar = lpzVar4.c;
        if (!ljvVar.c()) {
            lpzVar4.c = ljn.p(ljvVar);
        }
        lhv.g(r13, lpzVar4.c);
        ?? r132 = this.b;
        ljh ljhVar2 = (ljh) lqcVar.z(5);
        ljhVar2.w(lqcVar);
        ljh c2 = r132.c(ljhVar2, ljhVar);
        kyf kyfVar = ((lpz) ljhVar.b).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        jnk jnkVar = eku.a;
        kyl kylVar2 = kyfVar.c;
        if (kylVar2 == null) {
            kylVar2 = kyl.j;
        }
        String str = kylVar2.d;
        if (!c2.b.y()) {
            c2.t();
        }
        ljn ljnVar = c2.b;
        lqc lqcVar2 = (lqc) ljnVar;
        str.getClass();
        lqcVar2.a |= 2;
        lqcVar2.g = str;
        if (!ljnVar.y()) {
            c2.t();
        }
        ((lqc) c2.b).e = lla.a;
        kye b2 = kye.b(kyfVar.k);
        if (b2 == null) {
            b2 = kye.UNRECOGNIZED;
        }
        if (b2 != kye.SHARED_WITH_ME_PENDING) {
            if (!hqk.c(kyfVar)) {
                ljh k2 = lqi.d.k();
                ljh k3 = lpo.c.k();
                lpl lplVar = lpl.d;
                if (!k3.b.y()) {
                    k3.t();
                }
                lpo lpoVar = (lpo) k3.b;
                lplVar.getClass();
                lpoVar.b = lplVar;
                lpoVar.a = 30;
                if (!k2.b.y()) {
                    k2.t();
                }
                lqi lqiVar = (lqi) k2.b;
                lpo lpoVar2 = (lpo) k3.q();
                lpoVar2.getClass();
                lqiVar.b = lpoVar2;
                lqiVar.a |= 1;
                if (!k2.b.y()) {
                    k2.t();
                }
                ((lqi) k2.b).c = a.B(3);
                c2.am(k2);
            }
            kyg kygVar = kyfVar.g;
            if (kygVar == null) {
                kygVar = kyg.d;
            }
            if (kygVar.a && hqk.b(kyfVar)) {
                ljh k4 = lqi.d.k();
                ljh k5 = lpo.c.k();
                lpm lpmVar = lpm.a;
                if (!k5.b.y()) {
                    k5.t();
                }
                lpo lpoVar3 = (lpo) k5.b;
                lpmVar.getClass();
                lpoVar3.b = lpmVar;
                lpoVar3.a = 31;
                if (!k4.b.y()) {
                    k4.t();
                }
                lqi lqiVar2 = (lqi) k4.b;
                lpo lpoVar4 = (lpo) k5.q();
                lpoVar4.getClass();
                lqiVar2.b = lpoVar4;
                lqiVar2.a |= 1;
                if (!k4.b.y()) {
                    k4.t();
                }
                ((lqi) k4.b).c = a.B(3);
                c2.am(k4);
                ljh k6 = lqi.d.k();
                ljh k7 = lpo.c.k();
                lpn lpnVar = lpn.a;
                if (!k7.b.y()) {
                    k7.t();
                }
                lpo lpoVar5 = (lpo) k7.b;
                lpnVar.getClass();
                lpoVar5.b = lpnVar;
                lpoVar5.a = 32;
                if (!k6.b.y()) {
                    k6.t();
                }
                lqi lqiVar3 = (lqi) k6.b;
                lpo lpoVar6 = (lpo) k7.q();
                lpoVar6.getClass();
                lqiVar3.b = lpoVar6;
                lqiVar3.a |= 1;
                if (!k6.b.y()) {
                    k6.t();
                }
                ((lqi) k6.b).c = a.B(3);
                c2.am(k6);
            }
        }
        kyl kylVar3 = kyfVar.c;
        if (kylVar3 == null) {
            kylVar = kyl.j;
        } else {
            kylVar = kylVar3;
        }
        int h = kzv.h(kylVar.b);
        if (h != 0) {
            int i2 = h - 1;
            if (i2 != 0) {
                if (i2 == 1) {
                    if (kylVar3 == null) {
                        kylVar3 = kyl.j;
                    }
                    if (kylVar3.b == 10) {
                        limVar = (lim) kylVar3.c;
                    } else {
                        limVar = lim.b;
                    }
                    if (!c2.b.y()) {
                        c2.t();
                    }
                    lqc lqcVar3 = (lqc) c2.b;
                    limVar.getClass();
                    lqcVar3.a |= 8;
                    lqcVar3.i = limVar;
                }
            } else {
                if (kylVar3 == null) {
                    kylVar3 = kyl.j;
                }
                if (kylVar3.b == 9) {
                    kykVar = (kyk) kylVar3.c;
                } else {
                    kykVar = kyk.c;
                }
                String str2 = kykVar.a;
                ljh k8 = lpx.e.k();
                if (!k8.b.y()) {
                    k8.t();
                }
                ljn ljnVar2 = k8.b;
                str2.getClass();
                ((lpx) ljnVar2).b = str2;
                kyl kylVar4 = kyfVar.c;
                if (kylVar4 == null) {
                    kylVar4 = kyl.j;
                }
                if (kylVar4.b == 9) {
                    kykVar2 = (kyk) kylVar4.c;
                } else {
                    kykVar2 = kyk.c;
                }
                boolean z = kykVar2.b;
                if (!ljnVar2.y()) {
                    k8.t();
                }
                ((lpx) k8.b).c = z;
                jjr jjrVar = jsv.a;
                jst jstVar = jst.a;
                jjr jjrVar2 = jsv.c;
                String s = ivc.s(str2);
                jmw listIterator = jsv.a.listIterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (s.startsWith(String.valueOf((String) listIterator.next()).concat(":"))) {
                            break;
                        }
                    } else if (s.startsWith("data:")) {
                        String s2 = ivc.s(str2);
                        if (s2.startsWith("data:") && s2.length() > 5) {
                            int i3 = 5;
                            while (i3 < s2.length() && (charAt3 = s2.charAt(i3)) != ';' && charAt3 != ',') {
                                i3++;
                            }
                            if (jsv.b.contains(s2.substring(5, i3)) && s2.startsWith(";base64,", i3) && (i = i3 + 8) < s2.length()) {
                                while (i < s2.length() && (charAt2 = s2.charAt(i)) != '=') {
                                    if ((charAt2 < 'a' || charAt2 > 'z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '/')) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                                while (i < s2.length()) {
                                    if (s2.charAt(i) != '=') {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        jmw listIterator2 = ((jmo) jjrVar2).listIterator();
                        while (true) {
                            if (listIterator2.hasNext()) {
                                if (s.startsWith(String.valueOf(ivc.s(((jss) listIterator2.next()).name()).replace('_', '-')).concat(":"))) {
                                    break;
                                }
                            } else {
                                for (int i4 = 0; i4 < str2.length() && (charAt = str2.charAt(i4)) != '#' && charAt != '/'; i4++) {
                                    if (charAt == ':') {
                                        break;
                                    } else {
                                        if (charAt == '?') {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ljh k9 = jsu.c.k();
                if (!k9.b.y()) {
                    k9.t();
                }
                String str3 = jstVar.b;
                jsu jsuVar = (jsu) k9.b;
                jsuVar.a |= 1;
                jsuVar.b = str3;
                jsu jsuVar2 = (jsu) k9.q();
                if (!k8.b.y()) {
                    k8.t();
                }
                lpx lpxVar = (lpx) k8.b;
                jsuVar2.getClass();
                lpxVar.d = jsuVar2;
                lpxVar.a |= 1;
                if (!c2.b.y()) {
                    c2.t();
                }
                lqc lqcVar4 = (lqc) c2.b;
                lpx lpxVar2 = (lpx) k8.q();
                lpxVar2.getClass();
                lqcVar4.h = lpxVar2;
                lqcVar4.a |= 4;
            }
            this.a.w(lqcVar, (lqc) c2.q());
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:            if ((android.os.SystemClock.elapsedRealtime() - r6) >= ((r9 - defpackage.lmi.b(r11)) + defpackage.lua.c())) goto L115;     */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, ele] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(defpackage.lqc r14, defpackage.kyh r15, defpackage.eiv r16, defpackage.eis r17, android.content.Context r18) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elo.d(lqc, kyh, eiv, eis, android.content.Context):java.lang.String");
    }

    public final void f() {
        int i = 5;
        ((bym) this.a).n(new dzw(this, i));
        if (((ilv) this.b).p()) {
            jer b = ((ilv) this.b).e().b(new eil(10));
            if (b.g()) {
                if (((ilv) this.b).d((lqd) b.c()).b().g()) {
                    ((bym) this.a).m(new dzw(this, i), ((Integer) r0.c()).intValue());
                }
            }
        }
    }

    public final void g(lqd lqdVar, ebf ebfVar, String str, String str2, String str3) {
        lpo lpoVar;
        if (!TextUtils.isEmpty(str3)) {
            ((bym) this.a).l(dxq.LOCK_PHONE_NUMBER_SET);
        }
        if (!TextUtils.isEmpty(str2)) {
            ((bym) this.a).l(dxq.LOCK_MESSAGE_SET);
        }
        if (!TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2)) {
            str2 = " ";
        }
        ebfVar.d();
        ((bym) this.a).k(dxp.DEVICES);
        if (str == null) {
            ljh k = loz.c.k();
            if (str2 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ((loz) k.b).a = str2;
            }
            if (str3 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ((loz) k.b).b = str3;
            }
            ljh k2 = lpo.c.k();
            if (!k2.b.y()) {
                k2.t();
            }
            lpo lpoVar2 = (lpo) k2.b;
            loz lozVar = (loz) k.q();
            lozVar.getClass();
            lpoVar2.b = lozVar;
            lpoVar2.a = 2;
            lpoVar = (lpo) k2.q();
        } else {
            ljh k3 = lpe.d.k();
            if (!k3.b.y()) {
                k3.t();
            }
            ljn ljnVar = k3.b;
            ((lpe) ljnVar).a = str;
            if (str2 != null) {
                if (!ljnVar.y()) {
                    k3.t();
                }
                ((lpe) k3.b).b = str2;
            }
            if (str3 != null) {
                if (!k3.b.y()) {
                    k3.t();
                }
                ((lpe) k3.b).c = str3;
            }
            ljh k4 = lpo.c.k();
            if (!k4.b.y()) {
                k4.t();
            }
            lpo lpoVar3 = (lpo) k4.b;
            lpe lpeVar = (lpe) k3.q();
            lpeVar.getClass();
            lpoVar3.b = lpeVar;
            lpoVar3.a = 3;
            lpoVar = (lpo) k4.q();
        }
        ((ees) this.b).b(lqdVar, lpoVar);
    }

    public final long h() {
        return fyo.a((ContentResolver) this.a, "android_id", 0L);
    }

    public final String i() {
        if (!fma.bI((Context) this.b) && !fma.bJ((Context) this.b)) {
            return ltr.a.a().a();
        }
        return "https://android.googleapis.com/dogfood";
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    public final synchronized List j(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<bso> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (bso bsoVar : list) {
                    if (bsoVar.g(cls, cls2)) {
                        arrayList.add(bsoVar.c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    public final synchronized List k(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<bso> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (bso bsoVar : list) {
                    if (bsoVar.g(cls, cls2) && !arrayList.contains(bsoVar.b)) {
                        arrayList.add(bsoVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void l(String str, dix dixVar, Class cls, Class cls2) {
        L(str).add(new bso(cls, cls2, dixVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    public final synchronized void m(List list) {
        ArrayList arrayList = new ArrayList((Collection) this.a);
        this.a.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                this.a.add(str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dln, java.lang.Object] */
    public final void n(Bitmap bitmap) {
        this.b.d(bitmap);
    }

    public final void o(byte[] bArr) {
        ((dlu) this.a).c(bArr);
    }

    public final byte[] p(int i) {
        return (byte[]) ((dlu) this.a).a(i, byte[].class);
    }

    public final synchronized List s(Class cls) {
        return ((dnu) this.b).c(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, java.lang.Object] */
    public final synchronized List t(Class cls) {
        ?? r0;
        ddg ddgVar = (ddg) ((ddg) this.a).a.get(cls);
        if (ddgVar == null) {
            r0 = 0;
        } else {
            r0 = ddgVar.a;
        }
        if (r0 == 0) {
            List unmodifiableList = DesugarCollections.unmodifiableList(((dnu) this.b).b(cls));
            Object obj = this.a;
            if (((ddg) ((ddg) obj).a.put(cls, new ddg(unmodifiableList))) == null) {
                return unmodifiableList;
            }
            throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
        }
        return r0;
    }

    public final synchronized void u(Class cls, Class cls2, dnq dnqVar) {
        ((dnu) this.b).d(cls, cls2, dnqVar);
        ((ddg) this.a).e();
    }

    public final synchronized void v(Class cls, Class cls2, dnq dnqVar) {
        ((dnu) this.b).e(cls, cls2, dnqVar);
        ((ddg) this.a).e();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [buf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [buf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [buf, java.lang.Object] */
    public final String w(dir dirVar) {
        String str;
        synchronized (this.b) {
            str = (String) ((dtm) this.b).f(dirVar);
        }
        if (str == null) {
            dmi dmiVar = (dmi) this.a.a();
            bsc.q(dmiVar);
            try {
                dirVar.a(dmiVar.a);
                byte[] digest = dmiVar.a.digest();
                synchronized (dtq.b) {
                    char[] cArr = dtq.b;
                    for (int i = 0; i < digest.length; i++) {
                        byte b = digest[i];
                        int i2 = i + i;
                        char[] cArr2 = dtq.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.a.b(dmiVar);
            }
        }
        synchronized (this.b) {
            ((dtm) this.b).g(dirVar, str);
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.Queue] */
    public final void x(String str) {
        njm njmVar;
        synchronized (this) {
            njmVar = (njm) this.a.get(str);
            bsc.q(njmVar);
            int i = njmVar.a;
            if (i > 0) {
                int i2 = i - 1;
                njmVar.a = i2;
                if (i2 == 0) {
                    njm njmVar2 = (njm) this.a.remove(str);
                    if (njmVar2.equals(njmVar)) {
                        Object obj = this.b;
                        synchronized (((dhx) obj).a) {
                            if (((dhx) obj).a.size() < 10) {
                                ((dhx) obj).a.offer(njmVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + njmVar.toString() + ", but actually removed: " + String.valueOf(njmVar2) + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + i);
            }
        }
        njmVar.b.unlock();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    public final List y(String str) {
        List ag;
        str.getClass();
        synchronized (this.a) {
            ?? r1 = this.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : r1.entrySet()) {
                if (amr.i(((cvk) entry.getKey()).a, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                this.b.remove((cvk) it.next());
            }
            ag = mkm.ag(linkedHashMap.values());
        }
        return ag;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final boolean z(cvk cvkVar) {
        boolean containsKey;
        synchronized (this.a) {
            containsKey = this.b.containsKey(cvkVar);
        }
        return containsKey;
    }

    public elo(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public elo(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public elo(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public elo(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public elo(bym bymVar, ilv ilvVar) {
        this.a = bymVar;
        this.b = ilvVar;
        ilvVar.h(new ah(this, 10));
    }

    public elo(List list, List list2) {
        int size = list.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.a)[i] = ((Integer) list.get(i)).intValue();
            ((float[]) this.b)[i] = ((Float) list2.get(i)).floatValue();
        }
    }

    public elo(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = Choreographer.getInstance();
        this.b = Looper.myLooper();
    }

    public elo(evo evoVar, elm elmVar) {
        evoVar.getClass();
        this.a = evoVar;
        this.b = elmVar;
    }

    public elo(EditText editText) {
        this.a = editText;
        cdg cdgVar = new cdg(editText);
        this.b = cdgVar;
        editText.addTextChangedListener(cdgVar);
        editText.setEditableFactory(cdc.a());
    }

    public elo(cel celVar, mnb mnbVar) {
        mnbVar.getClass();
        this.a = celVar;
        mst mstVar = mtj.a;
        this.b = mnbVar.plus(nbc.a.h());
    }

    public elo(byte[] bArr, char[] cArr) {
        this.a = new mrp(0, mrs.a);
        this.b = new mro(false, mrs.a);
    }

    public elo(char[] cArr) {
        this.a = new Object();
        this.b = new LinkedHashMap();
    }

    public elo(crd crdVar, eld eldVar) {
        crdVar.getClass();
        eldVar.getClass();
        this.a = crdVar;
        this.b = eldVar;
    }

    public elo(String str, String str2, byte[] bArr, byte[] bArr2) {
        str2.getClass();
        this.b = str;
        this.a = str2;
    }

    public elo(String str, String str2, byte[] bArr) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public elo(String str, String str2) {
        str.getClass();
        this.b = str;
        this.a = str2;
    }

    public elo(czq czqVar) {
        this.a = new ArrayList();
        this.b = czqVar;
    }

    @Deprecated
    public elo(dgj dgjVar) {
        dgd dgdVar = new dgd();
        this.b = new dgb(dgjVar);
        this.a = dgdVar;
    }

    public elo(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new HashMap();
        this.b = new dhx((byte[]) null);
    }

    public elo(byte[] bArr, byte[] bArr2) {
        this.b = new dtm(1000L);
        this.a = dtx.a(10, new dmh(0));
    }

    public elo(buf bufVar) {
        dnu dnuVar = new dnu(bufVar);
        this.a = new ddg((byte[]) null);
        this.b = dnuVar;
    }

    public elo(byte[] bArr) {
        this.b = new AtomicReference();
        this.a = new rx();
    }

    public elo() {
        this.a = new ArrayList();
        this.b = new HashMap();
    }

    public elo(Context context, byte[] bArr) {
        this.b = new dxn();
        File cacheDir = context.getCacheDir();
        cacheDir.getClass();
        this.a = new dgg(cacheDir);
    }

    public elo(Context context) {
        this.b = context;
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        this.a = contentResolver;
    }
}
