package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipq extends iut {
    final /* synthetic */ Chip a;

    public ipq(Chip chip) {
        this.a = chip;
    }

    @Override // defpackage.iut
    public final void b(Typeface typeface, boolean z) {
        CharSequence text;
        Chip chip = this.a;
        ipu ipuVar = chip.e;
        if (ipuVar.n) {
            text = ipuVar.c;
        } else {
            text = chip.getText();
        }
        chip.setText(text);
        this.a.requestLayout();
        this.a.invalidate();
    }

    @Override // defpackage.iut
    public final void a(int i) {
    }
}
