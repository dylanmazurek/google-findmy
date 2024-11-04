package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class etl implements jxd {
    private final /* synthetic */ int a;

    public /* synthetic */ etl(int i) {
        this.a = i;
    }

    @Override // defpackage.jxd
    public final jyz a(Object obj) {
        boolean z;
        lim j;
        jer jerVar;
        int i = 2;
        int i2 = 0;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                jnk jnkVar = etq.a;
                if (!lua.k()) {
                    ((jni) ((jni) ((jni) etq.a.g()).i(th)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "lambda$logAuditRecord$19", (char) 806, "SharingApplicationRequirementsViewModel.java")).r("ARI failure");
                    return ivc.E(Status.a);
                }
                return ivc.D(th);
            case 1:
                Exception exc = (Exception) obj;
                if (exc instanceof elu) {
                    ((jni) ((jni) ((jni) esa.a.g()).i(exc)).j("com/google/android/apps/adm/integrations/spot/ownerkey/OwnerKeyCacheImpl", "lambda$fetchAndCacheOwnerKey$0", 'l', "OwnerKeyCacheImpl.java")).r("Account switched while getting owner key.");
                    return ivc.D(exc);
                }
                ((jni) ((jni) ((jni) esa.a.g()).i(exc)).j("com/google/android/apps/adm/integrations/spot/ownerkey/OwnerKeyCacheImpl", "lambda$fetchAndCacheOwnerKey$0", 'o', "OwnerKeyCacheImpl.java")).r("Exception while getting owner key, treating as missing key");
                return ivc.E(jdl.a);
            case 2:
                Status status = (Status) obj;
                int i3 = status.g;
                jnk jnkVar2 = etq.a;
                if (i3 > 0) {
                    ((jni) ((jni) etq.a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "lambda$logAuditRecord$20", 813, "SharingApplicationRequirementsViewModel.java")).u("ARI failure: %s", status.h);
                    if (lua.k()) {
                        return ivc.D(new Exception("ARI failure: ".concat(String.valueOf(status.h))));
                    }
                }
                return jyv.a;
            case 3:
                fhn fhnVar = (fhn) obj;
                int a = fhnVar.a();
                if (a != 17 && a != 31003) {
                    throw fhnVar;
                }
                return jyv.a;
            case 4:
                return ivc.D(new IllegalStateException());
            case 5:
                byte[] bArr = (byte[]) obj;
                lja ljaVar = lja.a;
                lkz lkzVar = lkz.a;
                ljn m = ljn.m(kxq.b, bArr, 0, bArr.length, lja.a);
                ljn.A(m);
                return ivc.E((kxq) m);
            case 6:
                fhn fhnVar2 = (fhn) obj;
                if (fhnVar2.a() == 17) {
                    return ivc.D(new MdiNotAvailableException$ApiNotConnectedException());
                }
                return ivc.D(fhnVar2);
            case 7:
                IOException iOException = (IOException) obj;
                fhn fhnVar3 = (fhn) hog.T(iOException, fhn.class);
                if (fhnVar3 != null && fhnVar3.a() == 10) {
                    return ivc.D(new MdiNotAvailableException$DeveloperErrorException());
                }
                return ivc.D(iOException);
            case 8:
                huv huvVar = (huv) obj;
                lhl lhlVar = huvVar.a;
                return iuu.o(ivc.E(null), new huw(huvVar, i2), jxv.a);
            case 9:
                fhn fhnVar4 = (fhn) obj;
                throw new hwf(fhnVar4.a(), fhnVar4.getMessage(), fhnVar4);
            case 10:
                ics icsVar = (ics) obj;
                lim limVar = icsVar.a;
                int i4 = icn.c;
                if (limVar.d() <= 0) {
                    return icn.a(icsVar.a);
                }
                byte a2 = icsVar.a.a(0);
                int i5 = a2 & 1;
                if ((a2 & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (i5 != 0) {
                    lim w = icsVar.a.w(1);
                    if (w.d() < 20) {
                        return icn.a(icsVar.a);
                    }
                    if (w.d() < 32) {
                        j = w.j(0, 20);
                    } else {
                        j = w.j(0, 32);
                    }
                    if (w.d() > j.d()) {
                        byte a3 = w.a(j.d());
                        ihx[] values = ihx.values();
                        int length = values.length;
                        while (i2 < length) {
                            ihx ihxVar = values[i2];
                            if (a3 == ihxVar.f) {
                                jerVar = jer.i(ihxVar);
                                return ivc.E(new icl(true, z, jer.i(j), jerVar));
                            }
                            i2++;
                        }
                    }
                    jerVar = jdl.a;
                    return ivc.E(new icl(true, z, jer.i(j), jerVar));
                }
                jdl jdlVar = jdl.a;
                return ivc.E(new icl(false, z, jdlVar, jdlVar));
            case 11:
                idt idtVar = (idt) obj;
                hwx.U(idtVar.f);
                return bei.d(new icy(idtVar, i));
            case 12:
                return ivc.D(((jtq) obj).getCause());
            case 13:
                return ivc.D(new ied((TimeoutException) obj));
            case 14:
                lim limVar2 = (lim) obj;
                if (limVar2.d() < 3) {
                    return ivc.D(new iea("Incomplete component state data"));
                }
                jiu jiuVar = new jiu();
                jiuVar.d(kyh.DEVICE_COMPONENT_LEFT, kpb.s((byte) (limVar2.a(0) >> 4), limVar2.a(1)));
                jiuVar.d(kyh.DEVICE_COMPONENT_RIGHT, kpb.s((byte) (limVar2.a(0) & 15), limVar2.a(2)));
                if (limVar2.d() > 3) {
                    jiuVar.d(kyh.DEVICE_COMPONENT_CASE, kpb.s((byte) 0, limVar2.a(3)));
                }
                return ivc.E(jiuVar.b());
            case 15:
                return ((idz) obj).a();
            case 16:
                return jyv.a;
            case 17:
                try {
                    return ivc.E((ibu) ((jck) obj).c());
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    Throwable th2 = e;
                    if (cause != null) {
                        th2 = e.getCause();
                    }
                    return ivc.D(th2);
                }
            case 18:
                ((jni) ((jni) ((jni) igo.a.g().h(flv.a, 284)).i((iiv) obj)).j("com/google/android/libraries/spot/client/DeviceEidsProviderImpl", "lambda$getTimestampedEphemeralIds$1", 120, "DeviceEidsProviderImpl.java")).r("Local owner key does not match the owner key version of a device");
                return ivc.E(new hot().n());
            case 19:
                return ivc.D(new igs((iiv) obj));
            default:
                return ivc.D(((ieq) obj).a("Could not reset device"));
        }
    }
}
