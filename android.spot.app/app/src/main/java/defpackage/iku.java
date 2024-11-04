package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iku implements ijv {
    private boolean a = false;

    static {
        new AtomicInteger();
    }

    public final void b() {
        this.a = true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [ikz, java.lang.Object] */
    @Override // defpackage.ijv
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final File a(kqr kqrVar) {
        if (this.a) {
            if (kqrVar.f.isEmpty()) {
                return kqrVar.e.b((Uri) kqrVar.c);
            }
            throw new ikk("Short circuit would skip transforms.");
        }
        iki ikiVar = new iki(ikt.b(kqrVar));
        try {
            Closeable closeable = ikiVar.a;
            if (closeable instanceof ikc) {
                File c = ((ikc) closeable).c();
                ikiVar.close();
                return c;
            }
            throw new IOException("Not convertible and fallback to pipe is disabled.");
        } catch (Throwable th) {
            try {
                ikiVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
