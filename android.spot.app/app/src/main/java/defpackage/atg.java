package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atg extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view instanceof ath) {
            int i = ath.h;
            Outline outline2 = ((ath) view).b;
            if (outline2 != null) {
                outline.set(outline2);
            }
        }
    }
}
