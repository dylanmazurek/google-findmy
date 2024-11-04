package defpackage;

import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bot implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bot(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                ((ExpandableDialogView) this.a).getViewTreeObserver().removeOnPreDrawListener(this);
                Property property = hmh.af;
                int[] iArr = bwn.a;
                Object obj = this.a;
                if (((View) obj).getLayoutDirection() == 1) {
                    i = ((ExpandableDialogView) obj).a.left;
                } else {
                    i = ((ExpandableDialogView) obj).a.right;
                }
                ((ExpandableDialogView) obj).setPivotX(i);
                ((ExpandableDialogView) this.a).setPivotY(r0.a.top);
                return true;
            }
            asy asyVar = ((aqr) this.a).c;
            asyVar.a();
            asyVar.b(asyVar.d);
            ((aqr) this.a).a.getViewTreeObserver().removeOnPreDrawListener(this);
            ((aqr) this.a).e = false;
            return true;
        }
        ((CoordinatorLayout) this.a).i(0);
        return true;
    }
}
