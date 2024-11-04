package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mre implements Iterable, mpq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mre(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.b != 0) {
            return new mqt((Object[]) this.a, 1);
        }
        return new mri((mrg) this.a);
    }
}
