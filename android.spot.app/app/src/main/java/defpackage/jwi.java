package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwi implements Runnable {
    final jwq a;
    final jyz b;

    public jwi(jwq jwqVar, jyz jyzVar) {
        this.a = jwqVar;
        this.b = jyzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jwc jwcVar = jwq.k;
        if (this.a.value == this) {
            jyz jyzVar = this.b;
            if (jwq.k.f(this.a, this, jwq.i(jyzVar))) {
                jwq.k(this.a, false);
            }
        }
    }
}
