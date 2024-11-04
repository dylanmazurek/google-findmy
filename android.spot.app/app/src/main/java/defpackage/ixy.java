package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ixy extends ArrayAdapter {
    final /* synthetic */ ixz a;
    private final ColorStateList b;
    private final ColorStateList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixy(ixz ixzVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        ColorStateList colorStateList;
        this.a = ixzVar;
        ColorStateList colorStateList2 = null;
        if (!b()) {
            colorStateList = null;
        } else {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{ixzVar.e.getColorForState(iArr, 0), 0});
        }
        this.c = colorStateList;
        if (a() && b()) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList2 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{bro.b(ixzVar.e.getColorForState(iArr3, 0), ixzVar.d), bro.b(ixzVar.e.getColorForState(iArr2, 0), ixzVar.d), ixzVar.d});
        }
        this.b = colorStateList2;
    }

    private final boolean a() {
        if (this.a.d != 0) {
            return true;
        }
        return false;
    }

    private final boolean b() {
        if (this.a.e != null) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            Drawable drawable = null;
            if (this.a.getText().toString().contentEquals(textView.getText()) && a()) {
                ColorDrawable colorDrawable = new ColorDrawable(this.a.d);
                if (this.c != null) {
                    bsc.g(colorDrawable, this.b);
                    drawable = new RippleDrawable(this.c, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
