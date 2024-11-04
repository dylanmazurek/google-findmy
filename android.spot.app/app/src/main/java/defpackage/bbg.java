package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbg implements Comparator {
    final /* synthetic */ Comparator a;
    final /* synthetic */ Comparator b;

    public bbg(Comparator comparator, Comparator comparator2) {
        this.a = comparator;
        this.b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.a.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        return this.b.compare(((bfh) obj).b, ((bfh) obj2).b);
    }
}
