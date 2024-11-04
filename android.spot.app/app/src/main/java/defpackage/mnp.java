package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mnp extends mnl implements mpb {
    private final int a;

    public mnp(int i, mmx mmxVar) {
        super(mmxVar);
        this.a = i;
    }

    @Override // defpackage.mpb
    public final int bQ() {
        return this.a;
    }

    @Override // defpackage.mnj
    public final String toString() {
        if (this.q == null) {
            String d = mpd.d(this);
            d.getClass();
            return d;
        }
        return super.toString();
    }
}
