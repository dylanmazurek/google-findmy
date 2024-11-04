package defpackage;

import android.net.Uri;
import com.google.android.apps.adm.integrations.spot.clientactions.ClientActionListenableWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ene implements jei {
    private final /* synthetic */ int a;

    public /* synthetic */ ene(int i) {
        this.a = i;
    }

    @Override // defpackage.jei
    public final Object a(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                ((jni) ((jni) ClientActionListenableWorker.e.e()).j("com/google/android/apps/adm/integrations/spot/clientactions/ClientActionListenableWorker", "lambda$workInternal$0", 117, "ClientActionListenableWorker.java")).r("Client action handled successfully");
                return new cqa();
            case 1:
                if (((iid) obj).a.g()) {
                    return enc.SUCCESS;
                }
                return enc.CANNOT_AGGREGATE;
            case 2:
                ((jni) ((jni) ((jni) ClientActionListenableWorker.e.f()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/clientactions/ClientActionListenableWorker", "lambda$workInternal$1", '|', "ClientActionListenableWorker.java")).r("Failed executing a client action command");
                return new cpy();
            case 3:
                return null;
            case 4:
                return ((enq) obj).a.a;
            case 5:
                return new enq((kyz) obj, fma.i().toEpochMilli());
            case 6:
                return ((enq) obj).a.b;
            case 7:
                ((jni) ((jni) ((jni) eow.a.f().h(jop.a, "EraseDeviceHandler")).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/erase/EraseDeviceHandlerImpl", "lambda$deleteFromFastPair$6", (char) 253, "EraseDeviceHandlerImpl.java")).r("Failed unpairing device in FastPair");
                return null;
            case 8:
                return Float.valueOf(Math.round(((float) ((Double) obj).doubleValue()) * 10.0f) / 10.0f);
            case 9:
                Uri uri = ((kpn) obj).a;
                if (uri == null) {
                    return "";
                }
                return uri.toString();
            case 10:
                return ((lqc) obj).g;
            case 11:
                return Boolean.valueOf(((eun) obj).e());
            case 12:
                return Boolean.valueOf(((eun) obj).b());
            case 13:
                return Boolean.valueOf(((eun) obj).c());
            case 14:
                if (((Integer) obj).intValue() != 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                return Boolean.valueOf(((eun) obj).f());
            case 16:
                if (((Integer) obj).intValue() != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                return Boolean.valueOf(((eun) obj).d());
            case 18:
                return fma.o(true);
            case 19:
                return fma.o(true);
            default:
                return fma.o(true);
        }
    }
}
