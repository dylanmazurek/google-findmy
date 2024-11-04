package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.apps.adm.R;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsRequest;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etq extends cgk {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel");
    public static final jiy b = jiy.l(etn.TURN_ON_LOCATION, lnb.SHARING_APPLICATION_TURN_ON_LOCATION_RESOLVABLE_FAILURE, etn.TURN_ON_LAST_KNOWN_LOCATION, lnb.SHARING_APPLICATION_TURN_LAST_KNOWN_LOCATION_ON_RESOLVABLE_FAILURE, etn.JOIN_FIND_MY_DEVICE_NETWORK, lnb.SHARING_APPLICATION_JOIN_FIND_MY_DEVICE_NETWORK_RESOLVABLE_FAILURE);
    public static final jiy c = jiy.l(etn.TURN_ON_LOCATION, lnb.SHARING_APPLICATION_TURN_ON_LOCATION_RESOLUTION_FAILED, etn.TURN_ON_LAST_KNOWN_LOCATION, lnb.SHARING_APPLICATION_TURN_LAST_KNOWN_LOCATION_ON_RESOLUTION_FAILED, etn.JOIN_FIND_MY_DEVICE_NETWORK, lnb.SHARING_APPLICATION_JOIN_FIND_MY_DEVICE_NETWORK_RESOLUTION_FAILED);
    public final evy d;
    public final Executor e;
    public lqd g;
    public jyz j;
    public jyz k;
    public jer l;
    public final fop m;
    public final fhq n;
    private final Context o;
    private final Executor p;
    private jyz q;
    private jyz r;
    private jyz s;
    private jyz t;
    private final dxf u;
    private final dhx v;
    public final cfn f = new cfn(etp.a(etn.USE_RESPONSIBLY));
    public jer h = jdl.a;
    public final Object i = new Object();

    public etq(evy evyVar, dxf dxfVar, Context context, dhx dhxVar, fhq fhqVar, fop fopVar, Executor executor, Executor executor2) {
        jyz jyzVar = jyv.a;
        this.j = jyzVar;
        this.q = jyzVar;
        this.r = jyzVar;
        this.k = jyzVar;
        this.l = jdl.a;
        this.s = jyzVar;
        this.t = jyzVar;
        this.d = evyVar;
        this.u = dxfVar;
        this.o = context;
        this.v = dhxVar;
        this.n = fhqVar;
        this.m = fopVar;
        this.e = executor;
        this.p = executor2;
    }

    public final etp a() {
        etp etpVar = (etp) this.f.d();
        etpVar.getClass();
        return etpVar;
    }

    public final void b(eto etoVar) {
        if (a().a != etn.JOIN_FIND_MY_DEVICE_NETWORK) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "joinFindMyDeviceNetwork", 573, "SharingApplicationRequirementsViewModel.java")).u("joinFindMyDeviceNetwork called when state is unexpectedly %s", a().a);
            return;
        }
        e();
        d(lnb.SHARING_APPLICATION_JOIN_FIND_MY_DEVICE_NETWORK_REQUESTED);
        synchronized (this.i) {
            this.t = iuu.t(new etm(this, etoVar, 0), this.e).e(new eoc(this, 10), this.e).a(fhy.class, new eoc(this, 20), this.e).a(Exception.class, new eoc(this, 11), this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cgk
    public final void c() {
        synchronized (this.i) {
            this.j.cancel(false);
            this.q.cancel(false);
            this.r.cancel(false);
            this.k.cancel(false);
            this.s.cancel(false);
            this.t.cancel(false);
        }
    }

    public final void d(lnb lnbVar) {
        lqd lqdVar = this.g;
        if (lqdVar == null) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "logEvent", 766, "SharingApplicationRequirementsViewModel.java")).r("deviceIdentifier == null; skipping logging");
        } else {
            this.u.c(lnbVar, this.h, lqdVar);
        }
    }

    public final void e() {
        gji gjiVar = new gji(a());
        gjiVar.f(true);
        this.f.i(gjiVar.e());
    }

    public final void f() {
        this.v.m(R.string.sharing_application_accepting_failure);
        this.f.i(etp.b(etn.TERMINATED, etk.FAILURE));
    }

    public final void g(boolean z) {
        lnb lnbVar;
        if (z) {
            lnbVar = lnb.SHARING_APPLICATION_FIND_MY_DEVICE_SETTINGS_LAUNCHED;
        } else {
            lnbVar = lnb.SHARING_APPLICATION_FIND_MY_DEVICE_SETTINGS_FAILED_TO_LAUNCH;
        }
        d(lnbVar);
    }

    public final void h() {
        this.f.i(etp.b(etn.TERMINATED, etk.SUCCESS));
    }

    public final void i(boolean z) {
        lnb lnbVar;
        if (z) {
            lnbVar = lnb.SHARING_APPLICATION_SCREEN_LOCK_ACTIVITY_STARTED_SUCCESSFULLY;
        } else {
            lnbVar = lnb.SHARING_APPLICATION_SCREEN_LOCK_ACTIVITY_STARTED_FAILURE;
        }
        d(lnbVar);
    }

    public final void j() {
        synchronized (this.i) {
            if (!this.l.g()) {
                ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "preJoinFindMyDeviceNetwork", 558, "SharingApplicationRequirementsViewModel.java")).r("Settings response is unexpectedly missing in preJoinFindMyDeviceNetwork");
                return;
            }
            if (((GetFindMyDeviceSettingsResponse) this.l.c()).b) {
                h();
            } else {
                this.f.i(etp.a(etn.JOIN_FIND_MY_DEVICE_NETWORK));
            }
        }
    }

    public final void k() {
        e();
        d(lnb.SHARING_APPLICATION_SCREEN_LOCK_CHECK_REQUESTED);
        synchronized (this.i) {
            this.q = iuu.t(new eli(this, 5), this.e).e(new eoc(this, 15), this.e).a(Throwable.class, new eoc(this, 16), this.e);
        }
    }

    public final void l(boolean z) {
        synchronized (this.i) {
            if (!this.l.g()) {
                ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "preTurnOnFindMyDevice", 457, "SharingApplicationRequirementsViewModel.java")).r("Settings response is unexpectedly missing in preTurnOnFindMyDevice");
                return;
            }
            if (((GetFindMyDeviceSettingsResponse) this.l.c()).a) {
                if (z) {
                    d(lnb.SHARING_APPLICATION_FIND_MY_DEVICE_TURNED_ON);
                }
                if (!this.l.g()) {
                    ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "preTurnOnLastKnownLocation", 488, "SharingApplicationRequirementsViewModel.java")).r("Settings response is unexpectedly missing in preTurnOnLastKnownLocation");
                } else if (((GetFindMyDeviceSettingsResponse) this.l.c()).g) {
                    j();
                } else {
                    this.f.i(etp.a(etn.TURN_ON_LAST_KNOWN_LOCATION));
                }
            } else {
                this.f.i(etp.a(etn.TURN_ON_FIND_MY_DEVICE));
            }
        }
    }

    public final void m(buc bucVar) {
        synchronized (this.i) {
            this.l = jdl.a;
            int i = 12;
            this.r = jbx.d(fzo.b(this.m.b(new GetFindMyDeviceSettingsRequest()))).e(new emc(this, bucVar, i), this.p).a(Exception.class, new eoc(this, i), this.e);
        }
    }

    public final void n(eto etoVar) {
        if (a().a != etn.TURN_ON_LAST_KNOWN_LOCATION) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "turnOnLastKnownLocation", 502, "SharingApplicationRequirementsViewModel.java")).u("turnOnLastKnownLocation called when state is unexpectedly %s", a().a);
            return;
        }
        e();
        d(lnb.SHARING_APPLICATION_TURN_LAST_KNOWN_LOCATION_ON_REQUESTED);
        synchronized (this.i) {
            this.s = iuu.t(new etm(this, etoVar, 3), this.e).e(new eoc(this, 19), this.e).a(fhy.class, new eoc(this, 20), this.e).a(Exception.class, new eoc(this, 9), this.e);
        }
    }

    public final boolean o() {
        boolean isLocationEnabled;
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = (LocationManager) this.o.getSystemService("location");
            if (locationManager != null) {
                isLocationEnabled = locationManager.isLocationEnabled();
                if (isLocationEnabled) {
                    return true;
                }
            }
            return false;
        }
        if (Settings.Secure.getInt(this.o.getContentResolver(), "location_mode", 0) != 0) {
            return true;
        }
        return false;
    }

    public final jyz p(eto etoVar, int i) {
        String str;
        jyz E;
        int i2;
        ArrayList arrayList;
        String str2;
        int i3;
        Account b2 = this.d.b();
        if (b2 == null) {
            return ivc.D(new NullPointerException("Account is unexpectedly null"));
        }
        int i4 = 0;
        try {
            str = ivc.n(this.o.getPackageManager().getPackageInfo("com.google.android.apps.adm", 0).versionName);
        } catch (Exception unused) {
            str = "";
        }
        Context context = this.o;
        fdz fdzVar = new fdz(context);
        jis jisVar = etoVar.a;
        jis jisVar2 = etoVar.b;
        jis jisVar3 = etoVar.c;
        jis jisVar4 = etoVar.d;
        int i5 = 2;
        try {
            ljh k = kxg.h.k();
            ljh k2 = kwy.b.k();
            k2.D(jisVar);
            if (!k.b.y()) {
                k.t();
            }
            kxg kxgVar = (kxg) k.b;
            kwy kwyVar = (kwy) k2.q();
            kwyVar.getClass();
            kxgVar.b = kwyVar;
            i2 = 1;
            kxgVar.a |= 1;
            ljh k3 = kwy.b.k();
            k3.D(jisVar2);
            if (!k.b.y()) {
                k.t();
            }
            kxg kxgVar2 = (kxg) k.b;
            kwy kwyVar2 = (kwy) k3.q();
            kwyVar2.getClass();
            kxgVar2.c = kwyVar2;
            kxgVar2.a |= 2;
            ljh k4 = kwy.b.k();
            k4.D(jisVar3);
            if (!k.b.y()) {
                k.t();
            }
            kxg kxgVar3 = (kxg) k.b;
            kwy kwyVar3 = (kwy) k4.q();
            kwyVar3.getClass();
            kxgVar3.d = kwyVar3;
            kxgVar3.a |= 4;
            ljh k5 = kwy.b.k();
            k5.D(jisVar4);
            if (!k.b.y()) {
                k.t();
            }
            kxg kxgVar4 = (kxg) k.b;
            kwy kwyVar4 = (kwy) k5.q();
            kwyVar4.getClass();
            kxgVar4.e = kwyVar4;
            kxgVar4.a |= 8;
            String locale = Locale.getDefault().toString();
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            kxg kxgVar5 = (kxg) ljnVar;
            locale.getClass();
            kxgVar5.a |= 16;
            kxgVar5.f = locale;
            if (!ljnVar.y()) {
                k.t();
            }
            kxg kxgVar6 = (kxg) k.b;
            kxgVar6.a |= 32;
            kxgVar6.g = str;
            kxg kxgVar7 = (kxg) k.q();
            ljh k6 = kxh.c.k();
            if (!k6.b.y()) {
                k6.t();
            }
            kxh kxhVar = (kxh) k6.b;
            kxgVar7.getClass();
            kxhVar.b = kxgVar7;
            kxhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            kxh kxhVar2 = (kxh) k6.q();
            ljh k7 = kwz.f.k();
            ljh k8 = kxi.d.k();
            if (!k8.b.y()) {
                k8.t();
            }
            ljn ljnVar2 = k8.b;
            kxi kxiVar = (kxi) ljnVar2;
            kxiVar.b = 996;
            kxiVar.a |= 1;
            if (!ljnVar2.y()) {
                k8.t();
            }
            kxi kxiVar2 = (kxi) k8.b;
            kxhVar2.getClass();
            kxiVar2.c = kxhVar2;
            kxiVar2.a |= 8;
            if (!k7.b.y()) {
                k7.t();
            }
            kwz kwzVar = (kwz) k7.b;
            kxi kxiVar3 = (kxi) k8.q();
            kxiVar3.getClass();
            kwzVar.e = kxiVar3;
            kwzVar.a |= 8;
            ljh k9 = kxd.d.k();
            if (!k9.b.y()) {
                k9.t();
            }
            kxd kxdVar = (kxd) k9.b;
            kxdVar.b = 470;
            kxdVar.a |= 1;
            ljh k10 = kxe.c.k();
            ljh k11 = kxf.c.k();
            if (!k11.b.y()) {
                k11.t();
            }
            kxf kxfVar = (kxf) k11.b;
            kxfVar.b = i - 1;
            kxfVar.a |= 1;
            if (!k10.b.y()) {
                k10.t();
            }
            kxe kxeVar = (kxe) k10.b;
            kxf kxfVar2 = (kxf) k11.q();
            kxfVar2.getClass();
            kxeVar.b = kxfVar2;
            kxeVar.a |= ImageMetadata.LENS_APERTURE;
            if (!k9.b.y()) {
                k9.t();
            }
            kxd kxdVar2 = (kxd) k9.b;
            kxe kxeVar2 = (kxe) k10.q();
            kxeVar2.getClass();
            kxdVar2.c = kxeVar2;
            kxdVar2.a |= 2;
            if (!k7.b.y()) {
                k7.t();
            }
            kwz kwzVar2 = (kwz) k7.b;
            kxd kxdVar3 = (kxd) k9.q();
            kxdVar3.getClass();
            kwzVar2.d = kxdVar3;
            kwzVar2.a |= 4;
            try {
                String c2 = fej.c(context, b2.name);
                ljh k12 = kxc.d.k();
                ljh k13 = kxb.c.k();
                if (!k13.b.y()) {
                    k13.t();
                }
                kxb kxbVar = (kxb) k13.b;
                c2.getClass();
                kxbVar.a = 1;
                kxbVar.b = c2;
                if (!k12.b.y()) {
                    k12.t();
                }
                kxc kxcVar = (kxc) k12.b;
                kxb kxbVar2 = (kxb) k13.q();
                kxbVar2.getClass();
                kxcVar.b = kxbVar2;
                kxcVar.a |= 1;
                if (!k7.b.y()) {
                    k7.t();
                }
                kwz kwzVar3 = (kwz) k7.b;
                kxc kxcVar2 = (kxc) k12.q();
                kxcVar2.getClass();
                kwzVar3.b = kxcVar2;
                kwzVar3.a |= 1;
            } catch (fed | IOException e) {
                ((jni) ((jni) ((jni) ijg.a.g().h(flv.a, 284)).i(e)).j("com/google/android/libraries/spot/util/AuditRecordLoggerImpl", "addEntitiesToAuditRecordBuilder", (char) 227, "AuditRecordLoggerImpl.java")).r("failed to get account ID");
            }
            long a2 = fyo.a(context.getContentResolver(), "android_id", 0L);
            ljh k14 = kxc.d.k();
            ljh k15 = kxa.c.k();
            String hexString = Long.toHexString(a2);
            if (!k15.b.y()) {
                k15.t();
            }
            kxa kxaVar = (kxa) k15.b;
            hexString.getClass();
            kxaVar.a |= 1;
            kxaVar.b = hexString;
            if (!k14.b.y()) {
                k14.t();
            }
            kxc kxcVar3 = (kxc) k14.b;
            kxa kxaVar2 = (kxa) k15.q();
            kxaVar2.getClass();
            kxcVar3.c = kxaVar2;
            kxcVar3.a |= 4;
            if (!k7.b.y()) {
                k7.t();
            }
            kwz kwzVar4 = (kwz) k7.b;
            kxc kxcVar4 = (kxc) k14.q();
            kxcVar4.getClass();
            kwzVar4.c = kxcVar4;
            kwzVar4.a |= 2;
            kwz kwzVar5 = (kwz) k7.q();
            arrayList = new ArrayList();
            str2 = b2.name;
            kxi kxiVar4 = kwzVar5.e;
            if (kxiVar4 == null) {
                kxiVar4 = kxi.d;
            }
            int ae = hwx.ae(kxiVar4.b);
            if (ae == 0 || ae != 997) {
                i3 = 228;
            } else {
                i3 = 267;
            }
            arrayList.add(kwzVar5.g());
        } catch (fed | IOException e2) {
            E = ivc.E(new Status(4, e2.getMessage()));
        }
        if (!arrayList.isEmpty()) {
            LogAuditRecordsRequest logAuditRecordsRequest = new LogAuditRecordsRequest(1, i3, str2, (byte[][]) arrayList.toArray(new byte[0]), null, null);
            fjy fjyVar = new fjy();
            fjyVar.c = 6901;
            fjyVar.a = new fep(logAuditRecordsRequest, i2);
            E = fzo.b(fdzVar.h(fjyVar.a()));
            return jbx.d(E).b(Throwable.class, new etl(i4), this.e).f(new etl(i5), this.e);
        }
        throw new IllegalStateException("Must specify at least one audit record.");
    }
}
