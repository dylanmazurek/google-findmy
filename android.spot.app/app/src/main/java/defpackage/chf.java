package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chf extends chg {
    public volatile che a;
    public volatile che b;
    public List c;
    private Executor k;

    public chf(Context context) {
        super(context.getApplicationContext());
    }

    public final void a() {
        if (this.b == null && this.a != null) {
            boolean z = this.a.a;
            if (this.k == null) {
                this.k = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            che cheVar = this.a;
            Executor executor = this.k;
            if (cheVar.f != 1) {
                int i = cheVar.f;
                int i2 = i - 1;
                if (i != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("We should never reach this state");
                        }
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                }
                throw null;
            }
            cheVar.f = 2;
            executor.execute(cheVar.c);
        }
    }

    public final void b(List list) {
        this.c = list;
        cha chaVar = this.j;
        if (chaVar != null) {
            if (cgz.b(2)) {
                Objects.toString(chaVar);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                chaVar.l(list);
            } else {
                chaVar.i(list);
            }
        }
    }

    public final void c(che cheVar) {
        if (this.b == cheVar) {
            SystemClock.uptimeMillis();
            this.b = null;
            a();
        }
    }

    @Override // defpackage.chg
    public final void d() {
        if (this.a != null) {
            if (!this.f) {
                this.i = true;
            }
            if (this.b != null) {
                boolean z = this.a.a;
            } else {
                boolean z2 = this.a.a;
                che cheVar = this.a;
                cheVar.d.set(true);
                if (cheVar.c.cancel(false)) {
                    this.b = this.a;
                }
            }
            this.a = null;
        }
    }
}
