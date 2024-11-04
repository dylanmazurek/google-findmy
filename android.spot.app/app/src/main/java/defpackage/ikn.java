package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikn implements Iterator {
    private long a = 10;

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Long next() {
        long j;
        long j2 = this.a;
        if (j2 >= 30000) {
            j = 60000;
        } else {
            j = j2 + j2;
        }
        this.a = j;
        return Long.valueOf(j2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return true;
    }
}
