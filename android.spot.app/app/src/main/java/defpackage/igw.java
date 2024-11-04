package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class igw implements jxd {
    private final /* synthetic */ int a;

    public /* synthetic */ igw(int i) {
        this.a = i;
    }

    @Override // defpackage.jxd
    public final jyz a(Object obj) {
        switch (this.a) {
            case 0:
                return ivc.D(new igt((Exception) obj));
            case 1:
                return ivc.D(new igr((Exception) obj));
            case 2:
                return jyv.a;
            case 3:
                Throwable th = (Throwable) obj;
                if (!(th instanceof ihe) && !(th instanceof fhy)) {
                    return ivc.D(new ihc(th));
                }
                return ivc.D(th);
            case 4:
                Throwable th2 = (Throwable) obj;
                if (!(th2 instanceof CancellationException)) {
                    ((jni) ((jni) ((jni) iho.a.g().h(flv.a, 284)).i(th2)).j("com/google/android/libraries/spot/clientactions/ClientActionResultReporterImpl", "lambda$send$1", 'J', "ClientActionResultReporterImpl.java")).r("Failed reporting client action result to the server.");
                    return jyv.a;
                }
                return ivc.C();
            case 5:
                ((jni) ((jni) ((jni) ihu.a.f().h(flv.a, 284)).i((ljy) obj)).j("com/google/android/libraries/spot/clientactions/SignedClientActionCommandHandlerImpl", "lambda$handle$2", 65, "SignedClientActionCommandHandlerImpl.java")).r("Unable to parse the command.");
                return jyv.a;
            case 6:
                ((jni) ((jni) ((jni) ihu.a.f().h(flv.a, 284)).i((Exception) obj)).j("com/google/android/libraries/spot/clientactions/SignedClientActionCommandHandlerImpl", "lambda$handle$3", 72, "SignedClientActionCommandHandlerImpl.java")).r("An unexpected error occurred while handling a signed command.");
                return jyv.a;
            case 7:
                ((jni) ((jni) ((jni) ihu.a.f().h(flv.a, 284)).i((GeneralSecurityException) obj)).j("com/google/android/libraries/spot/clientactions/SignedClientActionCommandHandlerImpl$ForAccountImpl", "lambda$handle$1", 110, "SignedClientActionCommandHandlerImpl.java")).r("Unable to verify the signature of the command.");
                return jyv.a;
            case 8:
                return ivc.E(null);
            default:
                return ivc.E("");
        }
    }
}
