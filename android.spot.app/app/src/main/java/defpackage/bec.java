package defpackage;

import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bec {
    public static final bec a = new bec();

    private bec() {
    }

    public final void a(baw bawVar) {
        ViewParent parent = bawVar.getParent();
        if (parent == null) {
            return;
        }
        parent.onDescendantInvalidated(bawVar, bawVar);
    }
}
