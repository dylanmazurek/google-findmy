package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hte implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;

    public hte(mko mkoVar, mko mkoVar2, mko mkoVar3) {
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
    }

    @Override // defpackage.mko, defpackage.mkn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jer a() {
        jer jerVar = (jer) ((lsi) this.a).b;
        jer jerVar2 = (jer) ((lsi) this.b).b;
        if (!jerVar.g() && !jerVar2.g()) {
            return jdl.a;
        }
        mko mkoVar = this.c;
        mkoVar.getClass();
        return jer.i(new hsp(mkoVar, 2));
    }
}
