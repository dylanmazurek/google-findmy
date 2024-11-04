package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkt {
    public final dkr a;
    public final dkb b;
    public final dmf c;
    public final ddh d;
    public final hiz e;
    public final bpz f;
    public final kvu g;
    private final dks h;

    public dkt(dmf dmfVar, dhx dhxVar, dmm dmmVar, dmm dmmVar2, dmm dmmVar3) {
        this.c = dmfVar;
        dks dksVar = new dks(dhxVar);
        this.h = dksVar;
        dkb dkbVar = new dkb();
        this.b = dkbVar;
        synchronized (this) {
            synchronized (dkbVar) {
            }
        }
        this.f = new bpz();
        this.d = new ddh();
        this.a = new dkr(dmmVar, dmmVar2, dmmVar3, this, this);
        this.g = new kvu(dksVar);
        this.e = new hiz((byte[]) null);
        dmfVar.a = this;
    }

    public final synchronized void a(dkx dkxVar, dir dirVar) {
        this.d.b(dirVar, dkxVar);
    }

    public final synchronized void b(dkx dkxVar, dir dirVar, dkz dkzVar) {
        if (dkzVar != null) {
            if (dkzVar.a) {
                this.b.b(dirVar, dkzVar);
            }
        }
        this.d.b(dirVar, dkxVar);
    }
}
