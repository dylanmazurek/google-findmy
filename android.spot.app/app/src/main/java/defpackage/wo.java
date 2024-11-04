package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wo extends mpe implements moh {
    private final /* synthetic */ int u;
    public static final wo t = new wo(19);
    public static final wo s = new wo(18);
    public static final wo r = new wo(17);
    public static final wo q = new wo(16);
    public static final wo p = new wo(15);
    public static final wo o = new wo(14);
    public static final wo n = new wo(13);
    public static final wo m = new wo(12);
    public static final wo l = new wo(11);
    public static final wo k = new wo(10);
    public static final wo j = new wo(9);
    public static final wo i = new wo(8);
    public static final wo h = new wo(7);
    public static final wo g = new wo(6);
    public static final wo f = new wo(5);
    public static final wo e = new wo(4);
    public static final wo d = new wo(3);
    public static final wo c = new wo(2);
    public static final wo b = new wo(1);
    public static final wo a = new wo(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo(int i2) {
        super(1);
        this.u = i2;
    }

    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        boolean z;
        switch (this.u) {
            case 0:
                ux uxVar = (ux) obj;
                return new aqk(a.k(uxVar.a, uxVar.b));
            case 1:
                long j2 = ((aqk) obj).a;
                return new ux(aqk.b(j2), aqk.c(j2));
            case 2:
                aql aqlVar = (aql) obj;
                return new uz(aqlVar.b, aqlVar.c, aqlVar.d, aqlVar.e);
            case 3:
                uz uzVar = (uz) obj;
                return new aql(uzVar.a, uzVar.b, uzVar.c, uzVar.d);
            case 4:
                long j3 = ((aqn) obj).a;
                return new ux(aqn.b(j3), aqn.a(j3));
            case 5:
                ux uxVar2 = (ux) obj;
                return new aqn(a.k(uxVar2.a, uxVar2.b));
            case 6:
                return mlh.a;
            case 7:
                return mlh.a;
            case 8:
                return mlh.a;
            case 9:
                return mlh.a;
            case 10:
                return Long.valueOf(((Number) obj).longValue());
            case 11:
                return mlh.a;
            case 12:
                return Boolean.valueOf(!(((aov) obj) instanceof aos));
            case 13:
                ((apy) obj).b();
                return mlh.a;
            case 14:
                int i2 = ((apr) obj).a;
                return aqd.a;
            case 15:
                int i3 = ((apr) obj).a;
                return aqd.a;
            case 16:
                Boolean f2 = ij.f((aqh) obj, 7);
                if (f2 != null) {
                    z = f2.booleanValue();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                return mlh.a;
            case 18:
                return mlh.a;
            case 19:
                kv.f((asn) obj, aqx.d, 0.0f, null, 126);
                return mlh.a;
            default:
                return true;
        }
    }
}
