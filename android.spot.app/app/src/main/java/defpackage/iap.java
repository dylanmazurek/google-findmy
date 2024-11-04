package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iap implements iao {
    private static final jnk c = jnk.l("com/google/android/libraries/spot/api/SpotServiceSignatureVerifierImpl");
    public final jzc a;
    public final enr b;

    static {
        try {
            klk.a();
        } catch (GeneralSecurityException e) {
            ((jni) ((jni) ((jni) c.f().h(flv.a, 284)).i(e)).j("com/google/android/libraries/spot/api/SpotServiceSignatureVerifierImpl", "<clinit>", '\'', "SpotServiceSignatureVerifierImpl.java")).r("Initialization of SpotServiceSignatureVerifier failed.");
        }
    }

    public iap(enr enrVar, jzc jzcVar) {
        this.b = enrVar;
        this.a = jzcVar;
    }

    public static /* synthetic */ jyz a(lim limVar, lim limVar2, lim limVar3) {
        try {
            try {
                InputStream l = limVar3.l();
                try {
                    lja ljaVar = lja.a;
                    lkz lkzVar = lkz.a;
                    lja ljaVar2 = lja.a;
                    kjk kjkVar = kjk.c;
                    liq J = liq.J(l);
                    ljn l2 = kjkVar.l();
                    try {
                        try {
                            try {
                                try {
                                    llg b = lkz.a.b(l2);
                                    b.l(l2, lir.p(J), ljaVar2);
                                    b.g(l2);
                                    ljn.A(l2);
                                    kjk kjkVar2 = (kjk) l2;
                                    l.close();
                                    ((kai) kac.a(kjkVar2.g()).b(kai.class)).a(limVar.A(), limVar2.A());
                                    return jyv.a;
                                } catch (IOException e) {
                                    if (e.getCause() instanceof ljy) {
                                        throw ((ljy) e.getCause());
                                    }
                                    throw new ljy(e);
                                }
                            } catch (RuntimeException e2) {
                                if (e2.getCause() instanceof ljy) {
                                    throw ((ljy) e2.getCause());
                                }
                                throw e2;
                            }
                        } catch (ljy e3) {
                            if (e3.a) {
                                throw new ljy(e3);
                            }
                            throw e3;
                        }
                    } catch (llo e4) {
                        throw e4.a();
                    }
                } catch (Throwable th) {
                    l.close();
                    throw th;
                }
            } catch (ljy unused) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (GeneralSecurityException e5) {
            return ivc.D(e5);
        }
    }
}
