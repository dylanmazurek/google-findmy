package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnx extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public cnx(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        cny cnyVar = new cny();
        cnyVar.e = (VectorDrawable) this.a.newDrawable();
        return cnyVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        cny cnyVar = new cny();
        cnyVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return cnyVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        cny cnyVar = new cny();
        cnyVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return cnyVar;
    }
}
