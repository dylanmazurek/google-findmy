package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsa implements drk {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.drk
    public final void h() {
        Iterator it = dtq.f(this.a).iterator();
        while (it.hasNext()) {
            ((dsw) it.next()).h();
        }
    }

    @Override // defpackage.drk
    public final void i() {
        Iterator it = dtq.f(this.a).iterator();
        while (it.hasNext()) {
            ((dsw) it.next()).i();
        }
    }

    @Override // defpackage.drk
    public final void j() {
        Iterator it = dtq.f(this.a).iterator();
        while (it.hasNext()) {
            ((dsw) it.next()).j();
        }
    }
}
