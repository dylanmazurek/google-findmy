package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkl extends gkm {
    private final gjk c;

    public gkl(gjk gjkVar) {
        this.c = gjkVar;
    }

    @Override // defpackage.gyp
    public final String c() {
        return "RPC_REMOVE_TARGET";
    }

    @Override // defpackage.gkm
    public final gjj g(Bundle bundle, lgq lgqVar, goa goaVar) {
        if (goaVar == null) {
            return i();
        }
        return this.c.f(goaVar, lgqVar);
    }

    @Override // defpackage.gkm
    protected final String h() {
        return "RemoveTargetCallback";
    }
}
