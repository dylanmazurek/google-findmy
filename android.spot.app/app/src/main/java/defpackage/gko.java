package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gko extends gkm {
    private final gjk c;

    public gko(gjk gjkVar) {
        this.c = gjkVar;
    }

    @Override // defpackage.gyp
    public final String c() {
        return "RPC_STORE_TARGET";
    }

    @Override // defpackage.gkm
    public final gjj g(Bundle bundle, lgq lgqVar, goa goaVar) {
        if (goaVar == null) {
            return i();
        }
        return this.c.h(goaVar, lgp.b(bundle.getInt("com.google.android.libraries.notifications.REGISTRATION_REASON", lgp.REGISTRATION_REASON_UNSPECIFIED.o)), lgqVar);
    }

    @Override // defpackage.gkm
    protected final String h() {
        return "StoreTargetCallback";
    }
}
