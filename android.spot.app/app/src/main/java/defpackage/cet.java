package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cet implements cjw {
    @Override // defpackage.cjw
    public final void a(cjz cjzVar) {
        if (cjzVar instanceof cgq) {
            ddh aE = ((cgq) cjzVar).aE();
            cjy R = cjzVar.R();
            Iterator it = aE.o().iterator();
            while (it.hasNext()) {
                cgk n = aE.n((String) it.next());
                n.getClass();
                bst.c(n, R, cjzVar.N());
            }
            if (!aE.o().isEmpty()) {
                R.c(cet.class);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
    }
}
