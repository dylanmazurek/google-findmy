package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ro extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final bau f;
    private static final int[] g = {R.attr.colorBackground};
    public static final lb e = new lb();

    public ro(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void b(ro roVar, int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public final float a() {
        return lb.b(this.f);
    }

    public ro(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.adm.R.attr.cardViewStyle);
    }

    public ro(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        bau bauVar = new bau(this);
        this.f = bauVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rn.a, i, com.google.android.apps.adm.R.style.CardView);
        bwn.p(this, context, rn.a, attributeSet, obtainStyledAttributes, i, com.google.android.apps.adm.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(g);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.google.android.apps.adm.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.google.android.apps.adm.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        rp rpVar = new rp(valueOf, dimension);
        bauVar.a = rpVar;
        ((ro) bauVar.b).setBackgroundDrawable(rpVar);
        ViewGroup viewGroup = bauVar.b;
        viewGroup.setClipToOutline(true);
        viewGroup.setElevation(dimension2);
        Object obj = bauVar.a;
        boolean d = bauVar.d();
        boolean c = bauVar.c();
        rp rpVar2 = (rp) obj;
        if (dimension3 != rpVar2.b || rpVar2.c != d || rpVar2.d != c) {
            rpVar2.b = dimension3;
            rpVar2.c = d;
            rpVar2.d = c;
            rpVar2.a(null);
            rpVar2.invalidateSelf();
        }
        lb.d(bauVar);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
