package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dle implements dlf, dtv {
    private static final buf a = dtx.a(20, new dmh(1));
    private dlf b;
    private boolean c;
    private boolean d;
    private final iyu e = new iyu();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dle d(dlf dlfVar) {
        dle dleVar = (dle) a.a();
        bsc.q(dleVar);
        dleVar.d = false;
        dleVar.c = true;
        dleVar.b = dlfVar;
        return dleVar;
    }

    @Override // defpackage.dlf
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.dlf
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.dlf
    public final Object c() {
        return this.b.c();
    }

    @Override // defpackage.dlf
    public final synchronized void e() {
        this.e.a();
        this.d = true;
        if (!this.c) {
            this.b.e();
            this.b = null;
            a.b(this);
        }
    }

    @Override // defpackage.dtv
    public final iyu f() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g() {
        this.e.a();
        if (this.c) {
            this.c = false;
            if (this.d) {
                e();
                return;
            }
            return;
        }
        throw new IllegalStateException("Already unlocked");
    }
}
