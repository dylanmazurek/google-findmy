package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqu extends aow implements ayj {
    public moh a;

    public aqu(moh mohVar) {
        this.a = mohVar;
    }

    @Override // defpackage.ayj
    public final awi a(awj awjVar, awg awgVar, long j) {
        awi cd;
        awr l = awgVar.l(j);
        cd = awjVar.cd(l.a, l.b, mly.a, new tn(l, this, 10, null));
        return cd;
    }

    @Override // defpackage.aow
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.a + ')';
    }
}
