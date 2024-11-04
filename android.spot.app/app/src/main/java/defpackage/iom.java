package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iom implements byz {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public iom(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.byz
    public final boolean a(View view) {
        this.b.H(this.a);
        return true;
    }
}
