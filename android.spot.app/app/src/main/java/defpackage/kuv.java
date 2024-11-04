package defpackage;

import android.accounts.Account;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.findmydevice.spot.GetOwnerKeyRequest;
import com.google.android.gms.findmydevice.spot.ImportGivenOwnerKeyRequest;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Collection;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuv {
    private static volatile kuv c;
    public final Object a;
    public final Object b;

    public kuv(Intent intent) {
        this.b = new bym((int[]) null);
        this.a = intent;
    }

    private final SharedPreferences B() {
        return ((Context) this.a).getSharedPreferences("ServiceHostnameManagerImpl", 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    private final void C() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((kuk) it.next()).d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kuv b(Context context) {
        if (c == null) {
            synchronized (kuv.class) {
                if (c == null) {
                    c = new kuv(context.getApplicationContext());
                }
            }
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.kuv n(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r5 = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L2b java.lang.Error -> L2d java.io.IOException -> L2f
            kuv r2 = new kuv     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L27 java.io.IOException -> L29
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L27 java.io.IOException -> L29
            return r2
        L25:
            r2 = move-exception
            goto L3b
        L27:
            r2 = move-exception
            goto L3b
        L29:
            r2 = move-exception
            goto L3b
        L2b:
            r0 = move-exception
            goto L30
        L2d:
            r0 = move-exception
            goto L30
        L2f:
            r0 = move-exception
        L30:
            r2 = r0
            r0 = r1
            goto L3b
        L33:
            r5 = move-exception
            goto L38
        L35:
            r5 = move-exception
            goto L38
        L37:
            r5 = move-exception
        L38:
            r2 = r5
            r5 = r1
            r0 = r5
        L3b:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L49
            r0.release()     // Catch: java.io.IOException -> L48
            goto L49
        L48:
        L49:
            if (r5 == 0) goto L4e
            r5.close()     // Catch: java.io.IOException -> L4e
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kuv.n(android.content.Context):kuv");
    }

    public static void q(kuv kuvVar, kuv kuvVar2) {
        Object obj = ((kpb) kuvVar.a).b;
        long[] jArr = (long[]) obj;
        kfl.b(jArr, (long[]) ((kpb) kuvVar2.b).b, (long[]) kuvVar2.a);
        Object obj2 = ((kpb) kuvVar.a).c;
        kpb kpbVar = (kpb) kuvVar2.b;
        long[] jArr2 = (long[]) obj2;
        kfl.b(jArr2, (long[]) kpbVar.c, (long[]) kpbVar.a);
        Object obj3 = ((kpb) kuvVar.a).a;
        long[] jArr3 = (long[]) obj3;
        kfl.b(jArr3, (long[]) ((kpb) kuvVar2.b).a, (long[]) kuvVar2.a);
        kpb kpbVar2 = (kpb) kuvVar2.b;
        Object obj4 = kpbVar2.b;
        long[] jArr4 = (long[]) kpbVar2.c;
        kfl.b((long[]) kuvVar.b, (long[]) obj4, jArr4);
    }

    public static final iiy t(kyq kyqVar, ijf ijfVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3 = true;
        if (kzv.e(kyqVar.b) == 4) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        if (kyqVar.b == 3) {
            i = ((Integer) kyqVar.c).intValue();
        } else {
            i = 0;
        }
        if (i != ijfVar.c) {
            if (kyqVar.b == 3) {
                i2 = ((Integer) kyqVar.c).intValue();
            } else {
                i2 = 0;
            }
            int i3 = ijfVar.c;
            Integer valueOf = Integer.valueOf(i2);
            jer.i(valueOf);
            Integer valueOf2 = Integer.valueOf(i3);
            jer.i(valueOf2);
            throw new iiv(String.format("Required key version %s does not match the local version, which is %s.", valueOf, valueOf2));
        }
        mep mepVar = new mep(null, null, null);
        try {
            if (kyqVar.d.d() == 48) {
                mepVar.a = ijm.a(ijfVar.b, kyqVar.d);
            } else {
                if (kyqVar.d.d() == 60) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                hwx.J(z2);
                mepVar.a = ijm.e(ijfVar.b, kyqVar.d);
            }
            lln llnVar = kyqVar.f;
            if (llnVar == null) {
                llnVar = lln.c;
            }
            mepVar.f(llnVar);
            if (!kyqVar.e.z()) {
                if (kyqVar.e.d() == 32) {
                    mepVar.e(ijm.a(ijfVar.b, kyqVar.e));
                } else {
                    if (kyqVar.e.d() != 44) {
                        z3 = false;
                    }
                    hwx.J(z3);
                    mepVar.e(ijm.e(ijfVar.b, kyqVar.e));
                }
            }
            return mepVar.d();
        } catch (ijl e) {
            throw new IllegalArgumentException("Failed to decrypt user secrets", e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Set, java.lang.Object] */
    public final boolean A() {
        if (!hzc.b()) {
            return false;
        }
        String a = hzc.a((Context) this.a);
        if (a == null) {
            return true;
        }
        int size = this.b.size();
        if (size != 0) {
            if (size == 1) {
                String a2 = ((hzd) hzc.Y(this.b)).a();
                hwx.O(a2.startsWith(":"), "The provided @CustomMainProcess is not an app-private one, i.e. the one staring with colon(':'). @CustomMainProcess value: %s", a2);
                return a.equals(String.valueOf(((Context) this.a).getPackageName()).concat(String.valueOf(a2)));
            }
            throw new IllegalArgumentException("More than 1 custom main process specified");
        }
        return a.equals(((Context) this.a).getPackageName());
    }

    public final jer a(String str) {
        String string = B().getString(str, null);
        if (string == null) {
            string = ijq.a(str);
        }
        return jer.h(string);
    }

    public final void c(kus kusVar) {
        hwx.U(B().edit().remove(kusVar.b()).commit());
        C();
    }

    public final void d(kus kusVar, String str) {
        hwx.U(B().edit().putString(kusVar.b(), str).commit());
        C();
    }

    public final fxs e() {
        return (fxs) ((bym) this.b).a;
    }

    public final void f() {
        ((bym) this.b).u(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final fsa g(Object obj) {
        return (fsa) this.a.get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Object h(fsa fsaVar) {
        return this.b.get(fsaVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    public final void i(Object obj, fsa fsaVar) {
        this.a.put(obj, fsaVar);
        this.b.put(fsaVar, obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    public final void j(fsa fsaVar) {
        ?? r0 = this.b;
        Object obj = r0.get(fsaVar);
        r0.remove(fsaVar);
        this.a.remove(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    public final synchronized fxs k(String str, ksf ksfVar) {
        fxs fxsVar = (fxs) this.b.get(str);
        if (fxsVar != null) {
            return fxsVar;
        }
        Object obj = ksfVar.a;
        Object obj2 = ksfVar.b;
        Object obj3 = ksfVar.c;
        ksh kshVar = ((FirebaseMessaging) obj).f;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj;
        fxs b = ksh.b(kshVar.a(amr.n(kshVar.a), "*", new Bundle())).c(((FirebaseMessaging) obj).h, new ksd(firebaseMessaging, (String) obj2, (ksn) obj3, 0)).b(this.a, new kqu(this, str, 2));
        this.b.put(str, b);
        return b;
    }

    public final void l() {
        try {
            ((FileLock) this.a).release();
            ((FileChannel) this.b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.Map, java.lang.Object] */
    public final synchronized fxs m(String str, String str2, kqp kqpVar) {
        Pair pair = new Pair(str, str2);
        fxs fxsVar = (fxs) this.b.get(pair);
        if (fxsVar != null) {
            return fxsVar;
        }
        Object obj = kqpVar.a;
        Object obj2 = kqpVar.b;
        Object obj3 = kqpVar.c;
        Object obj4 = kqpVar.d;
        Object obj5 = kqpVar.e;
        String str3 = (String) obj3;
        String str4 = (String) obj2;
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) obj;
        fxs c2 = kqr.b(((FirebaseInstanceId) obj).e.a(str4, str3, (String) obj4, new Bundle())).c(((FirebaseInstanceId) obj).b, new ksd(firebaseInstanceId, (String) obj3, (String) obj4, 1));
        final kqv kqvVar = (kqv) obj5;
        final FirebaseInstanceId firebaseInstanceId2 = (FirebaseInstanceId) obj;
        c2.o(new pt(6), new fxo() { // from class: kqq
            @Override // defpackage.fxo
            public final void d(Object obj6) {
                Object obj7 = ((ktd) obj6).a;
                kqv kqvVar2 = kqvVar;
                if (kqvVar2 != null) {
                    if (((String) obj7).equals(kqvVar2.b)) {
                        return;
                    }
                }
                Iterator it = FirebaseInstanceId.this.f.iterator();
                while (it.hasNext()) {
                    ((FirebaseMessaging) ((njz) it.next()).a).e((String) obj7);
                }
            }
        });
        fxs b = c2.b(this.a, new kqu(this, pair, 0));
        this.b.put(pair, b);
        return b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Enum o(Object obj) {
        Enum r0 = (Enum) this.b.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(String.valueOf(obj))));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Object p(Enum r3) {
        Object obj = this.a.get(r3);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(String.valueOf(r3))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.animation.Animator$AnimatorListener, java.lang.Object] */
    public final void r(ValueAnimator valueAnimator) {
        iqh iqhVar = new iqh();
        valueAnimator.addListener(this.a);
        ((ArrayList) this.b).add(iqhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final jyz s(kyq kyqVar) {
        boolean z;
        if (kzv.e(kyqVar.b) == 4) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        return jbx.d(((kuv) this.b).u()).f(new ifl(kyqVar, 9), this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jfe, java.lang.Object] */
    public final jyz u() {
        jer jerVar = (jer) this.a.a();
        if (!jerVar.g()) {
            return ivc.E(jdl.a);
        }
        GetOwnerKeyRequest getOwnerKeyRequest = new GetOwnerKeyRequest();
        getOwnerKeyRequest.a = (Account) jerVar.c();
        Object obj = this.b;
        fjy fjyVar = new fjy();
        fjyVar.b = new Feature[]{fnv.a};
        fjyVar.a = new fep(getOwnerKeyRequest, 14);
        fjyVar.c = 33311;
        return jbx.d(fzo.b(((fhq) obj).f(fjyVar.a()))).e(new ihq(6), jxv.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jfe, java.lang.Object] */
    public final jyz v(int i) {
        jer jerVar = (jer) this.a.a();
        ImportGivenOwnerKeyRequest importGivenOwnerKeyRequest = new ImportGivenOwnerKeyRequest();
        importGivenOwnerKeyRequest.a = (Account) jerVar.c();
        importGivenOwnerKeyRequest.b = i;
        fjy fjyVar = new fjy();
        fjyVar.b = new Feature[]{fnv.a};
        fjyVar.a = new fep(importGivenOwnerKeyRequest, 13);
        fjyVar.c = 33314;
        return jbx.d(fzo.b(((fhq) this.b).f(fjyVar.a()))).e(new ihq(5), jxv.a);
    }

    public final jyz w(kyf kyfVar, kyh kyhVar, jxd jxdVar) {
        kyg kygVar = kyfVar.g;
        if (kygVar == null) {
            kygVar = kyg.d;
        }
        int I = a.I(kygVar.c);
        if (I == 0) {
            I = 1;
        }
        return ((igh) this.a).d(kyfVar, (jjr) Collection.EL.stream(hqt.h(I)).filter(new ehc(kyhVar, 10)).collect(jgr.b), jxdVar, (igo) this.b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final hzp x() {
        return new hzp(((StringBuilder) this.b).toString(), this.a);
    }

    public final void y(String str) {
        ((StringBuilder) this.b).append(str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    public final void z(String str, Object... objArr) {
        ((StringBuilder) this.b).append(str);
        if (objArr != null) {
            if (this.a.size() + objArr.length <= 999) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        this.a.add(obj.toString());
                    } else {
                        throw new IllegalArgumentException("Bind argument can't be null for query".concat(str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Single SQL statements support at most 999 parameters.");
        }
    }

    public kuv(igh ighVar, igo igoVar) {
        this.b = igoVar;
        this.a = ighVar;
    }

    public kuv(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public kuv(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public kuv(kuv kuvVar, Executor executor) {
        this.b = kuvVar;
        this.a = executor;
    }

    public kuv(mko mkoVar, mko mkoVar2) {
        this.a = mkoVar;
        this.b = mkoVar2;
    }

    private kuv(Context context) {
        this.b = jql.n();
        this.a = context;
    }

    public kuv(Context context, Map map) {
        this.a = context;
        this.b = map.keySet();
    }

    public kuv(mko mkoVar, mko mkoVar2, byte[] bArr, byte[] bArr2) {
        mkoVar.getClass();
        this.a = mkoVar;
        mkoVar2.getClass();
        this.b = mkoVar2;
    }

    public kuv(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.b = new Rect();
        this.a = new Rect();
    }

    public kuv(mca mcaVar, mbc mbcVar) {
        hwx.V(!mcaVar.f(), "Error status must not be OK");
        this.b = mcaVar;
        this.a = mbcVar;
    }

    public kuv(char[] cArr, byte[] bArr) {
        this.b = new StringBuilder();
        this.a = new ArrayList();
    }

    public kuv() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public kuv(mko mkoVar, mko mkoVar2, byte[] bArr) {
        mkoVar.getClass();
        this.a = mkoVar;
        mkoVar2.getClass();
        this.b = mkoVar2;
    }

    public kuv(short[] sArr) {
        this.b = new ArrayList();
        this.a = new irs(this);
    }

    public kuv(iym iymVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.b = iymVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kuv(Iterable iterable) {
        this.a = new jxk();
        this.b = jis.n(iterable);
        jmx it = ((jis) iterable).iterator();
        while (it.hasNext()) {
            jxp jxpVar = (jxp) it.next();
            Object obj = this.a;
            jyy jyyVar = jxp.a;
            jxpVar.a((jxk) obj);
        }
    }

    public kuv(kuv kuvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new kpb((kpb) kuvVar.b);
        this.a = Arrays.copyOf((long[]) kuvVar.a, 10);
    }

    public kuv(byte[] bArr, byte[] bArr2) {
        this(new kpb((byte[]) null), new long[10], (byte[]) null);
    }

    public kuv(kuv kuvVar, byte[] bArr, byte[] bArr2) {
        this((byte[]) null, (byte[]) null);
        q(this, kuvVar);
    }

    public kuv(byte[] bArr) {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    public kuv(kuv kuvVar) {
        this.a = new HashMap((Map) kuvVar.b);
        this.b = new HashMap((Map) kuvVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public kuv(kuv kuvVar, byte[] bArr) {
        this.b = new HashMap((Map) kuvVar.a);
        this.a = new HashMap((Map) kuvVar.b);
    }

    public kuv(Executor executor, byte[] bArr) {
        this.b = new rx();
        this.a = executor;
    }

    public kuv(Executor executor) {
        this.b = new rx();
        this.a = executor;
    }
}
