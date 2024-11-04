package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, float f) {
        view.setTransitionAlpha(f);
    }
}
