package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.apps.adm.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class inv extends Drawable implements irw {
    public final WeakReference a;
    public final iny b;
    public final int c;
    private final ivf d;
    private final irx e;
    private final Rect f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private WeakReference l;
    private WeakReference m;

    public inv(Context context, inx inxVar) {
        int c;
        int b;
        FrameLayout frameLayout;
        ius iusVar;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        isa.c(context);
        this.f = new Rect();
        irx irxVar = new irx(this);
        this.e = irxVar;
        irxVar.a.setTextAlign(Paint.Align.CENTER);
        iny inyVar = new iny(context, inxVar);
        this.b = inyVar;
        if (o()) {
            c = inyVar.e();
        } else {
            c = inyVar.c();
        }
        if (o()) {
            b = inyVar.d();
        } else {
            b = inyVar.b();
        }
        ivf ivfVar = new ivf(new ivl(ivl.b(context, c, b)));
        this.d = ivfVar;
        m();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && irxVar.f != (iusVar = new ius(context2, inyVar.b.d.intValue()))) {
            irxVar.c(iusVar, context2);
            n();
            g();
            invalidateSelf();
        }
        if (a() != -2) {
            this.c = ((int) Math.pow(10.0d, a() - 1.0d)) - 1;
        } else {
            this.c = inyVar.b.m;
        }
        irxVar.e();
        g();
        invalidateSelf();
        irxVar.e();
        m();
        g();
        invalidateSelf();
        l();
        ColorStateList valueOf = ColorStateList.valueOf(inyVar.b.b.intValue());
        if (ivfVar.A() != valueOf) {
            ivfVar.L(valueOf);
            invalidateSelf();
        }
        n();
        WeakReference weakReference2 = this.l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.l.get();
            WeakReference weakReference3 = this.m;
            if (weakReference3 != null) {
                frameLayout = (FrameLayout) weakReference3.get();
            } else {
                frameLayout = null;
            }
            f(view, frameLayout);
        }
        g();
        setVisible(inyVar.b.t.booleanValue(), false);
    }

    private final String j() {
        if (i()) {
            String d = d();
            int a = a();
            if (a != -2 && d != null && d.length() > a) {
                Context context = (Context) this.a.get();
                if (context == null) {
                    return "";
                }
                return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), d.substring(0, a - 1), "…");
            }
            return d;
        }
        if (h()) {
            if (this.c != -2 && b() > this.c) {
                Context context2 = (Context) this.a.get();
                if (context2 == null) {
                    return "";
                }
                return String.format(this.b.h(), context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.c), "+");
            }
            return NumberFormat.getInstance(this.b.h()).format(b());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    private final void k(View view, View view2) {
        float f;
        float f2;
        View view3;
        FrameLayout c = c();
        if (c == null) {
            float y = view.getY();
            f2 = view.getX();
            view3 = view.getParent();
            f = y;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            view3 = c;
        }
        while (view3 instanceof View) {
            if (view3 != view2) {
                ViewParent parent = view3.getParent();
                if ((parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren()) {
                    View view4 = view3;
                    f += view4.getY();
                    f2 += view4.getX();
                    view3 = view3.getParent();
                }
            }
            float f3 = (this.h - this.k) + f;
            float f4 = (this.g - this.j) + f2;
            View view5 = view3;
            float height = ((this.h + this.k) - view5.getHeight()) + f;
            float width = ((this.g + this.j) - view5.getWidth()) + f2;
            if (f3 < 0.0f) {
                this.h += Math.abs(f3);
            }
            if (f4 < 0.0f) {
                this.g += Math.abs(f4);
            }
            if (height > 0.0f) {
                this.h -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.g -= Math.abs(width);
                return;
            }
            return;
        }
    }

    private final void l() {
        this.e.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    private final void m() {
        int c;
        int b;
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        ivf ivfVar = this.d;
        if (o()) {
            c = this.b.e();
        } else {
            c = this.b.c();
        }
        if (o()) {
            b = this.b.d();
        } else {
            b = this.b.b();
        }
        ivfVar.cy(new ivl(ivl.b(context, c, b)));
        invalidateSelf();
    }

    private final void n() {
        this.e.a.setColor(this.b.b.c.intValue());
        invalidateSelf();
    }

    private final boolean o() {
        if (!i() && !h()) {
            return false;
        }
        return true;
    }

    public final int a() {
        return this.b.b.l;
    }

    public final int b() {
        if (this.b.i()) {
            return this.b.b.k;
        }
        return 0;
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final String d() {
        return this.b.b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String j;
        int round;
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.d.draw(canvas);
            if (o() && (j = j()) != null) {
                Rect rect = new Rect();
                this.e.a.getTextBounds(j, 0, j.length(), rect);
                float exactCenterY = this.h - rect.exactCenterY();
                float f = this.g;
                if (rect.bottom <= 0) {
                    round = (int) exactCenterY;
                } else {
                    round = Math.round(exactCenterY);
                }
                canvas.drawText(j, f, round, this.e.a);
            }
        }
    }

    @Override // defpackage.irw
    public final void e() {
        invalidateSelf();
    }

    public final void f(View view, FrameLayout frameLayout) {
        this.l = new WeakReference(view);
        this.m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        g();
        invalidateSelf();
    }

    public final void g() {
        View view;
        ViewGroup viewGroup;
        float f;
        float f2;
        float f3;
        int g;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        int i;
        float f13;
        Context context = (Context) this.a.get();
        WeakReference weakReference = this.l;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference weakReference2 = this.m;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            if (o()) {
                f = this.b.d;
            } else {
                f = this.b.c;
            }
            this.i = f;
            if (f != -1.0f) {
                this.j = f;
                this.k = f;
            } else {
                if (o()) {
                    f2 = this.b.g;
                } else {
                    f2 = this.b.e;
                }
                this.j = Math.round(f2 / 2.0f);
                if (o()) {
                    f3 = this.b.h;
                } else {
                    f3 = this.b.f;
                }
                this.k = Math.round(f3 / 2.0f);
            }
            if (o()) {
                String j = j();
                this.j = Math.max(this.j, (this.e.a(j) / 2.0f) + this.b.b.u.intValue());
                float f14 = this.k;
                irx irxVar = this.e;
                if (!irxVar.d) {
                    f13 = irxVar.c;
                } else {
                    irxVar.b(j);
                    f13 = irxVar.c;
                }
                float max = Math.max(f14, (f13 / 2.0f) + this.b.b.v.intValue());
                this.k = max;
                this.j = Math.max(this.j, max);
            }
            int intValue = this.b.b.x.intValue();
            if (o()) {
                intValue = this.b.b.z.intValue();
                Context context2 = (Context) this.a.get();
                if (context2 != null) {
                    float f15 = hzc.f(context2) - 1.0f;
                    intValue = inc.b(intValue, intValue - this.b.b.C.intValue(), inc.a(0.0f, 1.0f, 0.3f, 1.0f, f15));
                }
            }
            if (this.b.k == 0) {
                intValue -= Math.round(this.k);
            }
            int intValue2 = intValue + this.b.b.B.intValue();
            int a = this.b.a();
            if (a != 8388691 && a != 8388693) {
                this.h = rect2.top + intValue2;
            } else {
                this.h = rect2.bottom - intValue2;
            }
            if (o()) {
                g = this.b.b.y.intValue();
            } else {
                g = this.b.g();
            }
            if (this.b.k == 1) {
                if (o()) {
                    i = this.b.j;
                } else {
                    i = this.b.i;
                }
                g += i;
            }
            float intValue3 = g + this.b.b.A.intValue();
            int a2 = this.b.a();
            if (a2 != 8388659 && a2 != 8388691) {
                if (this.b.l == 0) {
                    if (view.getLayoutDirection() == 0) {
                        f4 = rect2.right;
                        f5 = this.j;
                        f12 = (f4 + f5) - intValue3;
                    } else {
                        f6 = rect2.left;
                        f7 = this.j;
                        f12 = (f6 - f7) + intValue3;
                    }
                } else if (view.getLayoutDirection() == 0) {
                    f8 = rect2.right - this.j;
                    f9 = this.k;
                    f12 = f8 + ((f9 + f9) - intValue3);
                } else {
                    f10 = rect2.left + this.j;
                    f11 = this.k;
                    f12 = f10 - ((f11 + f11) - intValue3);
                }
            } else if (this.b.l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f10 = rect2.left + this.j;
                    f11 = this.k;
                    f12 = f10 - ((f11 + f11) - intValue3);
                } else {
                    f8 = rect2.right - this.j;
                    f9 = this.k;
                    f12 = f8 + ((f9 + f9) - intValue3);
                }
            } else if (view.getLayoutDirection() == 0) {
                f6 = rect2.left;
                f7 = this.j;
                f12 = (f6 - f7) + intValue3;
            } else {
                f4 = rect2.right;
                f5 = this.j;
                f12 = (f4 + f5) - intValue3;
            }
            this.g = f12;
            if (this.b.b.D.booleanValue()) {
                ViewParent c = c();
                if (c == null) {
                    c = view.getParent();
                }
                if ((c instanceof View) && (c.getParent() instanceof View)) {
                    k(view, (View) c.getParent());
                }
            } else {
                k(view, null);
            }
            Rect rect3 = this.f;
            float f16 = this.g;
            float f17 = this.h;
            float f18 = this.j;
            float f19 = this.k;
            rect3.set((int) (f16 - f18), (int) (f17 - f19), (int) (f16 + f18), (int) (f17 + f19));
            float f20 = this.i;
            if (f20 != -1.0f) {
                this.d.J(f20);
            }
            if (!rect.equals(this.f)) {
                this.d.setBounds(this.f);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean h() {
        if (!this.b.j() && this.b.i()) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        return this.b.j();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, defpackage.irw
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        iny inyVar = this.b;
        inyVar.a.i = i;
        inyVar.b.i = i;
        l();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
