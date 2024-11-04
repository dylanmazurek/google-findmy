package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class mfb extends mav {
    private final mav a;

    public mfb(mav mavVar) {
        this.a = mavVar;
    }

    @Override // defpackage.lyt
    public final lyv a(mbg mbgVar, lys lysVar) {
        return this.a.a(mbgVar, lysVar);
    }

    @Override // defpackage.lyt
    public final String b() {
        return this.a.b();
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("delegate", this.a);
        return q.toString();
    }
}
