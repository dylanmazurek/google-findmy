package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eq {
    private static final Object b = new Object();
    private static Executor c;
    public Executor a;
    private final fa d;

    public eq(fa faVar) {
        this.d = faVar;
    }

    public final bfi a() {
        if (this.a == null) {
            synchronized (b) {
                if (c == null) {
                    c = Executors.newFixedThreadPool(2);
                }
            }
            this.a = c;
        }
        return new bfi(this.a, this.d, null);
    }
}
