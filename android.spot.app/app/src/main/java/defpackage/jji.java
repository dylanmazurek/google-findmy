package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jji extends jmw {
    final Iterator a;
    Iterator b = jkf.a;
    final /* synthetic */ jjm c;

    public jji(jjm jjmVar) {
        this.c = jjmVar;
        this.a = jjmVar.map.values().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.b.hasNext() && !this.a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((jih) this.a.next()).listIterator();
        }
        return this.b.next();
    }
}
