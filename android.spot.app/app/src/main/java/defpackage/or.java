package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class or {
    public static final or a = new or();

    private or() {
    }

    public final OnBackInvokedCallback a(mnw mnwVar) {
        mnwVar.getClass();
        return new nc(mnwVar, 2);
    }

    public final void b(Object obj, int i, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ce$$ExternalSyntheticApiModelOutline0.m20m(obj).registerOnBackInvokedCallback(i, ce$$ExternalSyntheticApiModelOutline0.m19m(obj2));
    }

    public final void c(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ce$$ExternalSyntheticApiModelOutline0.m20m(obj).unregisterOnBackInvokedCallback(ce$$ExternalSyntheticApiModelOutline0.m19m(obj2));
    }
}
