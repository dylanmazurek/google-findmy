package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erg extends mpe implements moh {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erg(Object obj, agt agtVar, int i) {
        super(1);
        this.c = i;
        this.a = obj;
        this.b = agtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, ble] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r9v12, types: [adt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        float floatValue;
        float floatValue2;
        float floatValue3;
        float floatValue4;
        float floatValue5;
        float floatValue6;
        float floatValue7;
        float floatValue8;
        float floatValue9;
        float floatValue10;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ((mvm) this.b).a.removeCallbacks(this.a);
                            return mlh.a;
                        }
                        avs avsVar = (avs) obj;
                        avsVar.getClass();
                        this.a.h(new blh(this.b.cg(blm.a(avsVar.d()))));
                        return mlh.a;
                    }
                    ark arkVar = (ark) obj;
                    arkVar.getClass();
                    floatValue9 = ((Number) this.b.a()).floatValue();
                    arkVar.q(floatValue9);
                    floatValue10 = ((Number) this.b.a()).floatValue();
                    arkVar.r(floatValue10);
                    arkVar.p(((Number) ((gga) this.a).c()).floatValue());
                    return mlh.a;
                }
                ark arkVar2 = (ark) obj;
                arkVar2.getClass();
                floatValue6 = ((Number) this.b.a()).floatValue();
                arkVar2.q(floatValue6);
                floatValue7 = ((Number) this.b.a()).floatValue();
                arkVar2.r(floatValue7);
                floatValue8 = ((Number) this.a.a()).floatValue();
                arkVar2.p(floatValue8);
                return mlh.a;
            }
            eeh eehVar = (eeh) obj;
            eehVar.getClass();
            eehVar.e((String) this.b);
            eehVar.g((lim) this.a);
            return mlh.a;
        }
        ark arkVar3 = (ark) obj;
        arkVar3.getClass();
        ?? r0 = this.a;
        ?? r1 = this.b;
        floatValue = ((Number) r0.a()).floatValue();
        floatValue2 = ((Number) r1.a()).floatValue();
        float b = aqn.b(arkVar3.o);
        float a = aqn.a(arkVar3.o);
        float f = floatValue2 - 1.0f;
        double radians = (float) Math.toRadians(floatValue);
        float f2 = (((-((float) Math.sin(radians))) * f) / 2.0f) * 0.7843602f * b;
        float cos = ((((float) Math.cos(radians)) * f) / 2.0f) * 0.7843602f * a;
        ?? r12 = this.a;
        long k = a.k(f2, cos);
        floatValue3 = ((Number) r12.a()).floatValue();
        arkVar3.p(floatValue3);
        floatValue4 = ((Number) this.b.a()).floatValue();
        arkVar3.q(floatValue4);
        floatValue5 = ((Number) this.b.a()).floatValue();
        arkVar3.r(floatValue5);
        arkVar3.v(aqk.b(k));
        arkVar3.w(aqk.c(k));
        return mlh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erg(Object obj, Object obj2, int i) {
        super(1);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
