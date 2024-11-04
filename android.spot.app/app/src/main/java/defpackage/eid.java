package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eid extends elf {
    public eiu a;
    public eiv b;
    private ekk c;
    private ekl d;

    public eid() {
    }

    @Override // defpackage.elf, defpackage.eiw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final elg c() {
        eiu eiuVar = this.a;
        if (eiuVar != null) {
            this.b = eiuVar.a();
        } else if (this.b == null) {
            this.b = eiv.c().a();
        }
        ekk ekkVar = this.c;
        if (ekkVar != null) {
            this.d = ekkVar.a();
        } else if (this.d == null) {
            this.d = ekl.a().a();
        }
        return new eij(this.b, this.d);
    }

    @Override // defpackage.eiw
    public final eiu b() {
        if (this.a == null) {
            eiv eivVar = this.b;
            if (eivVar == null) {
                this.a = eiv.c();
            } else {
                this.a = eivVar.d();
                this.b = null;
            }
        }
        return this.a;
    }

    @Override // defpackage.eiw
    public final ekk d() {
        if (this.c == null) {
            ekl eklVar = this.d;
            if (eklVar == null) {
                this.c = ekl.a();
            } else {
                this.c = new ekk(eklVar);
                this.d = null;
            }
        }
        return this.c;
    }

    public eid(elg elgVar) {
        this.b = elgVar.a();
        this.d = elgVar.c();
    }
}
