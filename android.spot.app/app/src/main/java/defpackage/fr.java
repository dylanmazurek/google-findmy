package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.SearchEvent;
import android.view.Window;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ActionMode a(Window.Callback callback, ActionMode.Callback callback2, int i) {
        ActionMode onWindowStartingActionMode;
        onWindowStartingActionMode = callback.onWindowStartingActionMode(callback2, i);
        return onWindowStartingActionMode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Window.Callback callback, SearchEvent searchEvent) {
        boolean onSearchRequested;
        onSearchRequested = callback.onSearchRequested(searchEvent);
        return onSearchRequested;
    }

    public static void d(bae baeVar, moh mohVar) {
        if (mohVar.a(baeVar) != bad.ContinueTraversal) {
            return;
        }
        qs.f(baeVar, mohVar);
    }

    public static boolean e(apm apmVar, long j) {
        if (!apmVar.k.t) {
            return false;
        }
        azq s = qg.f(apmVar).s();
        if (s.j()) {
            long j2 = s.c;
            int b = blm.b(j2);
            int a = blm.a(j2);
            long e = nd.e(s);
            float b2 = aqk.b(e);
            float c = aqk.c(e);
            float f = b + b2;
            float f2 = a + c;
            float b3 = aqk.b(j);
            if (b2 <= b3 && b3 <= f) {
                float c2 = aqk.c(j);
                if (c <= c2 && c2 <= f2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long f(bet betVar) {
        DragEvent dragEvent = (DragEvent) betVar.a;
        return a.k(dragEvent.getX(), dragEvent.getY());
    }

    public EdgeEffect c(RecyclerView recyclerView) {
        throw null;
    }
}
