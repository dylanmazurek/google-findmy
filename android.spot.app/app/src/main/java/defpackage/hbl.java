package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbl extends fs {
    private final Drawable a;
    private final Rect b = new Rect();
    private final View c;

    public hbl(View view, Drawable drawable) {
        this.c = view;
        this.a = drawable;
    }

    @Override // defpackage.fs
    public final void b(Rect rect, View view, RecyclerView recyclerView, me meVar) {
        super.b(rect, view, recyclerView, meVar);
        if (recyclerView.getChildAt(0) == view) {
            rect.set(0, this.a.getIntrinsicHeight(), 0, 0);
        }
    }

    @Override // defpackage.fs
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView.getChildCount() == 0) {
            return;
        }
        View childAt = recyclerView.getChildAt(0);
        RecyclerView.G(childAt, this.b);
        int round = this.b.top + Math.round(childAt.getTranslationY());
        int intrinsicHeight = this.a.getIntrinsicHeight() + round;
        View view = this.c;
        int[] iArr = bwn.a;
        if (view.getLayoutDirection() == 1) {
            this.a.setBounds(0, round, recyclerView.getWidth(), intrinsicHeight);
        } else {
            this.a.setBounds(0, round, recyclerView.getWidth(), intrinsicHeight);
        }
        this.a.draw(canvas);
    }
}
