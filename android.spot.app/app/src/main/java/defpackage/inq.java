package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class inq extends ins {
    public final Rect a;
    final Rect b;
    public int c;
    public int d;

    public inq() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    public boolean A() {
        return false;
    }

    @Override // defpackage.ins
    protected final void cV(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View w = w(coordinatorLayout.a(view));
        if (w != null) {
            bos bosVar = (bos) view.getLayoutParams();
            Rect rect = this.a;
            rect.set(coordinatorLayout.getPaddingLeft() + bosVar.leftMargin, w.getBottom() + bosVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - bosVar.rightMargin, ((coordinatorLayout.getHeight() + w.getBottom()) - coordinatorLayout.getPaddingBottom()) - bosVar.bottomMargin);
            bya byaVar = coordinatorLayout.e;
            if (byaVar != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left += byaVar.b();
                rect.right -= byaVar.c();
            }
            Rect rect2 = this.b;
            int i3 = bosVar.c;
            if (i3 == 0) {
                i2 = 8388659;
            } else {
                i2 = i3;
            }
            Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int y = y(w);
            view.layout(rect2.left, rect2.top - y, rect2.right, rect2.bottom - y);
            this.c = rect2.top - w.getBottom();
            return;
        }
        coordinatorLayout.j(view, i);
        this.c = 0;
    }

    public float u(View view) {
        throw null;
    }

    public int v(View view) {
        throw null;
    }

    public abstract View w(List list);

    public final int y(View view) {
        if (this.d == 0) {
            return 0;
        }
        float u = u(view);
        int i = this.d;
        return bpv.e((int) (u * i), 0, i);
    }

    public inq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
}
