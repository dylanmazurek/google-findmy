package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class evt extends ion {
    final /* synthetic */ evu a;

    public evt(evu evuVar) {
        this.a = evuVar;
    }

    @Override // defpackage.ion
    public final void a(View view, float f) {
        int v = BottomSheetBehavior.x(view).v();
        bso.f().intValue();
        this.a.d.e(null, Integer.valueOf(((int) ((view.getHeight() - v) * f)) + v));
    }

    @Override // defpackage.ion
    public final void b(View view, int i) {
        this.a.q();
    }
}
