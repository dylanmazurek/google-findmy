package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ipk extends cni {
    final /* synthetic */ ipn b;

    public ipk(ipn ipnVar) {
        this.b = ipnVar;
    }

    @Override // defpackage.cni
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            bsc.g(drawable, colorStateList);
        }
    }

    @Override // defpackage.cni
    public final void c(Drawable drawable) {
        ipn ipnVar = this.b;
        ColorStateList colorStateList = ipnVar.b;
        if (colorStateList != null) {
            bsc.f(drawable, colorStateList.getColorForState(ipnVar.d, colorStateList.getDefaultColor()));
        }
    }
}
