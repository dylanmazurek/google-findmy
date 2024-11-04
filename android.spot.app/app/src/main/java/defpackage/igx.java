package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igx {
    public final jzd a;
    public final kyf b;
    public final hnu d;
    public final kuv e;
    public final kuv f;
    private final hjq h;
    private final ktn i;
    public jyz c = null;
    private volatile igq g = igq.NOT_STARTED;

    public igx(kuv kuvVar, hnu hnuVar, kuv kuvVar2, jzd jzdVar, ktn ktnVar, kyf kyfVar, hjq hjqVar) {
        this.f = kuvVar;
        this.d = hnuVar;
        this.e = kuvVar2;
        this.a = jzdVar;
        this.i = ktnVar;
        this.b = kyfVar;
        this.h = hjqVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [jzd, java.lang.Object] */
    public final jyz a(lim limVar, lim limVar2, ibu ibuVar) {
        idt idtVar = ibuVar.b;
        if (icv.e(idtVar)) {
            ktn ktnVar = this.i;
            hot hotVar = (hot) ktnVar.a;
            icn icnVar = new icn(idtVar, (hot) ktnVar.b, (hot) ktnVar.d, hotVar, ktnVar.c);
            return jbx.d(jbx.d(icnVar.a.b(ico.READ_PROVISIONING_STATE, jer.i(limVar), new icz(1))).f(new etl(10), icnVar.b)).f(new hxk(this, icnVar, limVar, limVar2, 4), this.a);
        }
        throw new iek("The connected device does not support Eddystone configuration via FastPair.");
    }

    public final void b(igq igqVar) {
        this.g = igqVar;
        if (igqVar.equals(igq.FAILED)) {
            return;
        }
        hjq hjqVar = this.h;
        ((eow) hjqVar.b).j(eow.h((kyf) hjqVar.a), (eox) eow.b.get(igqVar));
    }
}
