package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dty implements kps {
    static final dty a = new dty();
    private static final kpr b;
    private static final kpr c;
    private static final kpr d;
    private static final kpr e;
    private static final kpr f;
    private static final kpr g;
    private static final kpr h;
    private static final kpr i;
    private static final kpr j;
    private static final kpr k;
    private static final kpr l;
    private static final kpr m;
    private static final kpr n;
    private static final kpr o;
    private static final kpr p;

    static {
        kub kubVar = new kub("projectNumber");
        kubVar.f(new kpv(1, kpy.DEFAULT));
        b = kubVar.e();
        kub kubVar2 = new kub("messageId");
        kubVar2.f(new kpv(2, kpy.DEFAULT));
        c = kubVar2.e();
        kub kubVar3 = new kub("instanceId");
        kubVar3.f(new kpv(3, kpy.DEFAULT));
        d = kubVar3.e();
        kub kubVar4 = new kub("messageType");
        kubVar4.f(new kpv(4, kpy.DEFAULT));
        e = kubVar4.e();
        kub kubVar5 = new kub("sdkPlatform");
        kubVar5.f(new kpv(5, kpy.DEFAULT));
        f = kubVar5.e();
        kub kubVar6 = new kub("packageName");
        kubVar6.f(new kpv(6, kpy.DEFAULT));
        g = kubVar6.e();
        kub kubVar7 = new kub("collapseKey");
        kubVar7.f(new kpv(7, kpy.DEFAULT));
        h = kubVar7.e();
        kub kubVar8 = new kub("priority");
        kubVar8.f(new kpv(8, kpy.DEFAULT));
        i = kubVar8.e();
        kub kubVar9 = new kub("ttl");
        kubVar9.f(new kpv(9, kpy.DEFAULT));
        j = kubVar9.e();
        kub kubVar10 = new kub("topic");
        kubVar10.f(new kpv(10, kpy.DEFAULT));
        k = kubVar10.e();
        kub kubVar11 = new kub("bulkId");
        kubVar11.f(new kpv(11, kpy.DEFAULT));
        l = kubVar11.e();
        kub kubVar12 = new kub("event");
        kubVar12.f(new kpv(12, kpy.DEFAULT));
        m = kubVar12.e();
        kub kubVar13 = new kub("analyticsLabel");
        kubVar13.f(new kpv(13, kpy.DEFAULT));
        n = kubVar13.e();
        kub kubVar14 = new kub("campaignId");
        kubVar14.f(new kpv(14, kpy.DEFAULT));
        o = kubVar14.e();
        kub kubVar15 = new kub("composerLabel");
        kubVar15.f(new kpv(15, kpy.DEFAULT));
        p = kubVar15.e();
    }

    private dty() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kpp
    public final /* synthetic */ void a(Object obj, Object obj2) {
        ktc ktcVar = (ktc) obj;
        obj2.a(b, ktcVar.a);
        obj2.b(c, ktcVar.b);
        obj2.b(d, ktcVar.c);
        obj2.b(e, ktcVar.d);
        obj2.b(f, ktcVar.e);
        obj2.b(g, ktcVar.f);
        obj2.b(h, ktcVar.g);
        kqa kqaVar = (kqa) obj2;
        kqaVar.e(i, 0);
        kqaVar.e(j, ktcVar.h);
        obj2.b(k, ktcVar.i);
        obj2.a(l, 0L);
        obj2.b(m, ktcVar.j);
        obj2.b(n, ktcVar.k);
        obj2.a(o, 0L);
        obj2.b(p, ktcVar.l);
    }
}
