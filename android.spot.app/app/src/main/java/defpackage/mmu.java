package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmu implements mna {
    private final moh a;
    private final mna b;

    public mmu(mna mnaVar, moh mohVar) {
        this.a = mohVar;
        this.b = mnaVar instanceof mmu ? ((mmu) mnaVar).b : mnaVar;
    }

    public final mmz a(mmz mmzVar) {
        return (mmz) this.a.a(mmzVar);
    }

    public final boolean b(mna mnaVar) {
        mnaVar.getClass();
        if (mnaVar != this && this.b != mnaVar) {
            return false;
        }
        return true;
    }

    public mmu() {
        this(mmy.k, cka.q);
    }
}
