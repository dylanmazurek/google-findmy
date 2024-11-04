package defpackage;

import android.content.res.TypedArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezs implements AutoCloseable {
    public final TypedArray a;

    public ezs(TypedArray typedArray) {
        this.a = typedArray;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.recycle();
    }
}
