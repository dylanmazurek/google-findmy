package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nao {
    public static final nbj a = new nbj("UNDEFINED");
    public static final nbj b = new nbj("REUSABLE_CLAIMED");

    public static final void a(mmx mmxVar, Object obj) {
        mvh mvhVar;
        if (mmxVar instanceof nan) {
            nan nanVar = (nan) mmxVar;
            Object t = msz.t(obj);
            if (nanVar.a.cp(nanVar.o())) {
                nanVar.c = t;
                nanVar.e = 1;
                nanVar.a.a(nanVar.o(), nanVar);
                return;
            }
            boolean z = msy.a;
            ThreadLocal threadLocal = mvc.a;
            mto a2 = mvc.a();
            if (a2.o()) {
                nanVar.c = t;
                nanVar.e = 1;
                a2.m(nanVar);
                return;
            }
            a2.n(true);
            try {
                muf mufVar = (muf) nanVar.o().get(muf.c);
                if (mufVar != null && !mufVar.t()) {
                    CancellationException n = mufVar.n();
                    nanVar.w(t, n);
                    nanVar.p(mjo.n(n));
                } else {
                    mmx mmxVar2 = nanVar.b;
                    Object obj2 = nanVar.d;
                    mnb o = mmxVar2.o();
                    Object b2 = nbl.b(o, obj2);
                    if (b2 != nbl.a) {
                        mvhVar = mss.c(mmxVar2, o, b2);
                    } else {
                        mvhVar = null;
                    }
                    try {
                        nanVar.b.p(obj);
                    } finally {
                        if (mvhVar == null || mvhVar.T()) {
                            nbl.c(o, b2);
                        }
                    }
                }
                do {
                } while (a2.q());
                return;
            } catch (Throwable th) {
                try {
                    nanVar.G(th, null);
                    return;
                } finally {
                    a2.l(true);
                }
            }
        }
        mmxVar.p(obj);
    }
}
