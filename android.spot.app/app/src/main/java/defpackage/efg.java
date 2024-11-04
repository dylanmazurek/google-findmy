package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class efg extends ClickableSpan {
    final /* synthetic */ efh a;

    public efg(efh efhVar) {
        this.a = efhVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.a.aq.g()) {
            ((eey) this.a.aq.c()).a(this.a.y());
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
