package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyc extends AtomicReference implements Executor, Runnable {
    Executor a;
    Runnable b;
    Thread c;
    kub d;

    public jyc(Executor executor, kub kubVar) {
        super(jyb.NOT_RUN);
        this.a = executor;
        this.d = kubVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        if (get() == jyb.CANCELLED) {
            this.a = null;
            this.d = null;
            return;
        }
        this.c = Thread.currentThread();
        try {
            kub kubVar = this.d;
            kubVar.getClass();
            Object obj = kubVar.a;
            if (((mep) obj).a == this.c) {
                this.d = null;
                if (((mep) obj).c == null) {
                    z = true;
                } else {
                    z = false;
                }
                hwx.U(z);
                ((mep) obj).c = runnable;
                Executor executor = this.a;
                executor.getClass();
                ((mep) obj).b = executor;
                this.a = null;
            } else {
                Executor executor2 = this.a;
                executor2.getClass();
                this.a = null;
                this.b = runnable;
                executor2.execute(this);
            }
        } finally {
            this.c = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r3;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.c) {
            Runnable runnable = this.b;
            runnable.getClass();
            this.b = null;
            runnable.run();
            return;
        }
        mep mepVar = new mep();
        mepVar.a = currentThread;
        kub kubVar = this.d;
        kubVar.getClass();
        kubVar.a = mepVar;
        this.d = null;
        try {
            Runnable runnable2 = this.b;
            runnable2.getClass();
            this.b = null;
            runnable2.run();
            while (true) {
                ?? r0 = mepVar.c;
                if (r0 == 0 || (r3 = mepVar.b) == 0) {
                    break;
                }
                mepVar.c = null;
                mepVar.b = null;
                r3.execute(r0);
            }
        } finally {
            mepVar.a = null;
        }
    }
}
