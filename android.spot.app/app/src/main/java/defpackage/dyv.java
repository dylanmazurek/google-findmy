package defpackage;

import android.content.Context;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dyv implements jei {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dyv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.function.Consumer, java.lang.Object] */
    @Override // defpackage.jei
    public final Object a(Object obj) {
        jer jerVar;
        boolean z = false;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                synchronized (((dyw) obj2).d) {
                    int i = ((dyw) obj2).i;
                    int i2 = i - 1;
                    if (i != 0) {
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    ((dyw) obj2).e(1);
                                }
                            } else {
                                ((dyw) obj2).e(3);
                            }
                        } else {
                            ((jni) ((jni) dyw.a.g()).j("com/google/android/apps/adm/deeplink/DeepLinkHandlerImpl", "onCallbackReturned", 206, "DeepLinkHandlerImpl.java")).r("Callback returned when no deep link is being handled");
                        }
                    } else {
                        throw null;
                    }
                }
                return null;
            case 1:
                apc apcVar = (apc) obj;
                lqd lqdVar = ((lqc) this.a).d;
                if (lqdVar == null) {
                    lqdVar = lqd.d;
                }
                return Boolean.valueOf(apcVar.n(lqdVar).containsValue(eis.IN_RANGE));
            case 2:
                this.a.accept((evq) obj);
                return true;
            case 3:
                boolean z2 = !((Boolean) obj).booleanValue();
                ljh ljhVar = (ljh) this.a;
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                loy loyVar = (loy) ljhVar.b;
                loy loyVar2 = loy.c;
                loyVar.b = z2;
                return (loy) ljhVar.q();
            case 4:
                GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse = (GetFindMyDeviceSettingsResponse) obj;
                Object obj3 = this.a;
                eim eimVar = (eim) obj3;
                synchronized (eimVar.b) {
                    jerVar = ((eim) obj3).c;
                    ((eim) obj3).c = jer.i(getFindMyDeviceSettingsResponse);
                }
                if (!jerVar.g() || !ein.a((GetFindMyDeviceSettingsResponse) jerVar.c()).equals(ein.a(getFindMyDeviceSettingsResponse))) {
                    eimVar.d.i(jer.i(ein.a(getFindMyDeviceSettingsResponse)));
                }
                return null;
            case 5:
                kzb kzbVar = (kzb) obj;
                jnk jnkVar = ejg.a;
                if (kzbVar.d.isEmpty()) {
                    kym kymVar = kzbVar.b;
                    if (kymVar == null) {
                        kymVar = kym.f;
                    }
                    if (kymVar.b == 10 && (((kzb) this.a).a & 1) == 0) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                return ejo.f((kyf) ((jer) this.a).c(), (jer) obj);
            case 7:
                ((ejo) this.a).d(((Boolean) obj).booleanValue());
                return null;
            case 8:
                kyf kyfVar = ((ejo) this.a).e.a((lqc) obj).b;
                if (kyfVar == null) {
                    return kyf.r;
                }
                return kyfVar;
            case 9:
                ((ejo) this.a).d(((Boolean) obj).booleanValue());
                return null;
            case 10:
                return ((apc) this.a).n((lqd) obj);
            case 11:
                return Boolean.valueOf(((eiv) obj).a((kyh) this.a).b());
            case 12:
                return Boolean.valueOf(((eiv) obj).a((kyh) this.a).i);
            case 13:
                kyf kyfVar2 = ((ekf) this.a).a.a((lqc) obj).b;
                if (kyfVar2 == null) {
                    return kyf.r;
                }
                return kyfVar2;
            case 14:
                return elo.e((kzb) obj, (Context) this.a, true);
            case 15:
                ((ekp) this.a).e = jer.i(true);
                return null;
            case 16:
                ((jni) ((jni) ((jni) ekp.a.g()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/SpotDeviceTypeHandler", "lambda$prepareForIsEnabled$1", 'j', "SpotDeviceTypeHandler.java")).r("FindMyDevice GmsCore module is unavailable");
                ((ekp) this.a).e = jer.i(false);
                return null;
            case 17:
                kyf kyfVar3 = ((elh) this.a).a.a((lqc) obj).b;
                if (kyfVar3 == null) {
                    kyfVar3 = kyf.r;
                }
                kyl kylVar = kyfVar3.c;
                if (kylVar == null) {
                    kylVar = kyl.j;
                }
                kyj b = kyj.b(kylVar.e);
                if (b == null) {
                    return kyj.UNRECOGNIZED;
                }
                return b;
            case 18:
                return Long.valueOf(((Long) obj).longValue() + ((Integer) ((ekl) this.a).i.e(300000)).intValue());
            case 19:
                return ((ilv) this.a).c((lqc) obj);
            default:
                jer jerVar2 = (jer) obj;
                emx emxVar = (emx) this.a;
                if (emxVar.j.decrementAndGet() == 0) {
                    emxVar.h = jerVar2;
                    emxVar.i = true;
                    emxVar.c.l(null);
                }
                return null;
        }
    }
}
