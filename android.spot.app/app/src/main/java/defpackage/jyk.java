package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyk implements Runnable {
    final Future a;
    final jyj b;

    public jyk(Future future, jyj jyjVar) {
        this.a = future;
        this.b = jyjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable j;
        Object obj = this.a;
        if ((obj instanceof jzv) && (j = ((jzv) obj).j()) != null) {
            this.b.a(j);
            return;
        }
        try {
            this.b.b(ivc.M(this.a));
        } catch (ExecutionException e) {
            this.b.a(e.getCause());
        } catch (Throwable th) {
            this.b.a(th);
        }
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.a(this.b);
        return q.toString();
    }
}
