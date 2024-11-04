package defpackage;

import android.content.IntentSender;
import com.google.android.gms.common.Feature;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eji implements jxd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eji(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r0v58, types: [haz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v67, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v68, types: [java.lang.Object, jyz] */
    @Override // defpackage.jxd
    public final jyz a(Object obj) {
        boolean z = false;
        switch (this.b) {
            case 0:
                lim limVar = (lim) obj;
                ljh k = lah.c.k();
                if (!k.b.y()) {
                    k.t();
                }
                ljn ljnVar = k.b;
                limVar.getClass();
                ((lah) ljnVar).a = limVar;
                if (!ljnVar.y()) {
                    k.t();
                }
                Object obj2 = this.a;
                ((lah) k.b).b = true;
                lah lahVar = (lah) k.q();
                mbg mbgVar = kzv.a;
                if (mbgVar == null) {
                    synchronized (kzv.class) {
                        mbgVar = kzv.a;
                        if (mbgVar == null) {
                            mbd a = mbg.a();
                            a.d = mbf.UNARY;
                            a.e = mbg.c("google.internal.spot.v1.SpotReportingService", "UploadOwnerScans");
                            a.b();
                            lah lahVar2 = lah.c;
                            lja ljaVar = mkc.a;
                            a.b = new mkb(lahVar2);
                            a.c = new mkb(lai.a);
                            mbgVar = a.a();
                            kzv.a = mbgVar;
                        }
                    }
                }
                kzu kzuVar = ((ejj) obj2).b;
                return mkj.a(kzuVar.a.a(mbgVar, kzuVar.b), lahVar);
            case 1:
                return fzo.b(((eim) this.a).e.b(new GetFindMyDeviceSettingsRequest()));
            case 2:
                Object obj3 = this.a;
                fhy fhyVar = (fhy) obj;
                synchronized (((ejo) obj3).d) {
                    hwx.V(((ejo) obj3).b.g(), "keychainIntentLauncher was not initialized.");
                    ((jni) ((jni) ejo.a.f()).j("com/google/android/apps/adm/integrations/spot/OwnerKeyHandler", "lambda$importOwnerKeyFromKeychain$4", 283, "OwnerKeyHandler.java")).r("Starting keychain intent.");
                    Object c = ((ejo) obj3).b.c();
                    IntentSender intentSender = fhyVar.b().getIntentSender();
                    intentSender.getClass();
                    ((pf) c).b(new pm(intentSender, null, 0, 0));
                }
                return jyv.a;
            case 3:
                Object obj4 = this.a;
                ejo ejoVar = (ejo) obj4;
                Throwable th = (Throwable) obj;
                synchronized (ejoVar.d) {
                    ((ejo) obj4).c = jdl.a;
                }
                if (th instanceof elu) {
                    return jyv.a;
                }
                ejoVar.e();
                return ivc.D(th);
            case 4:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof elu) {
                    return jyv.a;
                }
                ((ejo) this.a).e();
                return ivc.D(th2);
            case 5:
                Object obj5 = this.a;
                return ((emz) obj5).d.schedule(new csf(obj5, 6), lua.a.a().f(), TimeUnit.SECONDS);
            case 6:
                ftc ftcVar = new ftc(((lim) ((iiy) obj).b.c()).A());
                fjy fjyVar = new fjy();
                fjyVar.a = new fsw(ftcVar, 3);
                fjyVar.b = new Feature[]{ftb.a};
                fjyVar.c = 1356;
                return fzo.b(((eow) this.a).e.h(fjyVar.a()));
            case 7:
                gay gayVar = (gay) obj;
                ?? r0 = this.a;
                if (gayVar != null) {
                    if (gayVar.b == 4) {
                        return jwu.g(r0, new jej(gayVar), jxv.a);
                    }
                    throw new UnsupportedOperationException("Unsupported LogAuthSpec Override");
                }
                return r0;
            case 8:
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size + size);
                Iterator it = list.iterator();
                while (true) {
                    Object obj6 = this.a;
                    if (it.hasNext()) {
                        gok gokVar = (gok) it.next();
                        try {
                            List a2 = ((gbd) obj6).a(gokVar.b.getClass());
                            List a3 = ((gbd) obj6).a(gbf.class);
                            ArrayList arrayList2 = new ArrayList(a2.size() + a3.size());
                            Iterator it2 = a2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(gbd.c(gokVar, (gbe) it2.next()));
                            }
                            Iterator it3 = a3.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(gbd.c(gokVar, (gbe) it3.next()));
                            }
                            arrayList.add(jwu.g(ivc.B(arrayList2), new jej(null), jxv.a));
                            arrayList.add(gokVar.a);
                        } catch (Throwable th3) {
                            arrayList.add(ivc.D(th3));
                        }
                    } else {
                        return ivc.S(arrayList).a(new hxl(4), ((gbd) obj6).a);
                    }
                }
            case 9:
                Exception exc = (Exception) obj;
                ((gfn) this.a).f.F(1006, false);
                throw exc;
            case 10:
                Exception exc2 = (Exception) obj;
                ((gfn) this.a).f.F(1007, false);
                throw exc2;
            case 11:
                IOException iOException = (IOException) obj;
                int i = jfi.a;
                IOException iOException2 = iOException;
                Throwable th4 = iOException2;
                while (true) {
                    Throwable cause = iOException2.getCause();
                    if (cause != null) {
                        if (cause != th4) {
                            if (z) {
                                th4 = th4.getCause();
                            }
                            z = !z;
                            iOException2 = cause;
                        } else {
                            throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                        }
                    } else {
                        if (iOException2 instanceof FileNotFoundException) {
                            return ((gfn) this.a).c();
                        }
                        throw iOException;
                    }
                }
            case 12:
                gfs gfsVar = (gfs) obj;
                if (gfn.i(gfsVar)) {
                    return ivc.E(gfsVar);
                }
                return ((gfn) this.a).c();
            case 13:
                Exception exc3 = (Exception) obj;
                ((gfn) this.a).f.D(false);
                throw exc3;
            case 14:
                Object obj7 = this.a;
                return iuu.p(((gfn) obj7).g.x(), new ejc(obj7, (kxq) obj, 15), jxv.a);
            case 15:
                Exception exc4 = (Exception) obj;
                ((gfn) this.a).f.E(false);
                throw exc4;
            case 16:
                ((jol) ((jol) ((jol) glz.a.g()).i((Throwable) obj)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "lambda$fetchBitmap$2", 1021, "NotificationBuilderHelper.java")).r("Failed to download image on first attempt, retrying.");
                return this.a.a();
            case 17:
                return this.a.a((jis) obj);
            case 18:
                return ((huy) this.a).d(hvb.EMPTY_CACHE);
            case 19:
                huv huvVar = (huv) obj;
                if (huvVar == null) {
                    return ((huy) this.a).d(hvb.EMPTY_CACHE);
                }
                return ivc.E(huvVar);
            default:
                return ((bqm) this.a).b((hxw) obj);
        }
    }
}
