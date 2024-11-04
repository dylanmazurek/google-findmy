package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cqb {
    public Context a;
    public WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public cqb(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.a = context;
                this.b = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public jyz a() {
        return bei.d(new bmh() { // from class: cpx
            @Override // defpackage.bmh
            public final Object a(bmf bmfVar) {
                bmfVar.d(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
                return "default failing getForegroundInfoAsync";
            }
        });
    }

    public abstract jyz b();

    public final cpn d() {
        return this.b.b;
    }

    public final UUID e() {
        return this.b.a;
    }

    public final Executor f() {
        return this.b.d;
    }

    public final void g(int i) {
        this.c.compareAndSet(-256, i);
    }

    public final boolean h() {
        if (this.c.get() != -256) {
            return true;
        }
        return false;
    }
}
