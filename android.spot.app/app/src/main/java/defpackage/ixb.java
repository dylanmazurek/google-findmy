package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixb extends LinearLayout {
    public TextView a;
    public ImageView b;
    public final Drawable c;
    final /* synthetic */ TabLayout d;
    private iwz e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [ixb, android.view.View] */
    public ixb(TabLayout tabLayout, Context context) {
        super(context);
        this.d = tabLayout;
        this.f = 2;
        int i = tabLayout.p;
        if (i != 0) {
            Drawable c = cu.c(context, i);
            this.c = c;
            if (c != null && c.isStateful()) {
                c.setState(getDrawableState());
            }
        } else {
            this.c = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.k != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList a = iuv.a(tabLayout.k);
            boolean z = tabLayout.y;
            gradientDrawable = new RippleDrawable(a, true == z ? null : gradientDrawable, true != z ? gradientDrawable2 : null);
        }
        setBackground(gradientDrawable);
        tabLayout.invalidate();
        setPaddingRelative(tabLayout.c, tabLayout.d, tabLayout.e, tabLayout.f);
        setGravity(17);
        setOrientation(!tabLayout.v ? 1 : 0);
        setClickable(true);
        bwn.x(this, bet.l(getContext()));
    }

    private static final void d(View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new ecu(view, 5, null));
    }

    public final void a(iwz iwzVar) {
        if (iwzVar != this.e) {
            this.e = iwzVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        c();
        iwz iwzVar = this.e;
        boolean z = false;
        if (iwzVar != null) {
            TabLayout tabLayout = iwzVar.f;
            if (tabLayout != null) {
                int a = tabLayout.a();
                if (a != -1 && a == iwzVar.c) {
                    z = true;
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        setSelected(z);
    }

    public final void c() {
        CharSequence charSequence;
        boolean z;
        int i;
        CharSequence charSequence2;
        int i2;
        int i3;
        iwz iwzVar = this.e;
        if (this.b == null) {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
            this.b = imageView;
            addView(imageView, 0);
        }
        if (this.a == null) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
            this.a = textView;
            addView(textView);
            this.f = this.a.getMaxLines();
        }
        brh.j(this.a, this.d.g);
        if (isSelected() && (i3 = this.d.i) != -1) {
            brh.j(this.a, i3);
        } else {
            brh.j(this.a, this.d.h);
        }
        ColorStateList colorStateList = this.d.j;
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        TextView textView2 = this.a;
        ImageView imageView2 = this.b;
        iwz iwzVar2 = this.e;
        CharSequence charSequence3 = null;
        if (iwzVar2 != null) {
            charSequence = iwzVar2.a;
        } else {
            charSequence = null;
        }
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z2 = !isEmpty;
        if (textView2 != null) {
            if (!isEmpty) {
                int i4 = this.e.e;
                z = true;
            } else {
                z = false;
            }
            if (true != z2) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            textView2.setText(charSequence2);
            if (true != z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView2.setVisibility(i2);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z = false;
        }
        if (imageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            if (z && imageView2.getVisibility() == 0) {
                i = (int) hwx.j(getContext(), 8);
            } else {
                i = 0;
            }
            if (this.d.v) {
                if (i != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(i);
                    marginLayoutParams.bottomMargin = 0;
                    imageView2.setLayoutParams(marginLayoutParams);
                    imageView2.requestLayout();
                }
            } else if (i != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i;
                marginLayoutParams.setMarginEnd(0);
                imageView2.setLayoutParams(marginLayoutParams);
                imageView2.requestLayout();
            }
        }
        iwz iwzVar3 = this.e;
        if (iwzVar3 != null) {
            charSequence3 = iwzVar3.b;
        }
        if (Build.VERSION.SDK_INT > 23) {
            if (true != z2) {
                charSequence = charSequence3;
            }
            in.b(this, charSequence);
        }
        d(this.b);
        d(this.a);
        if (iwzVar != null && !TextUtils.isEmpty(iwzVar.b)) {
            setContentDescription(iwzVar.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.c;
        int[] drawableState = getDrawableState();
        if (drawable != null && drawable.isStateful() && this.c.setState(drawableState)) {
            invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        byn bynVar = new byn(accessibilityNodeInfo);
        bynVar.w(bym.a(0, 1, this.e.c, 1, isSelected()));
        if (isSelected()) {
            bynVar.u(false);
            bynVar.af(byi.a);
        }
        bynVar.N(getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.d.q;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = this.d.m;
            if (isSelected()) {
                TabLayout tabLayout = this.d;
                if (tabLayout.i != -1) {
                    f = tabLayout.n;
                }
            }
            int i4 = this.f;
            ImageView imageView = this.b;
            if (imageView != null && imageView.getVisibility() == 0) {
                i4 = 1;
            } else {
                TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.d.o;
                }
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int maxLines = this.a.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                if (this.d.u != 1 || f <= textSize || lineCount != 1 || ((layout = this.a.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    this.a.setTextSize(0, f);
                    this.a.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.e != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            this.e.a();
            return true;
        }
        return performClick;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }
}
