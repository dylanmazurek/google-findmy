package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbw extends fbf {
    public final Map a = new HashMap();

    @Override // defpackage.fbf
    public final /* bridge */ /* synthetic */ void c(fbf fbfVar) {
        fbw fbwVar = (fbw) fbfVar;
        fma.aR(fbwVar);
        fbwVar.a.putAll(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
