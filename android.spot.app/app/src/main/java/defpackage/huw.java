package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class huw implements jei {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ huw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v60, types: [mko, java.lang.Object] */
    @Override // defpackage.jei
    public final Object a(Object obj) {
        ics icsVar;
        boolean z;
        int i = 0;
        r2 = false;
        boolean z2 = false;
        boolean z3 = false;
        switch (this.b) {
            case 0:
                return this.a;
            case 1:
                huv huvVar = (huv) obj;
                ((huy) this.a).b = new hux(huvVar.a);
                return huvVar.b;
            case 2:
                hwx.a();
                return (hwy) hxa.c.get(new jes((String) obj, ((fez) this.a).i));
            case 3:
                ConcurrentMap concurrentMap = hxg.a;
                ljh k = hwv.b.k();
                for (Map.Entry entry : Collections.unmodifiableMap(((hwv) obj).a).entrySet()) {
                    Object obj2 = this.a;
                    hwt hwtVar = (hwt) entry.getValue();
                    ljh k2 = hwt.d.k();
                    if (!hwtVar.c.equals(obj2)) {
                        String str = hwtVar.c;
                        if (!k2.b.y()) {
                            k2.t();
                        }
                        hwt hwtVar2 = (hwt) k2.b;
                        str.getClass();
                        hwtVar2.a |= 1;
                        hwtVar2.c = str;
                    }
                    for (String str2 : hwtVar.b) {
                        if (!str2.equals(obj2)) {
                            k2.A(str2);
                        }
                    }
                    k.B((String) entry.getKey(), (hwt) k2.q());
                }
                return (hwv) k.q();
            case 4:
                ConcurrentMap concurrentMap2 = hxg.a;
                hwt hwtVar3 = hwt.d;
                lkl lklVar = ((hwv) obj).a;
                Object obj3 = this.a;
                if (lklVar.containsKey(obj3)) {
                    hwtVar3 = (hwt) lklVar.get(obj3);
                }
                return hwtVar3.b;
            case 5:
                ConcurrentMap concurrentMap3 = hxg.a;
                Object obj4 = this.a;
                hwt hwtVar4 = hwt.d;
                obj4.getClass();
                lkl lklVar2 = ((hwv) obj).a;
                if (lklVar2.containsKey(obj4)) {
                    hwtVar4 = (hwt) lklVar2.get(obj4);
                }
                return hwtVar4.c;
            case 6:
                return ((bqm) this.a).d();
            case 7:
                hws hwsVar = (hws) obj;
                lyn lynVar = new lyn((byte[]) null);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                Object obj5 = this.a;
                try {
                    try {
                        synchronized (hxy.a) {
                            kpb kpbVar = (kpb) ((hxy) obj5).f.a();
                            Uri uri = ((hxy) obj5).h;
                            hwq hwqVar = hwsVar.b;
                            if (hwqVar == null) {
                                hwqVar = hwq.j;
                            }
                            ikx ikxVar = new ikx(hwqVar);
                            ikxVar.a = new lyn[]{lynVar};
                            kpbVar.n(uri, ikxVar);
                            hwq hwqVar2 = hwsVar.b;
                            if (hwqVar2 == null) {
                                hwqVar2 = hwq.j;
                            }
                            ((hxy) obj5).i = hwqVar2;
                        }
                        synchronized (hxy.b) {
                            kpb kpbVar2 = (kpb) ((hxy) obj5).f.a();
                            Uri uri2 = ((hxy) obj5).j;
                            hwr hwrVar = hwsVar.c;
                            if (hwrVar == null) {
                                hwrVar = hwr.h;
                            }
                            ikx ikxVar2 = new ikx(hwrVar);
                            ikxVar2.a = new lyn[]{lynVar};
                            kpbVar2.n(uri2, ikxVar2);
                            hwr hwrVar2 = hwsVar.c;
                            if (hwrVar2 == null) {
                                hwrVar2 = hwr.h;
                            }
                            ((hxy) obj5).k = hwrVar2;
                        }
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            case 8:
                List list = (List) obj;
                jiu jiuVar = new jiu();
                while (true) {
                    hyy hyyVar = (hyy) this.a;
                    jis jisVar = hyyVar.j.a;
                    if (i < ((jmi) jisVar).c) {
                        hyh hyhVar = (hyh) jisVar.get(i);
                        hzb hzbVar = (hzb) hyyVar.f.get(hyhVar);
                        if (hzbVar == null) {
                            ((jni) ((jni) hyy.a.f()).j("com/google/android/libraries/precisionfinding/ranging/PrecisionRangingImpl", "lambda$rangingTechnologiesAvailability$3", 564, "PrecisionRangingImpl.java")).u("Adapter not found for ranging technology: %s", hyhVar);
                            jiuVar.d(hyhVar, 0);
                        } else if (!hzbVar.b.isPresent()) {
                            jiuVar.d(hyhVar, 0);
                        } else if (!((Boolean) list.get(i)).booleanValue()) {
                            jiuVar.d(hyhVar, 1);
                        } else {
                            jiuVar.d(hyhVar, 2);
                        }
                        i++;
                    } else {
                        return jiuVar.b();
                    }
                }
            case 9:
                lim limVar = (lim) obj;
                ?? r0 = this.a;
                if (r0.contains(limVar) || r0.contains(limVar.j(0, Math.min(10, limVar.d())))) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 10:
                ((icv) this.a).i = true;
                return null;
            case 11:
                lim limVar2 = (lim) obj;
                Object obj6 = this.a;
                synchronized (((icv) obj6).h) {
                    if (((icv) obj6).j.g() && ((icr) ((icv) obj6).j.c()).c.g()) {
                        z2 = true;
                    }
                    hwx.U(z2);
                    if (limVar2 != null) {
                        icsVar = new ics(limVar2, (icx) ((icr) ((icv) obj6).j.c()).c.c());
                        ((icv) obj6).j = jdl.a;
                    } else {
                        throw new NullPointerException("Null result");
                    }
                }
                return icsVar;
            case 12:
                ((idb) this.a).b();
                return obj;
            case 13:
                Object obj7 = this.a;
                synchronized (((idw) obj7).b) {
                    jni jniVar = (jni) ((jni) idw.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattConnectionKeepAliveProcess", "lambda$onGattClientConnect$2", 157, "GattConnectionKeepAliveProcess.java");
                    kxv kxvVar = ((idw) obj7).f.b;
                    if (kxvVar == null) {
                        kxvVar = kxv.b;
                    }
                    jniVar.y("GATT client disconnected for device %s (%s)", kxvVar.a, ((idw) obj7).g);
                    if (!((idw) obj7).e) {
                        ((idw) obj7).h.c();
                        ((idw) obj7).c();
                    }
                }
                return null;
            case 14:
                jnk jnkVar = iey.a;
                return new ibm(((Integer) obj).intValue(), ((ies) this.a).c);
            case 15:
                jer jerVar = (jer) obj;
                if (!jerVar.g()) {
                    return jdl.a;
                }
                Object obj8 = this.a;
                ifh ifhVar = (ifh) obj8;
                Object c = ifhVar.c.c();
                lim limVar3 = (lim) jerVar.c();
                hri hriVar = new hri((lim) jerVar.c(), ifhVar.d, ((ife) ((hnu) ifhVar.p.a).a).a());
                njz njzVar = new njz(obj8, null);
                kuv kuvVar = (kuv) ifhVar.o.a;
                return jer.i(new hyg((hya) c, limVar3, hriVar, njzVar, (hnu) ((lsi) kuvVar.b).b, (ExecutorService) kuvVar.a.a()));
            case 16:
                return Long.valueOf(((ifo) this.a).i);
            case 17:
                Object obj9 = this.a;
                synchronized (((ifo) obj9).h) {
                    z = !((ifo) obj9).k.isCancelled();
                    ((ifo) obj9).k = null;
                }
                return Boolean.valueOf(z);
            case 18:
                Long l = (Long) obj;
                ((ifo) this.a).p = SystemClock.elapsedRealtime() + l.longValue();
                return l;
            case 19:
                jnk jnkVar2 = ifo.a;
                return this.a;
            default:
                Void r13 = (Void) obj;
                ((igx) this.a).b(igq.COMPLETED_SUCCESSFULLY);
                return r13;
        }
    }
}
