package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnl extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public cnl(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        cnn cnnVar = new cnn();
        cnnVar.e = this.a.newDrawable();
        cnnVar.e.setCallback(cnnVar.d);
        return cnnVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        cnn cnnVar = new cnn();
        cnnVar.e = this.a.newDrawable(resources);
        cnnVar.e.setCallback(cnnVar.d);
        return cnnVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        cnn cnnVar = new cnn();
        cnnVar.e = this.a.newDrawable(resources, theme);
        cnnVar.e.setCallback(cnnVar.d);
        return cnnVar;
    }
}
