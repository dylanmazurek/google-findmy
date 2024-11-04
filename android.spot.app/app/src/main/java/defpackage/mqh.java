package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mqh implements Iterable, mpq {
    public final long a;
    public final long b;
    private final long c = 1;

    public mqh(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean c() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mqh)) {
            return false;
        }
        if (c() && ((mqh) obj).c()) {
            return true;
        }
        mqh mqhVar = (mqh) obj;
        if (this.a != mqhVar.a || this.b != mqhVar.b) {
            return false;
        }
        long j = mqhVar.c;
        return true;
    }

    public int hashCode() {
        if (c()) {
            return -1;
        }
        long j = this.a;
        long j2 = this.b;
        return (int) (((((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32))) * 31) + 1);
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new mqi(this.a, this.b);
    }

    public String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
