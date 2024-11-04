package com.google.android.libraries.onegoogle.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import defpackage.moz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LockableNestedScrollView extends NestedScrollView {
    public boolean g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LockableNestedScrollView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        view.getClass();
        if (this.g) {
            super.measureChild(view, i, i2);
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            view.measure(NestedScrollView.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutParams.width), NestedScrollView.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), layoutParams.height));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (this.g) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
        } else if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.g && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, defpackage.bvg
    public final boolean t(View view, View view2, int i, int i2) {
        view.getClass();
        view2.getClass();
        if (this.g && super.t(view, view2, i, i2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.g = true;
    }

    public /* synthetic */ LockableNestedScrollView(Context context, AttributeSet attributeSet, int i, moz mozVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
