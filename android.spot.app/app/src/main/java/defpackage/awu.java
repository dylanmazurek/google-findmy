package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awu extends mpe implements moh {
    private final /* synthetic */ int v;
    public static final awu u = new awu(20);
    public static final awu t = new awu(19);
    public static final awu s = new awu(18);
    public static final awu r = new awu(17);
    public static final awu q = new awu(16);
    public static final awu p = new awu(15);
    public static final awu o = new awu(14);
    public static final awu n = new awu(13);
    public static final awu m = new awu(12);
    public static final awu l = new awu(11);
    public static final awu k = new awu(10);
    public static final awu j = new awu(9);
    public static final awu i = new awu(8);
    public static final awu h = new awu(7);
    public static final awu g = new awu(6);
    public static final awu f = new awu(5);
    public static final awu e = new awu(4);
    public static final awu d = new awu(3);
    public static final awu c = new awu(2);
    public static final awu b = new awu(1);
    public static final awu a = new awu(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awu(int i2) {
        super(1);
        this.v = i2;
    }

    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        switch (this.v) {
            case 0:
                return mlh.a;
            case 1:
                return mlh.a;
            case 2:
                axp axpVar = (axp) obj;
                axpVar.b = true;
                qh.e(axpVar);
                return mlh.a;
            case 3:
                ((axp) obj).x();
                return mlh.a;
            case 4:
                ((axn) obj).a();
                return mlh.a;
            case 5:
                axn axnVar = (axn) obj;
                axm a2 = axnVar.a();
                axnVar.a();
                a2.c = false;
                return mlh.a;
            case 6:
                ((axn) obj).a();
                return mlh.a;
            case 7:
                ((axn) obj).a();
                return mlh.a;
            case 8:
                axn axnVar2 = (axn) obj;
                axm a3 = axnVar2.a();
                axnVar2.a();
                a3.c = false;
                return mlh.a;
            case 9:
                ((axn) obj).a();
                return mlh.a;
            case 10:
                azt aztVar = ((azq) obj).z;
                if (aztVar != null) {
                    aztVar.invalidate();
                }
                return mlh.a;
            case 11:
                azq azqVar = (azq) obj;
                if (azqVar.y()) {
                    ayi ayiVar = azqVar.x;
                    if (ayiVar == null) {
                        azqVar.au(true);
                    } else {
                        ayi ayiVar2 = azq.n;
                        ayiVar2.a = ayiVar.a;
                        ayiVar2.b = ayiVar.b;
                        ayiVar2.c = ayiVar.c;
                        ayiVar2.d = ayiVar.d;
                        ayiVar2.e = ayiVar.e;
                        ayiVar2.f = ayiVar.f;
                        ayiVar2.g = ayiVar.g;
                        azqVar.au(true);
                        ayi ayiVar3 = azq.n;
                        if (ayiVar3.a != ayiVar.a || ayiVar3.b != ayiVar.b || ayiVar3.c != ayiVar.c || ayiVar3.d != ayiVar.d || ayiVar3.e != ayiVar.e || ayiVar3.f != ayiVar.f || !a.n(ayiVar3.g, ayiVar.g)) {
                            ayr ayrVar = azqVar.q;
                            ayz ayzVar = ayrVar.o;
                            if (ayzVar.m > 0) {
                                if (ayzVar.l || ayzVar.k) {
                                    ayr.ap(ayrVar);
                                }
                                ayzVar.q.m();
                            }
                            baw bawVar = ayrVar.t;
                            if (bawVar != null) {
                                bawVar.z(ayrVar);
                            }
                        }
                    }
                }
                return mlh.a;
            case 12:
                azs azsVar = (azs) obj;
                if (azsVar.y()) {
                    aqh aqhVar = azsVar.b;
                    aqf c2 = aqhVar.c();
                    aqhVar.f();
                    if (c2 != aqhVar.c()) {
                        ft.h(aqhVar);
                    }
                }
                return mlh.a;
            case 13:
                obj.getClass();
                return Boolean.valueOf(!((azv) obj).y());
            case 14:
                ayr ayrVar2 = (ayr) obj;
                if (ayrVar2.ad()) {
                    ayr.ap(ayrVar2);
                }
                return mlh.a;
            case 15:
                ayr ayrVar3 = (ayr) obj;
                if (ayrVar3.ad()) {
                    ayr.ap(ayrVar3);
                }
                return mlh.a;
            case 16:
                ayr ayrVar4 = (ayr) obj;
                if (ayrVar4.ad()) {
                    ayr.an(ayrVar4);
                }
                return mlh.a;
            case 17:
                ayr ayrVar5 = (ayr) obj;
                if (ayrVar5.ad()) {
                    ayr.an(ayrVar5);
                }
                return mlh.a;
            case 18:
                ayr ayrVar6 = (ayr) obj;
                if (ayrVar6.ad()) {
                    ayr.ao(ayrVar6, false, 7);
                }
                return mlh.a;
            case 19:
                ayr ayrVar7 = (ayr) obj;
                if (ayrVar7.ad()) {
                    ayr.aq(ayrVar7, false, 7);
                }
                return mlh.a;
            default:
                ayr ayrVar8 = (ayr) obj;
                if (ayrVar8.ad()) {
                    ayrVar8.K();
                }
                return mlh.a;
        }
    }
}
