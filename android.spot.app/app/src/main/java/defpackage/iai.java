package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iai implements iah {
    public static final /* synthetic */ int c = 0;
    private static final jnk d = jnk.l("com/google/android/libraries/spot/api/SpotServiceCrypterImpl");
    public final Executor a;
    public final enr b;

    static {
        try {
            keg.a();
        } catch (GeneralSecurityException e) {
            ((jni) ((jni) ((jni) d.f().h(flv.a, 284)).i(e)).j("com/google/android/libraries/spot/api/SpotServiceCrypterImpl", "<clinit>", '!', "SpotServiceCrypterImpl.java")).r("Initialization of SpotServiceCrypter failed.");
        }
    }

    public iai(enr enrVar, Executor executor) {
        this.b = enrVar;
        this.a = executor;
    }
}
