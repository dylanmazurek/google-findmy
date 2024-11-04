package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpk {
    private final jfd c;
    private volatile Process d;
    public volatile boolean b = false;
    public final jei a = new ewy(this, 18);

    public hpk(jfk jfkVar) {
        this.c = new jfd(jfkVar);
    }

    public final void a(String str) {
        if (!str.isEmpty()) {
            if (this.d != null) {
                try {
                    if (this.d.exitValue() != 0) {
                        this.b = true;
                        this.d = null;
                    }
                } catch (IllegalThreadStateException unused) {
                    return;
                }
            }
            if (!this.b) {
                synchronized (this) {
                    jfd jfdVar = this.c;
                    if (jfdVar.a && jfdVar.a(TimeUnit.MILLISECONDS) < 60000) {
                        return;
                    }
                    this.c.c();
                    this.c.d();
                    this.d = (Process) this.a.a(str);
                }
            }
        }
    }
}
