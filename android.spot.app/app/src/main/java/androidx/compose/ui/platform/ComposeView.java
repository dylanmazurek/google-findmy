package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.abi;
import defpackage.adt;
import defpackage.aee;
import defpackage.aeu;
import defpackage.afv;
import defpackage.agw;
import defpackage.bah;
import defpackage.bce;
import defpackage.mol;
import defpackage.moz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ComposeView extends bah {
    private final adt a;
    private boolean b;

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // defpackage.bah
    public final void a(abi abiVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        abi b = abiVar.b(420213850);
        if (i4 == 0) {
            if (true != b.D(this)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.G()) {
            b.r();
        } else {
            mol molVar = (mol) this.a.a();
            if (molVar != null) {
                molVar.a(b, 0);
            }
        }
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new bce(this, i, 0);
        }
    }

    @Override // defpackage.bah
    protected final boolean d() {
        return this.b;
    }

    public final void f(mol molVar) {
        this.b = true;
        this.a.h(molVar);
        if (isAttachedToWindow()) {
            if (isAttachedToWindow()) {
                super.c();
                return;
            }
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new aee(null, agw.a);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, moz mozVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
