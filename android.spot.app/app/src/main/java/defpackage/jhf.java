package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhf extends jhh {
    @Override // defpackage.jhh
    public final int a() {
        return 0;
    }

    @Override // defpackage.jhh
    public final jhh b(Comparable comparable, Comparable comparable2) {
        int compareTo = comparable.compareTo(comparable2);
        if (compareTo < 0) {
            return jhh.c;
        }
        if (compareTo > 0) {
            return jhh.d;
        }
        return jhh.b;
    }
}
