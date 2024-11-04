package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class itf {
    public final int a;
    public int b;
    public int[] c;
    public int d;
    public final int e;
    public final int f;
    public int g;
    public final int h;
    public final int i;
    public final int j;

    /* JADX INFO: Access modifiers changed from: protected */
    public itf(Context context, AttributeSet attributeSet, int i, int i2) {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray a = isa.a(context, attributeSet, iul.a, i, i2, new int[0]);
        int h = hzc.h(context, a, 11, dimensionPixelSize);
        this.a = h;
        this.b = Math.min(hzc.h(context, a, 10, 0), h / 2);
        this.e = a.getInt(6, 0);
        this.f = a.getInt(2, 0);
        this.g = a.getDimensionPixelSize(4, 0);
        this.h = Math.abs(a.getDimensionPixelSize(12, 0));
        this.i = Math.abs(a.getDimensionPixelSize(1, 0));
        this.j = a.getDimensionPixelSize(8, 0);
        if (!a.hasValue(3)) {
            this.c = new int[]{iqg.d(context, R.attr.colorPrimary, -1)};
        } else if (a.peekValue(3).type != 1) {
            this.c = new int[]{a.getColor(3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(a.getResourceId(3, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (a.hasValue(9)) {
            this.d = a.getColor(9, -1);
        } else {
            this.d = this.c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.d = iqg.b(this.d, (int) (f * 255.0f));
        }
        a.recycle();
    }

    public void a() {
        if (this.g >= 0) {
        } else {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }

    public final boolean b() {
        if (this.i > 0 && this.h > 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f != 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.e != 0) {
            return true;
        }
        return false;
    }
}
