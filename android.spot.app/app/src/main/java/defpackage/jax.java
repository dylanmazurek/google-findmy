package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jax implements Runnable, jbf {
    private jbe a;
    private jbe b;
    private final boolean c = ijs.h(null);
    private boolean d;
    private boolean e;
    private boolean f;

    public jax(jbe jbeVar, boolean z) {
        this.f = false;
        this.a = jbeVar;
        this.b = jbeVar;
        this.f = z;
    }

    private final void b() {
        this.d = true;
        boolean z = this.c;
        jbe jbeVar = this.a;
        if (z && !this.e) {
            ijs.g();
        }
        jbeVar.i();
        this.a = null;
    }

    public final void a(jyz jyzVar) {
        if (!this.d) {
            if (!this.e) {
                this.e = true;
                this.a.j();
                jyzVar.c(this, jxv.a);
                return;
            }
            throw new IllegalStateException("Signal is already attached to future");
        }
        throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
    }

    @Override // defpackage.jbf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        jbe jbeVar = this.b;
        try {
            this.b = null;
            if (!this.e) {
                if (!this.d) {
                    b();
                } else {
                    throw new IllegalStateException("Span was already closed!");
                }
            }
            if (jbeVar != null) {
                jbeVar.close();
            }
            if (this.f) {
                jbu.e(jbu.f(), jaw.a);
            }
        } catch (Throwable th) {
            if (jbeVar != null) {
                try {
                    jbeVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.d && this.e) {
            b();
        } else {
            ijs.e(new gpm(6));
        }
    }
}
