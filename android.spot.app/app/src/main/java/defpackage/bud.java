package defpackage;

import android.util.LongSparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bud extends mmc {
    final /* synthetic */ LongSparseArray a;
    private int b;

    public bud(LongSparseArray longSparseArray) {
        this.a = longSparseArray;
    }

    @Override // defpackage.mmc
    public final long a() {
        int i = this.b;
        this.b = i + 1;
        return this.a.keyAt(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.a.size()) {
            return true;
        }
        return false;
    }
}
