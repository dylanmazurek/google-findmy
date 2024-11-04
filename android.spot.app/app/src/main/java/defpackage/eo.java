package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eo extends el {
    private en a;
    private boolean b;

    public eo() {
        this(null, null);
    }

    @Override // defpackage.el, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // defpackage.el
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public en b() {
        return new en(this.a, this, null);
    }

    @Override // defpackage.el
    public void d(ek ekVar) {
        super.d(ekVar);
        if (ekVar instanceof en) {
            this.a = (en) ekVar;
        }
    }

    @Override // defpackage.el, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // defpackage.el, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.b) {
            super.mutate();
            this.a.d();
            this.b = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.el, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m = this.a.m(iArr);
        if (m < 0) {
            m = this.a.m(StateSet.WILD_CARD);
        }
        if (!g(m) && !onStateChange) {
            return false;
        }
        return true;
    }

    public eo(byte[] bArr) {
    }

    public eo(en enVar, Resources resources) {
        d(new en(enVar, this, resources));
        onStateChange(getState());
    }
}
