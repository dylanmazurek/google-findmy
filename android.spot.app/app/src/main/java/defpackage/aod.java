package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aod implements aoc {
    private final ala a = new ala();

    @Override // defpackage.aoc
    public /* synthetic */ aoe j(aoe aoeVar, aoe aoeVar2, aoe aoeVar3) {
        return null;
    }

    public final void k(int i) {
        int i2;
        do {
            i2 = this.a.get();
            if ((i2 & i) == 0) {
            } else {
                return;
            }
        } while (!this.a.compareAndSet(i2, i2 | i));
    }

    public final boolean l(int i) {
        if ((i & this.a.get()) != 0) {
            return true;
        }
        return false;
    }
}
