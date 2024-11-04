package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeh implements eiw {
    public lps a;
    public lqc b;
    public boolean c;
    public Long d;
    public short e;
    private String f;
    private lim g;
    private boolean h;
    private eiu i;
    private eiv j;
    private ekk k;
    private ekl l;

    eeh() {
    }

    @Override // defpackage.eiw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final edy c() {
        eiu eiuVar = this.i;
        if (eiuVar != null) {
            this.j = eiuVar.a();
        } else if (this.j == null) {
            this.j = eiv.c().a();
        }
        ekk ekkVar = this.k;
        if (ekkVar != null) {
            this.l = ekkVar.a();
        } else if (this.l == null) {
            this.l = ekl.a().a();
        }
        return new edy(this.f, this.a, this.b, this.c, this.d, this.g, this.h, this.j, this.l, (~this.e) & 511);
    }

    @Override // defpackage.eiw
    public final eiu b() {
        if (this.i == null) {
            eiv eivVar = this.j;
            if (eivVar == null) {
                this.i = eiv.c();
                this.e = (short) (this.e | 128);
            } else {
                this.i = eivVar.d();
                this.j = null;
            }
        }
        return this.i;
    }

    @Override // defpackage.eiw
    public final ekk d() {
        if (this.k == null) {
            ekl eklVar = this.l;
            if (eklVar == null) {
                this.k = ekl.a();
                this.e = (short) (this.e | 256);
            } else {
                this.k = new ekk(eklVar);
                this.l = null;
            }
        }
        return this.k;
    }

    public final void e(String str) {
        this.f = str;
        this.e = (short) (this.e | 1);
    }

    public final void f(boolean z) {
        this.h = z;
        this.e = (short) (this.e | 64);
    }

    public final void g(lim limVar) {
        this.g = limVar;
        this.e = (short) (this.e | 32);
    }

    public eeh(edy edyVar) {
        this.f = edyVar.a;
        this.a = edyVar.b;
        this.b = edyVar.c;
        this.c = edyVar.d;
        this.d = edyVar.e;
        this.g = edyVar.f;
        this.h = edyVar.g;
        this.j = edyVar.h;
        this.l = edyVar.i;
        this.e = (short) 511;
    }
}
