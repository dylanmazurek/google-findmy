package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class erd extends mpe implements mom {
    final /* synthetic */ aox a;
    final /* synthetic */ Object b;
    final /* synthetic */ gga c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erd(aox aoxVar, gga ggaVar, Object obj) {
        super(3);
        this.a = aoxVar;
        this.c = ggaVar;
        this.b = obj;
    }

    @Override // defpackage.mom
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        abi abiVar = (abi) obj2;
        ((Number) obj3).intValue();
        ((tv) obj).getClass();
        aox d = rc.d(this.a, "DEVICE_IMAGE_TEST_TAG");
        int i = aon.a;
        awh d2 = xt.d(aom.e);
        int a = abd.a(abiVar);
        acd c = abiVar.c();
        aox e = de.e(abiVar, d);
        int i2 = axu.a;
        mnw mnwVar = axt.a;
        abiVar.J();
        abiVar.v();
        if (abiVar.F()) {
            abiVar.k(mnwVar);
        } else {
            abiVar.x();
        }
        agx.a(abiVar, d2, axt.d);
        agx.a(abiVar, c, axt.c);
        mol molVar = axt.e;
        if (abiVar.F() || !amr.i(abiVar.g(), Integer.valueOf(a))) {
            Integer valueOf = Integer.valueOf(a);
            abiVar.w(valueOf);
            abiVar.i(valueOf, molVar);
        }
        gga ggaVar = this.c;
        agx.a(abiVar, e, axt.b);
        aox aoxVar = aox.d;
        float floatValue = ((Number) ggaVar.c()).floatValue();
        if (floatValue != 1.0f || floatValue != 1.0f) {
            aoxVar = jw.c(aoxVar, floatValue, floatValue, 0.0f, false, 131068);
        }
        dhu.a(this.b, aoxVar, abiVar, 56);
        abiVar.n();
        return mlh.a;
    }
}
