package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ejc implements jxd {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ejc(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v159, types: [java.lang.Object, jei] */
    /* JADX WARN: Type inference failed for: r0v163, types: [java.lang.Object, jei] */
    /* JADX WARN: Type inference failed for: r15v63, types: [java.lang.Object, ihn] */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.lang.Object, jei] */
    @Override // defpackage.jxd
    public final jyz a(Object obj) {
        lpl lplVar;
        kyt kytVar;
        jer i;
        jer i2;
        fxs n;
        jyz b;
        kxt kxtVar;
        lqu lquVar;
        jyz a;
        int i3 = 9;
        int i4 = 8;
        int i5 = 1;
        switch (this.c) {
            case 0:
                ejg ejgVar = (ejg) this.a;
                eim eimVar = ejgVar.g;
                synchronized (eimVar.b) {
                    jer a2 = eimVar.a();
                    if (a2.g() && (((Integer) a2.c()).intValue() == 2 || ((Integer) a2.c()).intValue() == 1)) {
                        ljh k = lpl.d.k();
                        if (((Integer) a2.c()).intValue() == 2) {
                            kytVar = kyt.FMDN_ALL_LOCATIONS;
                        } else {
                            kytVar = kyt.FMDN_HIGH_TRAFFIC;
                        }
                        if (!k.b.y()) {
                            k.t();
                        }
                        ((lpl) k.b).c = kytVar.a();
                        lln d = lmi.d(((GetFindMyDeviceSettingsResponse) eimVar.c.c()).f);
                        if (!k.b.y()) {
                            k.t();
                        }
                        lpl lplVar2 = (lpl) k.b;
                        d.getClass();
                        lplVar2.b = d;
                        lplVar2.a |= 1;
                        lplVar = (lpl) k.q();
                    } else {
                        ljh k2 = lpl.d.k();
                        kyt kytVar2 = kyt.FMDN_DISABLED_DEFAULT;
                        if (!k2.b.y()) {
                            k2.t();
                        }
                        ((lpl) k2.b).c = kytVar2.a();
                        lplVar = (lpl) k2.q();
                    }
                }
                lqd lqdVar = (lqd) this.b;
                if (!ejgVar.i(lqdVar)) {
                    ljh k3 = lpo.c.k();
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    lpo lpoVar = (lpo) k3.b;
                    lplVar.getClass();
                    lpoVar.b = lplVar;
                    lpoVar.a = 30;
                    lpo lpoVar2 = (lpo) k3.q();
                    dvt dvtVar = ejgVar.c;
                    ilv ilvVar = ejgVar.n;
                    String b2 = dvtVar.b();
                    ilvVar.q(lqdVar, new emh(b2, i5), 3);
                    ejgVar.c.d(lqdVar, lpoVar2, b2, lua.a.a().k());
                    ejgVar.m.d(lnb.LOCATE_REMOTE_INSTRUCTION_ISSUED, jdl.a, lqdVar, b2);
                }
                return jyv.a;
            case 1:
                ehk ehkVar = (ehk) this.a;
                if (ehkVar.c.g()) {
                    kyf kyfVar = ehkVar.d.a(ehkVar.a()).b;
                    if (kyfVar == null) {
                        kyfVar = kyf.r;
                    }
                    kyl kylVar = kyfVar.c;
                    if (kylVar == null) {
                        kylVar = kyl.j;
                    }
                    kxz kxzVar = kylVar.h;
                    if (kxzVar == null) {
                        kxzVar = kxz.d;
                    }
                    if (((kxz) ehkVar.c.c()).a.equals(kxzVar.a)) {
                        i = jdl.a;
                    } else {
                        i = jer.i(((kxz) ehkVar.c.c()).a);
                    }
                    if (((kxz) ehkVar.c.c()).b.equals(kxzVar.b)) {
                        i2 = jdl.a;
                    } else {
                        i2 = jer.i(((kxz) ehkVar.c.c()).b);
                    }
                    if (i.g() || i2.g()) {
                        return ehkVar.g.b((lqd) this.b, jdl.a, i, i2);
                    }
                }
                return jyv.a;
            case 2:
                Integer num = (Integer) obj;
                Object obj2 = this.a;
                ejo ejoVar = (ejo) obj2;
                synchronized (ejoVar.d) {
                    ((ejo) obj2).c = jer.i(num);
                }
                return ((gok) this.b).A(ejoVar.k.v(num.intValue()));
            case 3:
                ftc ftcVar = new ftc(((lim) ((iiy) obj).b.c()).A());
                Object obj3 = this.b;
                fma.aR(obj3);
                fjy fjyVar = new fjy();
                fjyVar.a = new fpx((Object) ftcVar, (String) obj3, 4);
                fjyVar.b = new Feature[]{ftb.a};
                fjyVar.c = 1351;
                return fzo.b(((elk) this.a).f.h(fjyVar.a()));
            case 4:
                Object obj4 = this.b;
                Object obj5 = ((eme) obj4).b;
                Object obj6 = this.a;
                synchronized (obj5) {
                    try {
                        n = fma.o(fej.a((Context) ((eme) obj4).e.a, ((emd) obj6).a, ((emd) obj6).b, new Bundle()));
                    } catch (fed | IOException e) {
                        n = fma.n(e);
                    }
                    b = fzo.b(n);
                }
                return b;
            case 5:
                return fzo.b(((emx) this.a).l.l((LocationSettingsRequest) this.b));
            case 6:
                if (((enc) obj) == enc.SUCCESS) {
                    kxx kxxVar = (kxx) this.b;
                    if (kxxVar.a == 12) {
                        kxtVar = (kxt) kxxVar.b;
                    } else {
                        kxtVar = kxt.f;
                    }
                    kyf kyfVar2 = kxtVar.a;
                    if (kyfVar2 == null) {
                        kyfVar2 = kyf.r;
                    }
                    kxv kxvVar = kyfVar2.b;
                    if (kxvVar == null) {
                        kxvVar = kxv.b;
                    }
                    kxy kxyVar = ihp.a;
                    ljh k4 = kxy.f.k();
                    if (!k4.b.y()) {
                        k4.t();
                    }
                    ljn ljnVar = k4.b;
                    ((kxy) ljnVar).c = hwx.ac(2);
                    if (!ljnVar.y()) {
                        k4.t();
                    }
                    ((kxy) k4.b).e = true;
                    ljh k5 = kxu.c.k();
                    if (!k5.b.y()) {
                        k5.t();
                    }
                    kxu kxuVar = (kxu) k5.b;
                    kxvVar.getClass();
                    kxuVar.b = kxvVar;
                    kxuVar.a |= 1;
                    if (!k4.b.y()) {
                        k4.t();
                    }
                    ?? r15 = this.a;
                    kxy kxyVar2 = (kxy) k4.b;
                    kxu kxuVar2 = (kxu) k5.q();
                    kxuVar2.getClass();
                    kxyVar2.b = kxuVar2;
                    kxyVar2.a = 8;
                    return r15.a((kxy) k4.q());
                }
                return jyv.a;
            case 7:
                ((enk) this.a).e.c(lnb.SHARING_FINALIZATION_FAILURE, jdl.a, (lqd) this.b);
                return ivc.D((Throwable) obj);
            case 8:
                return ((eno) this.a).a((String) this.b, (Account[]) obj, 0);
            case 9:
                kyf kyfVar3 = (kyf) this.b;
                kyl kylVar2 = kyfVar3.c;
                if (kylVar2 == null) {
                    kylVar2 = kyl.j;
                }
                int ab = hwx.ab(kylVar2.g);
                if (ab != 0) {
                    i5 = ab;
                }
                if (!hqk.e(i5)) {
                    ((jni) ((jni) eow.a.c().h(jop.a, "EraseDeviceHandler")).j("com/google/android/apps/adm/integrations/spot/erase/EraseDeviceHandlerImpl", "deleteFromFastPair", 233, "EraseDeviceHandlerImpl.java")).r("Not removing device from FastPair since it is not a locator tag");
                    return jyv.a;
                }
                kyq kyqVar = kyfVar3.f;
                if (kyqVar == null) {
                    kyqVar = kyq.g;
                }
                if (kyqVar.e.z()) {
                    ((jni) ((jni) eow.a.g().h(jop.a, "EraseDeviceHandler")).j("com/google/android/apps/adm/integrations/spot/erase/EraseDeviceHandlerImpl", "deleteFromFastPair", 237, "EraseDeviceHandlerImpl.java")).r("Not removing device from FastPair since it has no account key");
                    return jyv.a;
                }
                Object obj7 = this.a;
                ((jni) ((jni) eow.a.c().h(jop.a, "EraseDeviceHandler")).j("com/google/android/apps/adm/integrations/spot/erase/EraseDeviceHandlerImpl", "deleteFromFastPair", 241, "EraseDeviceHandlerImpl.java")).r("Removing device from FastPair");
                kyq kyqVar2 = kyfVar3.f;
                if (kyqVar2 == null) {
                    kyqVar2 = kyq.g;
                }
                eow eowVar = (eow) obj7;
                return jbx.d(eowVar.g.s(kyqVar2)).f(new eji(obj7, 6), eowVar.d).a(Throwable.class, new ene(7), jxv.a);
            case 10:
                Object obj8 = this.a;
                etb etbVar = (etb) obj8;
                Object obj9 = etbVar.e;
                Object obj10 = this.b;
                synchronized (obj9) {
                    ((etb) obj8).f.put(obj10, new etd(3, jdl.a));
                }
                ihk ihkVar = etbVar.h;
                lqd lqdVar2 = (lqd) obj10;
                if (lqdVar2.a == 3) {
                    lquVar = (lqu) lqdVar2.b;
                } else {
                    lquVar = lqu.c;
                }
                kxv kxvVar2 = lquVar.b;
                if (kxvVar2 == null) {
                    kxvVar2 = kxv.b;
                }
                return ihkVar.c(kxvVar2);
            case 11:
                Object obj11 = this.a;
                lnb lnbVar = lnb.SHARING_PENDING_CALCULATING_VALIDATION_CODE_UNAVAILABLE_BECAUSE_ALREADY_APPROVED;
                jdl jdlVar = jdl.a;
                etb etbVar2 = (etb) obj11;
                dxf dxfVar = etbVar2.g;
                Object obj12 = this.b;
                lqd lqdVar3 = (lqd) obj12;
                dxfVar.c(lnbVar, jdlVar, lqdVar3);
                ((jni) ((jni) etb.a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/PendingDevicesSharingValidationCodeStateImpl", "finalizeApprovedSharingApplication", 217, "PendingDevicesSharingValidationCodeStateImpl.java")).r("Pending device is already approved, finalizing now");
                etbVar2.g.c(lnb.SHARING_FINALIZATION_START, jdl.a, lqdVar3);
                ewg ewgVar = etbVar2.b;
                ewgVar.getClass();
                byte[] bArr = null;
                jbx a3 = iuu.s(new eta(ewgVar, 0), etbVar2.d).f(new ejc(obj11, obj12, 10), etbVar2.c).e(new emc(obj11, obj12, i4, bArr), etbVar2.d).a(Throwable.class, new emc(obj11, obj12, i3, bArr), etbVar2.c);
                ewg ewgVar2 = etbVar2.b;
                ewgVar2.getClass();
                a3.c(new eta(ewgVar2, 2), etbVar2.d);
                return a3;
            case 12:
                fhy fhyVar = (fhy) obj;
                if (fhyVar.b() == null) {
                    return ivc.D(fhyVar);
                }
                Object obj13 = this.a;
                Object obj14 = this.b;
                ((jni) ((jni) ((jni) etu.a.g()).i(fhyVar)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "lambda$applyToShareDevice$1", (char) 227, "SharingApplicationViewModel.java")).r("Manual ower key sync is required");
                etu etuVar = (etu) obj14;
                etuVar.d(lnb.SHARING_APPLICATION_FAILURE_SYNC_OWNER_KEY_REQUIRED);
                etuVar.c.i(new ets(5, jer.i(obj13), jer.i(fhyVar.b())));
                return jyv.a;
            case 13:
                ihd ihdVar = (ihd) obj;
                ljh k6 = lmu.i.k();
                euf eufVar = (euf) this.a;
                lmy f = eufVar.f.f(ihdVar);
                if (!k6.b.y()) {
                    k6.t();
                }
                Object obj15 = this.b;
                lmu lmuVar = (lmu) k6.b;
                f.getClass();
                lmuVar.f = f;
                lmuVar.a |= 16;
                AtomicReference atomicReference = (AtomicReference) obj15;
                atomicReference.set(jer.i((lmu) k6.q()));
                eufVar.e.c(lnb.SHARING_INVITATION_GENERATING_LINK, (jer) atomicReference.get(), eufVar.d);
                bym bymVar = eufVar.g;
                Uri parse = Uri.parse(String.format("https://google.com/android/find/device/2?sharingInvitation=token#%s", jtf.e.k(ihdVar.a.A())));
                Bundle bundle = new Bundle();
                kpb kpbVar = (kpb) bymVar.a;
                bundle.putString("apiKey", ((knh) kpbVar.c).d().a);
                Bundle bundle2 = new Bundle();
                bundle.putBundle("parameters", bundle2);
                bundle2.putParcelable("link", parse);
                if ("https://findmydevice.app.google/".matches("(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$") || "https://findmydevice.app.google/".matches("(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$")) {
                    bundle.putString("domain", "https://findmydevice.app.google/".replace("https://", ""));
                }
                bundle.putString("domainUriPrefix", "https://findmydevice.app.google/");
                knh.b();
                Bundle bundle3 = new Bundle();
                bundle3.putString("apn", knh.b().a().getPackageName());
                bundle2.putAll(bundle3);
                if (bundle.getString("apiKey") != null) {
                    Uri uri = (Uri) bundle.getParcelable("dynamicLink");
                    if (TextUtils.isEmpty(bundle.getString("domainUriPrefix")) && uri == null) {
                        throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
                    }
                    return iuu.o(fzo.b(((fhq) kpbVar.a).h(new kph(bundle))), new ene(i3), jxv.a);
                }
                throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
            case 14:
                gay gayVar = (gay) obj;
                int i6 = gayVar.b;
                Object obj16 = this.b;
                if (i6 == 1) {
                    a = ivc.E(true);
                } else {
                    gbj gbjVar = (gbj) obj16;
                    huj hujVar = gbjVar.d;
                    if (hujVar == null) {
                        synchronized (obj16) {
                            hujVar = ((gbj) obj16).d;
                            if (hujVar == null) {
                                hujVar = new huj();
                                ((gbj) obj16).d = hujVar;
                            }
                        }
                    }
                    a = hujVar.a(gbjVar.a, ((grn) gbjVar.c).b().booleanValue(), true);
                }
                gbj gbjVar2 = (gbj) obj16;
                return jwu.h(a, new gfl(gbjVar2, (gbi) this.a, gayVar, i5), gbjVar2.b);
            case 15:
                gfs gfsVar = (gfs) obj;
                lwi a4 = lwh.a.a();
                gfn gfnVar = (gfn) this.a;
                if (a4.c(gfnVar.c) && ((kxq) this.b).a.size() > 0) {
                    kxq kxqVar = gfsVar.a;
                    if (kxqVar == null) {
                        kxqVar = kxq.b;
                    }
                    if (kxqVar.a.size() == 0) {
                        hjq hjqVar = gfnVar.d;
                        ((ilk) ((hpd) hjqVar.b).h).b((Uri) hjqVar.a);
                        return gfnVar.g.x();
                    }
                }
                return ivc.E(gfsVar);
            case 16:
                hjy hjyVar = (hjy) obj;
                ((AtomicReference) ((hld) this.a).b).set(hjyVar);
                return (jyz) this.b.a(hjyVar);
            case 17:
                final List list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    Object obj17 = this.a;
                    if (it.hasNext()) {
                        arrayList.add((jyz) this.b.a(((hpd) ((ktn) obj17).d).d((Account) it.next())));
                    } else {
                        final ktn ktnVar = (ktn) obj17;
                        return iuu.D(arrayList).f(new Callable() { // from class: hkp
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                String str;
                                hri hriVar;
                                kxq kxqVar2;
                                int i7;
                                int i8;
                                String str2;
                                String str3;
                                List list2 = list;
                                int size = list2.size();
                                jin j = jis.j(size);
                                ktn ktnVar2 = ktn.this;
                                boolean z = false;
                                for (int i9 = 0; i9 < size; i9++) {
                                    List list3 = arrayList;
                                    hjv a5 = hjw.a();
                                    a5.b(((Account) list2.get(i9)).name);
                                    jyz jyzVar = (jyz) list3.get(i9);
                                    hwx.U(jyzVar.isDone());
                                    String str4 = "OK";
                                    try {
                                        try {
                                            kxqVar2 = (kxq) jyr.b(jyzVar, MdiOwnersLoader$MdiException.class);
                                        } catch (MdiOwnersLoader$MdiException e2) {
                                            e = e2;
                                        } catch (jzu e3) {
                                            e = e3;
                                        }
                                        if (kxqVar2 == null) {
                                            str4 = "Absent";
                                            a5.d(z);
                                            Object obj18 = ktnVar2.a;
                                            str = (String) ktnVar2.b;
                                            hriVar = (hri) obj18;
                                        } else if (kxqVar2.a.size() <= 0) {
                                            Log.w("OneGoogle", "GetPeopleResponse contains no persons");
                                            ((hri) ktnVar2.a).g("NoPerson", (String) ktnVar2.b);
                                            j.h(a5.a());
                                        } else {
                                            jaa jaaVar = ((kxr) kxqVar2.a.get(z ? 1 : 0)).a;
                                            if (jaaVar == null) {
                                                jaaVar = jaa.e;
                                            }
                                            if (jaaVar.a.size() > 0) {
                                                try {
                                                    jae jaeVar = (jae) jaaVar.a.get(z ? 1 : 0);
                                                    a5.d = jaeVar.a;
                                                    a5.c(new ljt(jaeVar.b, jae.c).contains(jac.GOOGLE_ONE_USER));
                                                    if (true != new ljt(jaeVar.b, jae.c).contains(jac.GOOGLE_FAMILY_CHILD_USER)) {
                                                        i7 = 3;
                                                    } else {
                                                        i7 = 2;
                                                    }
                                                    a5.h = i7;
                                                    if (true != new ljt(jaeVar.b, jae.c).contains(jac.GOOGLE_APPS_USER)) {
                                                        i8 = 3;
                                                    } else {
                                                        i8 = 2;
                                                    }
                                                    a5.e(i8);
                                                } catch (MdiOwnersLoader$MdiException | jzu e4) {
                                                    e = e4;
                                                    z = false;
                                                    Throwable cause = e.getCause();
                                                    str4 = hog.S(cause);
                                                    fhn fhnVar = (fhn) hog.T(cause, fhn.class);
                                                    if (fhnVar != null) {
                                                        int a6 = fhnVar.a();
                                                        str4 = a.ae(a6, "ApiException-");
                                                        if (a6 != 17) {
                                                            if (a6 == 10) {
                                                                throw new ExecutionException(new MdiNotAvailableException$DeveloperErrorException(cause));
                                                            }
                                                        } else {
                                                            throw new ExecutionException(new MdiNotAvailableException$ApiNotConnectedException(cause));
                                                        }
                                                    }
                                                    Log.w("OneGoogle", "Failed to load profile data", e);
                                                    Object obj19 = ktnVar2.a;
                                                    str = (String) ktnVar2.b;
                                                    hriVar = (hri) obj19;
                                                    hriVar.g(str4, str);
                                                    j.h(a5.a());
                                                }
                                            }
                                            if (jaaVar.b.size() > 0) {
                                                izz izzVar = (izz) jaaVar.b.get(0);
                                                int i10 = izzVar.a;
                                                String str5 = null;
                                                if ((i10 & 2) != 0) {
                                                    str2 = izzVar.b;
                                                } else {
                                                    str2 = null;
                                                }
                                                a5.a = str2;
                                                if ((i10 & 64) != 0) {
                                                    str3 = izzVar.c;
                                                } else {
                                                    str3 = null;
                                                }
                                                a5.b = str3;
                                                if ((i10 & 128) != 0) {
                                                    str5 = izzVar.d;
                                                }
                                                a5.c = str5;
                                            }
                                            jad f2 = fzo.f(kxqVar2);
                                            if (f2 != null) {
                                                if (f2.d) {
                                                    a5.f = f2.c;
                                                } else {
                                                    a5.e = f2.c;
                                                }
                                            }
                                            if (jaaVar.d.size() != 1) {
                                                z = false;
                                            } else {
                                                z = false;
                                                z = false;
                                                z = false;
                                                z = false;
                                                int a7 = izx.a(((izy) jaaVar.d.get(0)).a);
                                                if (a7 != 0 && a7 != 1) {
                                                    if (a7 != 2) {
                                                        if (a7 != 4) {
                                                            a5.g = 4;
                                                        } else {
                                                            a5.g = 3;
                                                        }
                                                    } else {
                                                        a5.g = 2;
                                                    }
                                                }
                                                a5.g = 1;
                                            }
                                            Object obj20 = ktnVar2.a;
                                            str = (String) ktnVar2.b;
                                            hriVar = (hri) obj20;
                                        }
                                        hriVar.g(str4, str);
                                        j.h(a5.a());
                                    } catch (Throwable th) {
                                        ((hri) ktnVar2.a).g("OK", (String) ktnVar2.b);
                                        throw th;
                                    }
                                }
                                return j.g();
                            }
                        }, jxv.a);
                    }
                }
            case 18:
                hks hksVar = (hks) this.a;
                hksVar.g((hkm) obj);
                return (jyz) this.b.a(hksVar.a);
            case 19:
                hue hueVar = (hue) obj;
                ljh ljhVar = (ljh) hueVar.z(5);
                ljhVar.w(hueVar);
                ljj ljjVar = (ljj) ljhVar;
                if (!ljjVar.b.y()) {
                    ljjVar.t();
                }
                Object obj18 = this.a;
                Object obj19 = this.b;
                hue hueVar2 = (hue) ljjVar.b;
                hue hueVar3 = hue.c;
                obj19.getClass();
                hueVar2.b = (nfe) obj19;
                hueVar2.a |= 1;
                bqm bqmVar = (bqm) obj18;
                return ((ClearcutMetricSnapshotTransmitter) bqmVar.b).a((Context) bqmVar.d, (hue) ljjVar.q());
            default:
                ConcurrentMap concurrentMap = hxg.a;
                jin jinVar = new jin();
                hvq hvqVar = (hvq) this.a;
                jinVar.h(hvqVar.c);
                if (a.g()) {
                    jinVar.h(gad.a(hvqVar.c));
                }
                jis g = jinVar.g();
                int i7 = ((jmi) g).c;
                for (int i8 = 0; i8 < i7; i8++) {
                    Object obj20 = this.b;
                    File file = new File(String.valueOf(((Context) g.get(i8)).getFilesDir()) + "/phenotype/shared/" + ((String) obj20));
                    if (file.exists()) {
                        i5 = hxg.a(file) ? 1 : 0;
                    }
                }
                if (i5 != 0) {
                    return jyv.a;
                }
                return ivc.D(new IOException("Unable to remove snapshots for removed user"));
        }
    }

    public /* synthetic */ ejc(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
