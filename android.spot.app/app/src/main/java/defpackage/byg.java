package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byg extends ClickableSpan {
    private final int a;
    private final byn b;
    private final int c;

    public byg(int i, byn bynVar, int i2) {
        this.a = i;
        this.b = bynVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.b.performAction(this.c, bundle);
    }
}
