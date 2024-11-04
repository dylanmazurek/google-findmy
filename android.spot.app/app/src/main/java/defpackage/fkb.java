package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkb implements Iterable, Closeable, fhx {
    protected final DataHolder a;

    public fkb(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.fhx
    public final void a() {
        this.a.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new fkc(this);
    }
}
