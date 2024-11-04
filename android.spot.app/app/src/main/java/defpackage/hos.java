package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hos {
    public final ndp a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final ndf f;
    public final String g;
    public final ndq h;
    public final Integer i;

    public hos(ndp ndpVar, Long l, Long l2, Long l3, Long l4, ndf ndfVar, String str, ndq ndqVar, Integer num) {
        this.a = ndpVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = ndfVar;
        this.g = str;
        this.h = ndqVar;
        this.i = num;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
