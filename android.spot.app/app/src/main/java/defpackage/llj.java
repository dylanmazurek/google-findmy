package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class llj implements Iterator {
    final /* synthetic */ lll a;
    private int b = -1;
    private boolean c;
    private Iterator d;

    public llj(lll lllVar) {
        this.a = lllVar;
    }

    private final Iterator a() {
        if (this.d == null) {
            this.d = this.a.b.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b + 1 < this.a.a.size()) {
            return true;
        }
        if (!this.a.b.isEmpty() && a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        if (i < this.a.a.size()) {
            return (Map.Entry) this.a.a.get(this.b);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c) {
            this.c = false;
            this.a.f();
            if (this.b < this.a.a.size()) {
                lll lllVar = this.a;
                int i = this.b;
                this.b = i - 1;
                lllVar.d(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
