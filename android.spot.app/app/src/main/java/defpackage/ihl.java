package defpackage;

import java.security.SecureRandom;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihl implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final mko d;
    private final mko e;
    private final mko f;
    private final mko g;
    private final mko h;

    public ihl(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8) {
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
        this.e = mkoVar5;
        this.f = mkoVar6;
        this.g = mkoVar7;
        this.h = mkoVar8;
    }

    @Override // defpackage.mko, defpackage.mkn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ihk a() {
        jfe jfeVar = (jfe) this.a.a();
        lja ljaVar = (lja) this.b.a();
        SecureRandom secureRandom = new SecureRandom();
        hnu a = ((iag) this.c).a();
        fop a2 = ((fnx) this.d).a();
        kuv a3 = ((iix) this.e).a();
        kuv a4 = ((iix) this.f).a();
        ((iiz) this.g).a();
        return new ihk(jfeVar, ljaVar, secureRandom, a, a2, a3, a4, (ScheduledExecutorService) this.h.a());
    }
}
