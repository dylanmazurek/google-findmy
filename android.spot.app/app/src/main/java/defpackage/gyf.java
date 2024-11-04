package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyf implements gyc {
    private static final joo a = joo.m("GnpSdk");
    private final gyg b;
    private final ddg c;

    public gyf(gyg gygVar, ddg ddgVar) {
        this.b = gygVar;
        this.c = ddgVar;
    }

    @Override // defpackage.gyc
    public final synchronized gfx a(String str) {
        return b(str, lgp.COLLABORATOR_API_CALL);
    }

    public final synchronized gfx b(String str, lgp lgpVar) {
        ijs.b();
        try {
            this.c.o(1);
        } catch (RuntimeException e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/registration/impl/ChimeRegistrationApiImpl", "registerAccountForPushNotifications", 'U', "ChimeRegistrationApiImpl.java")).r("Failed setting last used registration API to Chime");
        }
        return this.b.a(str, false, lgpVar);
    }
}
