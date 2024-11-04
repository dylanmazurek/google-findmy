package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfl implements cfo {
    final cfk a;
    final cfo b;
    int c = -1;

    public cfl(cfk cfkVar, cfo cfoVar) {
        this.a = cfkVar;
        this.b = cfoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a.h(this);
    }

    public final void c() {
        this.a.j(this);
    }

    @Override // defpackage.cfo
    public final void d(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.d(obj);
        }
    }
}
