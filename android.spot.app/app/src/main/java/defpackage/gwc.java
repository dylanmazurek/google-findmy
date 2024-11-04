package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwc implements gwb {
    private static final joo a = joo.m("GnpSdk");

    @Override // defpackage.gwb
    public final void a(Context context) {
        try {
            hvq.c(context);
        } catch (IllegalStateException e) {
            ((jol) ((jol) a.k().i(e)).j("com/google/android/libraries/notifications/platform/phenotype/impl/GnpPhenotypeContextInitImpl", "initPhenotypeContext", 23, "GnpPhenotypeContextInitImpl.java")).r("PhenotypeContext.setContext was called more than once");
        }
    }
}
