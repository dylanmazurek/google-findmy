package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbm {
    public static final bbm a = new bbm();

    private bbm() {
    }

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(bbl.a);
    }
}
