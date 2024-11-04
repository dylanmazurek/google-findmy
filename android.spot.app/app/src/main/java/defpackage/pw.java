package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pw extends qd {
    public final HashMap a = new HashMap();

    @Override // defpackage.qd
    public final pz a(Object obj) {
        return (pz) this.a.get(obj);
    }

    @Override // defpackage.qd
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.a.remove(obj);
        return b;
    }

    public final boolean c(Object obj) {
        return this.a.containsKey(obj);
    }
}
