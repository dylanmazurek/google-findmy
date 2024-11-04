package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wb implements agt {
    public final we a;
    public moh b;
    public moh c;
    final /* synthetic */ kgf d;

    public wb(kgf kgfVar, we weVar, moh mohVar, moh mohVar2) {
        this.d = kgfVar;
        this.a = weVar;
        this.b = mohVar;
        this.c = mohVar2;
    }

    @Override // defpackage.agt
    public final Object a() {
        b(((wi) this.d.a).c());
        return this.a.a();
    }

    public final void b(wc wcVar) {
        Object a = this.c.a(wcVar.b());
        if (((wi) this.d.a).s()) {
            this.a.h(this.c.a(wcVar.a()), a, (vj) this.b.a(wcVar));
        } else {
            this.a.i(a, (vj) this.b.a(wcVar));
        }
    }
}
