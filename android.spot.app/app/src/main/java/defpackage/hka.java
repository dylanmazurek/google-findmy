package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hka implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hka(hlt hltVar, AtomicBoolean atomicBoolean, int i) {
        this.c = i;
        this.a = atomicBoolean;
        this.b = hltVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v25, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, android.view.ViewTreeObserver$OnDrawListener] */
    /* JADX WARN: Type inference failed for: r1v3, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, jbe] */
    /* JADX WARN: Type inference failed for: r2v24, types: [kqz, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        jyz b;
        SharedPreferences.Editor editor = null;
        int i = 6;
        switch (this.c) {
            case 0:
                ((hjy) ((AtomicReference) ((hld) this.a).b).get()).e((njz) this.b);
                return;
            case 1:
                hld hldVar = (hld) this.b;
                ((AtomicReference) hldVar.b).set((hjy) hldVar.a.a());
                this.a.run();
                return;
            case 2:
                int i2 = ((hmy) this.b).a;
                if (i2 != 0) {
                    Process.setThreadPriority(i2);
                }
                this.a.run();
                return;
            case 3:
                ((hro) this.a).b.d.a(5, ((hmq) this.b).a);
                return;
            case 4:
                ((hro) this.a).b.d.a(6, ((hmq) this.b).a);
                return;
            case 5:
                ((View) this.b).getViewTreeObserver().removeOnDrawListener(this.a);
                return;
            case 6:
                ((htu) this.b).a(this.a);
                return;
            case 7:
                SharedPreferences a = hxi.a((Context) this.b);
                for (Map.Entry<String, ?> entry : a.getAll().entrySet()) {
                    if (entry.getValue() instanceof String) {
                        if (entry.getValue().equals(this.a)) {
                            if (editor == null) {
                                editor = a.edit();
                            }
                            editor.remove(entry.getKey());
                        }
                    }
                }
                if (editor != null) {
                    editor.commit();
                    return;
                }
                return;
            case 8:
                if (Build.VERSION.SDK_INT >= 26) {
                    hvq hvqVar = (hvq) this.b;
                    if (!hvqVar.c.getPackageName().equals("com.android.vending")) {
                        Object obj = this.a;
                        if (!hxe.a(hvqVar.c).containsKey(obj)) {
                            Log.e("PhenotypeCombinedFlags", a.ag((String) obj, "Config package ", " cannot use PROCESS_STABLE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags."));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((hxc) this.b).d(this.a);
                return;
            case 10:
                try {
                    ivc.M(this.a);
                    return;
                } catch (Exception e) {
                    Log.w("MobStoreFlagStore", "Failed to store account on flag read for: " + ((hxc) this.b).c + " which may lead to stale flags.", e);
                    return;
                }
            case 11:
                Object obj2 = this.b;
                hzb hzbVar = (hzb) ((hyy) this.a).f.get(obj2);
                if (hzbVar == null) {
                    ((jni) ((jni) hyy.a.f()).j("com/google/android/libraries/precisionfinding/ranging/PrecisionRangingImpl", "lambda$stopPrecisionRanging$1", 460, "PrecisionRangingImpl.java")).u("Adapter not found for ranging technology when trying to stop: %s", obj2);
                    return;
                }
                ((jni) ((jni) hzb.a.e()).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter", "stop", 117, "UwbAdapter.java")).r("Stop UwbAdapter API called.");
                if (hzbVar.b.isEmpty()) {
                    ((jni) ((jni) hzb.a.g()).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter", "stop", 119, "UwbAdapter.java")).r("Tried to stop UWB but it is not available.");
                    hzbVar.a();
                    return;
                }
                synchronized (hzbVar.f) {
                    if (hzbVar.h == 1) {
                        ((jni) ((jni) hzb.a.g()).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter", "stop", 125, "UwbAdapter.java")).r("Tried to stop UWB while it is already in stopped state");
                        return;
                    } else {
                        hzbVar.b();
                        return;
                    }
                }
            case 12:
                AtomicReference atomicReference = (AtomicReference) this.a;
                ((icg) atomicReference.get()).a();
                ((ici) this.b).b.b((iay) atomicReference.get());
                return;
            case 13:
                idt idtVar = ((idz) this.b).a;
                synchronized (idtVar.j) {
                    b = idtVar.b(new icy(idtVar, i));
                    idtVar.n.a.readRemoteRssi();
                }
                Object obj3 = this.a;
                ivc.N(b, new dup(obj3, 17), ((ifg) obj3).a.f);
                return;
            case 14:
                Object obj4 = this.b;
                synchronized (((igh) this.a).c) {
                    ((igd) obj4).e(false);
                }
                return;
            case 15:
                if (this.a.isCancelled()) {
                    ((jbw) this.b).f().cancel(false);
                    return;
                }
                return;
            case 16:
                try {
                    ((ina) this.b).d.set((ta) ivc.M(this.a));
                    return;
                } catch (ExecutionException e2) {
                    throw new RuntimeException(e2);
                }
            case 17:
                if (!((AtomicBoolean) this.a).getAndSet(true)) {
                    Log.w("ARCore-InstallService", "requestInstall timed out, launching fullscreen.");
                    hlt hltVar = (hlt) this.b;
                    jcs.g((Activity) hltVar.c, (jcq) hltVar.b);
                    return;
                }
                return;
            case 18:
                ((jnu) this.a).a.remove(this.b);
                return;
            case 19:
                jck jckVar = new jck(this.a, (byte[]) null);
                jbh jbhVar = (jbh) this.b;
                ?? r2 = jbhVar.a;
                int i3 = jbn.a;
                miv f = jbu.f();
                jbe e3 = jbu.e(f, r2);
                Object obj5 = jbhVar.b;
                try {
                    Object obj6 = ((jbh) obj5).b;
                    Object obj7 = ((jbh) obj5).a;
                    jni jniVar = (jni) ((jni) igh.a.e()).j("com/google/android/libraries/spot/ble/SharedGattConnectionManagerInternal", "lambda$finishToValueAndCloser$4", 316, "SharedGattConnectionManagerInternal.java");
                    kxv kxvVar = ((kyf) obj6).b;
                    if (kxvVar == null) {
                        kxvVar = kxv.b;
                    }
                    jniVar.u("Connection established to device %s", kxvVar.a);
                    ((bmf) obj7).c(jckVar);
                    return;
                } catch (Throwable th) {
                    try {
                        jaq.a(th);
                        throw th;
                    } finally {
                        jbu.e(f, e3);
                    }
                }
            default:
                Object obj8 = this.b;
                kqz kqzVar = ((kol) obj8).b;
                ?? r22 = this.a;
                if (kqzVar == kol.a) {
                    synchronized (obj8) {
                        ((kol) obj8).b = r22;
                    }
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
        }
    }

    public /* synthetic */ hka(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ hka(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public hka(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }
}
