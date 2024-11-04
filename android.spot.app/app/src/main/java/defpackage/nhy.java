package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class nhy implements nll {
    public boolean a;
    final /* synthetic */ nie b;
    private final nkv c;

    public nhy(nie nieVar) {
        this.b = nieVar;
        this.c = new nkv(nieVar.c.dv());
    }

    @Override // defpackage.nll
    public long a(nkp nkpVar, long j) {
        try {
            return this.b.c.a(nkpVar, j);
        } catch (IOException e) {
            this.b.b.e();
            c();
            throw e;
        }
    }

    public final void c() {
        int i = this.b.e;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            nie.l(this.c);
            this.b.e = 6;
            return;
        }
        throw new IllegalStateException(a.ae(i, "state: "));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        this.a = true;
    }

    @Override // defpackage.nll
    public final nln dv() {
        return this.c;
    }
}
