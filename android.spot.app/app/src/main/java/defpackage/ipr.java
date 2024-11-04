package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipr extends ViewOutlineProvider {
    final /* synthetic */ Chip a;

    public ipr(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ipu ipuVar = this.a.e;
        if (ipuVar != null) {
            ipuVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
