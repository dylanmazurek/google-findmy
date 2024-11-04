package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qp implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public qp(Handler handler, int i) {
        this.b = i;
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            this.a.post(runnable);
                            return;
                        } else {
                            this.a.post(runnable);
                            return;
                        }
                    }
                    bqd.n(runnable);
                    if (this.a.post(runnable)) {
                        return;
                    }
                    Handler handler = this.a;
                    Objects.toString(handler);
                    throw new RejectedExecutionException(handler.toString().concat(" is shutting down"));
                }
                bqd.n(runnable);
                if (this.a.post(runnable)) {
                    return;
                }
                Handler handler2 = this.a;
                Objects.toString(handler2);
                throw new RejectedExecutionException(handler2.toString().concat(" is shutting down"));
            }
            this.a.post(runnable);
            return;
        }
        this.a.post(runnable);
    }

    public qp(int i, byte[] bArr) {
        this.b = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    public qp(Handler handler, int i, byte[] bArr) {
        this.b = i;
        bqd.n(handler);
        this.a = handler;
    }

    public qp(int i) {
        this.b = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    public qp(Looper looper, int i) {
        this.b = i;
        this.a = new fqw(looper);
    }

    public qp(int i, char[] cArr) {
        this.b = i;
        this.a = new fqw(Looper.getMainLooper());
    }
}
