package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kpi extends kpk {
    private final kqz a;
    private final bym b;

    public kpi(kqz kqzVar, bym bymVar) {
        this.a = kqzVar;
        this.b = bymVar;
    }

    @Override // defpackage.kpk
    public final void c(Status status, kpc kpcVar) {
        ktd ktdVar;
        Bundle bundle;
        knn knnVar;
        if (kpcVar == null) {
            ktdVar = null;
        } else {
            ktdVar = new ktd(kpcVar);
        }
        fma.ba(status, ktdVar, this.b);
        if (kpcVar != null && (bundle = kpcVar.a().getBundle("scionData")) != null && bundle.keySet() != null && (knnVar = (knn) this.a.a()) != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                bundle.getBundle(it.next());
                knnVar.a();
            }
        }
    }
}
