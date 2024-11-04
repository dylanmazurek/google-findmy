package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gzs extends FrameLayout implements hjs {
    private boolean a;
    private boolean b;

    public gzs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public abstract int a();

    @Override // defpackage.hjs
    public final void b(hjp hjpVar) {
        if (this.a) {
            hjpVar.c(this, a());
            this.b = true;
        }
    }

    public final void c(hjp hjpVar, gbm gbmVar) {
        if (this.a) {
            hjpVar.d(this, a(), gbmVar);
            this.b = true;
        }
    }

    @Override // defpackage.hjs
    public final void cU(hjp hjpVar) {
        if (this.a && this.b) {
            hjpVar.e(this);
            this.b = false;
        }
    }

    public final void d() {
        this.a = true;
    }
}
