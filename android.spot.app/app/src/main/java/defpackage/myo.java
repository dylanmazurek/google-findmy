package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class myo implements myk {
    private final /* synthetic */ int b;

    public myo(int i) {
        this.b = i;
    }

    @Override // defpackage.myk
    public final mwv a(mys mysVar) {
        if (this.b != 0) {
            return new mwy(myh.a, 0);
        }
        return new mwo(new myn(mysVar, (mmx) null, 0));
    }

    public final String toString() {
        if (this.b != 0) {
            return "SharingStarted.Eagerly";
        }
        return "SharingStarted.Lazily";
    }
}
