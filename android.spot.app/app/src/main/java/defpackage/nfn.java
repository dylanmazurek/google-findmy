package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfn {
    public static final nfn a = new nfn(mkm.aj(new ArrayList()), null);
    public final nkh b;
    private final Set c;

    public nfn(Set set, nkh nkhVar) {
        this.c = set;
        this.b = nkhVar;
    }

    public final nfn a(nkh nkhVar) {
        if (amr.i(this.b, nkhVar)) {
            return this;
        }
        return new nfn(this.c, nkhVar);
    }

    public final void b() {
        Iterator it = this.c.iterator();
        if (!it.hasNext()) {
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nfn) {
            nfn nfnVar = (nfn) obj;
            if (amr.i(nfnVar.c, this.c) && amr.i(nfnVar.b, this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.c.hashCode() + 1517;
        nkh nkhVar = this.b;
        if (nkhVar != null) {
            i = nkhVar.hashCode();
        } else {
            i = 0;
        }
        return (hashCode * 41) + i;
    }
}
