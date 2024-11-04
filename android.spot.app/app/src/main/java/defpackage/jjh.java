package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjh extends jmw {
    final Iterator a;
    Object b = null;
    Iterator c = jkf.a;
    final /* synthetic */ jjm d;

    public jjh(jjm jjmVar) {
        this.d = jjmVar;
        this.a = jjmVar.map.entrySet().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.c.hasNext() && !this.a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((jih) entry.getValue()).listIterator();
        }
        Object obj = this.b;
        obj.getClass();
        return new jii(obj, this.c.next());
    }
}
