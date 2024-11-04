package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.biometrics.BiometricPrompt;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.accounts.AccountLayout;
import j$.util.Collection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apc {
    public static apc d;
    public final Object a;
    public final Object b;
    public final Object c;

    public apc(Context context, LocationManager locationManager) {
        this.b = new dw();
        this.c = context;
        this.a = locationManager;
    }

    private final int H() {
        Object obj = this.b;
        if (obj == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (!((buw) obj).d()) {
            return 12;
        }
        if (!((buw) this.b).c()) {
            return 11;
        }
        return 0;
    }

    private final int I() {
        if (!((bet) this.a).A()) {
            return H();
        }
        if (H() == 0) {
            return 0;
        }
        return -1;
    }

    private final int J() {
        Object obj = this.c;
        if (obj == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        return qs.a(apc$$ExternalSyntheticApiModelOutline0.m2m(obj));
    }

    private static void K(View view, hjf hjfVar) {
        view.setTag(R.id.view_bound_account_tag, hjfVar);
    }

    private final gfb L() {
        ljh k = gfb.e.k();
        if (!k.b.y()) {
            k.t();
        }
        Object obj = this.c;
        ljn ljnVar = k.b;
        gfb gfbVar = (gfb) ljnVar;
        gfbVar.a |= 16;
        gfbVar.d = ((gfh) obj).b;
        if (!ljnVar.y()) {
            k.t();
        }
        ljn ljnVar2 = k.b;
        gfb gfbVar2 = (gfb) ljnVar2;
        gfbVar2.a |= 2;
        gfbVar2.b = 1;
        Object obj2 = this.c;
        if (!ljnVar2.y()) {
            k.t();
        }
        String str = ((gfh) obj2).a;
        gfb gfbVar3 = (gfb) k.b;
        gfbVar3.a |= 4;
        gfbVar3.c = str;
        return (gfb) k.q();
    }

    public static apc d(Context context) {
        return new apc(new bet(context));
    }

    public static final boolean q(jer jerVar, long j) {
        if (!jerVar.g() || SystemClock.elapsedRealtime() - ((Long) jerVar.c()).longValue() > j) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void w(hjp hjpVar, View view) {
        if (view instanceof hjs) {
            ((hjs) view).b(hjpVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                w(hjpVar, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void y(hjp hjpVar, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                y(hjpVar, viewGroup.getChildAt(i));
            }
        }
        if (view instanceof hjs) {
            ((hjs) view).cU(hjpVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(12:5|6|7|(1:(1:10)(2:24|25))(3:26|27|(1:29))|11|(1:13)|14|(2:17|15)|18|19|20|21))|32|6|7|(0)(0)|11|(0)|14|(1:15)|18|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0027, code lost:            r7 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:            r7 = defpackage.mjo.n(r7);     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:10:0x0023, B:11:0x004c, B:13:0x0052, B:14:0x0054, B:15:0x0074, B:17:0x007a, B:19:0x0095, B:27:0x0034), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[Catch: all -> 0x0027, LOOP:0: B:15:0x0074->B:17:0x007a, LOOP_END, TryCatch #0 {all -> 0x0027, blocks: (B:10:0x0023, B:11:0x004c, B:13:0x0052, B:14:0x0054, B:15:0x0074, B:17:0x007a, B:19:0x0095, B:27:0x0034), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(defpackage.goa r7, defpackage.mmx r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ghz
            if (r0 == 0) goto L13
            r0 = r8
            ghz r0 = (defpackage.ghz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ghz r0 = new ghz
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.mjo.o(r8)     // Catch: java.lang.Throwable -> L27
            goto L4c
        L27:
            r7 = move-exception
            goto L9b
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.mjo.o(r8)
            java.lang.Object r8 = r6.c     // Catch: java.lang.Throwable -> L27
            gok r8 = (defpackage.gok) r8     // Catch: java.lang.Throwable -> L27
            imf r7 = r8.h(r7)     // Catch: java.lang.Throwable -> L27
            jyz r7 = r7.a()     // Catch: java.lang.Throwable -> L27
            r7.getClass()     // Catch: java.lang.Throwable -> L27
            r0.b = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r8 = defpackage.mpd.p(r7, r0)     // Catch: java.lang.Throwable -> L27
            if (r8 != r1) goto L4c
            return r1
        L4c:
            gig r8 = (defpackage.gig) r8     // Catch: java.lang.Throwable -> L27
            gih r7 = r8.b     // Catch: java.lang.Throwable -> L27
            if (r7 != 0) goto L54
            gih r7 = defpackage.gih.c     // Catch: java.lang.Throwable -> L27
        L54:
            long r0 = r7.b     // Catch: java.lang.Throwable -> L27
            lkl r7 = r8.c     // Catch: java.lang.Throwable -> L27
            java.util.Map r7 = java.util.Collections.unmodifiableMap(r7)     // Catch: java.lang.Throwable -> L27
            r7.getClass()     // Catch: java.lang.Throwable -> L27
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L27
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L27
            int r2 = defpackage.mkm.H(r2)     // Catch: java.lang.Throwable -> L27
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L27
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L27
        L74:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L95
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L27
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L27
            gih r2 = (defpackage.gih) r2     // Catch: java.lang.Throwable -> L27
            long r4 = r2.b     // Catch: java.lang.Throwable -> L27
            java.lang.Long r2 = new java.lang.Long     // Catch: java.lang.Throwable -> L27
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L27
            r8.put(r3, r2)     // Catch: java.lang.Throwable -> L27
            goto L74
        L95:
            ggb r7 = new ggb     // Catch: java.lang.Throwable -> L27
            r7.<init>(r0, r8)     // Catch: java.lang.Throwable -> L27
            goto L9f
        L9b:
            java.lang.Object r7 = defpackage.mjo.n(r7)
        L9f:
            gna r7 = defpackage.frx.G(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apc.A(goa, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(defpackage.goa r5, defpackage.mmx r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.gia
            if (r0 == 0) goto L13
            r0 = r6
            gia r0 = (defpackage.gia) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            gia r0 = new gia
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            apc r5 = r0.d
            defpackage.mjo.o(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.mjo.o(r6)
            r0.d = r4
            r0.b = r3
            java.lang.Object r6 = r4.A(r5, r0)
            if (r6 == r1) goto L61
            r5 = r4
        L3f:
            gna r6 = (defpackage.gna) r6
            boolean r0 = r6 instanceof defpackage.gnc
            if (r0 == 0) goto L5e
            java.lang.Object r5 = r5.b
            jer r5 = (defpackage.jer) r5
            java.lang.Object r5 = r5.f()
            gxt r5 = (defpackage.gxt) r5
            if (r5 == 0) goto L5e
            gnc r6 = (defpackage.gnc) r6
            java.lang.Object r6 = r6.a
            ggb r6 = (defpackage.ggb) r6
            long r0 = r6.a
            java.util.Map r6 = r6.b
            r5.a()
        L5e:
            mlh r5 = defpackage.mlh.a
            return r5
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apc.B(goa, mmx):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(3:19|20|21))(4:27|28|(1:30)|26)|22|(1:24)|12|13|14))|33|6|7|(0)(0)|22|(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:            if (r5.B(r0, r3) != r4) goto L66;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0031, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:            r0 = defpackage.mjo.n(r0);     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002c, B:12:0x009a, B:20:0x0042, B:22:0x0086, B:24:0x008a, B:28:0x004b), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C(defpackage.goa r18, long r19, long r21, java.util.Map r23, defpackage.mmx r24) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r24
            boolean r3 = r2 instanceof defpackage.gib
            if (r3 == 0) goto L19
            r3 = r2
            gib r3 = (defpackage.gib) r3
            int r4 = r3.b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.b = r4
            goto L1e
        L19:
            gib r3 = new gib
            r3.<init>(r1, r2)
        L1e:
            java.lang.Object r2 = r3.a
            mne r4 = defpackage.mne.a
            int r5 = r3.b
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L48
            if (r5 == r7) goto L3c
            if (r5 != r6) goto L34
            defpackage.mjo.o(r2)     // Catch: java.lang.Throwable -> L31
            goto L9a
        L31:
            r0 = move-exception
            goto L9e
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3c:
            mpk r0 = r3.c
            apc r5 = r3.f
            goa r7 = r3.d
            defpackage.mjo.o(r2)     // Catch: java.lang.Throwable -> L31
            r2 = r0
            r0 = r7
            goto L86
        L48:
            defpackage.mjo.o(r2)
            mpk r2 = new mpk     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r1.c     // Catch: java.lang.Throwable -> L31
            gok r5 = (defpackage.gok) r5     // Catch: java.lang.Throwable -> L31
            imf r5 = r5.h(r0)     // Catch: java.lang.Throwable -> L31
            gic r15 = new gic     // Catch: java.lang.Throwable -> L31
            r16 = 0
            r8 = r15
            r9 = r19
            r11 = r2
            r12 = r23
            r13 = r21
            r6 = r15
            r15 = r16
            r8.<init>(r9, r11, r12, r13, r15)     // Catch: java.lang.Throwable -> L31
            ewy r8 = new ewy     // Catch: java.lang.Throwable -> L31
            r9 = 14
            r8.<init>(r6, r9)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = r1.a     // Catch: java.lang.Throwable -> L31
            jyz r5 = r5.b(r8, r6)     // Catch: java.lang.Throwable -> L31
            r3.d = r0     // Catch: java.lang.Throwable -> L31
            r3.f = r1     // Catch: java.lang.Throwable -> L31
            r3.c = r2     // Catch: java.lang.Throwable -> L31
            r3.b = r7     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = defpackage.mpd.p(r5, r3)     // Catch: java.lang.Throwable -> L31
            if (r5 == r4) goto L9d
            r5 = r1
        L86:
            boolean r2 = r2.a     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L9a
            r2 = 0
            r3.d = r2     // Catch: java.lang.Throwable -> L31
            r3.f = r2     // Catch: java.lang.Throwable -> L31
            r3.c = r2     // Catch: java.lang.Throwable -> L31
            r2 = 2
            r3.b = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r0 = r5.B(r0, r3)     // Catch: java.lang.Throwable -> L31
            if (r0 == r4) goto L9d
        L9a:
            mlh r0 = defpackage.mlh.a     // Catch: java.lang.Throwable -> L31
            goto La2
        L9d:
            return r4
        L9e:
            java.lang.Object r0 = defpackage.mjo.n(r0)
        La2:
            gna r0 = defpackage.frx.G(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apc.C(goa, long, long, java.util.Map, mmx):java.lang.Object");
    }

    public final void D(boolean z) {
        F(1001, z);
    }

    public final void E(boolean z) {
        F(1002, z);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [jfe, java.lang.Object] */
    public final void F(int i, boolean z) {
        if (!((ddg) this.b).y(0L)) {
            return;
        }
        gok gokVar = (gok) this.a.a();
        ljh k = gfc.f.k();
        if (!k.b.y()) {
            k.t();
        }
        gfc gfcVar = (gfc) k.b;
        gfcVar.a |= 1;
        gfcVar.d = 0;
        gfb L = L();
        if (!k.b.y()) {
            k.t();
        }
        gfc gfcVar2 = (gfc) k.b;
        L.getClass();
        gfcVar2.e = L;
        gfcVar2.a |= 2;
        ljh k2 = gff.d.k();
        if (!k2.b.y()) {
            k2.t();
        }
        gff gffVar = (gff) k2.b;
        gffVar.a |= 1;
        gffVar.b = z;
        if (!k.b.y()) {
            k.t();
        }
        gfc gfcVar3 = (gfc) k.b;
        gff gffVar2 = (gff) k2.q();
        gffVar2.getClass();
        gfcVar3.c = gffVar2;
        gfcVar3.b = 1;
        gokVar.k(i, (gfc) k.q());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [jfe, java.lang.Object] */
    public final void G(int i, boolean z) {
        if (!((ddg) this.b).y(0L)) {
            return;
        }
        gok gokVar = (gok) this.a.a();
        ljh k = gfc.f.k();
        if (!k.b.y()) {
            k.t();
        }
        gfc gfcVar = (gfc) k.b;
        gfcVar.a |= 1;
        gfcVar.d = 0;
        gfb L = L();
        if (!k.b.y()) {
            k.t();
        }
        gfc gfcVar2 = (gfc) k.b;
        L.getClass();
        gfcVar2.e = L;
        gfcVar2.a |= 2;
        ljh k2 = gff.d.k();
        if (!k2.b.y()) {
            k2.t();
        }
        ljn ljnVar = k2.b;
        gff gffVar = (gff) ljnVar;
        gffVar.a |= 1;
        gffVar.b = true;
        if (!ljnVar.y()) {
            k2.t();
        }
        gff gffVar2 = (gff) k2.b;
        gffVar2.a |= 2;
        gffVar2.c = z;
        if (!k.b.y()) {
            k.t();
        }
        gfc gfcVar3 = (gfc) k.b;
        gff gffVar3 = (gff) k2.q();
        gffVar3.getClass();
        gfcVar3.c = gffVar3;
        gfcVar3.b = 1;
        gokVar.k(i, (gfc) k.q());
    }

    public final void a() {
        ((aue) this.c).d.f();
    }

    public final int b(int i) {
        BiometricPrompt.CryptoObject c;
        Object obj;
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.c;
            if (obj2 == null) {
                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                return 1;
            }
            return qt.a(apc$$ExternalSyntheticApiModelOutline0.m2m(obj2), i);
        }
        if (!ja.c(i)) {
            return -2;
        }
        if (kv.c((Context) ((bet) this.a).a) != null) {
            if (ja.b(i)) {
                if (((bet) this.a).A()) {
                    return 0;
                }
                return 11;
            }
            if (Build.VERSION.SDK_INT == 29) {
                if (ja.d(i)) {
                    return J();
                }
                Method c2 = qs.c();
                if (c2 != null && (c = jy.c(jy.d())) != null) {
                    try {
                        if (Build.VERSION.SDK_INT == 29) {
                            obj = c2.invoke(this.c, c);
                        } else {
                            obj = null;
                        }
                        if (obj instanceof Integer) {
                            return ((Integer) obj).intValue();
                        }
                        Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    }
                }
                int J = J();
                Object obj3 = this.a;
                String str = Build.MODEL;
                if ((Build.VERSION.SDK_INT >= 30 || !kk.b((Context) ((bet) obj3).a, str, R.array.assume_strong_biometrics_models)) && J == 0) {
                    return I();
                }
                return J;
            }
            if (Build.VERSION.SDK_INT == 28) {
                if (la.c((Context) ((bet) this.a).a)) {
                    return I();
                }
            } else {
                return H();
            }
        }
        return 12;
    }

    public final Location c(String str) {
        try {
            if (((LocationManager) this.a).isProviderEnabled(str)) {
                return ((LocationManager) this.a).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String e() {
        String uuid = ((UUID) this.a).toString();
        uuid.getClass();
        return uuid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:            if (r7 != r1) goto L59;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v0, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [ncd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.moh r6, defpackage.mmx r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cca
            if (r0 == 0) goto L13
            r0 = r7
            cca r0 = (defpackage.cca) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cca r0 = new cca
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.a
            ncd r6 = (defpackage.ncd) r6
            defpackage.mjo.o(r7)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r7 = move-exception
            goto L6c
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            ncd r6 = r0.d
            java.lang.Object r2 = r0.a
            moh r2 = (defpackage.moh) r2
            defpackage.mjo.o(r7)
            goto L58
        L42:
            defpackage.mjo.o(r7)
            java.lang.Object r7 = r5.c
            r0.a = r6
            r2 = r7
            ncd r2 = (defpackage.ncd) r2
            r0.d = r2
            r0.c = r4
            java.lang.Object r2 = r2.b(r0)
            if (r2 == r1) goto L72
            r2 = r6
            r6 = r7
        L58:
            r0.a = r6     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            r0.d = r7     // Catch: java.lang.Throwable -> L2e
            r0.c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r2.a(r0)     // Catch: java.lang.Throwable -> L2e
            if (r7 != r1) goto L66
            goto L72
        L66:
            ncd r6 = (defpackage.ncd) r6
            r6.d()
            return r7
        L6c:
            ncd r6 = (defpackage.ncd) r6
            r6.d()
            throw r7
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apc.f(moh, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.mol r7, defpackage.mmx r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ccb
            if (r0 == 0) goto L13
            r0 = r8
            ccb r0 = (defpackage.ccb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccb r0 = new ccb
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r7 = r0.a
            ncd r0 = r0.d
            defpackage.mjo.o(r8)     // Catch: java.lang.Throwable -> L2b
            goto L57
        L2b:
            r8 = move-exception
            goto L64
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.mjo.o(r8)
            java.lang.Object r8 = r6.c
            r2 = r8
            ncd r2 = (defpackage.ncd) r2
            boolean r2 = r2.c()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L60
            r5 = r8
            ncd r5 = (defpackage.ncd) r5     // Catch: java.lang.Throwable -> L60
            r0.d = r5     // Catch: java.lang.Throwable -> L60
            r0.a = r2     // Catch: java.lang.Throwable -> L60
            r0.c = r3     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = r7.a(r4, r0)     // Catch: java.lang.Throwable -> L60
            if (r7 == r1) goto L5f
            r0 = r8
            r8 = r7
            r7 = r2
        L57:
            if (r7 == 0) goto L5e
            ncd r0 = (defpackage.ncd) r0
            r0.d()
        L5e:
            return r8
        L5f:
            return r1
        L60:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L64:
            if (r7 == 0) goto L6b
            ncd r0 = (defpackage.ncd) r0
            r0.d()
        L6b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apc.g(mol, mmx):java.lang.Object");
    }

    public final Object h() {
        return new Integer(((bym) this.a).b());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void i(bvd bvdVar) {
        ((CopyOnWriteArrayList) this.c).add(bvdVar);
        this.a.run();
    }

    public final void j(Menu menu, MenuInflater menuInflater) {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((bvd) it.next()).a(menu, menuInflater);
        }
    }

    public final void k(Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((bvd) it.next()).c(menu);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.Runnable] */
    public final void l(bvd bvdVar) {
        ((CopyOnWriteArrayList) this.c).remove(bvdVar);
        bvb bvbVar = (bvb) this.b.remove(bvdVar);
        if (bvbVar != null) {
            bvbVar.a();
        }
        this.a.run();
    }

    public final boolean m(MenuItem menuItem) {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            if (((bvd) it.next()).d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final jiy n(lqd lqdVar) {
        if (!((ilv) this.a).n(lqdVar)) {
            return jmn.a;
        }
        eiv b = ((ilv) this.a).b(lqdVar);
        return (jiy) Collection.EL.stream(b.h.entrySet()).collect(jgr.a(new eff(7), new egd(this, b, 3, null)));
    }

    public final jiy o() {
        return (jiy) ((ilv) this.a).e().b(new eil(9)).b(new dyv(this, 10)).e(jmn.a);
    }

    public final boolean p(kyh kyhVar) {
        return ((Boolean) ((ilv) this.a).f().b(new dyv(kyhVar, 12)).e(false)).booleanValue();
    }

    public final void r(lom lomVar, Account account, dfv dfvVar, dfu dfuVar) {
        elo eloVar = (elo) this.b;
        String valueOf = String.valueOf(eloVar.i());
        String valueOf2 = String.valueOf(fyo.b((ContentResolver) eloVar.a, "adm:tos_acceptance_url", "/nova/tos_acceptance"));
        ((dft) this.a).a(new dvp(lomVar, valueOf.concat(valueOf2), (lkx) loo.d.z(7), ((bso) this.c).h(account), dfvVar, dfuVar));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [hjy, java.lang.Object] */
    public final void s(String str, AccountLayout accountLayout) {
        str.getClass();
        elo eloVar = (elo) this.a;
        Bitmap bitmap = (Bitmap) ((sn) eloVar.b).b(str);
        if (bitmap == null) {
            dfh c = ((dgg) eloVar.a).c(str);
            if (c != null) {
                byte[] bArr = c.a;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                ((sn) eloVar.b).c(str, bitmap);
            }
        }
        if (bitmap != null) {
            if (accountLayout != null) {
                accountLayout.a(bitmap);
            }
        } else {
            kgf kgfVar = new kgf(this, str, accountLayout);
            ivc.N(((apc) kgfVar.a).c.d((String) kgfVar.c, 64), new dup(kgfVar, 0), ((apc) kgfVar.a).b);
        }
    }

    public final boolean t(Class cls, Class cls2) {
        if (((Class) this.c).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.b)) {
            return true;
        }
        return false;
    }

    public final boolean u(Class cls) {
        return ((Class) this.b).isAssignableFrom(cls);
    }

    public final boolean v(hob hobVar) {
        if (((hnk) this.a).a().booleanValue()) {
            if (((hnq) this.c).c.a == 2) {
                return true;
            }
            return false;
        }
        return hoa.e((Context) this.b, hobVar);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, hjp] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, hjp] */
    public final void x(View view, int i, Object obj) {
        hjf hjfVar;
        if (obj == null) {
            hjfVar = new hjf(2, null);
        } else {
            String ak = frx.ak(obj);
            if (ak != null && ak.contains("@")) {
                hjfVar = new hjf(1, ak);
            } else {
                hjfVar = new hjf(2, null);
            }
        }
        hjf hjfVar2 = (hjf) view.getTag(R.id.view_bound_account_tag);
        if (!hjfVar.equals(hjfVar2)) {
            if (hjfVar2 == null) {
                ((hjq) this.a).a(view, i, hjfVar);
                K(view, hjfVar);
                return;
            }
            int[] iArr = bwn.a;
            if (view.isAttachedToWindow()) {
                y(this.c, view);
                ((hjr) ((hjq) this.a).b).e(view);
                ((hjq) this.a).a(view, i, hjfVar);
                w(this.c, view);
                K(view, hjfVar);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:            r6 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:            r6 = defpackage.mjo.n(r6);     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(defpackage.goa r6, defpackage.mmx r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ghy
            if (r0 == 0) goto L13
            r0 = r7
            ghy r0 = (defpackage.ghy) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ghy r0 = new ghy
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.mjo.o(r7)     // Catch: java.lang.Throwable -> L27
            goto L53
        L27:
            r6 = move-exception
            goto L57
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.mjo.o(r7)
            java.lang.Object r7 = r5.c     // Catch: java.lang.Throwable -> L27
            gok r7 = (defpackage.gok) r7     // Catch: java.lang.Throwable -> L27
            imf r6 = r7.h(r6)     // Catch: java.lang.Throwable -> L27
            cka r7 = defpackage.cka.m     // Catch: java.lang.Throwable -> L27
            ewy r2 = new ewy     // Catch: java.lang.Throwable -> L27
            r4 = 13
            r2.<init>(r7, r4)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r5.a     // Catch: java.lang.Throwable -> L27
            jyz r6 = r6.b(r2, r7)     // Catch: java.lang.Throwable -> L27
            r0.b = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = defpackage.mpd.p(r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 == r1) goto L56
        L53:
            mlh r6 = defpackage.mlh.a     // Catch: java.lang.Throwable -> L27
            goto L5b
        L56:
            return r1
        L57:
            java.lang.Object r6 = defpackage.mjo.n(r6)
        L5b:
            gna r6 = defpackage.frx.G(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apc.z(goa, mmx):java.lang.Object");
    }

    public apc(be beVar, hcc hccVar, aj ajVar) {
        this.b = beVar;
        this.a = hccVar;
        this.c = ajVar;
    }

    public apc(gnv gnvVar, gsk gskVar, gur gurVar) {
        this.a = gnvVar;
        this.c = gskVar;
        this.b = gurVar;
    }

    public apc(hjp hjpVar, hjq hjqVar, haw hawVar) {
        this.c = hjpVar;
        this.a = hjqVar;
        this.b = hawVar;
    }

    public apc(Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public apc(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public apc(Object obj, Object obj2, Object obj3, char[] cArr) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public apc(Object obj, Object obj2, Object obj3, int[] iArr) {
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public apc(Object obj, Object obj2, Object obj3, short[] sArr) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public apc(bet betVar) {
        this.a = betVar;
        this.c = Build.VERSION.SDK_INT >= 29 ? qs.b((Context) betVar.a) : null;
        this.b = Build.VERSION.SDK_INT <= 29 ? new buw((Context) betVar.a) : null;
    }

    public apc(goj gojVar, mnb mnbVar, Set set) {
        set.getClass();
        this.a = gojVar;
        this.b = mnbVar;
        this.c = set;
    }

    public apc(hjy hjyVar, elo eloVar, Executor executor) {
        this.c = hjyVar;
        this.a = eloVar;
        executor.getClass();
        this.b = executor;
    }

    public apc(ilv ilvVar, hot hotVar, emt emtVar) {
        this.a = ilvVar;
        this.c = hotVar;
        this.b = new cfn(o());
        int i = 14;
        byte[] bArr = null;
        ilvVar.g(new dym(this, i, bArr));
        emtVar.d.h(new dym(this, i, bArr));
    }

    public apc(jfe jfeVar, ddg ddgVar, gfh gfhVar) {
        this.a = hwx.H(jfeVar);
        this.b = ddgVar;
        this.c = gfhVar;
    }

    public apc(View view, bet betVar) {
        Object systemService;
        this.a = view;
        this.b = betVar;
        systemService = view.getContext().getSystemService((Class<Object>) cs$$ExternalSyntheticApiModelOutline0.m61m());
        AutofillManager m58m = cs$$ExternalSyntheticApiModelOutline0.m58m(systemService);
        if (m58m != null) {
            this.c = m58m;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }

    public apc(dft dftVar, bso bsoVar, elo eloVar) {
        dftVar.getClass();
        this.a = dftVar;
        this.c = bsoVar;
        eloVar.getClass();
        this.b = eloVar;
    }

    public apc(gok gokVar, jzc jzcVar, jer jerVar) {
        jzcVar.getClass();
        jerVar.getClass();
        this.c = gokVar;
        this.a = jzcVar;
        this.b = jerVar;
    }

    public apc(mko mkoVar, mko mkoVar2, mko mkoVar3, byte[] bArr) {
        mkoVar.getClass();
        this.b = mkoVar;
        mkoVar2.getClass();
        this.a = mkoVar2;
        mkoVar3.getClass();
        this.c = mkoVar3;
    }

    public apc(avs avsVar) {
        this.b = avsVar;
        this.c = new aue();
        this.a = new si(null);
    }

    public apc(Runnable runnable) {
        this.c = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.a = runnable;
    }

    public apc(mko mkoVar, mko mkoVar2, mko mkoVar3) {
        mkoVar.getClass();
        this.b = mkoVar;
        mkoVar2.getClass();
        this.a = mkoVar2;
        mkoVar3.getClass();
        this.c = mkoVar3;
    }

    public apc() {
        this.c = new ncd();
        this.a = new bym();
        this.b = new mwo(new ccc(null, 0));
    }

    public apc(cqd cqdVar) {
        this(cqdVar.a, cqdVar.b, cqdVar.c);
    }

    public apc(UUID uuid, cvu cvuVar, Set set) {
        uuid.getClass();
        cvuVar.getClass();
        this.a = uuid;
        this.c = cvuVar;
        this.b = set;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List, java.lang.Object] */
    public apc(List list) {
        this.b = list;
        this.c = new ArrayList(list.size());
        this.a = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.c.add(((dby) ((fkz) list.get(i)).c).a());
            this.a.add(((dbu) ((fkz) list.get(i)).d).a());
        }
    }
}
