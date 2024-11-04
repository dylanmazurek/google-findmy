package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlk extends ViewOutlineProvider {
    final /* synthetic */ ExpandableDialogView a;

    public hlk(ExpandableDialogView expandableDialogView) {
        this.a = expandableDialogView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ExpandableDialogView expandableDialogView = this.a;
        outline.setRoundRect(Math.round(expandableDialogView.c.left), Math.round(this.a.c.top), Math.round(this.a.c.right), Math.round(this.a.c.bottom), expandableDialogView.b * (1.0f - expandableDialogView.a()));
    }
}
