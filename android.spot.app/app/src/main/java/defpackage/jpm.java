package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jpm implements Iterator {
    final /* synthetic */ jpn a;
    private int b = 0;

    public jpm(jpn jpnVar) {
        this.a = jpnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.a.a.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        jpp jppVar = this.a.a;
        return jppVar.d(jppVar.a[i] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
