package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqi extends mmc {
    private final long a;
    private boolean b;
    private long c;

    public mqi(long j, long j2) {
        boolean z;
        this.a = j2;
        if (j <= j2) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        this.c = true != z ? j2 : j;
    }

    @Override // defpackage.mmc
    public final long a() {
        long j = this.c;
        if (j == this.a) {
            if (this.b) {
                this.b = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.c = 1 + j;
        }
        return j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }
}
