package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awc implements axa {
    final /* synthetic */ awd a;
    final /* synthetic */ Object b;

    public awc(awd awdVar, Object obj) {
        this.a = awdVar;
        this.b = obj;
    }

    @Override // defpackage.axa
    public final void a() {
        this.a.h();
        ayr ayrVar = (ayr) this.a.i.remove(this.b);
        if (ayrVar != null) {
            awd awdVar = this.a;
            if (awdVar.m > 0) {
                int indexOf = awdVar.a.A().indexOf(ayrVar);
                int size = this.a.a.A().size();
                awd awdVar2 = this.a;
                int i = awdVar2.m;
                if (indexOf >= size - i) {
                    awdVar2.l++;
                    awdVar2.m = i - 1;
                    int size2 = awdVar2.a.A().size();
                    awd awdVar3 = this.a;
                    int i2 = (size2 - awdVar3.m) - awdVar3.l;
                    awdVar3.k(indexOf, i2);
                    this.a.g(i2);
                    return;
                }
                throw new IllegalStateException("Item is not in pre-composed item range");
            }
            throw new IllegalStateException("No pre-composed items to dispose");
        }
    }
}
