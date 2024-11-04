package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdq extends fs {
    private final Drawable a;
    private final Rect b = new Rect();
    private final int c;

    public hdq(Drawable drawable, int i) {
        this.a = drawable;
        this.c = i;
    }

    private final void g(RecyclerView recyclerView, View view, Canvas canvas, int i) {
        RecyclerView.G(view, this.b);
        int round = this.b.top + Math.round(view.getTranslationY());
        int intrinsicHeight = this.a.getIntrinsicHeight() + round;
        int[] iArr = bwn.a;
        int layoutDirection = view.getLayoutDirection();
        int width = recyclerView.getWidth();
        if (layoutDirection == 1) {
            width -= i;
        }
        if (layoutDirection == 1) {
            i = 0;
        }
        this.a.setBounds(i, round, width, intrinsicHeight);
        this.a.draw(canvas);
    }

    private static int h(View view, RecyclerView recyclerView) {
        int i;
        lj ljVar = recyclerView.l;
        if (ljVar == null) {
            return 1;
        }
        hwx.U(ljVar instanceof hcy);
        hcy hcyVar = (hcy) ljVar;
        mh h = RecyclerView.h(view);
        if (h != null) {
            i = h.a();
        } else {
            i = -1;
        }
        if (i == -1) {
            return 1;
        }
        jer b = hcyVar.b(((Integer) hcyVar.e.e(i)).intValue());
        if (b.f() == hdg.ALWAYS_HIDE_DIVIDER_CARD || b.f() == hdg.COMMON_ACTION_CARD) {
            return 1;
        }
        if (i <= 0 || !b.equals(hcyVar.b(((Integer) hcyVar.e.e(i - 1)).intValue())) || !b.g()) {
            return 2;
        }
        int ordinal = ((hdg) b.c()).ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return 1;
        }
        if (ordinal != 3) {
            return 2;
        }
        return 3;
    }

    @Override // defpackage.fs
    public final void b(Rect rect, View view, RecyclerView recyclerView, me meVar) {
        if (h(view, recyclerView) == 1) {
            return;
        }
        rect.set(0, this.a.getIntrinsicHeight(), 0, 0);
    }

    @Override // defpackage.fs
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int h = h(childAt, recyclerView) - 1;
            if (h != 1) {
                if (h == 2) {
                    g(recyclerView, childAt, canvas, this.c);
                }
            } else {
                g(recyclerView, childAt, canvas, 0);
            }
        }
    }
}
