package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjo {
    public volatile Object a;
    public volatile fjm b;
    private final Executor c;

    public fjo(Looper looper, Object obj, String str) {
        this.c = new qp(looper, 4);
        fma.aS(obj, "Listener must not be null");
        this.a = obj;
        fma.aP(str);
        this.b = new fjm(obj, str);
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }

    public final void b(fjn fjnVar) {
        this.c.execute(new fbh(this, fjnVar, 8, (short[]) null));
    }
}
