package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hxj implements jxd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hxj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [iep] */
    /* JADX WARN: Type inference failed for: r0v32, types: [iea] */
    /* JADX WARN: Type inference failed for: r0v34, types: [iel] */
    /* JADX WARN: Type inference failed for: r11v100, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r11v122, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [mko, java.lang.Object] */
    @Override // defpackage.jxd
    public final jyz a(Object obj) {
        iej iejVar;
        ifr idbVar;
        jyz E;
        switch (this.b) {
            case 0:
                return ((bqm) this.a).b((hxw) obj);
            case 1:
                hwf hwfVar = (hwf) obj;
                int i = hwfVar.a;
                if (i != 29501 && i != 29537 && i != 29538 && i != 29539 && i != 29540 && i != 29541 && i != 29542 && i != 29543) {
                    if (i == 29544) {
                        i = 29544;
                    }
                    return ivc.D(hwfVar);
                }
                hxc hxcVar = (hxc) this.a;
                boolean c = hxcVar.g.c();
                String str = "Failed to commit due to stale snapshot for " + hxcVar.c + ". Experiments may be delayed til next app start. Error code: " + i;
                if (!c) {
                    str = str.concat(". Triggering flag update.");
                }
                Log.w("MobStoreFlagStore", str);
                if (!c) {
                    hxcVar.c();
                }
                return ivc.D(hwfVar);
            case 2:
                return ((bqm) this.a).b((hxw) obj);
            case 3:
                return ivc.F((jyz) ((hxy) this.a).g.a());
            case 4:
                ((jni) ((jni) ((jni) hyg.c.g()).i((Exception) obj)).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "lambda$getUwbCapabilitiesForThisDevice$2", 415, "PrecisionFindingImpl.java")).r("Failed to get UWB address");
                ((hyg) this.a).d(1);
                return jyv.a;
            case 5:
                int i2 = iai.c;
                return ivc.E(lim.t(((kaa) kac.a(((lim) obj).A()).b(kaa.class)).a(((lim) this.a).A())));
            case 6:
                if (((icg) ((AtomicReference) this.a).get()).a) {
                    throw new ieb();
                }
                throw new ief();
            case 7:
                icv icvVar = (icv) this.a;
                return icvVar.o.f(icvVar.g);
            case 8:
                icv icvVar2 = (icv) this.a;
                return ivc.L(icvVar2.n, icvVar2.f.a, TimeUnit.MILLISECONDS, icvVar2.e);
            case 9:
                Object obj2 = this.a;
                Throwable th = (Throwable) obj;
                synchronized (((icv) obj2).h) {
                    ((icv) obj2).j = jdl.a;
                }
                if (th instanceof TimeoutException) {
                    return ivc.D(new iea("Missing or invalid notification"));
                }
                if (th instanceof iej) {
                    iej iejVar2 = (iej) th;
                    switch (iejVar2.a) {
                        case 128:
                            iejVar = new iep(iejVar2);
                            break;
                        case 129:
                            iejVar = new iea(iejVar2);
                            break;
                        case 130:
                            iejVar = new iel(iejVar2);
                            break;
                    }
                    iejVar2 = iejVar;
                    return ivc.D(iejVar2);
                }
                if (th instanceof ieq) {
                    return ivc.D(th);
                }
                return ivc.D(new ieh(th));
            case 10:
                final icv icvVar3 = (icv) this.a;
                return icvVar3.o.g(icvVar3.g, new idd() { // from class: icp
                    @Override // defpackage.idd
                    public final void a(BluetoothGattCharacteristic bluetoothGattCharacteristic, lim limVar) {
                        boolean z;
                        boolean z2;
                        icr icrVar;
                        boolean z3;
                        icv icvVar4 = icv.this;
                        byte b = 0;
                        if (bluetoothGattCharacteristic == icvVar4.g) {
                            z = true;
                        } else {
                            z = false;
                        }
                        hwx.J(z);
                        if (limVar.d() < 2) {
                            ((jni) ((jni) icv.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/FastPairEddystoneHelper", "handleNotification", 513, "FastPairEddystoneHelper.java")).u("Ignoring invalid notification %s", limVar);
                            return;
                        }
                        byte a = limVar.a(0);
                        if (a >= 0 && a < ico.values().length) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        hwx.J(z2);
                        ico icoVar = ico.values()[a];
                        byte a2 = limVar.a(1);
                        lim w = limVar.w(2);
                        if (icv.c.contains(icoVar)) {
                            synchronized (icvVar4.h) {
                                icrVar = (icr) icvVar4.k.get(icoVar);
                            }
                            if (icrVar != null && icrVar.c.g() && icrVar.d.g()) {
                                lim d = icv.d(icoVar, icrVar.b, a2, w, (lim) icrVar.d.c(), (icx) icrVar.c.c());
                                if (d != null && icvVar4.i) {
                                    hwx.U(icvVar4.f.b.g());
                                    Object c2 = icvVar4.f.b.c();
                                    if (icoVar.o == ico.RING.o) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    hwx.J(z3);
                                    synchronized (((idb) ((njz) c2).a).e) {
                                        byte a3 = d.a(0);
                                        if (a3 == 1) {
                                            if (((idb) ((njz) c2).a).f.g()) {
                                                ((bmf) ((idb) ((njz) c2).a).f.c()).d(new iem());
                                                return;
                                            }
                                        } else {
                                            if (a3 != 0 && a3 != 4) {
                                                if (((idb) ((njz) c2).a).h.g()) {
                                                    if (a3 == 3) {
                                                        ((njz) ((idb) ((njz) c2).a).h.c()).l();
                                                    } else if (a3 == 2) {
                                                        ((njz) ((idb) ((njz) c2).a).h.c()).l();
                                                    } else {
                                                        ((jni) ((jni) idb.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/FastPairEddystoneRingingClient$Subscriber", "notify", 300, "FastPairEddystoneRingingClient.java")).G(a3);
                                                    }
                                                }
                                            }
                                            if (((idb) ((njz) c2).a).f.g()) {
                                                if (a3 == 0) {
                                                    if (d.d() < 4) {
                                                        ((jni) ((jni) idb.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/FastPairEddystoneRingingClient", "validateRingingStartedNotification", 310, "FastPairEddystoneRingingClient.java")).s("Invalid data size for ringing started notification: %d", d.d());
                                                    } else if (d.a(2) == 0 && d.a(3) == 0) {
                                                        ((jni) ((jni) idb.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/FastPairEddystoneRingingClient", "validateRingingStartedNotification", 315, "FastPairEddystoneRingingClient.java")).r("Remaining time is zero in ringing started notification");
                                                    }
                                                    ((bmf) ((idb) ((njz) c2).a).f.c()).d(new iea("Invalid `ringing started` notification data"));
                                                }
                                                Object obj3 = ((njz) c2).a;
                                                if (true != ((idb) obj3).g) {
                                                    b = 4;
                                                }
                                                if (a3 == b) {
                                                    ((bmf) ((idb) obj3).f.c()).c(d);
                                                } else {
                                                    ((bmf) ((idb) obj3).f.c()).d(new iea("Unexpected ringing state"));
                                                }
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                }
                                return;
                            }
                            ((jni) ((jni) icv.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/FastPairEddystoneHelper", "handleAsyncNotification", 573, "FastPairEddystoneHelper.java")).u("Ignoring unexpected notification for dataId %s", icoVar);
                            return;
                        }
                        synchronized (icvVar4.h) {
                            if (icvVar4.j.g() && ((icr) icvVar4.j.c()).c.g() && ((icr) icvVar4.j.c()).d.g()) {
                                if (icvVar4.n.isDone()) {
                                    ((jni) ((jni) icv.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/FastPairEddystoneHelper", "handleSyncNotification", 608, "FastPairEddystoneHelper.java")).u("Ignoring extra notification for dataId %s ", icoVar);
                                    return;
                                }
                                if (icoVar != ((icr) icvVar4.j.c()).a) {
                                    icvVar4.m.d(new iea("Mismatching notification data id " + String.valueOf(icoVar) + ", expected " + String.valueOf(((icr) icvVar4.j.c()).a)));
                                    return;
                                }
                                if (a2 != w.d()) {
                                    icvVar4.m.d(new iea("Mismatching notification data length " + ((int) a2) + ", actual data size " + w.d()));
                                    return;
                                }
                                lim d2 = icv.d(icoVar, ((icr) icvVar4.j.c()).b, a2, w, (lim) ((icr) icvVar4.j.c()).d.c(), (icx) ((icr) icvVar4.j.c()).c.c());
                                if (d2 == null) {
                                    icvVar4.m.d(new iea("Mismatching authentication data"));
                                    return;
                                } else {
                                    icvVar4.m.c(d2);
                                    return;
                                }
                            }
                            ((jni) ((jni) icv.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/FastPairEddystoneHelper", "handleSyncNotification", 603, "FastPairEddystoneHelper.java")).u("Ignoring notification for dataId %s", icoVar);
                        }
                    }
                });
            case 11:
                Object obj3 = this.a;
                Throwable th2 = (Throwable) obj;
                synchronized (((icv) obj3).h) {
                    ((icv) obj3).l = jdl.a;
                }
                return ivc.D(th2);
            case 12:
                ((idb) this.a).b();
                return ivc.D(new iem((TimeoutException) obj));
            case 13:
                ((jni) ((jni) idt.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl", "connect", 518, "GattClientImpl.java")).r("Trying to create a new connection");
                Object obj4 = this.a;
                idt idtVar = (idt) obj4;
                jyz b = idtVar.b(new icy(obj4, 4));
                iuu.q(b, new dup(obj4, 16), idtVar.d);
                return b;
            case 14:
                return iuu.k(new idh(0), 500L, TimeUnit.MILLISECONDS, ((idt) this.a).d);
            case 15:
                idz idzVar = (idz) obj;
                jni jniVar = (jni) ((jni) idw.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattConnectionKeepAliveProcess", "lambda$establishNewConnection$0", 122, "GattConnectionKeepAliveProcess.java");
                Object obj5 = this.a;
                idw idwVar = (idw) obj5;
                kxv kxvVar = idwVar.f.b;
                if (kxvVar == null) {
                    kxvVar = kxv.b;
                }
                jniVar.y("Successfully established a connection to %s (%s) ", kxvVar.a, idwVar.g);
                idwVar.h.b(idzVar);
                synchronized (idwVar.b) {
                    ((idw) obj5).c = jwu.g(idzVar.a(), new huw(obj5, 13), ((idw) obj5).i);
                }
                return ivc.E(idzVar);
            case 16:
                Throwable th3 = (Throwable) obj;
                boolean z = th3 instanceof ief;
                Object obj6 = this.a;
                if (z) {
                    ((jni) ((jni) idw.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattConnectionKeepAliveProcess", "lambda$establishNewConnection$1", 135, "GattConnectionKeepAliveProcess.java")).r("Scan timed out, retrying.");
                } else {
                    jni jniVar2 = (jni) ((jni) ((jni) idw.a.g().h(flv.a, 284)).i(th3)).j("com/google/android/libraries/spot/ble/GattConnectionKeepAliveProcess", "lambda$establishNewConnection$1", 137, "GattConnectionKeepAliveProcess.java");
                    idw idwVar2 = (idw) obj6;
                    kxv kxvVar2 = idwVar2.f.b;
                    if (kxvVar2 == null) {
                        kxvVar2 = kxv.b;
                    }
                    jniVar2.y("Error establishing a persistent connection to %s (%s)", kxvVar2.a, idwVar2.g);
                }
                ((idw) obj6).c();
                return ivc.E(null);
            case 17:
                return ((iey) this.a).f;
            case 18:
                return this.a;
            case 19:
                ifh ifhVar = (ifh) this.a;
                ifhVar.j = (jer) obj;
                ifhVar.b();
                return jyv.a;
            default:
                idt idtVar2 = ((ibu) obj).b;
                boolean i3 = hqk.i(ibs.h(idtVar2), "a3c87601-0005-1000-8000-001a11000100");
                Object obj7 = this.a;
                ifo ifoVar = (ifo) obj7;
                kuv kuvVar = ifoVar.q;
                ibl iblVar = ifoVar.g;
                if (i3) {
                    kuv kuvVar2 = (kuv) kuvVar.a;
                    ((fma) kuvVar2.a.a()).getClass();
                    jzd jzdVar = (jzd) kuvVar2.b.a();
                    jzdVar.getClass();
                    idbVar = new ibs(jzdVar, idtVar2, iblVar);
                } else if (idb.d(idtVar2)) {
                    ktn ktnVar = (ktn) kuvVar.b;
                    ((fma) ktnVar.d.a()).getClass();
                    jzd jzdVar2 = (jzd) ktnVar.a.a();
                    jzdVar2.getClass();
                    idbVar = new idb(jzdVar2, ((icw) ktnVar.c).a(), ((ifb) ktnVar.b).a(), idtVar2, iblVar);
                } else {
                    throw new iek("The connected device does not support ringing.");
                }
                synchronized (ifoVar.h) {
                    if (idbVar.f() && ((ifo) obj7).j == ifj.RINGING) {
                        ((ifo) obj7).o = true;
                    }
                }
                if (idbVar.e()) {
                    E = iuu.o(idbVar.i(new njz(obj7)), new huw(idbVar, 19), ifoVar.f);
                } else {
                    E = ivc.E(idbVar);
                }
                return iuu.p(E, new ifl(obj7, 2), ifoVar.f);
        }
    }
}
