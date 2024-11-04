package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nd {
    public static OnBackInvokedCallback a(Runnable runnable) {
        runnable.getClass();
        return new nc(runnable, 0);
    }

    public static OnBackInvokedDispatcher b(View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        return findOnBackInvokedDispatcher;
    }

    public static void c(Object obj, Object obj2) {
        ce$$ExternalSyntheticApiModelOutline0.m20m(obj).registerOnBackInvokedCallback(1000000, ce$$ExternalSyntheticApiModelOutline0.m19m(obj2));
    }

    public static void d(Object obj, Object obj2) {
        ce$$ExternalSyntheticApiModelOutline0.m20m(obj).unregisterOnBackInvokedCallback(ce$$ExternalSyntheticApiModelOutline0.m19m(obj2));
    }

    public static final long e(avs avsVar) {
        return avsVar.f(0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final aql f(avs avsVar) {
        avs i = avsVar.i();
        if (i != null) {
            return i.h(avsVar, true);
        }
        long j = ((awr) avsVar).c;
        return new aql(0.0f, 0.0f, blm.b(j), blm.a(j));
    }

    public static final aql g(avs avsVar) {
        return i(avsVar).h(avsVar, true);
    }

    public static final aql h(avs avsVar) {
        avs i = i(avsVar);
        int b = blm.b(i.d());
        int a = blm.a(i.d());
        aql g = g(avsVar);
        float f = g.b;
        float f2 = g.c;
        float f3 = g.d;
        float f4 = g.e;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f5 = b;
        if (f > f5) {
            f = f5;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 <= f5) {
            f5 = f3;
        }
        if (f != f5) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            float f6 = a;
            if (f2 > f6) {
                f2 = f6;
            }
            if (f4 > f6) {
                f4 = f6;
            }
            if (f2 != f4) {
                long g2 = i.g(a.k(f, f2));
                long g3 = i.g(a.k(f5, f2));
                long g4 = i.g(a.k(f5, f4));
                long g5 = i.g(a.k(f, f4));
                float b2 = aqk.b(g2);
                float b3 = aqk.b(g3);
                float b4 = aqk.b(g5);
                float b5 = aqk.b(g4);
                float min = Math.min(b2, Math.min(b3, Math.min(b4, b5)));
                float max = Math.max(b2, Math.max(b3, Math.max(b4, b5)));
                float c = aqk.c(g2);
                float c2 = aqk.c(g3);
                float c3 = aqk.c(g5);
                float c4 = aqk.c(g4);
                return new aql(min, Math.min(c, Math.min(c2, Math.min(c3, c4))), max, Math.max(c, Math.max(c2, Math.max(c3, c4))));
            }
        }
        return aql.a;
    }

    public static final avs i(avs avsVar) {
        avs avsVar2;
        azq azqVar;
        azq azqVar2;
        avs i = avsVar.i();
        while (true) {
            avs avsVar3 = i;
            avsVar2 = avsVar;
            avsVar = avsVar3;
            if (avsVar == null) {
                break;
            }
            i = avsVar.i();
        }
        if (avsVar2 instanceof azq) {
            azqVar = (azq) avsVar2;
        } else {
            azqVar = null;
        }
        if (azqVar == null) {
            return avsVar2;
        }
        do {
            azqVar2 = azqVar;
            azqVar = azqVar.u;
        } while (azqVar != null);
        return azqVar2;
    }
}
