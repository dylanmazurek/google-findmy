package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrm implements nrl {
    private static final Set a = Collections.singleton("UTC");

    @Override // defpackage.nrl
    public final Set a() {
        return a;
    }

    @Override // defpackage.nrl
    public final nnw b(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return nnw.a;
        }
        return null;
    }
}
