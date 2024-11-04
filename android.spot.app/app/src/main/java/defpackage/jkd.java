package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkd extends jfm {
    final /* synthetic */ Iterator a;
    final /* synthetic */ jet b;

    public jkd(Iterator it, jet jetVar) {
        this.a = it;
        this.b = jetVar;
    }

    @Override // defpackage.jfm
    protected final Object a() {
        while (this.a.hasNext()) {
            Iterator it = this.a;
            jet jetVar = this.b;
            Object next = it.next();
            if (jetVar.a(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
