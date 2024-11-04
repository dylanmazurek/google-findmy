package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ko extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    public int f;
    public Drawable g;
    public int h;
    private float i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public ko(Context context) {
        this(context, null);
    }

    private static void a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: cW, reason: merged with bridge method [inline-methods] */
    public kn generateLayoutParams(AttributeSet attributeSet) {
        return new kn(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: cX, reason: merged with bridge method [inline-methods] */
    public kn generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof kn) {
            return new kn((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new kn((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new kn(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kn;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public kn generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new kn(-2);
        }
        if (i == 1) {
            return new kn(-1);
        }
        return null;
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.c;
            if (this.d == 1 && (i = this.f & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.e;
                    }
                } else {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.e) / 2;
                }
            }
            return i3 + ((kn) childAt.getLayoutParams()).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.g != null) {
            int i2 = 0;
            if (this.d == 1) {
                int childCount = getChildCount();
                while (i2 < childCount) {
                    View childAt = getChildAt(i2);
                    if (childAt != null && childAt.getVisibility() != 8 && s(i2)) {
                        p(canvas, (childAt.getTop() - ((kn) childAt.getLayoutParams()).topMargin) - this.m);
                    }
                    i2++;
                }
                if (s(childCount)) {
                    View childAt2 = getChildAt(childCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.m;
                    } else {
                        bottom = childAt2.getBottom() + ((kn) childAt2.getLayoutParams()).bottomMargin;
                    }
                    p(canvas, bottom);
                    return;
                }
                return;
            }
            int childCount2 = getChildCount();
            boolean a = nr.a(this);
            while (i2 < childCount2) {
                View childAt3 = getChildAt(i2);
                if (childAt3 != null && childAt3.getVisibility() != 8 && s(i2)) {
                    kn knVar = (kn) childAt3.getLayoutParams();
                    if (a) {
                        left2 = childAt3.getRight() + knVar.rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - knVar.leftMargin) - this.h;
                    }
                    q(canvas, left2);
                }
                i2++;
            }
            if (s(childCount2)) {
                View childAt4 = getChildAt(childCount2 - 1);
                if (childAt4 == null) {
                    if (a) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth() - getPaddingRight();
                        i = this.h;
                        right = left - i;
                    }
                } else {
                    kn knVar2 = (kn) childAt4.getLayoutParams();
                    if (a) {
                        left = childAt4.getLeft() - knVar2.leftMargin;
                        i = this.h;
                        right = left - i;
                    } else {
                        right = childAt4.getRight() + knVar2.rightMargin;
                    }
                }
                q(canvas, right);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e0, code lost:            if (r10.width == (-1)) goto L142;     */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x063d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r42, int r43) {
        /*
            Method dump skipped, instructions count: 2253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko.onMeasure(int, int):void");
    }

    final void p(Canvas canvas, int i) {
        this.g.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.g.draw(canvas);
    }

    final void q(Canvas canvas, int i) {
        this.g.setBounds(i, getPaddingTop() + this.o, this.h + i, (getHeight() - getPaddingBottom()) - this.o);
        this.g.draw(canvas);
    }

    public final void r(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean s(int i) {
        if (i == 0) {
            if ((this.n & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i == getChildCount()) {
            if ((this.n & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.n & 2) == 0) {
            return false;
        }
        do {
            i--;
            if (i < 0) {
                return false;
            }
        } while (getChildAt(i).getVisibility() == 8);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t() {
        this.a = false;
    }

    public ko(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ko(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.f = 8388659;
        ksr F = ksr.F(context, attributeSet, eb.n, i, 0);
        bwn.p(this, context, eb.n, attributeSet, (TypedArray) F.b, i, 0);
        int p = F.p(1, -1);
        if (p >= 0) {
            r(p);
        }
        int p2 = F.p(0, -1);
        if (p2 >= 0 && this.f != p2) {
            p2 = (8388615 & p2) == 0 ? p2 | 8388611 : p2;
            this.f = (p2 & 112) == 0 ? p2 | 48 : p2;
            requestLayout();
        }
        if (!F.z(2, true)) {
            t();
        }
        this.i = ((TypedArray) F.b).getFloat(4, -1.0f);
        this.b = F.p(3, -1);
        this.j = F.z(7, false);
        Drawable u = F.u(5);
        if (u != this.g) {
            this.g = u;
            if (u != null) {
                this.h = u.getIntrinsicWidth();
                this.m = u.getIntrinsicHeight();
            } else {
                this.h = 0;
                this.m = 0;
            }
            setWillNotDraw(u == null);
            requestLayout();
        }
        this.n = F.p(8, 0);
        this.o = F.o(6, 0);
        F.y();
    }
}
