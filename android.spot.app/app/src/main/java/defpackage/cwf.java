package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwf implements Callable {
    final /* synthetic */ cin a;
    final /* synthetic */ cwn b;

    public cwf(cwn cwnVar, cin cinVar) {
        this.b = cwnVar;
        this.a = cinVar;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean call() {
        boolean z;
        Cursor c = bwp.c(this.b.a, this.a);
        try {
            boolean z2 = false;
            if (c.moveToFirst()) {
                if (c.getInt(0) != 0) {
                    z2 = true;
                }
                z = Boolean.valueOf(z2);
            } else {
                z = false;
            }
            return z;
        } finally {
            c.close();
        }
    }

    protected final void finalize() {
        this.a.j();
    }
}
