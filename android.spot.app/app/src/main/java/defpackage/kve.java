package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kve implements lyw {
    private static final jnk a = jnk.l("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor");

    @Override // defpackage.lyw
    public final lyv a(mbg mbgVar, lys lysVar, lyt lytVar) {
        kub kubVar = (kub) lysVar.e(kua.a);
        if (kubVar != null) {
            ((jni) ((jni) a.c()).j("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 30, "CredentialStrategyInterceptor.java")).u("Using CredentialStrategy: %s", kubVar.getClass());
            return mjo.K(lytVar, hwx.ah(new hsp(kubVar, 3))).a(mbgVar, lysVar);
        }
        ((jni) ((jni) a.c()).j("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 38, "CredentialStrategyInterceptor.java")).r("Did not set CredentialStrategy");
        return lytVar.a(mbgVar, lysVar);
    }
}
