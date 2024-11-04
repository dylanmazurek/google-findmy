package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwu extends fwv {
    final /* synthetic */ bym a;

    public fwu(bym bymVar) {
        this.a = bymVar;
    }

    @Override // defpackage.fwv
    public final void b(Status status, PseudonymousIdToken pseudonymousIdToken) {
        fma.ba(status, pseudonymousIdToken, this.a);
    }
}
