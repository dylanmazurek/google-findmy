package defpackage;

import com.google.android.apps.adm.accounts.AccountLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgf {
    public final /* synthetic */ Object a;
    public final Object b;
    public final Object c;

    public kgf(apc apcVar, String str, AccountLayout accountLayout) {
        this.a = apcVar;
        this.c = str;
        this.b = accountLayout;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, agt] */
    public final wb a() {
        return (wb) this.b.a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [adt, java.lang.Object] */
    public final agt b(moh mohVar, moh mohVar2) {
        wb a = a();
        if (a == null) {
            wi wiVar = (wi) this.a;
            wb wbVar = new wb(this, new we(wiVar, mohVar2.a(wiVar.d()), qi.f((atk) this.c, mohVar2.a(((wi) this.a).d())), (atk) this.c), mohVar, mohVar2);
            Object obj = this.a;
            this.b.h(wbVar);
            ((wi) obj).t(wbVar.a);
            a = wbVar;
        }
        Object obj2 = this.a;
        a.c = mohVar2;
        a.b = mohVar;
        a.b(((wi) obj2).c());
        return a;
    }

    public final void c(ihy ihyVar) {
        ((emk) this.a).d(jer.i(ihyVar), (lqd) this.c);
        ((emk) this.a).g(new cui(this, ihyVar, 17, (byte[]) null));
    }

    public final void d(ick ickVar) {
        ((emk) this.a).g(new cui(this, ickVar, 16, (byte[]) null));
    }

    public final void e() {
        ((emk) this.a).f((lqd) this.c);
    }

    public kgf(Object obj, Class cls, Object obj2) {
        this.a = obj2;
        this.b = obj;
        this.c = cls;
    }

    public kgf(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public kgf(wi wiVar, atk atkVar) {
        this.a = wiVar;
        this.c = atkVar;
        this.b = new aee(null, agw.a);
    }
}
