package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irh extends buk {
    final /* synthetic */ CheckableImageButton a;

    public irh(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override // defpackage.buk
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.buk
    public final void c(View view, byn bynVar) {
        super.c(view, bynVar);
        bynVar.r(this.a.b);
        bynVar.s(this.a.a);
    }
}
