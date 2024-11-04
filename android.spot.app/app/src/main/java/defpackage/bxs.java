package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bxs {
    private final bya a;
    brq[] b;

    public bxs(bya byaVar) {
        this.a = byaVar;
    }

    public bya a() {
        h();
        return this.a;
    }

    public void g(int i, brq brqVar) {
        if (this.b == null) {
            this.b = new brq[9];
        }
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((i & i2) != 0) {
                this.b[bqr.d(i2)] = brqVar;
            }
        }
    }

    public final void h() {
        brq[] brqVarArr = this.b;
        if (brqVarArr != null) {
            brq brqVar = brqVarArr[bqr.d(1)];
            brq brqVar2 = this.b[bqr.d(2)];
            if (brqVar2 == null) {
                brqVar2 = this.a.f(2);
            }
            if (brqVar == null) {
                brqVar = this.a.f(1);
            }
            c(brq.b(brqVar, brqVar2));
            brq brqVar3 = this.b[bqr.d(16)];
            if (brqVar3 != null) {
                e(brqVar3);
            }
            brq brqVar4 = this.b[bqr.d(32)];
            if (brqVar4 != null) {
                d(brqVar4);
            }
            brq brqVar5 = this.b[bqr.d(64)];
            if (brqVar5 != null) {
                f(brqVar5);
            }
        }
    }

    public bxs() {
        this(new bya());
    }

    public void b(brq brqVar) {
    }

    public void c(brq brqVar) {
    }

    public void d(brq brqVar) {
    }

    public void e(brq brqVar) {
    }

    public void f(brq brqVar) {
    }
}
