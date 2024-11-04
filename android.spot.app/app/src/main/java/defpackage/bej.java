package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bej {
    public static void a(View view, int i) {
        view.setImportantForContentCapture(i);
    }

    public static final Object b(bfe bfeVar, bfn bfnVar) {
        Object obj = bfeVar.a.get(bfnVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
