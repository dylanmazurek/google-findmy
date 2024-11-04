package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.WorkSource;
import com.google.android.apps.adm.integrations.spot.clientactions.ClientActionListenableWorker;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eli implements jxc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eli(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r0v125, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [jfe, java.lang.Object] */
    @Override // defpackage.jxc
    public final jyz a() {
        jyz jyzVar;
        int i = 15;
        int i2 = 9;
        byte[] bArr = null;
        int i3 = 6;
        int i4 = 0;
        switch (this.b) {
            case 0:
                return this.a;
            case 1:
                dwt dwtVar = (dwt) this.a;
                Account[] m = fej.m(dwtVar.d);
                int length = m.length;
                while (i4 < length) {
                    Account account = m[i4];
                    ((jni) ((jni) dwt.a.d().h(jop.a, "ChimeRegistrationMngr")).j("com/google/android/apps/adm/chime/ChimeAccountRegistrationManagerImpl", "lambda$registerAccountsWithChime$0", 47, "ChimeAccountRegistrationManagerImpl.java")).y("Registered account %s with result %s for FMD notifications", account.name, dwtVar.c.a(account.name));
                    i4++;
                }
                return jyv.a;
            case 2:
                Object obj = this.a;
                synchronized (((emz) obj).h) {
                    if (((emz) obj).e.g()) {
                        jyzVar = ((jbw) ((emz) obj).e.c()).f();
                        ((emz) obj).e = jdl.a;
                    } else {
                        jyzVar = jyv.a;
                    }
                }
                return jyzVar;
            case 3:
                Object obj2 = this.a;
                byte[] e = ((cqb) obj2).d().e("signed_client_action_command");
                if (e == null) {
                    ((jni) ((jni) ClientActionListenableWorker.e.f()).j("com/google/android/apps/adm/integrations/spot/clientactions/ClientActionListenableWorker", "workInternal", 101, "ClientActionListenableWorker.java")).r("Missing signed client action command in input data");
                    return ivc.E(new cpy());
                }
                try {
                    ljn m2 = ljn.m(kzt.c, e, 0, e.length, ((ClientActionListenableWorker) obj2).f);
                    ljn.A(m2);
                    kzt kztVar = (kzt) m2;
                    ihu ihuVar = ((ClientActionListenableWorker) obj2).g;
                    ihw ihwVar = ihw.a;
                    kztVar.getClass();
                    return jbx.d(iuu.t(new iht(ihuVar, kztVar, ihwVar, i4), ihuVar.c).b(ljy.class, new igw(5), jxv.a).b(Exception.class, new igw(i3), jxv.a)).e(new ene(0), jxv.a).a(Throwable.class, new ene(2), jxv.a);
                } catch (ljy e2) {
                    ((jni) ((jni) ((jni) ClientActionListenableWorker.e.f()).i(e2)).j("com/google/android/apps/adm/integrations/spot/clientactions/ClientActionListenableWorker", "workInternal", 'm', "ClientActionListenableWorker.java")).r("Failed parsing signed client action command");
                    return ivc.E(new cpy());
                }
            case 4:
                ArrayList arrayList = new ArrayList();
                fma.aG(true, "intervalMillis must be greater than or equal to 0");
                arrayList.add(new LocationRequest(102, 0L, 0L, Math.max(0L, 0L), Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 0L, 0, 0, false, new WorkSource(null), null));
                return fzo.b(((etq) this.a).n.l(new LocationSettingsRequest(arrayList, true, true)));
            case 5:
                etq etqVar = (etq) this.a;
                Account b = etqVar.d.b();
                if (b == null) {
                    return ivc.D(new NullPointerException("Account is unexpectedly null"));
                }
                GetKeychainLockScreenKnowledgeFactorSupportRequest getKeychainLockScreenKnowledgeFactorSupportRequest = new GetKeychainLockScreenKnowledgeFactorSupportRequest();
                getKeychainLockScreenKnowledgeFactorSupportRequest.a = b;
                return fzo.b(etqVar.m.q(getKeychainLockScreenKnowledgeFactorSupportRequest));
            case 6:
                ilv ilvVar = (ilv) this.a;
                jer jerVar = (jer) ilvVar.e.a();
                boolean g = jerVar.g();
                Object a = ilvVar.g.a();
                if (g) {
                    jer jerVar2 = (jer) a;
                    if (jerVar2.g()) {
                        hpq hpqVar = new hpq((File) jerVar.c(), (String) jerVar2.c());
                        int a2 = hpqVar.a();
                        hpqVar.b().delete();
                        hpqVar.b = 0;
                        hpqVar.c = true;
                        if (a2 >= ((hpr) ilvVar.d.a()).b) {
                            Object obj3 = ilvVar.c;
                            hoy a3 = hoz.a();
                            ljh k = nfe.v.k();
                            ljh k2 = nfc.d.k();
                            if (!k2.b.y()) {
                                k2.t();
                            }
                            nfc nfcVar = (nfc) k2.b;
                            nfcVar.b = 6;
                            nfcVar.a |= 1;
                            if (!k.b.y()) {
                                k.t();
                            }
                            nfe nfeVar = (nfe) k.b;
                            nfc nfcVar2 = (nfc) k2.q();
                            nfcVar2.getClass();
                            nfeVar.r = nfcVar2;
                            nfeVar.a |= 4194304;
                            a3.e((nfe) k.q());
                            return ((hpd) obj3).b(a3.a());
                        }
                        return jyv.a;
                    }
                }
                return jyv.a;
            case 7:
                hqa hqaVar = (hqa) this.a;
                if (hqaVar.m() && !hqaVar.c.getAndSet(true)) {
                    return hqaVar.o(6, (hpp) hqaVar.b.a(), ((hpr) hqaVar.e.a()).e);
                }
                return jyv.a;
            case 8:
                hqa hqaVar2 = (hqa) this.a;
                if (hqaVar2.m()) {
                    ilv ilvVar2 = hqaVar2.f;
                    if (!((AtomicBoolean) ilvVar2.b).getAndSet(false)) {
                        jyz jyzVar2 = jyv.a;
                    } else {
                        ivc.J(new eli(ilvVar2, i3), ilvVar2.a);
                    }
                }
                return jyv.a;
            case 9:
                return jyv.a;
            case 10:
                return ((hsf) this.a).c();
            case 11:
                huy huyVar = (huy) this.a;
                return huy.c(huyVar.b(huyVar.d(hvb.EMPTY_CACHE)));
            case 12:
                Object obj4 = this.a;
                huy huyVar2 = (huy) obj4;
                if (!huyVar2.e()) {
                    return ivc.E(lhg.IN_MEMORY_CACHE);
                }
                return huyVar2.b(jbx.d(iuu.o(ivc.E(jdl.a), new hkn(15), jxv.a)).b(Exception.class, new eji(obj4, 18), jxv.a).f(new eji(obj4, 19), jxv.a));
            case 13:
                ((jni) ((jni) iey.a.e()).j("com/google/android/libraries/spot/ble/MulticomponentEddystoneBleTrackerProcess$ScanTask", "lambda$maybeScheduleAllComponentsDetectionTimeout$4", 360, "MulticomponentEddystoneBleTrackerProcess.java")).r("Timeout scanning for all components");
                ((iex) this.a).b();
                return jyv.a;
            case 14:
                return ivc.F(hrb.h(((ilp) this.a).b));
            case 15:
                ilp ilpVar = (ilp) this.a;
                return ilpVar.c((Uri) ivc.M(ilpVar.b), new ilm(ilpVar, i4));
            case 16:
                Object obj5 = this.a;
                ilz ilzVar = (ilz) obj5;
                Uri uri = (Uri) ivc.M(ilzVar.b);
                try {
                    return ivc.E(((ilz) obj5).g(uri));
                } catch (IOException e3) {
                    if (!ilzVar.d.g()) {
                        return ivc.D(e3);
                    }
                    if (ilz.d(e3)) {
                        return ivc.D(e3);
                    }
                    return jwu.h(ilzVar.k.b(jbn.b(new etm(obj5, ilzVar.d.c(), i2)), ilzVar.c), jbn.c(new ibz(obj5, uri, 12, bArr)), ilzVar.c);
                }
            case 17:
                Object obj6 = this.a;
                ilz ilzVar2 = (ilz) obj6;
                return jwu.g(ivc.F(ilzVar2.b), new emc(ilzVar2.i, new ide(obj6, 9), 17, bArr), jxv.a);
            case 18:
                Object obj7 = this.a;
                jxd c = jbn.c(new ifl(obj7, 16));
                imc imcVar = (imc) obj7;
                return ivc.F(jwu.h(imcVar.a, c, imcVar.b));
            case 19:
                Object obj8 = this.a;
                imc imcVar2 = (imc) obj8;
                try {
                    return ivc.E(((imc) obj8).b((Uri) ivc.M(imcVar2.a)));
                } catch (IOException e4) {
                    ily ilyVar = new ily(obj8, 2);
                    if (!imcVar2.c.g()) {
                        return ivc.D(e4);
                    }
                    if (!(e4 instanceof ikd) && !(e4.getCause() instanceof ikd)) {
                        return jwu.h(((jck) imcVar2.c.c()).m(e4, ilyVar), jbn.c(new ifl(obj8, i)), imcVar2.b);
                    }
                    return ivc.D(e4);
                }
            default:
                return this.a;
        }
    }
}
