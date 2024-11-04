package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csl {
    public final cvu a;
    public final Context b;
    public final String c;
    public final WorkDatabase d;
    public final cvv e;
    public final cuw f;
    public final String g;
    public final mui h;
    public final hph i;
    public final eld j;
    private final cur k;
    private final List l;

    /* JADX WARN: Type inference failed for: r1v6, types: [cur, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    public csl(ilv ilvVar) {
        cvu cvuVar = (cvu) ilvVar.d;
        this.a = cvuVar;
        this.b = (Context) ilvVar.g;
        String str = cvuVar.b;
        this.c = str;
        this.j = (eld) ilvVar.f;
        this.i = (hph) ilvVar.e;
        this.k = ilvVar.c;
        WorkDatabase workDatabase = (WorkDatabase) ilvVar.b;
        this.d = workDatabase;
        this.e = workDatabase.B();
        this.f = workDatabase.w();
        ?? r2 = ilvVar.a;
        this.l = r2;
        this.g = "Work [ id=" + str + ", tags={ " + mkm.ar(r2, ",", null, null, null, 62) + " } ]";
        this.h = new mui(null);
    }

    public final cvk a() {
        return cuv.b(this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [mnb, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.mmx r24) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csl.b(mmx):java.lang.Object");
    }

    public final void c(int i) {
        this.e.m(1, this.c);
        this.e.g(this.c, System.currentTimeMillis());
        this.e.f(this.c, this.a.t);
        this.e.l(this.c, -1L);
        this.e.i(this.c, i);
    }

    public final void d() {
        this.e.g(this.c, System.currentTimeMillis());
        this.e.m(1, this.c);
        cvv cvvVar = this.e;
        cwn cwnVar = (cwn) cvvVar;
        cwnVar.a.l();
        cks d = cwnVar.g.d();
        d.g(1, this.c);
        try {
            ((cwn) cvvVar).a.m();
            try {
                d.a();
                ((cwn) cvvVar).a.p();
                cwnVar.g.f(d);
                this.e.f(this.c, this.a.t);
                cvvVar = this.e;
                String str = this.c;
                cwn cwnVar2 = (cwn) cvvVar;
                cwnVar2.a.l();
                cks d2 = cwnVar2.e.d();
                d2.g(1, str);
                try {
                    ((cwn) cvvVar).a.m();
                    try {
                        d2.a();
                        ((cwn) cvvVar).a.p();
                        cwnVar2.e.f(d2);
                        this.e.l(this.c, -1L);
                    } finally {
                    }
                } catch (Throwable th) {
                    cwnVar2.e.f(d2);
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            cwnVar.g.f(d);
            throw th2;
        }
    }

    public final void e(boy boyVar) {
        List Q = mkm.Q(this.c);
        while (!Q.isEmpty()) {
            String str = (String) mkm.U(Q);
            if (this.e.j(str) != 6) {
                this.e.m(4, str);
            }
            Q.addAll(this.f.a(str));
        }
        cpn cpnVar = ((cpy) boyVar).a;
        cpnVar.getClass();
        this.e.f(this.c, this.a.t);
        this.e.h(this.c, cpnVar);
    }
}
