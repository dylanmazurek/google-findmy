package defpackage;

import android.accounts.Account;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.SystemClock;
import com.google.android.gms.common.Feature;
import com.google.android.gms.findmydevice.spot.OwnersLocationReportRequest;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emt {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothProximityImpl");
    public final iat b;
    public final ilv c;
    public final hot e;
    private final Executor f;
    private final jzd g;
    private final eqk i;
    private final foh j;
    private final kuv k;
    public final dhx d = new dhx((short[]) null);
    private jer h = jdl.a;

    public emt(ilv ilvVar, kuv kuvVar, hot hotVar, iat iatVar, foh fohVar, eqk eqkVar, Executor executor, jzd jzdVar) {
        this.c = ilvVar;
        this.k = kuvVar;
        this.e = hotVar;
        this.b = iatVar;
        this.j = fohVar;
        this.i = eqkVar;
        this.f = executor;
        this.g = jzdVar;
    }

    public final void a(lqd lqdVar) {
        if (this.c.n(lqdVar) && this.c.b(lqdVar).i.g()) {
            return;
        }
        this.c.q(lqdVar, new eje(2), 1);
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [evy, java.lang.Object] */
    public final void b(final kyf kyfVar, final lqd lqdVar, final ick ickVar) {
        if (!this.c.n(lqdVar)) {
            ((jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothProximityImpl", "onDeviceInProximity", 105, "BluetoothProximityImpl.java")).r("BUG: No device state for device in proximity.");
            return;
        }
        final eiv b = this.c.b(lqdVar);
        fze fzeVar = ickVar.a;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        ScanRecord a2 = fzeVar.a();
        if (a2 == null) {
            ((jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothProximityImpl", "onDeviceInProximity", 112, "BluetoothProximityImpl.java")).r("BUG: scanRecord is null");
            return;
        }
        final byte[] serviceData = a2.getServiceData(ifs.a);
        if (serviceData == null) {
            ((jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothProximityImpl", "onDeviceInProximity", 117, "BluetoothProximityImpl.java")).r("BUG: serviceData is null");
            return;
        }
        final jjr c = ickVar.b.c();
        if (Collection.EL.stream(c).anyMatch(new Predicate() { // from class: emp
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public final /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                jer jerVar = eiv.this.a((kyh) obj).f;
                if (jerVar.g() && elapsedRealtime - ((Long) jerVar.c()).longValue() < lua.a.a().z()) {
                    return false;
                }
                return true;
            }
        })) {
            int rssi = ((ScanResult) ickVar.a.a).getRssi();
            Account b2 = this.c.c.b();
            if (b2 == null) {
                ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothProximityImpl", "uploadOwnerSighting", 206, "BluetoothProximityImpl.java")).r("Skipping uploading owner sightings since account is null");
            } else {
                OwnersLocationReportRequest ownersLocationReportRequest = new OwnersLocationReportRequest();
                ownersLocationReportRequest.a = b2;
                com.google.android.gms.findmydevice.spot.ScanResult scanResult = new com.google.android.gms.findmydevice.spot.ScanResult();
                scanResult.b = serviceData;
                scanResult.a.add(1);
                scanResult.c = rssi;
                scanResult.a.add(2);
                ownersLocationReportRequest.b = scanResult;
                foh fohVar = this.j;
                fjy fjyVar = new fjy();
                fjyVar.b = new Feature[]{fnv.b};
                fjyVar.a = new fep(ownersLocationReportRequest, 8);
                fjyVar.c = 33308;
                ivc.N(fzo.b(fma.r(fohVar.f(fjyVar.a()), TimeUnit.SECONDS)), new ems(0), jxv.a);
            }
        }
        kzc kzcVar = kyfVar.d;
        if (kzcVar == null) {
            kzcVar = kzc.c;
        }
        if (eku.k(kzcVar)) {
            kzc kzcVar2 = kyfVar.d;
            if (kzcVar2 == null) {
                kzcVar2 = kzc.c;
            }
            if (kzcVar2.b) {
                ijp.a(jbx.d(this.i.e(lqdVar, 2, true)), "Mark as found failed", new Object[0]);
            }
        }
        kuv kuvVar = this.k;
        kyq kyqVar = kyfVar.f;
        if (kyqVar == null) {
            kyqVar = kyq.g;
        }
        jbx.d(kuvVar.s(kyqVar)).f(new jxd() { // from class: emq
            @Override // defpackage.jxd
            public final jyz a(Object obj) {
                int i;
                int i2 = iji.a;
                byte[] bArr = serviceData;
                lim a3 = ifv.a(lim.t(bArr));
                lim limVar = ((iiy) obj).a;
                final ick ickVar2 = ickVar;
                Long valueOf = Long.valueOf(ickVar2.c);
                kyf kyfVar2 = kyfVar;
                long j = kyfVar2.m;
                int g = kzv.g(kyfVar2.o);
                if (g == 0) {
                    i = 1;
                } else {
                    i = g;
                }
                emt emtVar = emt.this;
                final long j2 = elapsedRealtime;
                final jjr jjrVar = c;
                lqd lqdVar2 = lqdVar;
                final ias a4 = emtVar.b.a(bArr, a3, valueOf, limVar, j, i, kyfVar2.n);
                emtVar.c.q(lqdVar2, new els() { // from class: emr
                    @Override // defpackage.els
                    public final void a(eiu eiuVar) {
                        jmw listIterator = jjr.this.listIterator();
                        while (listIterator.hasNext()) {
                            final ick ickVar3 = ickVar2;
                            final ias iasVar = a4;
                            final long j3 = j2;
                            eiuVar.c((kyh) listIterator.next(), new Consumer() { // from class: emo
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj2) {
                                    boolean isConnectable;
                                    eir eirVar = (eir) obj2;
                                    eirVar.c = jer.i(Long.valueOf(j3));
                                    eirVar.b(iasVar.a);
                                    isConnectable = ((ScanResult) ickVar3.a.a).isConnectable();
                                    eirVar.c(isConnectable);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                    }
                }, 2);
                return jyv.a;
            }
        }, this.f).i(new elj(this, lqdVar, 2), jxv.a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [jzb, java.lang.Object] */
    public final void c(long j) {
        if (this.h.g()) {
            this.h.c().cancel(false);
        }
        this.h = jer.i(this.g.schedule(new dzw(this.d, 8), j, TimeUnit.MILLISECONDS));
    }
}
