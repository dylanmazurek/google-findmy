package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ts extends mpe implements moh {
    private final /* synthetic */ int u;
    public static final ts t = new ts(20);
    public static final ts s = new ts(19);
    public static final ts r = new ts(18);
    public static final ts q = new ts(17);
    public static final ts p = new ts(16);
    public static final ts o = new ts(15);
    public static final ts n = new ts(14);
    public static final ts m = new ts(13);
    public static final ts l = new ts(12);
    public static final ts k = new ts(11);
    public static final ts j = new ts(10);
    public static final ts i = new ts(9);
    public static final ts h = new ts(8);
    public static final ts g = new ts(6);
    public static final ts f = new ts(5);
    public static final ts e = new ts(4);
    public static final ts d = new ts(3);
    public static final ts c = new ts(2);
    public static final ts b = new ts(1);
    public static final ts a = new ts(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts(int i2) {
        super(1);
        this.u = i2;
    }

    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        boolean z = false;
        switch (this.u) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                Resources resources = (Resources) obj;
                resources.getClass();
                if ((resources.getConfiguration().uiMode & 48) == 32) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                long j2 = ((aqx) obj).f;
                float[] fArr = aru.a;
                long e2 = aqx.e(j2, aru.f);
                return new uz(aqx.a(e2), aqx.d(e2), aqx.c(e2), aqx.b(e2));
            case 3:
                return new atk(c, new oq((ars) obj, 8));
            case 4:
                long j3 = ((aro) obj).b;
                return new ux(aro.a(j3), aro.b(j3));
            case 5:
                ux uxVar = (ux) obj;
                return new aro(kk.p(uxVar.a, uxVar.b));
            case 6:
                return qh.b(0.0f, null, 7);
            case 7:
                ((ark) obj).o(false);
                return mlh.a;
            case 8:
                ((mnw) obj).a();
                return mlh.a;
            case 9:
                long j4 = ((bli) obj).a;
                return new ux(bli.a(j4), bli.b(j4));
            case 10:
                ux uxVar2 = (ux) obj;
                return new bli(a.k(uxVar2.a, uxVar2.b));
            case 11:
                return new uw(((blh) obj).a);
            case 12:
                return new blh(((uw) obj).a);
            case 13:
                return new uw(((Number) obj).floatValue());
            case 14:
                return Float.valueOf(((uw) obj).a);
            case 15:
                long j5 = ((blk) obj).a;
                return new ux(blk.a(j5), blk.b(j5));
            case 16:
                ux uxVar3 = (ux) obj;
                return new blk(bee.c(Math.round(uxVar3.a), Math.round(uxVar3.b)));
            case 17:
                long j6 = ((blm) obj).a;
                return new ux(blm.b(j6), blm.a(j6));
            case 18:
                ux uxVar4 = (ux) obj;
                return new blm(bef.m(moz.ac(Math.round(uxVar4.a), 0), moz.ac(Math.round(uxVar4.b), 0)));
            case 19:
                return new uw(((Number) obj).intValue());
            default:
                return Integer.valueOf((int) ((uw) obj).a);
        }
    }
}
