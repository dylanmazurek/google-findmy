package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckp implements ckg {
    public final Context a;
    public final String b;
    public final cke c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    private final mkt g = new mla(new azp(this, 20));

    public ckp(Context context, String str, cke ckeVar, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = ckeVar;
        this.d = z;
        this.e = z2;
    }

    private final cko c() {
        return (cko) this.g.a();
    }

    @Override // defpackage.ckg
    public final ckd a() {
        return c().b();
    }

    @Override // defpackage.ckg
    public final void b(boolean z) {
        if (this.g.b()) {
            c().setWriteAheadLoggingEnabled(z);
        }
        this.f = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.b()) {
            c().close();
        }
    }
}
