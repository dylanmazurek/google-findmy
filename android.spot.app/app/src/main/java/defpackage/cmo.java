package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmo {
    static int a(ViewGroup viewGroup, int i) {
        int childDrawingOrder;
        childDrawingOrder = viewGroup.getChildDrawingOrder(i);
        return childDrawingOrder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }
}
