package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bts implements Runnable {
    private final Callable a;
    private final buc b;
    private final Handler c;

    public bts(Handler handler, Callable callable, buc bucVar) {
        this.a = callable;
        this.b = bucVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kvw kvwVar;
        try {
            kvwVar = ((btn) this.a).call();
        } catch (Exception unused) {
            kvwVar = null;
        }
        this.c.post(new bx(this.b, kvwVar, 15, (char[]) null));
    }
}
