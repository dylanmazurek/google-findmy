package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ioz extends buk {
    final /* synthetic */ BottomSheetDragHandleView a;

    public ioz(BottomSheetDragHandleView bottomSheetDragHandleView) {
        this.a = bottomSheetDragHandleView;
    }

    @Override // defpackage.buk
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            this.a.b();
        }
    }
}
